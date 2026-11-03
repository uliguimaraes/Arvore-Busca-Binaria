public void main (String[] args) {
        ArvoreBuscaBinaria arvore = new ArvoreBuscaBinaria();
        arvore.inserir(11);
        arvore.inserir(5);
        arvore.inserir(0);
        arvore.inserir(4);
        arvore.inserir(9);
        arvore.inserir(8);
        arvore.inserir(10);
        arvore.inserir(31);
        arvore.inserir(35);
        arvore.inserir(55);
        arvore.inserir(52);

        arvore.inserir(59);

        System.out.println("Busca 5: " + arvore.buscar(5)); // true
        System.out.println("Busca 59: " + arvore.buscar(59)); // true
        System.out.println("Busca 90: " + arvore.buscar(90)); // false

        arvore.remover(20); // Remove nó folha
        arvore.remover(30); // Remove nó com um filho
        arvore.remover(50); // Remove nó com dois filhos

        System.out.println("Busca 20: " + arvore.buscar(20)); // false
        System.out.println("Busca 30: " + arvore.buscar(30)); // false
        System.out.println("Busca 50: " + arvore.buscar(50)); // false
    }

