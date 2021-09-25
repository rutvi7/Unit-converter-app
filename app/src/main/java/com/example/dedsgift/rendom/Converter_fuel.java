package com.example.dedsgift.rendom;

public class Converter_fuel {
    public enum Unit {
        MILE_PER_US_GALLON,
        MILE_PER_GALLON,
        KILOMETER_PER_LITER,
        LITER_PER_100_KILOMETER,
        ;

        // Helper method to convert text to one of the above constants
        public static Converter_fuel.Unit fromString(String text) {
            if (text != null) {
                for (Converter_fuel.Unit unit : Converter_fuel.Unit.values()) {
                    if (text.equalsIgnoreCase(unit.toString())) {
                        return unit;
                    }
                }
            }

            throw new IllegalArgumentException("Cannot find a value for " + text);
        }
    }

    private final double multiplier;
    public Converter_fuel(Converter_fuel.Unit from, Converter_fuel.Unit to) {
        double constant = 1;
        // Set the multiplier, else if fromUnit = toUnit, then it is 1
        switch (from) {
            case MILE_PER_US_GALLON:
                if (to == Converter_fuel.Unit.MILE_PER_GALLON) {
                    constant = 1.20095;
                } else if (to == Converter_fuel.Unit.KILOMETER_PER_LITER) {
                    constant = 0.425144;
                } else if (to == Converter_fuel.Unit.LITER_PER_100_KILOMETER) {
                    constant = 235.215;
                }

                break;
            case MILE_PER_GALLON:
                if (to == Converter_fuel.Unit.MILE_PER_US_GALLON) {
                    constant = 0.832674;
                } else if (to == Converter_fuel.Unit.KILOMETER_PER_LITER) {
                    constant = 0.354006;
                } else if (to == Converter_fuel.Unit.LITER_PER_100_KILOMETER) {
                    constant = 282.481;
                }
                break;
            case KILOMETER_PER_LITER:
                if (to == Converter_fuel.Unit.MILE_PER_US_GALLON) {
                    constant = 2.35215;
                } else if (to == Converter_fuel.Unit.MILE_PER_GALLON) {
                    constant = 2.82481;
                } else if (to == Converter_fuel.Unit.LITER_PER_100_KILOMETER) {
                    constant = 100;
                }
                break;
            case LITER_PER_100_KILOMETER:
                if (to == Converter_fuel.Unit.MILE_PER_US_GALLON) {
                    constant = 235.215;
                } else if (to == Converter_fuel.Unit.MILE_PER_GALLON) {
                    constant = 282.481;
                } else if (to == Converter_fuel.Unit.KILOMETER_PER_LITER) {
                    constant = 100;
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
