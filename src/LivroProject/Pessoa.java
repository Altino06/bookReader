package LivroProject;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    //Construtor
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    //Método simples
    public void fazerAniver() {
    this.idade ++;
    }

    //métodos especiais
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome1) {
        this.nome = nome1;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade1) {
        this.idade = idade1;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo1) {
        this.sexo = sexo1;
    }
}
