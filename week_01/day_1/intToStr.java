//Write a program to convert integer to string? 

class HelloWorld {
    public static void main(String[] args)
    {
        int x=121;
        //its convert number into string
        
        String y=""+x;
        
        System.out.println(y);
        
        //checking type of output 
        
        System.out.println(((Object)y).getClass().getSimpleName());
    }
}
