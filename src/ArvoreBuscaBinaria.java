public class ArvoreBuscaBinaria {
    private No raiz;

    public ArvoreBuscaBinaria() {
        this.raiz = null;
    }
    public void inserir(int dado) {
        raiz = inserirRecursivo(raiz, dado);


    }

    private No inserirRecursivo( No atual, int dado) {
        if (atual == null) {
            return new No(dado);
        }
        if (dado < atual.dado) {
            atual.esquerda = inserirRecursivo(atual.esquerda, dado);
        } else if (dado > atual.dado) {
            atual.direita = inserirRecursivo(atual.direita, dado);
        }
        return atual;
    }
    public boolean buscar(int dado) {
        return buscarRecursivo(raiz, dado);
    }

    private boolean buscarRecursivo(No atual, int dado) {
        if (atual == null) {
            return false;
        }
        if (dado == atual.dado) {
            return true;
        }
        if (dado < atual.dado) {
            return buscarRecursivo(atual.esquerda, dado);
        } else {
            return buscarRecursivo(atual.direita, dado);
        }
    }
    private No removerRecursivo(No atual, int dado) {
        if (atual == null) {
            return null;
        }
        if (dado == atual.dado) {
            // Caso 1: Nó sem filhos
            if (atual.esquerda == null && atual.direita == null) {
                return null;
            }
            // Caso 2: Nó com um filho
            if (atual.esquerda == null) {
                return atual.direita;
            }
            if (atual.direita == null) {
                return atual.esquerda;
            }
            // Caso 3: Nó com dois filhos
            int menorValor = encontrarMenorValor(atual.direita);
            atual.dado = menorValor;
            atual.direita = removerRecursivo(atual.direita, menorValor);
            return atual;
        }
        if (dado < atual.dado) {
            atual.esquerda = removerRecursivo(atual.esquerda, dado);
            return atual;
        }
        atual.direita = removerRecursivo(atual.direita, dado);
        return atual;
    }

    private int encontrarMenorValor(No direita) {
        while (direita.esquerda != null) {
            direita = direita.esquerda;
        }
        return direita.dado;
    }


    private No buscarMenorValor(No atual) {
        while (atual.esquerda != null) {
            atual = atual.esquerda;
        }
        return atual;
    }

    public void remover(int i) {
    }
}
