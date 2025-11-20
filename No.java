public class No {
    int valor;
    No esquerda;
    No direita;
    int altura; //para arvore AVL

    public No(int valor) {
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
        this.altura = 1; //para arvore AVL
    }
}
