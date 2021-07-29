package estruturas.pilhas;

public class Main {
    public static void main(String[] args) {
        Pilha minhaPilha = new Pilha();

        minhaPilha.push(new No("Conteudo 1"));
        minhaPilha.push(new No("Conteudo 2"));
        minhaPilha.push(new No("Conteudo 3"));
        minhaPilha.push(new No("Conteudo 4"));
        minhaPilha.push(new No("Conteudo 5"));
        minhaPilha.push(new No("Conteudo 6"));
        System.out.println(minhaPilha);

        minhaPilha.pop();
        System.out.println(minhaPilha);

        System.out.println(minhaPilha.top());
    }

}
