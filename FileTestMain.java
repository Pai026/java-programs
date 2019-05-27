import java.io.*;
public class FileTestMain
{
    public static void main(String[] args) throws IOException,FileNotFoundException
    {
        FileInputStream fi=new FileInputStream(args[0]);
        int s;
        while(true)
            {
                s= fi.read();
                if(s==-1)
                    break;
                System.out.println(s+" "+(char) s);
            }
    }
}