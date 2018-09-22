import java.util.*;


class Graph{
    static Map<Integer,ArrayList<Integer>> gr = new HashMap<>();
    static int numVertices = 0,numEdges = 0;

    static int getVertices(){
        return numVertices;
    }

    static int getEdges(){
        return numEdges;
    }

    static int addVertices(){
        ArrayList<Integer> neig = new ArrayList<>();
        gr.put(numVertices, neig);
        numVertices++;
        return numVertices-1;
    }

    static void addEdges(int a, int b){
        if(a<numVertices && b<numVertices){
            (gr.get(a)).add(b);
            (gr.get(b)).add(a);
        }else{
            System.out.println("Enter valid vertices");
        }
    }

    static ArrayList<Integer> getNeig(int a){
        return gr.get(a);
    }

    public static void main(String[] args) {
        System.out.println(addVertices());
        System.out.println(addVertices());
        System.out.println(addVertices());
        System.out.println(addVertices());

        addEdges(0,1);
        addEdges(0,2);
        addEdges(1,3);
        addEdges(1,4);
        addEdges(2,3);

        System.out.println("0 : " + getNeig(0));
        System.out.println("1 : " + getNeig(1));
        System.out.println("2 : " + getNeig(2));
        System.out.println("3 : " + getNeig(3));
    }

}