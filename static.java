class ObjectCounter {
    // Static variable to keep track of the number of objects created
    private static int objectCount = 0;
    
    // Constructor increments the object count each time an object is created
    public ObjectCounter() {
        objectCount++;
    }
    
    // Static method to get the number of objects created
    public static int getObjectCount() {
        return objectCount;
    }

    public static void main(String[] args) {
        // Creating objects
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();
        
        // Printing the number of objects created
        System.out.println("Number of objects created: " + ObjectCounter.getObjectCount());
    }
}
