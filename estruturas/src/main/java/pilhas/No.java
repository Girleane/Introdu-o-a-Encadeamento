package estruturas.pilhas;

public class No {
    private String conteudo;
    private No refNo = null;

    public No(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "Nos{" +
                "conteudo= " + conteudo + '}';
    }
}
