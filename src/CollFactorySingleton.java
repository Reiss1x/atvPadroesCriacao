class CollectionFactorySingleton {
    private static CollFactory instance;

    private CollectionFactorySingleton() {}

    public static CollFactory getInstance() {
        if (instance == null) {
            instance = new CollFactory();
        }
        return instance;
    }
}