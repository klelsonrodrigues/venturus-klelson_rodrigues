Algoritmo "semnome"
// Disciplina   : [Linguagem e L?gica de Programa??o]
// Professor   : Antonio Carlos Nicolodi 
// Descri??o   : Aqui voc? descreve o que o programa faz! (fun??o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 01/02/2023
Var
// Se??o de Declara??es das vari?veis 
valor :real
doacao:caractere
Inicio
// Se??o de Comandos, procedimento, fun??es, operadores, etc... 
escreval("digite ovalor de 1 a 5 para doar")
leia(valor)
escolha valor
    caso 1
      doacao<-"doar 10"
    caso 2
      doacao<-"doar 25"
    caso 3
      doacao<-"doar 50"
    caso 4
      doacao<-"doar outro valor"
    caso 5
      doacao<-"cancelar"
fimescolha
escreval ("voce escolheu ",doacao)
escreval ("obrigado")
Fimalgoritmo