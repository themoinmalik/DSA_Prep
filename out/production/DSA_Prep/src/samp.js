

function func1() {
    let a = 10;
    function func2() {
        console.log(a);
    }
    func2();
}

func1();


// 
let num = [1,2,4,6,8,9,3];

let newNum = num.filter((a) => {
     a*2;
})

console.log(newNum);

