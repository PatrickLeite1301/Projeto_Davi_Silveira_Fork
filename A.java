public class A{
    private int A1;
    private float A2;

    public int getA1(){
        return A1;
    }
    public float getA2(){
        return A2;
    }

    public void setA1(int t){
        A1 = t;
    }
    public void setA2(float t){
        A2 = t;
    }

    public void MA1(){
        System.out.println("MA1");
    }

    public void MA2(){
        System.out.println("MA2");
    }

    public void MA3(){
        System.out.println("Alteração a classe A partir do clone");
    }
}