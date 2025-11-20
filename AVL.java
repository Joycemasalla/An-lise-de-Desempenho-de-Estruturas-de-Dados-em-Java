public class AVL {
    private No raiz;

    public AVL() {
        this.raiz = null;
    }

    private int calcularAltura(No no) {
        if (no == null) {
            return 0;
        }
        return no.altura;
    }

    private int calcularBalanceamento(No no) {
        if (no == null) {
            return 0;
        }
        return calcularAltura(no.esquerda) - calcularAltura(no.direita);
    }
}
