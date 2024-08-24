import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java Básico");
        curso1.setDescricao("Curso de introdução à linguagem Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Java Avançado");
        curso2.setDescricao("Curso avançado de Java");
        curso2.setCargaHoraria(12);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Carreira");
        mentoria1.setDescricao("Mentoria sobre desenvolvimento de carreira");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devGuilherme = new Dev();
        devGuilherme.setNome("Guilherme");
        devGuilherme.inscreverNoBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Guilherme: " + devGuilherme.getConteudosInscritos());
        devGuilherme.progredir();
        devGuilherme.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Guilherme: " + devGuilherme.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Guilherme: " + devGuilherme.getConteudosConcluidos());
        System.out.println("XP: " + devGuilherme.calcularTotalXp());
    }
}
