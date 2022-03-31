  import java.util.stringTokenizer;

   
class Name
{
public static void main(string[]args)
{
StringTokeniser st=new  StringTokenizer("My name is shubham"," ");
while(st.hasMoreTokens())
{
System.out.println(st.nextToken());
}
}
}