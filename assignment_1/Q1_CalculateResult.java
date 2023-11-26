class CalculateResult {
    public static void main(String args[]) {
        int math, phy, chem, bio, eng, total;
        double avg, percent;

        math = 89;
        eng = 90;
        phy = 78;
        chem = 87;
        bio = 76;

        total = math + eng + bio + chem + phy;
        System.out.println("The Total Marks Is " + total);
        avg = total / 5;
        System.out.println("The Avg Marks Is " + avg);

        percent = (double) total / 500 * 100;
        System.out.println("The Percentage of Marks Is " + percent);

    }
}