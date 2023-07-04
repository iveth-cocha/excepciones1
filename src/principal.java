public class principal {

    public static void main(String[] args) {
        try{
            int[] myNumbers={1,2,3};
            System.out.println(myNumbers[10]);

        }catch (Exception e){
            System.out.println("someting  went wrong");
            System.out.println(e);//explica el error

        }
        finally{System.out.println("de todas formas voy a mostrar ");}

    }

}
