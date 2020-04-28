package util;
public class Validacoes {
    
    public static class InvalidField extends Exception {
        
        public final Integer id;
        public final InvalidFieldType type;
        
        public InvalidField(Integer id, InvalidFieldType type) {
            this.id = id;
            this.type = type;
        }
        
    }
    
    public enum InvalidFieldType {
        EMPTY_STRING, INVALID_EMAIL, NULL, FALSE
    }
    
    public static void notEmpty(String string) throws InvalidField {
        notEmpty(null, string);
    }
    
    public static void notEmpty(Integer id, String string) throws InvalidField {
        if (string.isEmpty()) {
            throw new InvalidField(id, InvalidFieldType.EMPTY_STRING);
        }
    }
    
    public static void isEmail(String email) throws InvalidField {
        isEmail(null, email);
    }
    
    public static void isEmail(Integer id, String email) throws InvalidField {
        if (!email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")) {
            throw new InvalidField(id, InvalidFieldType.INVALID_EMAIL);
        }
    }
    
    public static void notNull(Object object) throws InvalidField {
        notNull(null, object);
    }

    public static void notNull(Integer id, Object object) throws InvalidField {
        if (object == null) {
            throw new InvalidField(id, InvalidFieldType.NULL);
        }
    }
    
    public static void isTrue(boolean b) throws InvalidField {
        isTrue(null, b);
    }
    
    public static void isTrue(Integer id, boolean b) throws InvalidField {
        if (!b) {
            throw new InvalidField(id, InvalidFieldType.FALSE);
        }
    }
}
