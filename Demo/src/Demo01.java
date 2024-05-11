class Demo01 {
    public static void main(String[] args) {
        Demo01 d = new Demo01(); // Creating an instance of Demo01
        Demo01 returnedInstance = d.show(); // Invoking the show() method on the instance and capturing the returned instance
        if (returnedInstance instanceof Demo01) {
            System.out.println("show() method returns an instance of Demo01 class.");
        } else {
            System.out.println("show() method does not return an instance of Demo01 class.");
        }
    }

    public Demo01 show() {
        return this; // Returning the current instance of Demo01
    }
}
