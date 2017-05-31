package cl.cardev.utilidades.cardevutils;

import java.math.BigInteger;

/**
 * Created by Carlos Tapia on 31-05-2017.
 */
public class Nullables {
    
    public static String getString(Integer i){
        if (i == null){
            return null;
        }
        return String.valueOf(i);
    }

    public static String getString(BigInteger i){
        if (i == null){
            return null;
        }
        return String.valueOf(i);
    }

    public static String getString(Long i){
        if (i == null){
            return null;
        }
        return String.valueOf(i);
    }
}
