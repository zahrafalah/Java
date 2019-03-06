public class MoreFunWithLoop {

    public static void main(String[] args){

//        int num;
//        //indeterminate loop
//        //init
//        num = (int) (Math.random() * 100 + 1);
//        System.out.println(num);
//        //Test
//        while(num<90){
//            //Update
//            num = (int) (Math.random() * 100 + 1);
//            System.out.println(num);
//        }

        //init
//        int count =0;
//        do {
//            //logic
//            System.out.println();
//            //update/without this we would end up with infinit loop
//            count++;
////test
//        }while (count<10);

//        for loop is a pretest as well
//        for (init, test, update){
//            logic
//        }
//
//        for (int i = 0 ; i< 10; i++){
//            System.out.println(i + " ");
//
//        }
//        System.out.println("\n");

//        for (int i = 100 ; i> 0 ; i--){
//            if (i % 20 == 0){
//            System.out.println(i + "");}
//        }
//        System.out.println("\n");

//        int j;
//        for (j = 0; j<= 50; j +=5){
//            System.out.println(j +" ");
//        }
//        System.out.println(j);

        for (int row= 1; row<= 6 ; row++){
//            System.out.println(row);
            for (int col= 1;col <= 6; col++){
//                System.out.print("[" + row + "," + col +"]");
                System.out.print("[" + (row + col) +"]");
            }
            System.out.println("\n");
        }


    }
}
