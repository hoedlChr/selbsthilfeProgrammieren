public class BerechenFlaeche {
    private int Flaeche;

    public BerechenFlaeche()
    {

    }

    public BerechenFlaeche(int a)
    {
        Flaeche = a * a;
    }

    public BerechenFlaeche(int a, int b)
    {
        Flaeche = a * b;
    }

    public void setFlaeche(int flaeche) {
        Flaeche = flaeche;
    }
}
