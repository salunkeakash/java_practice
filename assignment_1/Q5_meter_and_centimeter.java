class meter_and_centimeter {

    public static void main(String args[]) {
        double feet = 10;
        double inches = 50;
        double total_inches;

        total_inches = feet * 12 + inches;
        double meters = total_inches * 0.0254;
        int centimeters = (int) ((meters - (int) meters) * 100);

        System.out.println("meters " + meters);
        System.out.println("centimeters " + centimeters);

    }
}
