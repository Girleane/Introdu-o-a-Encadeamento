package nos;

public class No {
    private final String conteudo;
    private No ProximoNo;

    public No(String conteudo) {
        this.conteudo = conteudo;
        this.ProximoNo = null;
    }

    public No getProximoNo() {
        return ProximoNo;
    }

    public void setProximoNo(No proximoNo) {
        ProximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" + conteudo + "}";
    }
}
