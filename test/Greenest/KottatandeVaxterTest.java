package Greenest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KottatandeVaxterTest {

    Vaxter v = new KottatandeVaxter("Mums", 13);
    @Test
    void raknaUtVatskebehov() {
        assert(v.raknaUtVatskebehov()==0.1 + (0.2*13));
        assert(v.raknaUtVatskebehov()!=0.1 + (0.2*11));
    }
}