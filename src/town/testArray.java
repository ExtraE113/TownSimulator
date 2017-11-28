package town;

public class testArray {
    /* This method is solely for the purposes of testing how arrays work; For example, how to change individual elements of an array
     */
    public static void main(String[] args){
        String[] strings = new String[20];
        for(int i=0; i<20; i++){
            strings[i] = String.valueOf(i);
        }
        for(int i=0; i<20; i++)
            System.out.println(strings[i]);
    }
}
