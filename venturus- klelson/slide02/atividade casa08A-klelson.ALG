Algoritmo "semnome"
// klelson rodrigues-atividade 09-slide02-venturus
Var
altura,peso,imc :real

Inicio
escreval("Digite o valor do peso")
leia(peso)
escreval("digite o valor da altura")
leia (altura)
imc<-peso/(altura*altura)
se (imc<16) entao
escreval("Magreza grave")
fimse
se (imc>16) e (imc<17) entao
escreval("Magreza moderada")
fimse
se (imc>17) e (imc<18.5) entao
escreval("magreza leve")
fimse
se (imc>18.5) e (imc<25) entao
escreval("saudavel")
fimse
se (imc>25) e (imc<30) entao
escreval("sobrepeso")
fimse
se (imc>30) e (imc<35) entao
escreval("obesidade grau 01")
fimse
se(imc>35) e (imc<40) entao
escreval("obesidade grau 02")
fimse
se (imc<40) entao
escreval("obesidade grau 03")
fimse
Fimalgoritmo