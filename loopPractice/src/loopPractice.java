public class loopPractice {

    public static void main(String[] args){

        for (int i =1, j = 2 ; i + j < 100 ; i++ , j += 2 ){
            if ((i + j) % 9==0)
                continue;
            System.out.println(i+j);
            if (i+ j >30)
                break;
        }
        System.out.println(15 % 9);



    }
}
