package ch.smartlinksa.intern.dao.constant;

public enum Gender {

    MALE, FEMALE;

    public static Gender valueOfKey(String key) {
        Gender gender = null;
        try {
            int value = Integer.valueOf(key);
            gender = valueOfKey(value);
        }
        catch (NumberFormatException e) {}
        return gender;
    }

    public static Gender valueOfKey(int key) {
        Gender gender = null;
        try {
            gender = Gender.values()[key];
        }
        catch (ArrayIndexOutOfBoundsException e) {}
        return gender;
    }



}
