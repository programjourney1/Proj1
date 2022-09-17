//console.log(document);
let button = document.getElementById('loadButton');

let content = document.getElementById('container');


button.onclick = loadLoc;

function loadSpan(response){

for(let i = 0; i < response.length; i++){
    let pokemon = document.createElement("p");
    pokemon.innerText = response[i].Species +" -"+ response[i].Loc ;
    content.appendChild(pokemon);
}}


//////////////////////////////

function loadLoc(){
    let request = new XMLHttpRequest();
    request.open("GET", "http://localhost:9004/Pokemon/Locz");
    request.send();

    request.onreadystatechange = load;

    function load(){
        if(request.readyState == 4 && request.status == 200){
            let responsejson = JSON.parse(request.response);
            console.log(responsejson);
            loadSpan(responsejson);
        }
    }
}
//////////////
let SpeciesInputN = document.getElementById('SpeciesInputN');
let DescriptionInputN = document.getElementById('DescriptionInputN');
let player = "r";
let addButtonN = document.getElementById('addButtonN');
addButtonN.onclick= addLoc;

function addLoc(){
    let request = new XMLHttpRequest();
    request.open("POST", "http://localhost:9004/Pokemon/Locz");
    request.setRequestHeader('Content-type','application/json; charset=UFT-8');
    let NormalObj = {Species: SpeciesInputN.value, Loc:DescriptionInputN.value, player:"r"};
    request.send(JSON.stringify(NormalObj));
}