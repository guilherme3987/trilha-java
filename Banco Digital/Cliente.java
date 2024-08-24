import java.time.LocalDate;

public class Cliente {
    private String nome;
    private String s_nome;
    private String endereco;
    private LocalDate data_nascimento;
    private String profissao;
    public Cliente(String nome, String s_nome, String endereco, LocalDate data_nascimento, String profissao) {
        this.nome = nome;
        this.s_nome = s_nome;
        this.endereco = endereco;
        this.data_nascimento = data_nascimento;
        this.profissao = profissao;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getS_nome() {
        return s_nome;
    }
    public void setS_nome(String s_nome) {
        this.s_nome = s_nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public LocalDate getData_nascimento() {
        return data_nascimento;
    }
    public void setData_nascimento(LocalDate data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    public String getNomeCompleto() {
        return nome + " " + s_nome;
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + s_nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", data de nascimento=" + data_nascimento +
                ", profissao='" + profissao + '\'' +
                '}';
    }

}
