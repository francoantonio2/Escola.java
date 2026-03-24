public class Escola {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", 12345, 12);
        aluno1.setNota(12); // Tentativa de definir uma nota inválida);
        aluno1.exibirInformacoes();

    }
}
