package anotacao;

/**
 * @author guiol
 */
public class Nome {

    @Anotacao("getNome")
    private String nome;

    public String getNome() {
        return "Lendo anotação";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
