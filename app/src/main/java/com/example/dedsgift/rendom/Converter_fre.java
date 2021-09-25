package com.example.dedsgift.rendom;

public class Converter_fre {

    public enum Unit {
        HERTZ,
        KILOHERTZ,
        MEGAHERTZ,
        GIGAHERTZ,
        ;

        // Helper method to convert text to one of the above constants
        public static Converter_fre.Unit fromString(String text) {
            if (text != null) {
                for (Converter_fre.Unit unit : Converter_fre.Unit.values()) {
                    if (text.equalsIgnoreCase(unit.toString())) {
                        return unit;
                    }
                }
            }

            throw new IllegalArgumentException("Cannot find a value for " + text);
        }
    }

    private final double multiplier;
    public Converter_fre(Converter_fre.Unit from, Converter_fre.Unit to) {
        double constant = 1;
        // Set the multiplier, else if fromUnit = toUnit, then it is 1
        switch (from) {
            case HERTZ:
                if (to == Converter_fre.Unit.KILOHERTZ) {
                    constant = 0.001;
                } else if (to == Converter_fre.Unit.MEGAHERTZ) {
                    constant = 1e-6;
                } else if (to == Unit.GIGAHERTZ) {
                    constant = 1e-9;
                }

                break;
            case KILOHERTZ:
                if (to == Converter_fre.Unit.HERTZ) {
                    constant = 1000;
                } else if (to == Converter_fre.Unit.MEGAHERTZ) {
                    constant = 0.001;
                } else if (to == Unit.GIGAHERTZ) {
                    constant = 1e-6;
                }
                break;
            case MEGAHERTZ:
                if (to == Converter_fre.Unit.HERTZ) {
                    constant = 1e+6;
                } else if (to == Converter_fre.Unit.KILOHERTZ) {
                    constant = 1000;
                } else if (to == Unit.GIGAHERTZ) {
                    constant = 0.001;
                }
                break;
            case GIGAHERTZ:
                if (to == Converter_fre.Unit.HERTZ) {
                    constant = 1e+9;
                } else if (to == Converter_fre.Unit.KILOHERTZ) {
                    constant = 1e+6;
                } else if (to == Unit.MEGAHERTZ) {
                    constant = 1000;
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
