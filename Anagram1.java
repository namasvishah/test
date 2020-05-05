import java.util.Arrays;
import java.util.Scanner;

class CheckAnagram
{
char a1[];
char a2[];
CheckAnagram(char[]a1,char[]a2)
{
this.a1=a1;
this.a2=a2;
}
boolean verify()
{
if(Arrays.equals(a1,a2))
{
return true;
}
return false;
}
}
class Anagram1
{
public static void main(String[] args)
{
int i;
boolean flag=false;
String s1=new String();
String s2=new String();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first string: ");
s1=sc.next();
System.out.println("Enter the second string: ");
s2=sc.next();
char[]c1=s1.toCharArray();
char[]c2=s2.toCharArray();
Arrays.sort(c1);
Arrays.sort(c2);
CheckAnagram ah=new CheckAnagram(c1,c2);
if(ah.verify())
{
System.out.println("Strings are anagrams of each other");
return;
}
System.out.println("Strings are not anagrams of each other");
}
}