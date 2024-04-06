public class Vector {
    public static int[] reverso(int[] v) {
        int[] reverso1 = new int[v.length];

        for (int i = 0; i < v.length; i++) {
            reverso1[i] = v [v.length - 1 - i];
        }
        return reverso1;
    }

}