package Structural.Flyweight;

public class OakTree implements TreeType {
    //intrinsic attributes
    private String name;
    private String color;
    private String texture;

    OakTree(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    //extrinsic attributes
    public void draw(int x, int y) {
        System.out.printf("%s tree drawn at %d,%d with color %s and texture %s\n", name, x, y, color, texture);
    }
}
