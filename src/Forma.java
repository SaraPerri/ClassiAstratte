enum Forme {
    Triangolo,
    Rettangolo
}

public class Forma {
    int base;
    int height;
    Forme forma;
    public Forma(int base, int height, Forme forma){
        this.base= base;
        this.height= height;
        this.forma= forma;
    }
    public void calcolaArea(){
        if (forma==Forme.Triangolo){
            System.out.println(base* height/2);
        } else if (forma==Forme.Rettangolo) {
            System.out.println(base* height);
        }


    }

}
