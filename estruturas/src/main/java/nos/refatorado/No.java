package nos.refatorado;

public class No<T> {

    public T conteudo;
    public No<T> proximoNo = null;

    public No(T conteudo) {
        this.conteudo = conteudo;
    }

    public void setProximoNo(No<T> proximoNo) {

        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {

        return "No{" + conteudo + '}';
    }

    public String toStringEncadeado() {
        String str = "No{" + conteudo + "}";

        if (proximoNo != null) {
            str += "->" + proximoNo;
        } else {
            str += "->null";
        }
        str += "\n";
        return str;
    }
}
