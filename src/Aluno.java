import java.util.Objects;

public class Aluno {
    private String nome;
    private int idade;
    private String dataNascimento;
    private String registroGeral;
    private String cpf;
    private String nomeMae;
    private String nomepai;
    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculado;

    private Disciplina disciplina = new Disciplina();

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }


    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRegistroGeral() {
        return registroGeral;
    }

    public void setRegistroGeral(String registroGeral) {
        this.registroGeral = registroGeral;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomepai;
    }

    public void setNomePai(String nomepai) {
        this.nomepai = nomepai;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerieMatriculado() {
        return serieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }


    public double getMediaNotas(){
       return (disciplina.getNota1() + disciplina.getNota2()
               + disciplina.getNota3() + disciplina.getNota4()) / 4 ;
    }

    public  boolean getAlunoAprovado(){
        double media = this.getMediaNotas();
        if( media >= 7){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", registroGeral='" + registroGeral + '\'' +
                ", cpf='" + cpf + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", nomepai='" + nomepai + '\'' +
                ", dataMatricula='" + dataMatricula + '\'' +
                ", nomeEscola='" + nomeEscola + '\'' +
                ", serieMatriculado='" + serieMatriculado + '\'' +
                ", disciplina=" + disciplina +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return idade == aluno.idade && Objects.equals(nome, aluno.nome)
                && Objects.equals(dataNascimento, aluno.dataNascimento)
                && Objects.equals(registroGeral, aluno.registroGeral)
                && Objects.equals(cpf, aluno.cpf)
                && Objects.equals(nomeMae, aluno.nomeMae)
                && Objects.equals(nomepai, aluno.nomepai)
                && Objects.equals(dataMatricula, aluno.dataMatricula)
                && Objects.equals(nomeEscola, aluno.nomeEscola)
                && Objects.equals(serieMatriculado, aluno.serieMatriculado)
                && Objects.equals(disciplina, aluno.disciplina);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, dataNascimento, registroGeral, cpf, nomeMae, nomepai, dataMatricula, nomeEscola, serieMatriculado, disciplina);
    }



    }


