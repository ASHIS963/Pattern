public class holowangle {
    
    public static void main(String[] args) {
        int rw=4;
        int ijak=2;
        for(int time=1;time<=ijak;time++){
            for(int i=1;i<=rw;i++){
                for(int j=1;j<=i;j++){
                    if(j<i)
                    {
                        System.out.print(" ");
                    }
                    if(j==i)
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=rw;i>1;i--){
                if(i==rw)
                continue;
                for(int j=1;j<=i;j++){
                    if(j<i)
                    {
                        System.out.print(" ");
                    }
                    if(j==i)
                    System.out.print("*");
                }
                System.out.println();
            }
            if(time==ijak)
            System.out.print("*");
        }
    }
}