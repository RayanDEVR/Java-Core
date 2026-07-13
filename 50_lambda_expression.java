@FunctionalInterface
interface A
{
    void show(int i, int j);
 }

class LambdaExpression
{
    public static void main(String[] args) {
        
        A obj = (i, j) -> System.out.println("in show; " + ( i+ j));
        
        obj.show(4,8);
    }
}