import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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
    mentoria.setDescricao("Programação Java");
    mentoria.setData(LocalDate.now());



     Bootcamp bootcamp = new Bootcamp();
     bootcamp.setNome("Bootcamp Java Developer");
     bootcamp.setDescricao("Descrição Java Developer");
     bootcamp.getConteudos().add(curso1);
     bootcamp.getConteudos().add(curso2);
     bootcamp.getConteudos().add(mentoria);

     Dev devCamila = new Dev();
     devCamila.setNome("Camila");
     devCamila.inscreverBootcamp(bootcamp);
     System.out.println("Conteudos Inscritos Camila" + devCamila.getConteudosInscritos());
     devCamila.progredir();
     devCamila.progredir();
     System.out.println("-");
     System.out.println("Conteudos Inscritos Camila" + devCamila.getConteudosInscritos());
     System.out.println("Conteudos Concluidos Camila" + devCamila.getConteudosConcluidos());
     System.out.println("XP :" + devCamila.calcularTotalXp());

     System.out.println("___________________");

     Dev devJoao = new Dev();
     devJoao.setNome("João");
     devJoao.inscreverBootcamp(bootcamp);
     System.out.println("Conteudos Inscritos João" + devJoao.getConteudosInscritos());
     devJoao.progredir();
     devJoao.progredir();
     devJoao.progredir();
     System.out.println("-");
     System.out.println("Conteudos Inscritos João" + devJoao.getConteudosInscritos());
     System.out.println("Conteudos Concluidos João " + devJoao.getConteudosConcluidos());
     System.out.println("XP :" + devJoao.calcularTotalXp());


    }
}
