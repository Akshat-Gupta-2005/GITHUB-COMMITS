class Solution {
    public int[] countBits(int n) {
        if (n == 0) return new int[]{0};
        int count = 1;
        int[] arr = new int[n+1];
        while(count <= n){
            for (int i = 0 ; i < count ; i++){
                if (count+i <= n)
                arr[count+i] = arr[i] + 1;
            }
            count = count * 2;
        }

        count = count / 2;
        int i = 0;
        while(count <= n){
            arr[count] = arr[i] + 1;
            count++;
            i++;
        }

        return arr;

    }
}