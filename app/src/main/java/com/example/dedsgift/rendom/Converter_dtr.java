package com.example.dedsgift.rendom;

public class Converter_dtr {

    public enum Unit {
        BIT_PER_SECOND,
        KILOBIT_PER_SECOND,
        KILOBYTE_PER_SECOND,
        MEGABIT_PER_SECOND,
        MEGABYTE_PER_SECOND,
        GIGABIT_PER_SECOND,
        GIGABYTE_PER_SECOND,
        TERABIT_PER_SECOND,
        TERABYTE_PER_SECOND;

        // Helper method to convert text to one of the above constants
        public static Converter_dtr.Unit fromString(String text) {
            if (text != null) {
                for (Converter_dtr.Unit unit : Converter_dtr.Unit.values()) {
                    if (text.equalsIgnoreCase(unit.toString())) {
                        return unit;
                    }
                }
            }

            throw new IllegalArgumentException("Cannot find a value for " + text);
        }
    }

    private final double multiplier;
    public Converter_dtr(Converter_dtr.Unit from, Converter_dtr.Unit to) {
        double constant = 1;
        // Set the multiplier, else if fromUnit = toUnit, then it is 1
        switch (from) {
            case BIT_PER_SECOND:
                if (to == Converter_dtr.Unit.KILOBIT_PER_SECOND) {
                    constant = 0.001;
                } else if (to == Converter_dtr.Unit.KILOBYTE_PER_SECOND) {
                    constant = 0.000125;
                } else if (to == Converter_dtr.Unit.MEGABIT_PER_SECOND) {
                    constant = 1e-6;
                } else if (to == Converter_dtr.Unit.MEGABYTE_PER_SECOND) {
                    constant = 1.25e-7;
                } else if (to == Converter_dtr.Unit.GIGABIT_PER_SECOND) {
                    constant = 1e-9;
                } else if (to == Converter_dtr.Unit.GIGABYTE_PER_SECOND) {
                    constant = 1.25e-10;
                } else if (to == Unit.TERABIT_PER_SECOND) {
                    constant = 1e-10;
                } else if (to == Converter_dtr.Unit.TERABYTE_PER_SECOND){
                    constant = 1.25e-13;
                }
                break;
            case KILOBIT_PER_SECOND:
                if (to == Converter_dtr.Unit.BIT_PER_SECOND) {
                    constant = 1000;
                } else if (to == Converter_dtr.Unit.KILOBYTE_PER_SECOND) {
                    constant = 0.125;
                } else if (to == Converter_dtr.Unit.MEGABIT_PER_SECOND) {
                    constant = 0.001;
                } else if (to == Converter_dtr.Unit.MEGABYTE_PER_SECOND) {
                    constant = 0.000125;
                } else if (to == Converter_dtr.Unit.GIGABIT_PER_SECOND) {
                    constant = 1e-6;
                } else if (to == Converter_dtr.Unit.GIGABYTE_PER_SECOND) {
                    constant = 1.25e-7;
                } else if (to == Converter_dtr.Unit.TERABIT_PER_SECOND){
                    constant = 1e-9;
                } else if (to == Converter_dtr.Unit.TERABYTE_PER_SECOND){
                    constant = 1.25e-10;
                }
                break;
            case KILOBYTE_PER_SECOND:
                if (to == Converter_dtr.Unit.BIT_PER_SECOND) {
                    constant = 8000;
                } else if (to == Converter_dtr.Unit.KILOBIT_PER_SECOND) {
                    constant = 8;
                } else if (to == Converter_dtr.Unit.MEGABIT_PER_SECOND) {
                    constant = 0.008;
                } else if (to == Converter_dtr.Unit.MEGABYTE_PER_SECOND) {
                    constant = 0.001;
                } else if (to == Converter_dtr.Unit.GIGABIT_PER_SECOND) {
                    constant = 8e-6;
                } else if (to == Converter_dtr.Unit.GIGABYTE_PER_SECOND) {
                    constant = 1e-6;
                } else if (to == Converter_dtr.Unit.TERABIT_PER_SECOND){
                    constant = 8e-9;
                } else if (to == Converter_dtr.Unit.TERABYTE_PER_SECOND){
                    constant = 1e-9;
                }
                break;
            case MEGABIT_PER_SECOND:
                if (to == Converter_dtr.Unit.BIT_PER_SECOND) {
                    constant = 1e+6;
                } else if (to == Converter_dtr.Unit.KILOBIT_PER_SECOND) {
                    constant = 1000;
                } else if (to == Converter_dtr.Unit.KILOBYTE_PER_SECOND) {
                    constant = 125;
                } else if (to == Converter_dtr.Unit.MEGABYTE_PER_SECOND) {
                    constant = 0.125;
                } else if (to == Converter_dtr.Unit.GIGABIT_PER_SECOND) {
                    constant = 0.001;
                } else if (to == Converter_dtr.Unit.GIGABYTE_PER_SECOND) {
                    constant = 0.000125;
                } else if (to == Converter_dtr.Unit.TERABIT_PER_SECOND){
                    constant = 1e-6;
                } else  if (to == Converter_dtr.Unit.TERABYTE_PER_SECOND){
                    constant = 1.25e-7;
                }
                break;
            case MEGABYTE_PER_SECOND:
                if (to == Converter_dtr.Unit.BIT_PER_SECOND) {
                    constant = 8e+6;
                } else if (to == Converter_dtr.Unit.KILOBIT_PER_SECOND) {
                    constant = 8000;
                } else if (to == Converter_dtr.Unit.KILOBYTE_PER_SECOND) {
                    constant = 1000;
                } else if (to == Converter_dtr.Unit.MEGABIT_PER_SECOND) {
                    constant = 8;
                } else if (to == Converter_dtr.Unit.GIGABIT_PER_SECOND) {
                    constant = 0.008;
                } else if (to == Converter_dtr.Unit.GIGABYTE_PER_SECOND) {
                    constant = 0.001;
                } else if (to == Converter_dtr.Unit.TERABIT_PER_SECOND){
                    constant = 8e-6;
                } else  if (to == Converter_dtr.Unit.TERABYTE_PER_SECOND){
                    constant = 1e-6;
                }
                break;
            case GIGABIT_PER_SECOND:
                if (to == Converter_dtr.Unit.BIT_PER_SECOND) {
                    constant = 1e+9;
                } else if (to == Converter_dtr.Unit.KILOBIT_PER_SECOND) {
                    constant = 1e+6;
                } else if (to == Converter_dtr.Unit.KILOBYTE_PER_SECOND) {
                    constant = 125000;
                } else if (to == Converter_dtr.Unit.MEGABIT_PER_SECOND) {
                    constant = 1000;
                } else if (to == Converter_dtr.Unit.MEGABYTE_PER_SECOND) {
                    constant = 125;
                } else if (to == Converter_dtr.Unit.GIGABYTE_PER_SECOND) {
                    constant = 0.125;
                } else if (to == Converter_dtr.Unit.TERABIT_PER_SECOND){
                    constant = 0.001;
                } else  if (to == Converter_dtr.Unit.TERABYTE_PER_SECOND){
                    constant = 0.000125;
                }
                break;
            case GIGABYTE_PER_SECOND:
                if (to == Converter_dtr.Unit.BIT_PER_SECOND) {
                    constant = 8e+9;
                } else if (to == Converter_dtr.Unit.KILOBIT_PER_SECOND) {
                    constant = 8e+6;
                } else if (to == Converter_dtr.Unit.KILOBYTE_PER_SECOND) {
                    constant = 1e+6;
                } else if (to == Converter_dtr.Unit.MEGABIT_PER_SECOND) {
                    constant = 8000;
                } else if (to == Converter_dtr.Unit.MEGABYTE_PER_SECOND) {
                    constant = 1000;
                } else if (to == Converter_dtr.Unit.GIGABIT_PER_SECOND) {
                    constant = 8;
                } else if (to == Converter_dtr.Unit.TERABIT_PER_SECOND){
                    constant = 0.008;
                } else  if (to == Converter_dtr.Unit.TERABYTE_PER_SECOND){
                    constant = 0.001;
                }
                break;
            case TERABIT_PER_SECOND:
                if (to == Converter_dtr.Unit.BIT_PER_SECOND) {
                    constant = 1e+12;
                } else if (to == Converter_dtr.Unit.KILOBIT_PER_SECOND) {
                    constant = 1e+9;
                } else if (to == Converter_dtr.Unit.KILOBYTE_PER_SECOND) {
                    constant = 1.25e+8;
                } else if (to == Converter_dtr.Unit.MEGABIT_PER_SECOND) {
                    constant = 1e+6;
                } else if (to == Converter_dtr.Unit.MEGABYTE_PER_SECOND) {
                    constant = 125000;
                } else if (to == Converter_dtr.Unit.GIGABIT_PER_SECOND) {
                    constant = 1000;
                } else if (to == Converter_dtr.Unit.GIGABYTE_PER_SECOND){
                    constant = 125;
                } else  if (to == Converter_dtr.Unit.TERABYTE_PER_SECOND){
                    constant = 0.125;
                }
                break;
            case TERABYTE_PER_SECOND:
                if (to == Converter_dtr.Unit.BIT_PER_SECOND) {
                    constant = 8e+12;
                } else if (to == Converter_dtr.Unit.KILOBIT_PER_SECOND) {
                    constant = 8e+9;
                } else if (to == Converter_dtr.Unit.KILOBYTE_PER_SECOND) {
                    constant = 1e+9;
                } else if (to == Converter_dtr.Unit.MEGABIT_PER_SECOND) {
                    constant = 8e+6;
                } else if (to == Converter_dtr.Unit.MEGABYTE_PER_SECOND) {
                    constant = 1e+6;
                } else if (to == Converter_dtr.Unit.GIGABIT_PER_SECOND) {
                    constant = 8000;
                } else if (to == Converter_dtr.Unit.GIGABYTE_PER_SECOND){
                    constant = 1000;
                } else  if (to == Converter_dtr.Unit.TERABIT_PER_SECOND){
                    constant = 8;
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
