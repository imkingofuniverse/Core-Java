import java.util.scanner:
class Example{
    public static void main (String args]){
    scanner sc = new Scanner(System.in);
    System.out.println("Enter the side");
    int a = sc.nextInt());
    Solution solutionobject=new Solution();
    int outout = solution.area(a);
    System.out.println("The Outout is " + output);
    sc.close();
    }
}
class Solution{
    public int area(int a) {
    int squareArea = a*a;
    return squareArea;
    }
}