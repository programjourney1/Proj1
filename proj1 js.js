console.log(document);
let button = document.getElementById('loadButton');
let buttonf = document.getElementById('loadButtonf');
let buttonN = document.getElementById('loadButtonN');
let buttonB = document.getElementById('loadButtonB');
let content = document.getElementById('container');
let SpeciesInputB = document.getElementById('SpeciesInputB');
let DescriptionInputB = document.getElementById('DescriptionInputB');
let addButtonB = document.getElementById('addButtonB');
////
let SpeciesInputN = document.getElementById('SpeciesInputN');
let DescriptionInputN = document.getElementById('DescriptionInputN');
let addButtonN = document.getElementById('addButtonN');
///
let SpeciesInputF = document.getElementById('SpeciesInputF');
let DescriptionInputF = document.getElementById('DescriptionInputF');
let addButtonF = document.getElementById('addButtonF');
////
let SpeciesInputP = document.getElementById('SpeciesInputP');
let DescriptionInputP = document.getElementById('DescriptionInputP');
let addButtonP = document.getElementById('addButtonP');
//let button.onclick = loadSpan;
button.onclick = loadPoison;
buttonf.onclick = loadFly;
buttonN.onclick = loadNorm;
buttonB.onclick = loadBug;
addButtonB.onclick= addBug;
addButtonN.onclick= addNormal;
addButtonF.onclick= addFlying;
addButtonP.onclick= addPoison;
//loadButton.addEventListener("click", loadPoison);

function loadSpan(response){
//content.innerText = "Poison Pokemon"
for(let i = 0; i < response.length; i++){
    let paintingTitle = document.createElement("p");
    paintingTitle.innerText = response[i].Species +" -"+ response[i].Description;
    content.appendChild(paintingTitle);
}}
function loadPoison(){
    let request = new XMLHttpRequest();
    request.open("GET", "http://localhost:9004/Pokemon/Poison");
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
//////////////////////////////
function loadSpanF(response){
    content.innerText = "Flying Pokemon"
    for(let i = 0; i < response.length; i++){
        let paintingTitle = document.createElement("p");
        paintingTitle.innerText = response[i].Species +" -"+ response[i].Description;
        content.appendChild(paintingTitle);
    }}
    function loadFly(){
        let request = new XMLHttpRequest();
        request.open("GET", "http://localhost:9004/Pokemon/Flying");
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
////////////////
function loadSpanN(response){
    content.innerText = "Normal Pokemon"
    for(let i = 0; i < response.length; i++){
        let paintingTitle = document.createElement("p");
        paintingTitle.innerText = response[i].Species +" -"+ response[i].Description;
        content.appendChild(paintingTitle);
    }}
    function loadNorm(){
        let request = new XMLHttpRequest();
        request.open("GET", "http://localhost:9004/Pokemon/Normal");
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
    /////////////////////
    function loadSpanB(response){
        content.innerText = "Bug Pokemon"
        for(let i = 0; i < response.length; i++){
            let paintingTitle = document.createElement("p");
            paintingTitle.innerText = response[i].Species +" -"+ response[i].Description;
            content.appendChild(paintingTitle);
        }}
        function loadBug(){
            let request = new XMLHttpRequest();
            request.open("GET", "http://localhost:9004/Pokemon/Bug");
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
        async function getBug(){
            console.log("button clicked");
            let response = await fetch("http://localhost:9004/Pokemon/Bug");
            response = await response.json();
            loadBug(response);
        }
        ////////////////////////addBug
        function addBug(){
            let request = new XMLHttpRequest();
            request.open("POST", "http://localhost:9004/Pokemon/Bug");
            request.setRequestHeader('Content-type','application/json; charset=UFT-8');
            let BugObj = {Species: SpeciesInputB.value, Description:DescriptionInputB.value};
            request.send(JSON.stringify(BugObj));
        }

/////
function addNormal(){
    let request = new XMLHttpRequest();
    request.open("POST", "http://localhost:9004/Pokemon/Normal");
    request.setRequestHeader('Content-type','application/json; charset=UFT-8');
    let NormalObj = {Species: SpeciesInputN.value, Description:DescriptionInputN.value};
    request.send(JSON.stringify(NormalObj));
}
function addFlying(){
    let request = new XMLHttpRequest();
    request.open("POST", "http://localhost:9004/Pokemon/Flying");
    request.setRequestHeader('Content-type','application/json; charset=UFT-8');
    let FlyingObj = {Species: SpeciesInputF.value, Description:DescriptionInputF.value};
    request.send(JSON.stringify(FlyingObj));
}

function addPoison(){
    let request = new XMLHttpRequest();
    request.open("POST", "http://localhost:9004/Pokemon/Poison");
    request.setRequestHeader('Content-type','application/json; charset=UFT-8');
    let PoisonObj = {Species: SpeciesInputP.value, Description:DescriptionInputP.value};
    request.send(JSON.stringify(PoisonObj));
}
////////////






























function loadPoison(){
    let request = new XMLHttpRequest();
    request.open("GET", "http://localhost:9004/Pokemon/Poison");
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
