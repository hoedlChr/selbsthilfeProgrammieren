public class Demo {
    public static void main(String[] args) {

        BerechenFlaeche value3 = new BerechenFlaeche();

        Personen value1 = new Personen("Christoph", "Hoedl");
        value1.setBuildYear(1999);

        System.out.println("value1.getBuildYear() = " + value1.getBuildYear());

        Klassenraum value2 = new Klassenraum();
//        value2.anzahl = 24;
        value2.name = "1A";
//
        System.out.println("value2.name = " + value2.name);
        System.out.println("value2.anzahl = " + value2.anzahl);


        value3.setFlaeche(17);
    }
}
