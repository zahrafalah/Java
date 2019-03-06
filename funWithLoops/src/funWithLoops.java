

public class funWithLoops {
    public static void main(String[] args) {
//pretest loop
        // the block will run 0 or more time
        int num= (int)(Math.random() * 100 + 1);
        while (num < 70){
            System.out.println(num);
            //we need to update the num to stop the infinit loop by generating another random num
            num= (int)(Math.random() * 100 + 1);

        }

//       // What value is printed, what value is v left with?
//        int v = 20;
//        --v;
//        System.out.println(v++);

//        int s = 20;
//        int t = s++ + --s;
//        System.out.println(t);

        //determinant loop with posttest loop
        //the block will run 1 or more time
       //counter control loop
        int count = 0;
        int max = 10;
        do {
            System.out.println(count++ + " ");
            count = count + 1;
//            count++;
        }while (count < max);
        //System.out.println(" ");

         //infinit loop //So bad
//        int count = 0;
//        int max = 9;
//        while (count != max){
//            System.out.println(count++);
//            count ++;
//        }


    }
}
