import java.util.Scanner;
class AP
{
    int a,d,n,k,p,q;//First term,CD,no.of terms,k,p,q
    Scanner s = new Scanner(System.in);
    public AP()
    {
        this.a = s.nextInt();
        this.d = s.nextInt();
        this.n = s.nextInt();
        this.k = s.nextInt();
        this.p = s.nextInt();
        this.q = s.nextInt();
    }
    void Calculate()
    {
        int last = a+(n-1)*d;
        int r = ((k-a)/d)+1;
        int pa = a+(p-1)*d;
        int qa = a+(q-1)*d;
        int diff = Math.abs(pa-qa);
        System.out.printf("\n%d\n%d\n%d",last,r,diff);
    }
}

public class ArithProg {    
    public static void main(String[] args)
    {
        AP a= new AP();
        a.Calculate();
    }
}
