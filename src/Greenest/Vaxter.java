package Greenest;

public abstract class Vaxter implements VaxtInterface {

    private String namn;        //inkapsling
    private double langd;       //inkapsling

    public Vaxter() {       //Polymorfism
    this.namn = "Anonymus";
    this.langd = 1;
    }

    public Vaxter(String namn) {    //Polymorfism
        this.namn = namn;
        this.langd = 1;
    }
       //Polymorfism, konstruktor med olika antal parametrar
    public Vaxter(String namn, double langd) {
        this.namn = namn;
        this.langd = langd;
    }

    public String getNamn() {           //inkapsling
        return namn;
    }

    public void setNamn(String namn) {      //inkapsling
        this.namn = namn;
    }

    public double getLangd() {      //inkapsling
        return langd;
    }

    public void setLangd(double langd) {        //inkapsling
        this.langd = langd;
    }

    public abstract VatskeTyp getVatskeTyp();//{  //Polymorfism,

    //@Override
    public abstract double raknaUtVatskebehov();    //Polymorfism

    @Override
    public abstract String vaxtInfo();   //Polymorfism

    public void printMe(){          //Polymorfism
        System.out.println("Vaxter{" +
                "namn='" + namn + '\'' +
                ", langd=" + langd +
                '}');
    }

    @Override
    public String toString() {      //Polymorfism
        return "Vaxter{" +
                "namn='" + namn + '\'' +
                ", langd=" + langd +
                '}';
    }
}
