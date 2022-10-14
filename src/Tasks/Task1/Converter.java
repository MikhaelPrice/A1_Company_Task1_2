package Tasks.Task1;

import java.math.BigInteger;

public class Converter {

    public Converter() {
    }

    public static String toIpV4(BigInteger value) {
        long newValue = value.longValue();
        StringBuilder result = new StringBuilder(15);
        for (int i = 0; i < 4; i++) {
            result.insert(0, newValue & 0xff);
            if (i < 3) {
                result.insert(0, '.');
            }
            newValue = newValue >> 8;
        }
        return result.toString();
    }

    public static BigInteger fromIpV4(String address) {
        address = address.replace(" ", "");
        byte[] bytes = ipv4ToBytes(address);
        return new BigInteger(bytes);
    }

    private static byte[] ipv4ToBytes(String ipv4) {
        byte[] ret = new byte[5];
        ret[0] = 0;
        // Сначала находим позицию в строке IP-адреса
        int position1 = ipv4.indexOf(".");
        int position2 = ipv4.indexOf(".", position1 + 1);
        int position3 = ipv4.indexOf(".", position2 + 1);
        // Преобразовываем строку между каждым в целое число
        ret[1] = (byte) Integer.parseInt(ipv4.substring(0, position1));
        ret[2] = (byte) Integer.parseInt(ipv4.substring(position1 + 1,
                position2));
        ret[3] = (byte) Integer.parseInt(ipv4.substring(position2 + 1,
                position3));
        ret[4] = (byte) Integer.parseInt(ipv4.substring(position3 + 1));
        return ret;
    }

}
