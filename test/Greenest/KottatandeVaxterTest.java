package Greenest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KottatandeVaxterTest {

    Vaxter v = new KottatandeVaxter("Mums", 13);
    Vaxter v2 = new KottatandeVaxter("NamNam", 1);

    @Test
    void raknaUtVatskebehov() {
        assert(v.raknaUtVatskebehov()==0.1 + (0.2*13));
        assert(v.raknaUtVatskebehov()!=0.1 + (0.2*11));
        assert(v2.raknaUtVatskebehov()==0.1 + (0.2*1));
        //Assertions.assertEquals(0.3, v2.raknaUtVatskebehov());
        Assertions.assertEquals(0.1+(0.2*1), v2.raknaUtVatskebehov());
    }
}