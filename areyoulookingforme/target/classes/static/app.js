const startBtn = document.getElementById("startBtn");
const content = document.getElementById("content");

startBtn.addEventListener("click", startGame);

function startGame() {
    content.innerHTML = "<p>Loading questions...</p>";

    fetch("/api/questions")
        .then(response => response.json())
        .then(data => {
            console.log("Questions loaded:", data);
            showQuestion(data, 0, 0);
        })
        .catch(error => {
            content.innerHTML = "<p>Failed to load questions.</p>";
            console.error(error);
        });
}

function showQuestion(questions, index, score) {
    const question = questions[index];

    let html = `<h2>${question.text}</h2>`;

    question.answers.forEach(answer => {
        html += `
            <button onclick="answerQuestion(${answer.score}, ${index}, ${score}, questions)">
                ${answer.text}
            </button><br/><br/>
        `;
    });

    content.innerHTML = html;
}

function answerQuestion(answerScore, index, currentScore, questions) {
    const newScore = currentScore + answerScore;
    const nextIndex = index + 1;

    if (nextIndex < questions.length) {
        showQuestion(questions, nextIndex, newScore);
    } else {
        showResult(newScore);
    }
}

function showResult(score) {
    content.innerHTML = `
        <h2>Your score: ${score}</h2>
        <p>You might be exactly the kind of recruiter I'm looking for.</p>
    `;
}
