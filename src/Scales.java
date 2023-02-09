class Scales {
    static double celFah(double c) {
        return (c * 1.8) + 32;
    }

    static double celKel(double c) {
        return c + 273.15;
    }

    static double fahKel(double f) {
        return (f + 459.67) / 1.8;
    }

    static double fahCel(double f) {
        return (f - 32) / 1.8;
    }

    static double kelCel(double k) {
        return k - 273.15;
    }

    static double kelFah(double k) {
        return (k * 1.8) - 459.67;
    }
}
