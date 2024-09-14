public class Numbers {
    private int maxSize = 300;
    private int sum = 0;
    private int current;
    public Numbers(){}
    public void filter()
    {
        for (int i = 0; i <= maxSize; i++){
            if ((i % 4 == 0) && (i % 6 != 0)){
                current = i;
                while(current > 0) {
                    sum += current % 10;
                    current /= 10;
                }
                if (sum < 10){
                    System.out.println(i);
                }
                sum = 0;
            }
        }
    }
}
