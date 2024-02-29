public class Main
{
    //----------------------------------------------------
    //  Prints a statement.
    //----------------------------------------------------
    public static void main (String[] args)
    {
        System.out.println ("An Emergency Broadcast");
    }
}

//1.Change Main to main.
//->It doesn't work cuz the file name and the public class should be same.
//2.Change Emergency to emergency.
//->It works perfectly cuz it is in the "" String.
//3.Remove the first quotation mark in the string.
//->It won't work cuz it doesn't understand where the string is started.
//4.Change main to man.
//->It won't work cuz Java will not able to find the entry point.
//5.Change println to bogus.
//-> It won't work cuz it doesn't exist in the PrintStream line.
//6.Remove the semicolon at the end of the println statement.
//->.It won't work cuz in java it expects ";" in the end of statement.
//7.Remove the last brace in the program.
//->It won't work cuz "}" is used to indicate the end of the class body.
