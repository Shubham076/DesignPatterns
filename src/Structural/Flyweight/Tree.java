package Structural.Flyweight;

// Class using Flyweights
class Tree {
    private int x;
    private int y;

    //flyweight object
    private TreeType type;

    Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    void draw() {
        type.draw(x, y);
    }
}