package Greenest;

public class Kaktusar extends Vaxter{//} implements VaxtInterface { //implementerar interface

    private String vaxtTyp = "Kaktus";

    //private String vatskeTyp = "Mineralvatten";  //Inkapsling
    private VatskeTyp vatskeTyp = VatskeTyp.MINERALVATTEN;

    //private double vatskebehov;
    public Kaktusar() {
    }
    //Polymorfism
    public Kaktusar(String namn) {
        super(namn);
    }
    //Polymorfism
    public Kaktusar(String namn, double langd) {
        super(namn, langd);

    }

    public VatskeTyp getVatskeTyp() {  //Polymorfism, inkapsling
        return vatskeTyp;
    }

    public String getVaxtTyp() {
        return vaxtTyp;
    }

    @Override
    public double raknaUtVatskebehov() {    //Polymorfism
       /* double vatskebehov;
        vatskebehov = (double)2/100;
        return vatskebehov;*/
        return (double)2/100;
    }

    @Override
    public void printMe() {             //Polymorfism
        System.out.println("Kaktus{" +
                "namn='" + this.getNamn() + '\'' +
                ", langd=" + this.getLangd() +
                '}');
    }

    @Override
    public String vaxtInfo() {
        String message = String.format("Växttyp: " + this.vaxtTyp +
                ", namn='" + this.getNamn() + '\'' +
                ", längd=" + this.getLangd() + "m" +
                ", vätska='" + this.getVatskeTyp().sort + '\'' +
                ", vätskebehov='" + this.raknaUtVatskebehov() + "liter/dag" + '\'');

        return message;
    }
}
