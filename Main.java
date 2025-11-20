public class Main {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(5);

        vetor.inserir(10);
        vetor.inserir(30);
        vetor.inserir(40);

        vetor.inserir(20);
        vetor.inserir(50);

        vetor.inserir(60); // Vetor cheio

        System.out.println("\n--- Busca Sequencial ---");
        System.out.println("Buscar 30: " + vetor.buscarSequencial(30));
        System.out.println("Buscar 99: " + vetor.buscarSequencial(99));

        System.out.println("\n----------------------");

        System.out.println("\n--- Busca Binária ---");

        System.out.println("\n--- 1° Ordenação Insert Sort ---");
        System.out.println("Vetor antes da ordenação:");
        vetor.imprimirVetorParaTeste();
        vetor.ordenarInsertSort();
        System.out.println("Vetor após a ordenação:");
        vetor.imprimirVetorParaTeste();
        System.out.println("\n");

        System.out.println("\n--- 2° Busca Binária Ordenada ---");
        System.out.println("Buscar 20: " + vetor.buscarBinaria(20));
        System.out.println("Buscar 99: " + vetor.buscarBinaria(99));

        System.out.println("\n----------------------");

        ABB arvore1 = new ABB();
        System.out.println("--- Inserção Aleatória na Árvore ---");
        arvore1.inserir(50);
        arvore1.inserir(30);
        arvore1.inserir(70);
        arvore1.inserir(20);
        System.out.println("\n----------------------");

        System.out.println("\n--- Busca na Árvore ---");

        System.out.println("Buscar 30: " + arvore1.buscar(30)); // true
        System.out.println("Buscar 90: " + arvore1.buscar(90)); // false
        System.out.println("\n----------------------");

        ABB arvore2 = new ABB();
        System.out.println("\n--- Inserção Ordenada na Árvore ---");
        arvore2.inserir(10);
        arvore2.inserir(20);
        arvore2.inserir(30);
        arvore2.inserir(40);
        System.out.println("\n----------------------");

        System.out.println("\n--- Busca Ordenada na Árvore---");
        System.out.println("Buscar 20: " + arvore2.buscar(20)); // true
        System.out.println("Buscar 50: " + arvore2.buscar(50)); // false

    }
}
