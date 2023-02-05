Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 01/02/2023
Var
// Seção de Declarações das variáveis 
valor :real
doacao:caractere
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
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