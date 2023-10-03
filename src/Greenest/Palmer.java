package Greenest;

public class Palmer extends Vaxter{//} implements VaxtInterface { //implementerar interface

    private String vaxtTyp = "Palm";
    //private String vatskeTyp = "Kranvatten";  //inkapsling, privata variabler med accessors get.., set..
    private VatskeTyp vatskeTyp = VatskeTyp.KRANVATTEN;

    public Palmer() {
    }

    //Polymorfism
    public Palmer(String namn) {
        super(namn);
    }
    //Polymorfism
    public Palmer(String namn, double langd) {
        super(namn, langd);
    }

    public VatskeTyp getVatskeTyp() {  //inkapsling, Polymorfism
        return vatskeTyp;
    }

    public String getVaxtTyp() {
        return vaxtTyp;
    }

    @Override
    public double raknaUtVatskebehov() {  //Polymorfism
        /*double vatskebehov;
        vatskebehov = 0.5 * this.getLangd();
        return vatskebehov;*/
        return (0.5 * this.getLangd());
    }

    /*@Override
    public void printMe() {     //Polymorfism
        System.out.println("Palm{" +
                "namn='" + this.getNamn() + '\'' +
                ", langd=" + this.getLangd() +
                '}');
    }*/@Override
    public void printMe() {     //Polymorfism
        System.out.println("Palm{" +
                "namn='" + this.getNamn() + '\'' +
                ", langd=" + this.getLangd() + "m" +
                ", vätska='" + this.getVatskeTyp().sort + '\'' +
                ", vätskemängd='" + this.raknaUtVatskebehov() + "liter" + '\'' +
                '}');
    }

    @Override
    public String vaxtInfo() {
        String message = String.format("Växttyp: " + vaxtTyp +
                ", namn='" + this.getNamn() + '\'' +
                ", längd=" + this.getLangd() + "m" +
                ", vätska='" + this.getVatskeTyp().sort + '\'' +
                ", vätskebehov='" + this.raknaUtVatskebehov() + "liter/dag" + '\'');

        return message;
    }
}
