public class Triangolo extends Forma{
    public Triangolo(int base, int height) {
        super(base, height);
    }

    @Override
    public void calcolaArea() {
        System.out.println(base* height/2);
    }
}
