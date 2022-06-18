package questao2;
import connection.ConnectionFactory;
public class Filme {
    private int id;
    private String nome;
    private String descricao;
    private String ano;

    public Filme() {
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public String getAno() {
        return this.ano;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}

