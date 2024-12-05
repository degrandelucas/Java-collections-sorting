package list.collections.model;

public class Titulo implements Comparable<Titulo> {
    private String nome;
    private String tipoConteudo;

    public Titulo(String nome, String tipoConteudo) {
        this.nome = nome;
        this.tipoConteudo = tipoConteudo;
    }

    public String getNome() {
        return nome;
    }

    public String getTipoConteudo() {
        return tipoConteudo;
    }

    @Override
    public String toString() {
        return "Nome do Título: " + nome + " - Conteudo " + tipoConteudo;
    }

    @Override
    public int compareTo(Titulo nomeSeguinte) {
        return this.nome.compareTo(nomeSeguinte.getNome());
    }
}
