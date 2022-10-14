package Tasks.Task1;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestConverter {

    @Test
    public void parseFromIpV4() {
        BigInteger parseNumber1 = new BigInteger("2149583360");
        BigInteger parseNumber2 = new BigInteger("255");
        assertEquals("128.32.10.0", Converter.toIpV4(parseNumber1));
        assertEquals("0.0.0.255", Converter.toIpV4(parseNumber2));
    }

    @Test
    public void parseToIpV4() {
        String address1 = "128.32.10.0";
        String address2 = "0.0.0.255";
        assertEquals("2149583360", Converter.fromIpV4(address1).toString());
        assertEquals("255", Converter.fromIpV4(address2).toString());
    }

}
