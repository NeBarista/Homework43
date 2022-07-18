public class Main {
    public static void main(String[] args) {
        int[] newArray = adg(new int[] {6, 6, 8, 3, 2, 1, 1});
        for (int number : newArray) {
            System.out.println(number);
        }

    }
    public static int [] adg(int [] array) {
        int [] res = new int [array.length];
        for (int a = 0; a<res.length; a++) {
            res[a] = array[a] + array[array.length - 1 - a];
        }
        return res;
    }
}