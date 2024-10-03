package takeUforward.hashing;

public class Practice {
    public static void main(String[] args) {
        String s = "abCdEffasaGGfghf";
        int count = countCh('g', s);
        System.out.println(count);

    }
    static int countCh(char k, String s){
        int arr[] = new int[125];

        for(char c : s.toCharArray()){
            arr[c]++;
        }

        return arr[k];
    }
}
