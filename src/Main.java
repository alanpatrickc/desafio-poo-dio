import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

   Curso curso1 = new Curso();

    curso1.setTitulo("Curso Java");
    curso1.setDescricao("Java POO");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();
    curso2.setTitulo("Curso Java POO");
    curso2.setDescricao("Programação Orientada a Objetos");
    curso2.setCargaHoraria(4);

    Mentoria mentoria = new Mentoria();

    mentoria.setTitulo("Alan Patrickc");
    mentoria.setTitulo("Programação Java");
    mentoria.setData(LocalDate.now());

    System.out.println(curso1);
    System.out.println(curso2);
    System.out.println(mentoria);
    }
}
