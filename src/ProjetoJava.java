public class ProjetoJava {
    public static void main(String[] args){
        Pessoa[] p = new Pessoa[2];
        Livro[]  l = new Livro[3];

        p[0] = new Pessoa("Rodolfo", 27, "masculino");
        p[1] = new Pessoa("Rafaela", 26, "feminino");

        l[0] = new Livro("Senhor dos aneis", "Tolkien", 300, p[0]);
        l[1] = new Livro("Hoobit", "Tolkien", 200, p[1]);
        l[2] = new Livro("nevoeiro", "Stephen King", 400, p[1]);

        l[0].abrir();
        l[0].folhear(250);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());

    }
}
