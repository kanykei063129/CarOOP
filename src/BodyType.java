public enum BodyType {
    SEDAN,
    HATCHBACK,
    CROSSOVER,
    SUV,
    UNIVERSAL, BodyType;

    public  BodyType findByName(String name) {
        BodyType result = null;
        for (BodyType ignored : values()) {
            if (BodyType.name().equalsIgnoreCase(name)) {
                result = BodyType;
                break;
            }
        }
        return result;
    }
}
