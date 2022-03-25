/* Given an integer  as input, can you check the following:

If  is odd then print "Weird"
If  is even and, in between range 2 and 5(inclusive), print "Not Weird"
If  is even and, in between range 6 and 20(inclusive), print "Weird"
If  is even and , print "Not Weird"
Input Format

Single line of input: integer .

Constraints

Output Format

Print "Weird" if the number is weird; else, not "Not Weird" without the quotes.

Sample Input 1

3
Sample Output 1

Weird
Sample Input 2

24
Sample Output 2

Not Weird
Submissions: 660
Max Score: 10
Difficulty: Easy
Rate This Challenge:

    
More


*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=100){
        if(n%2!=0){
            System.out.println("Weird");
        }else if((n>=2 && n<=5 ) && n%2==0){
            System.out.println("Not Weird");
        }else if((n>=6 && n<=20) && n%2==0){
            System.out.println("Weird");
        }else if(n>20 && n%2==0){
            System.out.println("Not Weird");
        }
    }
    }
}
