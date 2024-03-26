public class mirrordimond {

    public static void main(String[] args) {
        int rt=5;
        //for top
        for(int i=1;i<=rt;i++){
            //for left
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //for space
            for(int j=1;j<=(rt*2)-(i*2);j++)
            {System.out.print(" ");}
            //for right
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }System.out.println();
        }
        //for bottom
        for(int i=rt;i>=1;i--){
            if(i==rt)
            continue;
            //for left
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //for space
            for(int j=1;j<=(rt*2)-(i*2);j++)
            {System.out.print(" ");}
            //for right
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }System.out.println();
        }
    }
}
