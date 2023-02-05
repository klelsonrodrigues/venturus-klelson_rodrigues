Algoritmo "04"
// klelson Rodrigues-atividade04-slide02-venturus
Var
nota1,nota2,nota3,media:real

Inicio
escreval ("digite a primeira nota da prova do aluno: ")
leia(nota1)
escreval ("digite a segunda nota da prova do aluno: ")
leia(nota2)
escreval ("digite a terceira nota da prova do aluno :")
leia(nota3)
media<-(nota1+nota2+nota3)/3;
se (media>=7)entao
	escreval("aluno aprovado com media  ",media)
fimse
se (media<7)e(media>=5)entao
	escreval("aluno aprovado com media  ",media)
fimse
se (media<5)entao
	escreval("aluno reprovado com media ",media)
fimse
Fimalgoritmo