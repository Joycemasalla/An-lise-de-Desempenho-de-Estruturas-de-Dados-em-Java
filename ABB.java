public class ABB {
    private No raiz;

    public ABB() {
        this.raiz = null;
    }

    // métodos publicos para chamar os métodos recursivos 
    public void inserir(int valor) {
        this.raiz = inserirRecursivo(this.raiz, valor);
    }

    public boolean buscar(int valor) {
        return buscarRecursivo(this.raiz, valor);
    }

    // métodos privados recursivos (os métodos reais)
    private No inserirRecursivo(No raiz, int valor) {
        if (raiz == null) {
            return new No(valor); 
        }

        if(valor < raiz.valor){
            raiz.esquerda = inserirRecursivo(raiz.esquerda, valor);
        } else if (valor > raiz.valor){
            raiz.direita = inserirRecursivo(raiz.direita, valor);
        }
        return raiz;
    }

    private boolean buscarRecursivo(No raiz, int valor){
        if(raiz == null){
            return false;
        }
        if(raiz.valor == valor){
            return true;
        }
        if(valor > raiz.valor){
            return buscarRecursivo(raiz.direita, valor);
        } else {
            return buscarRecursivo(raiz.esquerda, valor);
        }

    }
}
