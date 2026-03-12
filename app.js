let input = document.querySelector('input')

let getval =(e) => {
    input.value +=e.target.innerText
}

let calculate = () => {
    input.value =eval(input.value)
}

let clearAll = () => {
    input.value =""
} 
