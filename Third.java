/* You are given a class Solution with a main method. Your task is to complete the given code so that it outputs the area of a parallelogram with breadth  and height . You should read the variables from standard input.

If  or  , the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.

Input Format

Two lines of input. First line contains : breadth of parallelogram. Next line contains : height of parallelogram.

Constraints


Output Format

If both values are greater than zero, then the main method must output the area of the parallelogram; else, print "java.lang.Exception: Breadth and height must be positive" without quotes.

Sample input 1

1
3
Sample output 1

3
Sample input 2

-1
2
Sample output 2

java.lang.Exception: Breadth and height must be positive


*/



static int B;
static int H;
static boolean flag= true;
static{
    Scanner in = new Scanner(System.in);
    B = in.nextInt();
    H = in.nextInt();
    if(B<=0 || H<=0){
        System.out.println("java.lang.Exception: Breadth and height must be positive");
        flag = false;
    }
}
