import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bootcamp {
    private String nome;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataFinal;
    private List<Conteudo> conteudos = new ArrayList<>();
    private List<Dev> devsInscritos = new ArrayList<>();

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }

    public List<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(List<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public List<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(List<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    // Methods
    public void inscreverDev(Dev dev) {
        this.devsInscritos.add(dev);
        dev.getConteudosInscritos().addAll(this.conteudos);
    }

    public void calcularTotalXp() {
        // Implementar cálculo de XP total do bootcamp (se necessário)
    }

    public void exibirCursos() {
        for (Conteudo conteudo : conteudos) {
            System.out.println(conteudo);
        }
    }
}

