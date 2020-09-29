class Primitive {
    public static boolean toPrimitive(Boolean b) {
        boolean a = b != null ? b.booleanValue() : false;
        return a;
    }
}