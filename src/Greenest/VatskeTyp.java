package Greenest;

public enum VatskeTyp {
    KRANVATTEN ("Kranvatten"),
    MINERALVATTEN  ("Mineralvatten"),
    PROTEINDRYCK ("Proteindryck");

    public final String sort;

    VatskeTyp (String s){
        sort = s;
    }
}
