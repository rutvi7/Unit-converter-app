package com.example.dedsgift.rendom;

public class Converter_temp {
    public enum Unit {
        CELSIUS,
        FAHRENHEIT,
        KELVIN,
        ;

        // Helper method to convert text to one of the above constants
        public static Converter_temp.Unit fromString(String text) {
            if (text != null) {
                for (Converter_temp.Unit unit : Converter_temp.Unit.values()) {
                    if (text.equalsIgnoreCase(unit.toString())) {
                        return unit;
                    }
                }
            }

            throw new IllegalArgumentException("Cannot find a value for " + text);
        }
    }

    private final double multiplier;
    public Converter_temp(Converter_temp.Unit from, Converter_temp.Unit to) {
        double constant = 1;
        // Set the multiplier, else if fromUnit = toUnit, then it is 1
        switch (from) {
            case CELSIUS:
                if (to == Converter_temp.Unit.FAHRENHEIT) {
                    constant = 33.8;
                } else if (to == Converter_temp.Unit.KELVIN) {
                    constant = 274.15;
                } 
                break;
            case FAHRENHEIT:
                if (to == Converter_temp.Unit.CELSIUS) {
                    constant = -17.2222;
                } else if (to == Converter_temp.Unit.KELVIN) {
                    constant = 255.928;
                } 
                break;
            case KELVIN:
                if (to == Converter_temp.Unit.CELSIUS) {
                    constant = -272.15;
                } else if (to == Converter_temp.Unit.FAHRENHEIT) {
                    constant = -457.87;
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
