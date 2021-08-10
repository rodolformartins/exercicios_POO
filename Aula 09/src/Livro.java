public class Livro implements publicacao{
    //Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;


    //Construtor
    public Livro(String title,String author, int total, Pessoa reader){
        this.titulo = title;
        this.autor = author;
        this.totPaginas = total;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = reader;
    }

    //Métodos especiais
    public boolean detalhes(boolean i){
        return true;
    }

    public String detalhes(){
        return "Livro{" + "titulo=" + titulo + "\n, autor=" + autor + "\n, totPaginas=" + totPaginas + "\n, pagAtual=" + pagAtual + "\n,aberto=" + aberto +
                "\n,leitor=" + leitor.getNome() + "\n,idade=" + leitor.getIdade() + "\n,sexo=" + leitor.getSexo()
                + '}';
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;

    }


    @Override
    public void folhear(int p) {
        if(p > totPaginas){
            this.pagAtual = 0;
        }
        else{
            this.pagAtual = p;
        }
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
}


