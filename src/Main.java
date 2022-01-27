import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    //Criando objeto curso
        Curso curso1 = new Curso();
    //Passando valores para os seus atributos
    curso1.setTitulo("Curso Java");
    curso1.setDescricao("descrição curso java");
    curso1.setCargaHoraria(8);

    //Criando um segundo curso
    Curso curso2 = new Curso();
    curso2.setTitulo("Curso Javascript");
    curso2.setDescricao("descrição curso javacript");
    curso2.setCargaHoraria(4);


    //Criando mentoria
        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mnetoria de Java");
        mentoria.setDescricao("Descrição da mentoria java");
       //Observar a classe LocalDate. Estudar um pouco mais
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMatheus = new Dev();
        devMatheus.setNome("Matheus");
        devMatheus.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos do Matheus:" + devMatheus.getConteudoInscrito());
        System.out.println("Conteúdos Concluídos Camila:" + devMatheus.getConteudoConcluidos());

        devMatheus.progredir();
        System.out.println("-------");
        System.out.println("Conteúdos Inscritos do Matheus:" + devMatheus.getConteudoInscrito());
        System.out.println("Conteúdos Concluídos Camila:" + devMatheus.getConteudoConcluidos());
        System.out.println("XP:" + devMatheus.calcularTotalXp());

        System.out.println("====================================================");


        Dev devPaulo = new Dev();
        devPaulo.setNome("Paulo");
        devPaulo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos do Paulo:" + devPaulo.getConteudoInscrito());
        System.out.println("Conteúdos Concluídos Camila:" + devPaulo.getConteudoConcluidos());
        devPaulo.progredir();
        devPaulo.progredir();
        devPaulo.progredir();
        System.out.println("-------");

        System.out.println("Conteúdos Inscritos do Paulo:" + devPaulo.getConteudoInscrito());
        System.out.println("Conteúdos Concluídos Camila:" + devPaulo.getConteudoConcluidos());
        System.out.println("XP:" + devPaulo.calcularTotalXp());





    }
}
