class area_of_room {
    public static void main(String args[]) {
        double room = 144;
        float tilearea = (12f / 100) * (12f / 100);

        int no_tiles = (int) (room / tilearea);

        System.out.println(no_tiles + " tiles will be required to cover the flooring");
    }
}