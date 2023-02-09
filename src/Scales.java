class Scales {

    static String cel2Fah(double temp) {
        double celsFahr = (temp * 1.8) + 32;
        String cf = String.format("Celsius to Fahrenheit: %4.2f", celsFahr);
        return cf;
    }

    static String cel2Kel(double temp) {
        double celsKel = temp + 273.15;
        String ck = String.format("Celsius to Kelvin: %4.2f", celsKel);
        return ck;
    }

    static String fah2Cel(double temp) {
        double fahrCel = (temp - 32) / 1.8;
        String fc = String.format("Fahrenheit to Celsius: %4.2f", fahrCel);
        return fc;
    }

    static String fah2Kel(double temp){
        double fahrKel = (temp + 459.67) / 1.8;
        String fk = String.format("Fahrenheit to Kelvin: %4.2f", fahrKel);
        return fk;
    }

    static String kel2Cel(double temp) {
        double kelvCel = temp - 273.15;
        String kc = String.format("Kelvin to Celsius: %4.2f", kelvCel);
        return kc;
    }

    static String kel2Fah(double temp) {
        double kelvFah = (temp * 1.8) - 459.67;
        String kf = String.format("Kelvin to Fahrenheit: %4.2f", kelvFah);
        return kf;
    }
}