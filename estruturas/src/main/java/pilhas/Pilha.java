package estruturas.pilhas;

public class Pilha {
    No refTop = null;

    public void push(No novoNo) {
        No noAux = refTop;
        refTop = novoNo;
        refTop.setRefNo(noAux);
    }

    public void pop() {
        if (!isEmpty()) {
            No noPoped = refTop;
            refTop = refTop.getRefNo();
        }
    }

    public boolean isEmpty() {
        return refTop == null;
    }

    public No top() {
        return refTop;
    }

    @Override
    public String toString() {
        String stringRetorno = "------------\n";
        stringRetorno += "pilhas\n";
        stringRetorno += "------------\n";
        No noAuxiliar = refTop;

        while (true) {
            if (noAuxiliar != null) {
                stringRetorno += "[No{Conteudo= " + noAuxiliar.getConteudo() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            } else {
                break;
            }
        }
        stringRetorno += "============";
        return stringRetorno;
    }
}
