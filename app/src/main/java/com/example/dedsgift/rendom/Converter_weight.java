package com.example.dedsgift.rendom;

public class Converter_weight {

    public enum Unit {
        TONNE,
        KILOGRAM,
        GRAM,
        MILLIGRAM,
        MICROGRAM,
        IMPERIAL_TON,
        US_TON,
        POUND,
        STONE,
        OUNCE;

        // Helper method to convert text to one of the above constants
        public static Converter_weight.Unit fromString(String text) {
            if (text != null) {
                for (Converter_weight.Unit unit : Converter_weight.Unit.values()) {
                    if (text.equalsIgnoreCase(unit.toString())) {
                        return unit;
                    }
                }
            }

            throw new IllegalArgumentException("Cannot find a value for " + text);
        }
    }

    private final double multiplier;
    public Converter_weight(Converter_weight.Unit from, Converter_weight.Unit to) {
        double constant = 1;
        // Set the multiplier, else if fromUnit = toUnit, then it is 1
        switch (from) {
            case TONNE:
                if (to == Converter_weight.Unit.KILOGRAM) {
                    constant = 1000;
                } else if (to == Converter_weight.Unit.GRAM) {
                    constant = 1e+6;
                } else if (to == Converter_weight.Unit.MILLIGRAM) {
                    constant = 1e+9;
                } else if (to == Converter_weight.Unit.MICROGRAM) {
                    constant = 1e+12;
                } else if (to == Converter_weight.Unit.IMPERIAL_TON) {
                    constant = 0.984207;
                } else if (to == Converter_weight.Unit.US_TON) {
                    constant = 1.10231;
                } else if (to == Converter_weight.Unit.STONE) {
                    constant = 157.473;
                } else if (to == Converter_weight.Unit.POUND){
                    constant = 2204.62;
                } else if (to == Unit.OUNCE){
                    constant = 35274;
                }
                break;
            case KILOGRAM:
                if (to == Converter_weight.Unit.TONNE) {
                    constant = 0.001;
                } else if (to == Converter_weight.Unit.GRAM) {
                    constant = 1000;
                } else if (to == Converter_weight.Unit.MILLIGRAM) {
                    constant = 1e+6;
                } else if (to == Converter_weight.Unit.MICROGRAM) {
                    constant = 1e+9;
                } else if (to == Converter_weight.Unit.IMPERIAL_TON) {
                    constant = 0.000984207;
                } else if (to == Converter_weight.Unit.US_TON) {
                    constant = 0.00110231;
                } else if (to == Converter_weight.Unit.STONE){
                    constant = 0.157473;
                } else if (to == Converter_weight.Unit.POUND){
                    constant = 2.20462;
                } else if (to == Unit.OUNCE){
                    constant = 35.274;
                }
                break;
            case GRAM:
                if (to == Converter_weight.Unit.TONNE) {
                    constant = 1e-6;
                } else if (to == Converter_weight.Unit.KILOGRAM) {
                    constant = 0.001;
                } else if (to == Converter_weight.Unit.MILLIGRAM) {
                    constant = 1000;
                } else if (to == Converter_weight.Unit.MICROGRAM) {
                    constant = 1e+6;
                } else if (to == Converter_weight.Unit.IMPERIAL_TON) {
                    constant = 9.8421e-7;
                } else if (to == Converter_weight.Unit.US_TON) {
                    constant = 1.1023e-6;
                } else if (to == Converter_weight.Unit.STONE){
                    constant = 0.000157473;
                } else if (to == Converter_weight.Unit.POUND){
                    constant = 0.00220462;
                } else if (to == Unit.OUNCE){
                    constant = 0.0352747;
                }
                break;
            case MILLIGRAM:
                if (to == Converter_weight.Unit.TONNE) {
                    constant = 1e-9;
                } else if (to == Converter_weight.Unit.KILOGRAM) {
                    constant = 1e-6;
                } else if (to == Converter_weight.Unit.GRAM) {
                    constant = 0.001;
                } else if (to == Converter_weight.Unit.MICROGRAM) {
                    constant = 1000;
                } else if (to == Converter_weight.Unit.IMPERIAL_TON) {
                    constant = 9.8421e-10;
                } else if (to == Converter_weight.Unit.US_TON) {
                    constant = 1.1023e-9;
                } else if (to == Converter_weight.Unit.STONE){
                    constant = 1.5747e-7;
                } else  if (to == Converter_weight.Unit.POUND){
                    constant = 2.204e-6;
                } else if (to == Unit.OUNCE){
                    constant = 3.5274e-5;
                }
                break;
            case MICROGRAM:
                if (to == Converter_weight.Unit.TONNE) {
                    constant = 1e-12;
                } else if (to == Converter_weight.Unit.KILOGRAM) {
                    constant = 1e-9;
                } else if (to == Converter_weight.Unit.GRAM) {
                    constant = 1e-6;
                } else if (to == Converter_weight.Unit.MILLIGRAM) {
                    constant = 0.001;
                } else if (to == Converter_weight.Unit.IMPERIAL_TON) {
                    constant = 9.8421e-13;
                } else if (to == Converter_weight.Unit.US_TON) {
                    constant = 1.1023e-12;
                } else if (to == Converter_weight.Unit.STONE){
                    constant = 1.5747e-10;
                } else  if (to == Converter_weight.Unit.POUND){
                    constant = 2.204e-10;
                } else if (to == Unit.OUNCE){
                    constant = 3.5274e-8;
                }
                break;
            case IMPERIAL_TON:
                if (to == Converter_weight.Unit.TONNE) {
                    constant = 1.01605;
                } else if (to == Converter_weight.Unit.KILOGRAM) {
                    constant = 1016.05;
                } else if (to == Converter_weight.Unit.GRAM) {
                    constant = 1.016e+6;
                } else if (to == Converter_weight.Unit.MILLIGRAM) {
                    constant = 1.016e+9;
                } else if (to == Converter_weight.Unit.MICROGRAM) {
                    constant = 1.016e+12;
                } else if (to == Converter_weight.Unit.US_TON) {
                    constant = 1.12;
                } else if (to == Converter_weight.Unit.STONE){
                    constant = 160;
                } else  if (to == Converter_weight.Unit.POUND){
                    constant = 2240;
                } else if (to == Unit.OUNCE){
                    constant = 35840;
                }
                break;
            case US_TON:
                if (to == Converter_weight.Unit.TONNE) {
                    constant = 0.907185;
                } else if (to == Converter_weight.Unit.KILOGRAM) {
                    constant = 907.185;
                } else if (to == Converter_weight.Unit.GRAM) {
                    constant = 907185;
                } else if (to == Converter_weight.Unit.MILLIGRAM) {
                    constant = 9.072e+8;
                } else if (to == Converter_weight.Unit.MICROGRAM) {
                    constant = 9.072e+11;
                } else if (to == Converter_weight.Unit.IMPERIAL_TON) {
                    constant = 0.892857;
                } else if (to == Converter_weight.Unit.STONE){
                    constant = 142.857;
                } else  if (to == Converter_weight.Unit.POUND){
                    constant = 200;
                } else if (to == Unit.OUNCE){
                    constant = 32000;
                }
                break;
            case STONE:
                if (to == Converter_weight.Unit.TONNE) {
                    constant = 0.00635029;
                } else if (to == Converter_weight.Unit.KILOGRAM) {
                    constant = 6.35029;
                } else if (to == Converter_weight.Unit.GRAM) {
                    constant = 6350.29;
                } else if (to == Converter_weight.Unit.MILLIGRAM) {
                    constant = 6.35e+6;
                } else if (to == Converter_weight.Unit.MICROGRAM) {
                    constant = 6.35e+9;
                } else if (to == Converter_weight.Unit.IMPERIAL_TON) {
                    constant = 0.00625;
                } else if (to == Converter_weight.Unit.US_TON){
                    constant = 0.007;
                } else  if (to == Converter_weight.Unit.POUND){
                    constant = 14;
                } else if (to == Unit.OUNCE){
                    constant = 224;
                }
                break;
            case POUND:
                if (to == Converter_weight.Unit.TONNE) {
                    constant = 0.000453592;
                } else if (to == Converter_weight.Unit.KILOGRAM) {
                    constant = 0.453592;
                } else if (to == Converter_weight.Unit.GRAM) {
                    constant = 453.592;
                } else if (to == Converter_weight.Unit.MILLIGRAM) {
                    constant = 453592;
                } else if (to == Converter_weight.Unit.MICROGRAM) {
                    constant = 4.536e+8;
                } else if (to == Converter_weight.Unit.IMPERIAL_TON) {
                    constant = 0.000446429;
                } else if (to == Converter_weight.Unit.US_TON){
                    constant = 0.0005;
                } else  if (to == Converter_weight.Unit.STONE){
                    constant = 0.0714286;
                } else if (to == Unit.OUNCE){
                    constant = 16;
                }
                break;
            case OUNCE:
                if (to == Converter_weight.Unit.TONNE) {
                    constant = 2.835e-5;
                } else if (to == Converter_weight.Unit.KILOGRAM) {
                    constant = 0.0283495;
                } else if (to == Converter_weight.Unit.GRAM) {
                    constant = 28.3495;
                } else if (to == Converter_weight.Unit.MILLIGRAM) {
                    constant = 28349.5;
                } else if (to == Converter_weight.Unit.MICROGRAM) {
                    constant = 2.835e+7;
                } else if (to == Converter_weight.Unit.IMPERIAL_TON) {
                    constant = 2.7902e-5;
                } else if (to == Converter_weight.Unit.US_TON){
                    constant = 3.125e-5;
                } else  if (to == Converter_weight.Unit.STONE){
                    constant = 0.00446429;
                } else if (to == Unit.POUND){
                    constant = 0.0625;
                }
                break;
        }

        multiplier = constant;
    }

    // Convert the unit!
    public double convert(double input) {
        return input * multiplier;
    }
}
