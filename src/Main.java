import java.time.LocalDate;

import desafio.dominio.Bootcamp;
import desafio.dominio.Curso;
import desafio.dominio.Dev;
import desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Python");
        curso2.setDescricao("descrição curso Python");
        curso2.setCargaHoraria(12);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria java");
        mentoria1.setDescricao("descrição aijsasji");
        mentoria1.setData(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Orange Tech+ BackEnd");
        bootcamp.setDescricao("Bootcamp com foco em desenvolvimento backend");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devHenrique = new Dev();
        devHenrique.setNome("Henrique");
        devHenrique.inscreverBootcamp(bootcamp);
        System.out.println("---" + devHenrique.getNome() + "---");
        System.out.println("Conteudos Inscritos: " + devHenrique.getConteudosInscritos());
        devHenrique.progredir();
        devHenrique.progredir();
        System.out.println("---");
        System.out.println("Conteudos Inscritos: " + devHenrique.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + devHenrique.getConteudosConcluidos());
        System.out.println("Xp: " + devHenrique.calcularTotalXp());
        System.out.println("-------------------");

        Dev devOliveira = new Dev();
        devOliveira.setNome("Oliveira");
        devOliveira.inscreverBootcamp(bootcamp);
        System.out.println("---" + devOliveira.getNome() + "---");
        System.out.println("Conteudos Inscritos: " + devOliveira.getConteudosInscritos());
        devOliveira.progredir();
        devOliveira.progredir();
        devOliveira.progredir();
        System.out.println("---");
        System.out.println("Conteudos Inscritos: " + devOliveira.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + devOliveira.getConteudosConcluidos());
        System.out.println("Xp: " + devOliveira.calcularTotalXp());
        System.out.println("-------------------");

    }
}
