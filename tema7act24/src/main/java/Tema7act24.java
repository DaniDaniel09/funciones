public class Tema7act24 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,12,456,352,8575};
        System.out.println(maxim(5,10));
        System.out.println(maxim(5,40, 25));
        System.out.println(maxim(nums));
        System.out.println(altreMaxim(14,356,1343,11,86));
    }
    // a) Sobrecarga
    static int maxim (int num1, int num2){
        if (num1 > num2){
            return num1;
        }else{
            return num2;
        }
    }
    static int maxim (int num1, int num2, int num3){
        if (num1 > num2 && num1 > num3){
                return num1;
        }
        if (num2 > num3){
            return num2;
        }
        return num3;
    }
    // b) Vector de argumentos
    static int maxim (int[]nums){
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max){
                max = nums[i];
            }
            
        }
        return max;
    }
    // c Varargs
    static int altreMaxim (int ... num){
        return maxim(num);
    }
}
