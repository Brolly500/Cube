public class Facet {
    private R3Vector[] vertex;
    //private Color color;
    public Facet(R3Vector v1, R3Vector v2, R3Vector v3, R3Vector v4){
        vertex = new R3Vector[4];
        vertex[0]=v1;
        vertex[1]=v2;
        vertex[2]=v3;
        vertex[3]=v4;

    }
    public void out(){
        for(int i = 0; i<4; i++){
            System.out.println(vertex[i]);
            }
    }
}
