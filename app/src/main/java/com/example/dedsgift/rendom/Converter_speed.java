package com.example.dedsgift.rendom;

public class Converter_speed {

    public enum Unit {
        MILES_PER_HOUR,
        FOOT_PER_SECOND,
        METER_PER_SECOND,
        KILOMETER_PER_HOUR,
        KNOT,
        ;


        // Helper method to convert text to one of the above constants
        public static Converter_speed.Unit fromString(String text) {
            if (text != null) {
                for (Converter_speed.Unit unit : Converter_speed.Unit.values()) {
                    if (text.equalsIgnoreCase(unit.toString())) {
                        return unit;
                    }
                }
            }

            throw new IllegalArgumentException("Cannot find a value for " + text);
        }
    }

    private final double multiplier;
    public Converter_speed(Converter_speed.Unit from, Converter_speed.Unit to) {
        double constant = 1;
        // Set the multiplier, else if fromUnit = toUnit, then it is 1
        switch (from) {
            case MILES_PER_HOUR:
                if (to == Converter_speed.Unit.FOOT_PER_SECOND) {
                    constant = 1.4667;
                } else if (to == Converter_speed.Unit.METER_PER_SECOND) {
                    constant = 0.44704;
                } else if (to == Converter_speed.Unit.KILOMETER_PER_HOUR) {
                    constant = 1.60934;
                } else if (to == Unit.KNOT) {
                    constant = 0.868976;
                }

                break;
            case FOOT_PER_SECOND:
                if (to == Converter_speed.Unit.MILES_PER_HOUR) {
                    constant = 0.681818;
                } else if (to == Converter_speed.Unit.METER_PER_SECOND) {
                    constant = 0.3048;
                } else if (to == Converter_speed.Unit.KILOMETER_PER_HOUR) {
                    constant = 1.09728;
                } else if (to == Unit.KNOT) {
                    constant = 0.592484;
                }
                break;
            case METER_PER_SECOND:
                if (to == Converter_speed.Unit.MILES_PER_HOUR) {
                    constant = 2.23694;
                } else if (to == Converter_speed.Unit.FOOT_PER_SECOND) {
                    constant = 3.28084;
                } else if (to == Converter_speed.Unit.KILOMETER_PER_HOUR) {
                    constant = 3.6;
                } else if (to == Unit.KNOT) {
                    constant = 1.94384;
                }
                break;
            case KILOMETER_PER_HOUR:
                if (to == Converter_speed.Unit.MILES_PER_HOUR) {
                    constant = 0.621371;
                } else if (to == Converter_speed.Unit.FOOT_PER_SECOND) {
                    constant = 0.911344;
                } else if (to == Converter_speed.Unit.METER_PER_SECOND) {
                    constant = 0.277778;
                } else if (to == Unit.KNOT) {
                    constant = 0.539957;
                }
                break;
            case KNOT:
                if (to == Converter_speed.Unit.MILES_PER_HOUR) {
                    constant = 1.15078;
                } else if (to == Converter_speed.Unit.FOOT_PER_SECOND) {
                    constant = 1.68781;
                } else if (to == Converter_speed.Unit.METER_PER_SECOND) {
                    constant = 0.514444;
                } else if (to == Unit.KILOMETER_PER_HOUR) {
                    constant = 1.852;
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
