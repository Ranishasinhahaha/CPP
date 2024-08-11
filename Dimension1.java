import java.util.Scanner;

class Plate {
    protected int length;
    protected int width;

    Plate(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int plate_dimensions() {
        return this.length;
    }
}

class Box extends Plate {
    protected int height;

    Box(int length, int breadth, int height) {
        super(length, breadth); // changed width to breadth
        this.height = height;
    }

    public int box_dimensions() {
        return this.height; // changed to return height
    }
}

class WoodBox extends Box {
    protected int thick;

    WoodBox(int length, int width, int height, int thick) {
        super(length, width, height);
        this.thick = thick;
    }

    public int woodbox_dimensions() {
        return this.thick;
    }
}

class Dimension1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the dimensions:");
        int length = in.nextInt();
        int width = in.nextInt();
        int height = in.nextInt();
        int thick = in.nextInt();

        Plate p1 = new Plate(length, width);
        System.out.println("Plate dimensions: " + p1.plate_dimensions());

        Box b1 = new Box(length, width, height);
        System.out.println("Box dimensions: " + b1.box_dimensions());

        WoodBox Wb = new WoodBox(length, width, height, thick);
        System.out.println("WoodBox dimensions: " + Wb.woodbox_dimensions());
    }
}