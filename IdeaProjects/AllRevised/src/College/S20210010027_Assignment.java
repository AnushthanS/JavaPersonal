package College;

import java.util.Arrays;
import java.util.Scanner;

public class S20210010027_Assignment {

    private static int minIndex(int[] arr){
        int index = -1;
        int minValue = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < minValue) {
                minValue = arr[i];
                index = i;
            }
        }
        return index;
    }
    private static int[][] dijkstra(int[][] graph, int source, int destination) {
        int nodes = graph.length;
        int[] distance = new int[nodes];
        int[][] path = new int[nodes][2];

        for (int i = 0; i < nodes; i++) {
            distance[i] = Integer.MAX_VALUE;
            path[i][0] = -1;
            path[i][1] = Integer.MAX_VALUE;
        }

        distance[source] = 0;
        path[source][0] = source;
        path[source][1] = 0;

        for (int i = 0; i < nodes; i++) {
            int u = minIndex(distance);
            if (u == destination) break;

            for (int v = 0; v < nodes; v++) {
                if (graph[u][v] != 0 && distance[u] + graph[u][v] < distance[v]) {
                    distance[v] = distance[u] + graph[u][v];
                    path[v][0] = u;
                    path[v][1] = graph[u][v];
                }
            }
            distance[u] = Integer.MAX_VALUE;
        }

        int[][] sp = new int[nodes][2];
        int index = nodes - 1;
        sp[index][0] = destination;
        sp[index][1] = 0;
        while (index > 0) {
            int u = sp[index][0];
            int weight = sp[index][1];
            index--;
            int v = path[u][0];
            sp[index][0] = v;
            sp[index][1] = weight + path[u][1];
        }
        return sp;
    }
    private static int[] fragmentation(int payload, int mtu){
        int mtuData = mtu - 20;
        int totalData = payload - 20;

        int noOfFragments = (int)Math.ceil((payload+0.0)/mtuData);
        int[] fragments = new int[noOfFragments];

        int k = 0;
        while(totalData > mtuData){
            fragments[k] = mtu;
            totalData -= mtuData;
            k++;
        }
        fragments[k] = totalData + 20;
        return fragments;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int payload, mtu;

        System.out.print("Enter payload (bytes): ");
        payload = scanner.nextInt();

        System.out.print("Enter mtu (bytes): ");
        mtu = scanner.nextInt();

        int[][] graph;
        int nodes;

        System.out.print("Enter 1 to use the default graph, 2 to use a new input: ");
        int choice = scanner.nextInt();

        if(choice == 1){
            nodes = 6;
            graph = new int[nodes][nodes];
            for(int i = 0; i < nodes; i++){
                Arrays.fill(graph[i], 0);
            }

            graph[0][1] = 7;
            graph[0][2] = 12;
            graph[1][2] = 2;
            graph[1][3] = 9;
            graph[2][4] = 10;
            graph[3][5] = 1;
            graph[4][3] = 4;
            graph[4][5] = 5;

        } else if(choice == 2){
            System.out.print("Enter number of nodes: ");
            nodes = scanner.nextInt();

            graph = new int[nodes][nodes];

            System.out.println("Enter the adjacency matrix line by line: ");
            for (int i = 0; i < nodes; i++){
                for(int j = 0; j < nodes; j++){
                    graph[i][j] = scanner.nextInt();
                }
            }
        } else {
            System.out.println("Invalid choice");
            return;
        }

        System.out.print("Enter the source node: ");
        int source = scanner.nextInt();

        System.out.print("Enter the destination node: ");
        int destination = scanner.nextInt();

        int[] fragments = fragmentation(payload, mtu);
        System.out.println("Payload fragmented into "+fragments.length+ " fragments");

        int[][] path = dijkstra(graph, source, destination);

        int c = 1;
        for(int fragment: fragments){
            System.out.println("Fragment "+ c + " of size " + fragment);
            System.out.print("The shortest path is : ");
            int prev = -1;
            for(int[] arr: path){
                int n = arr[0];
                if(n != -1 && n != prev){
                    System.out.print(arr[0] + " ");
                    prev = n;
                }
            }
            System.out.println("\nTotal cost = " + path[0][1]);
            c++;
            System.out.println();
        }
    }
}