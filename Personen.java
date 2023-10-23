public class Personen {
    private String vorname;
    private String nachname;
    private int buildYear;

    public Personen(String vorname, String nn)
    {
//        setNachname(nn);
//        setVorname(vn);
//        setBuildYear(2000);
        this.vorname = vorname;
        this.nachname = nn;
        this.buildYear = 2000;
    }

    public Personen(String vorname, String nn, int bY)
    {
//        setNachname(nn);
//        setVorname(vn);
//        setBuildYear(2000);
        this.vorname = vorname;
        this.nachname = nn;
        this.buildYear = bY;
    }

    public void setVorname(String vorname)
    {
        if(vorname == "Christoph")
        {
            this.vorname = "vorname";
        }
        else
        {
            this.vorname = vorname;
        }
    }

    public void setNachname(String nachname)
    {
        this.nachname = nachname;
    }

    public void setBuildYear(int buildYear)
    {
        this.buildYear = buildYear;
    }

    public String getVorname()
    {
        return vorname;
    }

    public String getNachname()
    {
        return nachname;
    }

    public int getBuildYear()
    {
        return buildYear;
    }


}
