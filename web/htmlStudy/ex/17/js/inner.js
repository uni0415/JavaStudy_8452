const container = document.querySelector("#container");

let titleList = ['java', 'c', 'python', 'html', 'css', 'javascript', 'spring '];

let e = (title) => 
    ` 
    <div class="board-content">
        <div class="title">
            <h3>${title}</h3>
        </div>
        <div class="content">
            <img src="images/cup-1.png">
        </div>
	</div>
`;



let result = function (a, b) {
    return a + b;
}(10, 20);

result = (a, b) => a + b;
let result2 = result(10, 20);

let str = ``;   

for (let i = 0; i < titleList.length; i++){
    str += e(titleList[i]);
}

console.log(e);

container.innerHTML = str;
