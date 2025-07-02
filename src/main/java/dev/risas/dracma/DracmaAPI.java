package dev.risas.dracma;

public final class DracmaAPI {

    private static DracmaService service;

    public static void register(DracmaService instance) {
        service = instance;
    }

    public static DracmaService get() {
        if (service == null) throw new IllegalStateException("DracmaAPI no está registrado.");
        return service;
    }
}
