package com.example.dedsgift.rendom;

public class Converter_angle {

    public enum Unit {
        DEGREE,
        GRADIAN,
        MILLIRADIAN,
        MINUTE_OF_ARC,
        RADIAN,
        SECOND_OF_ARC,
        ;


        // Helper method to convert text to one of the above constants
        public static Converter_angle.Unit fromString(String text) {
            if (text != null) {
                for (Converter_angle.Unit unit : Converter_angle.Unit.values()) {
                    if (text.equalsIgnoreCase(unit.toString())) {
                        return unit;
                    }
                }
            }

            throw new IllegalArgumentException("Cannot find a value for " + text);
        }
    }

    private final double multiplier;
    public Converter_angle(Converter_angle.Unit from, Converter_angle.Unit to) {
        double constant = 1;
        // Set the multiplier, else if fromUnit = toUnit, then it is 1
        switch (from) {
            case DEGREE:
                if (to == Converter_angle.Unit.GRADIAN) {
                    constant = 1.11111;
                } else if (to == Converter_angle.Unit.MILLIRADIAN) {
                    constant = 17.4533;
                } else if (to == Converter_angle.Unit.MINUTE_OF_ARC) {
                    constant = 60;
                } else if (to == Converter_angle.Unit.RADIAN) {
                    constant = 0.0174533;
                } else if (to == Unit.SECOND_OF_ARC) {
                    constant = 3600;
                }

                break;
            case GRADIAN:
                if (to == Converter_angle.Unit.DEGREE) {
                    constant = 0.9;
                } else if (to == Converter_angle.Unit.MILLIRADIAN) {
                    constant = 15.708;
                } else if (to == Converter_angle.Unit.MINUTE_OF_ARC) {
                    constant = 54;
                } else if (to == Converter_angle.Unit.RADIAN) {
                    constant = 0.015708;
                } else if (to == Unit.SECOND_OF_ARC) {
                    constant = 3240;
                }
                break;
            case MILLIRADIAN:
                if (to == Converter_angle.Unit.DEGREE) {
                    constant = 0.0572958;
                } else if (to == Converter_angle.Unit.GRADIAN) {
                    constant = 0.063662;
                } else if (to == Converter_angle.Unit.MINUTE_OF_ARC) {
                    constant = 3.43775;
                } else if (to == Converter_angle.Unit.RADIAN) {
                    constant = 0.001;
                } else if (to == Unit.SECOND_OF_ARC) {
                    constant = 206.265;
                }
                break;
            case MINUTE_OF_ARC:
                if (to == Converter_angle.Unit.DEGREE) {
                    constant = 0.0166667;
                } else if (to == Converter_angle.Unit.GRADIAN) {
                    constant = 0.0185185;
                } else if (to == Converter_angle.Unit.MILLIRADIAN) {
                    constant = 0.290888;
                } else if (to == Converter_angle.Unit.RADIAN) {
                    constant = 0.000290888;
                } else if (to == Unit.SECOND_OF_ARC) {
                    constant = 60;
                }
                break;
            case RADIAN:
                if (to == Converter_angle.Unit.DEGREE) {
                    constant = 57.2958;
                } else if (to == Converter_angle.Unit.GRADIAN) {
                    constant = 63.662;
                } else if (to == Converter_angle.Unit.MILLIRADIAN) {
                    constant = 1000;
                } else if (to == Converter_angle.Unit.MINUTE_OF_ARC) {
                    constant = 3437.75;
                } else if (to == Unit.SECOND_OF_ARC) {
                    constant = 206265;
                }
                break;
            case SECOND_OF_ARC:
                if (to == Converter_angle.Unit.DEGREE) {
                    constant = 0.000277778;
                } else if (to == Converter_angle.Unit.GRADIAN) {
                    constant = 0.000308642;
                } else if (to == Converter_angle.Unit.MILLIRADIAN) {
                    constant = 0.00484814;
                } else if (to == Converter_angle.Unit.MINUTE_OF_ARC) {
                    constant = 0.0166667;
                } else if (to == Unit.RADIAN) {
                    constant = 4.8481e-6;
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
