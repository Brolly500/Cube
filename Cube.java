public class Cube {
    public Facet[] facets;

    public Cube() {
        facets = new Facet[6];
        facets[0] = new Facet(new R3Vector(0,0,0), //down
                              new R3Vector(1,0,0),
                              new R3Vector(1,1,0),
                              new R3Vector(0,1,0));

        facets[1] = new Facet(new R3Vector(0,0,0), //back
                new R3Vector(0,0,1),
                new R3Vector(0,1,1),
                new R3Vector(0,1,0));

        facets[2] = new Facet(new R3Vector(0,1,0), //right
                new R3Vector(1,1,0),
                new R3Vector(1,1,1),
                new R3Vector(0,1,1));

        facets[3] = new Facet(new R3Vector(1,0,0), //front
                new R3Vector(1,0,1),
                new R3Vector(1,1,1),
                new R3Vector(1,1,0));

        facets[4] = new Facet(new R3Vector(0,0,0), //left
                new R3Vector(1,0,0),
                new R3Vector(1,0,1),
                new R3Vector(0,0,1));

        facets[5] = new Facet(new R3Vector(0,0,1), //up
                new R3Vector(1,0,1),
                new R3Vector(1,1,1),
                new R3Vector(0,1,1));

    }

}