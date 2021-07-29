package nos;

public class Main {
    public static void main(String[] args) {
        No no1 = new No("Conteudo No1");
        No no2 = new No("Conteudo no2");

        no1.setProximoNo(no2);

        No no3 = new No("Conteudo no3");
        no2.setProximoNo(no3);

        System.out.println(no1 + " Proximo " + no1.getProximoNo());
        System.out.println(no2 + " Proximo " + no2.getProximoNo());
        System.out.println(no3 + " Proximo " + no3.getProximoNo()); //fim do encadeamento
    }
}
