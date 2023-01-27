var items = document.querySelectorAll('.item');

for (var i = 0; i < items.length; i++) {
  items[i].addEventListener('mouseenter', function() {
    this.classList.add('highlighted');
    this.style.opacity = 1;
  });
  items[i].addEventListener('mouseleave', function() {
    this.classList.remove('highlighted');
    this.style.opacity = 0.5;
  });
}

function enviarEmail() {
  event.preventDefault(); // evita o comportamento padrão do formulário
  var nome = document.getElementsByName("nome")[0].value;
  var sobrenome = document.getElementsByName("sobrenome")[0].value;
  var email = document.getElementsByName("email")[0].value;
  var assunto = document.getElementsByName("assunto")[0].value;
  var mensagem = document.getElementsByName("mensagem")[0].value;

  var destinatario = "seuemail@dominio.com";
  var assunto = "Novo contato do formulário: " + assunto;
  var corpo = "Nome: " + nome + " " + sobrenome + "\nEmail: " + email + "\nMensagem: " + mensagem;
  var remetente = "De: " + nome + " " + sobrenome + " <" + email + ">";

  // Envia o email usando a API do javascript
  Email.send({
      Host : "smtp.seudominio.com",
      Username : "seuemail@dominio.com",
      Password : "suasenha",
      To : destinatario,
      From : remetente,
      Subject : assunto,
      Body : corpo
  }).then(
    message => alert(message)
  );
}
