class sheet
{
    protected double width;
    protected double length;
    private final double costPerSquareFoot = 40; 

    public sheet(double width, double length)
    {
        this.width = width;
        this.length = length;
    }

    public double calculateCost() 
    {
        double area = width * length;
        return area * costPerSquareFoot;
    }
}

class box extends sheet 
{
    private double height;
    private final double costPerCubicFoot = 60; 

    public box(double width, double length, double height) 
    {
        super(width, length);
        this.height = height;
    }

    public double calculateCost1() 
    {
        double volume = width * length * height;
        return volume * costPerCubicFoot;
    }
}

public class Plastic
{
    public static void main(String args[]) 
    {
        sheet sheet = new sheet(5, 4); 
        box box = new box(2, 3, 4); 

        System.out.println("Cost of the sheet: Rs. " + sheet.calculateCost());
        System.out.println("Cost of the box: Rs. " + box.calculateCost1());
    }
}
