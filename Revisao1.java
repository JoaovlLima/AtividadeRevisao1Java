package AtividadeRevisao1;

import java.util.Scanner;

public class Revisao1 {
    Scanner sc = new Scanner(System.in);

    //Criar metodos da Classe

    public void exemplo1(){
      //criar um projeto para ler 2 notas e a frequencia
      //e falar se o aluno esta reporvado ou aprovado
      //1. ler a primeira nota  

        System.out.println("Informe a primeira nota");
        double nota1 = sc.nextDouble(); 

        //2. ler a segunda nota

        System.out.println("informe a segunda nota");
        double nota2 = sc.nextDouble();
        double media = (nota1+nota2)/2;

        //mostrar média do Aluno
        System.out.println("A média do Aluno é "+media);

        // informar o total de aulas
        System.out.println("Informe o total de aulas dadas");
        int aulasDadas = sc.nextInt();

        // informe numero de faltas aluno
        System.out.println("Informe a quantidade de faltas do aluno");
        int nfaltas = sc.nextInt();

        // calcular a % de frequencia
        double frequencia = (aulasDadas-nfaltas)*100/aulasDadas;

        //Mostrar a % de frequencia do aluno
        System.out.println("o Aluno teve "+frequencia+"%");

        //se (media>=50 e Frequencia>=75)
        if(media>=50 && frequencia>=75){
            System.out.println("Aluno Aprovado");
        }else if(media<50 && frequencia>=75){
            System.out.println("Aluno de Recuperação");
        }else{
            System.out.println("Aluno Reprovado");
        }



    


    }
    
    
    
}
