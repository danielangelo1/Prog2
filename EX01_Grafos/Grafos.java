package grafos;

public class Grafos {

	
    int vertice;
    int matriz[][];

    public Grafos(int vertice) {
        this.vertice = vertice;
        matriz = new int[vertice][vertice];
    }
    
    public void adicionarAresta(int origem, int destino) {
    	// adiciona aresta
        matriz[origem][destino]=1;

        //add bak edge for undirected graph
        matriz[destino][origem] = 1;
    }

    public void mostrarGrafo() {
        System.out.println("Grafo: (Matriz Adjacencia)");
        for (int i = 0; i < vertice; i++) {
            for (int j = 0; j <vertice ; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();
        }
        for (int i = 0; i < vertice; i++) {
            System.out.print("Vertice " + (i+1) + " é vizinho de: ");
            for (int j = 0; j <vertice ; j++) {
                if(matriz[i][(j)]==1){
                    System.out.print((j+1) + " ");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Grafos grafo = new Grafos(5);
        grafo.adicionarAresta(0, 1);
        grafo.adicionarAresta(0, 4);
        grafo.adicionarAresta(1, 2);
        grafo.adicionarAresta(1, 3);
        grafo.adicionarAresta(1, 4);
        grafo.adicionarAresta(2, 3);
        grafo.adicionarAresta(3, 4);
        grafo.mostrarGrafo();
    }
}

