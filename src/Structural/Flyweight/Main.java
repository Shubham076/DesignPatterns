package Structural.Flyweight;


/*
The Flyweight pattern is a structural design pattern that aims to reduce memory bu sharing data among multiple objects

Here's a simple example using Java. Let's say we're creating a forest simulator, and we need to render millions of trees, where each tree has a texture, color, and other data.

Storing all these tree objects in memory would be inefficient, especially when many trees share some characteristics. Instead, we can use the Flyweight pattern to store shared data (like the texture and color) in separate objects and reference these shared objects in the tree objects.
*/
public class Main {
    public static void main(String[] args) {
        TreeFactory treeFactory = new TreeFactory();

        Tree tree1 = new Tree(1, 2, treeFactory.getTree("OAK", "Green", "OakTexture"));
        Tree tree2 = new Tree(3, 2, treeFactory.getTree("OAK", "Green", "OakTexture"));
        Tree tree3 = new Tree(5, 2, treeFactory.getTree("OAK", "Green", "OakTexture"));
        Tree tree4 = new Tree(5, 3, treeFactory.getTree("NEEM", "Green", "OakTexture"));  // Shares TreeType with tree1
        Tree tree5 = new Tree(5, 2, treeFactory.getTree("NEEM", "Green", "OakTexture"));  // Shares TreeType with tree1

        tree1.draw();
        tree2.draw();
        tree3.draw();
        tree4.draw();
        tree5.draw();
    }
}
