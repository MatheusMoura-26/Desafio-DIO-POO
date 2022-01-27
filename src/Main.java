import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

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

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);



    }
}
