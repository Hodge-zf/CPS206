public class RecursionExample{
  public static void main(String[] args){
    RecursionExample recursion = new RecursionExample();
    System.out.println(recursion.doFactorial(5));
  }
  public int doFactorial(int n){
      int answer = (n)*(n - 1)*(n - 2)*(n - 3)*(n - 4);
        return answer;
  }
}
