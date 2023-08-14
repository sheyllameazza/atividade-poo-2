public class SQLFactory {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", 10);
        Materias materia1 = new Materias("P.O.O");
        Semestre semestre1 = new Semestre("5°");
        Professor professor1 = new Professor("Leticia", 10);
        Coordenador coordenador1 = new Coordenador("Rafael", 10);
        Diretor diretor1 = new Diretor("Will", 10);

        System.out.println("Aluno " + aluno1.nome + " do " + semestre1.semestre + " semestre, tirou " + aluno1.nota
                + " na matéria de " + materia1.materia + " da professora " + professor1.nome);

        System.out.println("Diretor " + diretor1.nome);
        System.out.println("Coordenador " + coordenador1.nome);
    }

}
