Algoritmo "05"
// klelson rodrigues-atividade05-slide 02-venturus
Var
// Seção de Declarações das variáveis 
nome:caractere
salario, salariominimo,salarionovo,quantidade,aumento :real

Inicio
escreval("Digite o nome do funcionario ")
leia(nome)
escreva("valor do salario atual")
leia(salario)
escreva("digite o valor do salario minimo")
leia(salariominimo)
quantidade<- salario/salariominimo;
escolha quantidade
caso 0,1,2,3
    aumento<-20;
    salarionovo<-salario+((salario*20)/100)
    escreval("aumento de ",aumento,"% , salario atual",salario," salario novo ",salarionovo)
caso 4,5,6
    aumento<-15;
    salarionovo<-salario+((salario*aumento)/100);
    escreval("aumento de ",aumento,"% , salario atual",salario," salario novo ",salarionovo)
caso 7,8,9
    aumento<-12;
    salarionovo<-salario+((salario*aumento)/100);
    escreval("aumento de ",aumento,"% , salario atual",salario," salario novo ",salarionovo)
caso 10,11,12
    aumento<-10;
    salarionovo<-salario+((salario*aumento)/100);
    escreval("aumento de ",aumento,"% , salario atual",salario," salario novo ",salarionovo)
caso 13,14,15
    aumento<-7;
    salarionovo<-salario+((salario*aumento)/100);
    escreval("aumento de ",aumento,"% , salario atual",salario," salario novo ",salarionovo)
caso 16
    aumento<-0;
    salarionovo<-salario+((salario*aumento)/100);
    escreval("aumento de ",aumento,"% , salario atual",salario," salario novo ",salarionovo)
fimescolha
Fimalgoritmo