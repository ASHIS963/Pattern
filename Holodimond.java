public class Holodimond {
    public static void main(String[] args) {
        int tr=7;
        for(int i=1;i<tr;i++){
            for(int j=1;j<=tr-i;j++){
                System.out.print(" ");}
            System.out.print("*");
            for(int j=1;j<=(i*2)-(tr/2);j++){
                System.out.print(" ");}
            if(i!=1){
            System.out.print("*");}
            System.out.println();
        }
        for(int i=tr;i>=1;i--){
             for(int j=1;j<=tr-i;j++){
                System.out.print(" ");}
            System.out.print("*");
            for(int j=1;j<=(i*2)-(tr/2);j++){
                System.out.print(" ");}
            if(i!=1){
            System.out.print("*");}
            System.out.println();
        }
    }
}
