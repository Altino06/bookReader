package LivroProject;

public class Main {
    public static void main(String[] args) {
        Pessoa [] person = new Pessoa[2];
        Livro [] book = new Livro[2];

        person [0] = new Pessoa("Matheus", 25, "Masc");
        person [1] = new Pessoa("Gabriel", 25, "Masc");

        book [0]  = new Livro("Admirável mundo novo",  "Aldous Huxley",  323,  135,  person [0]);
        book [1] = new Livro("On the road",  "Anônimo",  157, 120, person[1]);

        book [0].abrir();
        book [0].folhear(322);
        book [0].avancarPag();
        System.out.println(book [0].detalhes());
    }
}
