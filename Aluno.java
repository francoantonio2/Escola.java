class Aluno {
    private String nome;
    private int matricula;
    private double nota;

    public Aluno(String nome, int matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            System.out.println("Nota inválida. Por favor, insira um valor entre 0 e 10.");
        }
    }
       

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Matrícula: " + matricula + ", Nota: " + nota);
    }
}