public class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private String sexo;

    //Construtor
    public Pessoa(String name, int age, String sex){
        nome = name;
        idade = age;
        sexo = sex;
    }

    //Métodos especiais
    public void fazerAniver(){
        this.idade = this.idade + 1;
    }


    //Métodos getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade(){
        return idade;
    }

    public void setIdade(int age){
        this.idade = age;
    }

    public String getSexo(){
        return sexo;
    }

    public void setSexo(String sex){
        this.sexo = sex;
    }



}
