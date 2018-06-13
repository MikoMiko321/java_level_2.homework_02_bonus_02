package geekbrains.java_level_2.homework_02_bonus_02;

//Создать массив exceptions
//        Создать 10 разных исключений и при возникновении исключений добавлять данное исключение в массив, дал
//        Заполни массив exceptions 10 различными эксепшенами.
public class Main {

    public static void main(String[] args) {
	Exception[] myExceptions = new Exception[10];
	int index=0;

        try{
            int a=1/0;
        } catch (ArithmeticException e){
            myExceptions[index]=e;
            index++;
        }
        try{
            int arr[] ={1,2,3,4,5};
            System.out.println(arr[7]);
        } catch (ArrayIndexOutOfBoundsException e){
            myExceptions[index]=e;
            index++;
        }
        try{
            String str=null;
            System.out.println(str.length());
        } catch (NullPointerException e){
            myExceptions[index]=e;
            index++;
        }
        try{
            Object array[]= new Integer[3];
            array[0]= new String("Hello");
        } catch (ArrayStoreException e){
            myExceptions[index]=e;
            index++;
        }
        try{
            String str="hello";
            int i= Integer.parseInt(str);
        } catch (NumberFormatException e){
            myExceptions[index]=e;
            index++;
        }
        try{
            throw new IllegalArgumentException("IllegalArgumentException");
        } catch (IllegalArgumentException e){
            myExceptions[index]=e;
            index++;
        }
        try{
        int i=-1;
        int[] arr = new int[i];
        } catch (NegativeArraySizeException e){
            myExceptions[index]=e;
            index++;
        }
        try{
        String str="asdf";
        System.out.println(str.charAt(20));
        } catch (StringIndexOutOfBoundsException e){
            myExceptions[index]=e;
            index++;
        }
        try{
        throw new SecurityException("SecurityException");
        } catch (SecurityException e){
            myExceptions[index]=e;
            index++;
        }
        try{
            throw new UnsupportedOperationException("UnsupportedOperationException");
        } catch (UnsupportedOperationException e){
            myExceptions[index]=e;
            index++;
        }

        for(Exception e: myExceptions){
            System.out.println(e.getMessage());
        }
    }
}
