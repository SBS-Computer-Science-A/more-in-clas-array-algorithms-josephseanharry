//Joseph Sean Harry
public class mode{
    public static int findMode(int[] number) {
        int mode = number[0];
        int time = 1;
        for(int i = 1; i<number.length;i++){
            int thisone = 1;
            for(int j=0;j<i;j++){
                if(number[j]==number[i]){
                    thisone++;
                }
            }
        }
    }
}