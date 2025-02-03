const formulario = document.querySelector("form"); /* document.querySelector -> se tiver # vai ser o primeiro elemento que contem o id, se tiver . vai ser a classe*/
const Inome = document.querySelector(".nome"); 
const Iemail = document.querySelector(".email");
const Isenha = document.querySelector(".senha");
const Isenha2 = document.querySelector(".senha2");
const Itel = document.querySelector(".telefone");

function cadastrar(){
  if(Isenha.value == Isenha2.value){
  fetch("http://localhost:8080/usuarios", //api para realizar requisições HTTP assíncronas (GET, POST, etc.).
    {
      headers: {
        'Accept': 'application/json', //Informa ao servidor que o cliente espera receber respostas no formato JSON.
        'Content-Type': 'application/json' // Informa ao servidor que o corpo da requisição (body) está sendo enviado no formato JSON.
    },
    method: "POST",
    body: JSON.stringify({
      nome: Inome.value,
      email: Iemail.value,
      senha: Isenha.value,
      senha2: Isenha2.value,
      telefone: Itel.value
     })
  })
  .then(function (res) {
    console.log(res);
  })
  .catch(function (res) {
    console.log(res);})}
    else{
      alert("As senhas não coincidem!");
    }
};
function limpar(){
  Inome.value = "";
  Iemail.value = "";
  Isenha.value = "";
  Isenha2.value = "";
  Itel.value = "";
}


formulario.addEventListener('submit', function(event){ // Quando o envento de submit acontece, tal funcao vai acontecer: element.addEventListener(eventType, listener, options);

  event.preventDefault();
  cadastrar();
  limpar();


});