import javax.swing.*;
public class PrimeiraClasseJava {


    private static String disciplina;

    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        String idade = JOptionPane.showInputDialog("Qual sua idade? ");
        String dataNascimento = JOptionPane.showInputDialog("Data de nascimento? ");
        String registroGeral = JOptionPane.showInputDialog("Registro Geral? ");
        String cpf = JOptionPane.showInputDialog("Qual Seu CPF? ");
        String nomeMae = JOptionPane.showInputDialog("Qual nome da Mãe? ");
        String nomePai = JOptionPane.showInputDialog("Qual nome do pai? ");
        String dataMatricula = JOptionPane.showInputDialog("Qual a data da matricula? ");
        String serieMatriculado = JOptionPane.showInputDialog("Qual a serie da Matricula? ");
        String nomeEscola = JOptionPane.showInputDialog("Qual nome da escola? ");

        String disciplina1 = JOptionPane.showInputDialog("Disciplina 1");
        String nota1 = JOptionPane.showInputDialog("Nota 1: ");

        String disciplina2 = JOptionPane.showInputDialog("Disciplina 2");
        String nota2 = JOptionPane.showInputDialog("Nota 2: ");

        String disciplina3 = JOptionPane.showInputDialog("Disciplina 3");
        String nota3 = JOptionPane.showInputDialog("Nota 3: ");

        String disciplina4 = JOptionPane.showInputDialog("Disciplina 4");
        String nota4 = JOptionPane.showInputDialog("Nota 4: ");


        aluno.setNome(nome);
        aluno.setIdade(Integer.valueOf(idade));
        aluno.setDataNascimento(dataNascimento);
        aluno.setRegistroGeral(registroGeral);
        aluno.setCpf(cpf);
        aluno.setNomeMae(nomeMae);
        aluno.setNomePai(nomePai);
        aluno.setDataMatricula(dataMatricula);
        aluno.setSerieMatriculado(serieMatriculado);
        aluno.setNomeEscola(nomeEscola);

        aluno.getDisciplina().setDisciplina1(disciplina1);
        aluno.getDisciplina().setNota1(Double.parseDouble(nota1));

        aluno.getDisciplina().setDisciplina2(disciplina2);
        aluno.getDisciplina().setNota2(Double.parseDouble(nota2));

        aluno.getDisciplina().setDisciplina2(disciplina3);
        aluno.getDisciplina().setNota3(Double.parseDouble(nota3));

        aluno.getDisciplina().setDisciplina4(disciplina4);
        aluno.getDisciplina().setNota4(Double.parseDouble(nota4));

        System.out.println(aluno.toString());

        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Data de nascimento: " + aluno.getDataNascimento());
        System.out.println("Registro Geral: " + aluno.getRegistroGeral());
        System.out.println("CPF: " + aluno.getCpf());
        System.out.println("Nome da Mãe: " + aluno.getNomeMae());
        System.out.println("Nome do Pai: " + aluno.getNomePai());
        System.out.println("Serie da Matricula: " + aluno.getDataMatricula());
        System.out.println("Nome da Escola: " + aluno.getNomeEscola());
        //Disciplinas e notas

        System.out.println("Disciplina 1: " + aluno.getDisciplina().getDisciplina1());
        System.out.println("Primeira nota: " + aluno.getDisciplina().getNota1());

        System.out.println("Disciplina 2: " +aluno.getDisciplina().getDisciplina2());
        System.out.println("Segunda nota: " + aluno.getDisciplina().getNota2());

        System.out.println("Disciplina 3: " + aluno.getDisciplina().getDiscisplina3());
        System.out.println("terceira nota: " + aluno.getDisciplina().getNota3());

        System.out.println("Disciplina 4: " + aluno.getDisciplina().getDisciplina4());
        System.out.println("Quarta nota: " + aluno.getDisciplina().getNota4());


        System.out.println("Media da Nota: " + aluno.getMediaNotas());
        System.out.println("resultado: " + ((aluno.getAlunoAprovado()) ? "Aprovado" : "Reprovado"));


    }}

