package com.example.dedsgift.rendom;

public class Converter_pre {
    public enum Unit {
        BAR,
        PASCAL,
        POUND_FORCE_PER_SQUARE_INCH,
        STANDARD_ATMOSPHERE,
        TORR,
        ;


        // Helper method to convert text to one of the above constants
        public static Converter_pre.Unit fromString(String text) {
            if (text != null) {
                for (Converter_pre.Unit unit : Converter_pre.Unit.values()) {
                    if (text.equalsIgnoreCase(unit.toString())) {
                        return unit;
                    }
                }
            }

            throw new IllegalArgumentException("Cannot find a value for " + text);
        }
    }

    private final double multiplier;
    public Converter_pre(Converter_pre.Unit from, Converter_pre.Unit to) {
        double constant = 1;
        // Set the multiplier, else if fromUnit = toUnit, then it is 1
        switch (from) {
            case BAR:
                if (to == Converter_pre.Unit.PASCAL) {
                    constant = 100000;
                } else if (to == Converter_pre.Unit.POUND_FORCE_PER_SQUARE_INCH) {
                    constant = 14.5038;
                } else if (to == Converter_pre.Unit.STANDARD_ATMOSPHERE) {
                    constant = 0.986923;
                } else if (to == Converter_pre.Unit.TORR) {
                    constant = 750.062;
                }

                break;
            case PASCAL:
                if (to == Converter_pre.Unit.BAR) {
                    constant = 1e-5;
                } else if (to == Converter_pre.Unit.POUND_FORCE_PER_SQUARE_INCH) {
                    constant = 0.000145038;
                } else if (to == Converter_pre.Unit.STANDARD_ATMOSPHERE) {
                    constant = 9.8692e-6;
                } else if (to == Converter_pre.Unit.TORR) {
                    constant = 0.00750062;
                }
                break;
            case POUND_FORCE_PER_SQUARE_INCH:
                if (to == Converter_pre.Unit.BAR) {
                    constant = 0.0689476;
                } else if (to == Converter_pre.Unit.PASCAL) {
                    constant = 6894.76;
                } else if (to == Converter_pre.Unit.STANDARD_ATMOSPHERE) {
                    constant = 0.068046;
                } else if (to == Converter_pre.Unit.TORR) {
                    constant = 51.7149;
                }
                break;
            case STANDARD_ATMOSPHERE:
                if (to == Converter_pre.Unit.BAR) {
                    constant = 1.01325;
                } else if (to == Converter_pre.Unit.PASCAL) {
                    constant = 101325;
                } else if (to == Converter_pre.Unit.POUND_FORCE_PER_SQUARE_INCH) {
                    constant = 14.6959;
                } else if (to == Converter_pre.Unit.TORR) {
                    constant = 760;
                }
                break;
            case TORR:
                if (to == Converter_pre.Unit.BAR) {
                    constant = 0.00133322;
                } else if (to == Converter_pre.Unit.PASCAL) {
                    constant = 133.322;
                } else if (to == Converter_pre.Unit.POUND_FORCE_PER_SQUARE_INCH) {
                    constant = 0.0193368;
                } else if (to == Converter_pre.Unit.STANDARD_ATMOSPHERE) {
                    constant = 0.00131579;
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
