package day60_Exceptions;

public class MultiCatchBlock {
    public static void main(String[] args) {
        String word = "java";
        //String word = null ;

        try{
            System.out.println("length"+word.length());
            System.out.println("word"+word);
            System.out.println(word.substring(20));
        }catch(NullPointerException e ){
            System.out.println("NullPointerException caught and handled ");
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("index is wrong");
        }catch(Throwable t){ // parent class is always put last
            System.out.println("Exception is caught ");
            System.out.println("Type = "+t.getCause());
        }


    }
}
