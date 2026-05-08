const outputBox = document.getElementById("output");

let expression = "";

// show number
const numClick = (num) => {
    expression += num;
    outputBox.textContent = expression;
};

// show operator
const saveOperator = (op) => {
    if (expression === "") return;

    const lastChar = expression.slice(-1);

    // prevent double operators like ++ or +*
    if (["+", "-", "*"].includes(lastChar)) {
        expression = expression.slice(0, -1);
    }

    expression += op;
    outputBox.textContent = expression;
};

// number buttons
document.getElementById("btn0").onclick = () => numClick("0");
document.getElementById("btn1").onclick = () => numClick("1");
document.getElementById("btn2").onclick = () => numClick("2");
document.getElementById("btn3").onclick = () => numClick("3");
document.getElementById("btn4").onclick = () => numClick("4");
document.getElementById("btn5").onclick = () => numClick("5");
document.getElementById("btn6").onclick = () => numClick("6");
document.getElementById("btn7").onclick = () => numClick("7");
document.getElementById("btn8").onclick = () => numClick("8");
document.getElementById("btn9").onclick = () => numClick("9");

// operators
document.getElementById("btnplus").onclick = () => saveOperator("+");
document.getElementById("btnminus").onclick = () => saveOperator("-");
document.getElementById("btnmultiply").onclick = () => saveOperator("*");

// equal button
document.getElementById("btnequal").onclick = () => {
    try {
        if (expression === "") return;

        const result = Function(`return ${expression}`)();
        outputBox.textContent = result;
        expression = result.toString(); // allow chaining
    } catch (error) {
        outputBox.textContent = "Error";
        expression = "";
    }
};