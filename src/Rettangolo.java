public class Rettangolo extends Forma{
    public Rettangolo(int base, int height)
    {
        super (base, height);
    }

    @Override
    public void calcolaArea() {

    System.out.println(base* height);
    }
}
