package com.example.dedsgift.rendom;

public class Converter_ds {

    public enum Unit {
        BIT,
        KILOBIT,
        MEGABIT,
        GIGABIT,
        TERABIT,
        PETABIT,
        BYTE,
        KILOBYTE,
        MEGABYTE,
        GIGABYTE,
        TERABYTE,
        PETABYTE;


        // Helper method to convert text to one of the above constants
        public static Converter_ds.Unit fromString(String text) {
            if (text != null) {
                for (Converter_ds.Unit unit : Converter_ds.Unit.values()) {
                    if (text.equalsIgnoreCase(unit.toString())) {
                        return unit;
                    }
                }
            }

            throw new IllegalArgumentException("Cannot find a value for " + text);
        }
    }

    private final double multiplier;
    public Converter_ds(Converter_ds.Unit from, Converter_ds.Unit to) {
        double constant = 1;
        // Set the multiplier, else if fromUnit = toUnit, then it is 1
        switch (from) {
            case BIT:
                if (to == Converter_ds.Unit.KILOBIT) {
                    constant = 0.001;
                } else if (to == Converter_ds.Unit.MEGABIT) {
                    constant = 1e-6;
                } else if (to == Converter_ds.Unit.GIGABIT) {
                    constant = 1e-9;
                } else if (to == Converter_ds.Unit.TERABIT) {
                    constant = 1e-12;
                } else if (to == Converter_ds.Unit.PETABIT) {
                    constant = 1e-15;
                } else if (to == Converter_ds.Unit.BYTE) {
                    constant = 0.125;
                } else if (to == Converter_ds.Unit.KILOBYTE) {
                    constant = 0.000125;
                } else if (to == Converter_ds.Unit.MEGABYTE){
                    constant = 1.25e-7;
                } else if (to == Converter_ds.Unit.GIGABYTE){
                    constant = 1.25e-10;
                } else if (to == Converter_ds.Unit.TERABYTE){
                    constant = 1.25e-13;
                } else if (to == Converter_ds.Unit.PETABYTE){
                    constant = 1.25e-16;
                }
                break;
            case KILOBIT:
                if (to == Converter_ds.Unit.BIT) {
                    constant = 1000;
                } else if (to == Converter_ds.Unit.MEGABIT) {
                    constant = 0.001;
                } else if (to == Converter_ds.Unit.GIGABIT) {
                    constant = 1e-6;
                } else if (to == Converter_ds.Unit.TERABIT) {
                    constant = 1e-9;
                } else if (to == Converter_ds.Unit.PETABIT) {
                    constant = 1e-12;
                } else if (to == Converter_ds.Unit.BYTE) {
                    constant = 125;
                } else if (to == Converter_ds.Unit.KILOBYTE){
                    constant = 0.125;
                } else if (to == Converter_ds.Unit.MEGABYTE){
                    constant = 0.000125;
                } else if (to == Converter_ds.Unit.GIGABYTE){
                    constant = 1.25e-7;
                } else if (to == Converter_ds.Unit.TERABYTE){
                    constant = 1.25e-10;
                } else if (to == Converter_ds.Unit.PETABYTE){
                    constant = 1.25e-13;
                }
                break;
            case MEGABIT:
                if (to == Converter_ds.Unit.BIT) {
                    constant = 1e+6;
                } else if (to == Converter_ds.Unit.KILOBIT) {
                    constant = 1000;
                } else if (to == Converter_ds.Unit.GIGABIT) {
                    constant = 0.001;
                } else if (to == Converter_ds.Unit.TERABIT) {
                    constant = 1e-6;
                } else if (to == Converter_ds.Unit.PETABIT) {
                    constant = 1e-9;
                } else if (to == Converter_ds.Unit.BYTE) {
                    constant = 125000;
                } else if (to == Converter_ds.Unit.KILOBYTE){
                    constant = 125;
                } else if (to == Converter_ds.Unit.MEGABYTE){
                    constant = 0.125;
                } else if (to == Converter_ds.Unit.GIGABYTE){
                    constant = 0.000125;
                } else if (to == Converter_ds.Unit.TERABYTE){
                    constant = 1.25e-7;
                } else if (to == Converter_ds.Unit.PETABYTE){
                    constant = 1.25e-10;
                }
                break;
            case GIGABIT:
                if (to == Converter_ds.Unit.BIT) {
                    constant = 1e+9;
                } else if (to == Converter_ds.Unit.KILOBIT) {
                    constant = 1e+6;
                } else if (to == Converter_ds.Unit.MEGABIT) {
                    constant = 1000;
                } else if (to == Converter_ds.Unit.TERABIT) {
                    constant = 0.001;
                } else if (to == Converter_ds.Unit.PETABIT) {
                    constant = 1e-6;
                } else if (to == Converter_ds.Unit.BYTE) {
                    constant = 1.25e+8;
                } else if (to == Converter_ds.Unit.KILOBYTE){
                    constant = 125000;
                } else  if (to == Converter_ds.Unit.MEGABYTE){
                    constant = 125;
                } else if (to == Converter_ds.Unit.GIGABYTE){
                    constant = 0.125;
                } else if (to == Converter_ds.Unit.TERABYTE){
                    constant = 0.000125;
                } else if (to == Converter_ds.Unit.PETABYTE){
                    constant = 1.25e-7;
                }
                break;
            case TERABIT:
                if (to == Converter_ds.Unit.BIT) {
                    constant = 1e+12;
                } else if (to == Converter_ds.Unit.KILOBIT) {
                    constant = 1e+9;
                } else if (to == Converter_ds.Unit.MEGABIT) {
                    constant = 1e+6;
                } else if (to == Converter_ds.Unit.GIGABIT) {
                    constant = 1000;
                } else if (to == Converter_ds.Unit.PETABIT) {
                    constant = 0.001;
                } else if (to == Converter_ds.Unit.BYTE) {
                    constant = 1.25e+11;
                } else if (to == Converter_ds.Unit.KILOBYTE){
                    constant = 1.25e+8;
                } else  if (to == Converter_ds.Unit.MEGABYTE){
                    constant = 125000;
                } else if (to == Converter_ds.Unit.GIGABYTE){
                    constant = 125;
                } else if (to == Converter_ds.Unit.TERABYTE){
                    constant = 0.125;
                } else if (to == Converter_ds.Unit.PETABYTE){
                    constant = 0.000125;
                }
                break;
            case PETABIT:
                if (to == Converter_ds.Unit.BIT) {
                    constant = 1e+15;
                } else if (to == Converter_ds.Unit.KILOBIT) {
                    constant = 1e+12;
                } else if (to == Converter_ds.Unit.MEGABIT) {
                    constant = 1e+9;
                } else if (to == Converter_ds.Unit.GIGABIT) {
                    constant = 1e+6;
                } else if (to == Converter_ds.Unit.TERABIT) {
                    constant = 1000;
                } else if (to == Converter_ds.Unit.BYTE) {
                    constant = 1.25e+14;
                } else if (to == Converter_ds.Unit.KILOBYTE){
                    constant = 1.25e+11;
                } else  if (to == Converter_ds.Unit.MEGABYTE){
                    constant = 1.25e+8;
                } else if (to == Converter_ds.Unit.GIGABYTE){
                    constant = 125000;
                } else if (to == Converter_ds.Unit.TERABYTE){
                    constant = 125;
                } else if (to == Converter_ds.Unit.PETABYTE){
                    constant = 0.125;
                }
                break;
            case BYTE:
                if (to == Converter_ds.Unit.BIT) {
                    constant = 8;
                } else if (to == Converter_ds.Unit.KILOBIT) {
                    constant = 0.008;
                } else if (to == Converter_ds.Unit.MEGABIT) {
                    constant = 8e-6;
                } else if (to == Converter_ds.Unit.GIGABIT) {
                    constant = 8e-9;
                } else if (to == Converter_ds.Unit.TERABIT) {
                    constant = 8e-12;
                } else if (to == Converter_ds.Unit.PETABIT) {
                    constant = 8e-15;
                } else if (to == Converter_ds.Unit.KILOBYTE){
                    constant = 0.001;
                } else  if (to == Converter_ds.Unit.MEGABYTE){
                    constant = 1e-6;
                } else if (to == Converter_ds.Unit.GIGABYTE){
                    constant = 1e-9;
                } else if (to == Converter_ds.Unit.TERABYTE){
                    constant = 1e-12;
                } else if (to == Converter_ds.Unit.PETABYTE){
                    constant = 1e-15;
                }
                break;
            case KILOBYTE:
                if (to == Converter_ds.Unit.BIT) {
                    constant = 8000;
                } else if (to == Converter_ds.Unit.KILOBIT) {
                    constant = 8;
                } else if (to == Converter_ds.Unit.MEGABIT) {
                    constant = 0.008;
                } else if (to == Converter_ds.Unit.GIGABIT) {
                    constant = 8e-6;
                } else if (to == Converter_ds.Unit.TERABIT) {
                    constant = 8e-9;
                } else if (to == Converter_ds.Unit.PETABIT) {
                    constant = 8e-12;
                } else if (to == Converter_ds.Unit.BYTE){
                    constant = 1000;
                } else  if (to == Converter_ds.Unit.MEGABYTE){
                    constant = 0.001;
                } else if (to == Converter_ds.Unit.GIGABYTE){
                    constant = 1e-6;
                } else if (to == Converter_ds.Unit.TERABYTE){
                    constant = 1e-9;
                } else if (to == Converter_ds.Unit.PETABYTE){
                    constant = 1e-12;
                }
                break;
            case MEGABYTE:
                if (to == Converter_ds.Unit.BIT) {
                    constant = 8e+6;
                } else if (to == Converter_ds.Unit.KILOBIT) {
                    constant = 8000;
                } else if (to == Converter_ds.Unit.MEGABIT) {
                    constant = 8;
                } else if (to == Converter_ds.Unit.GIGABIT) {
                    constant = 0.008;
                } else if (to == Converter_ds.Unit.TERABIT) {
                    constant = 8e-6;
                } else if (to == Converter_ds.Unit.PETABIT) {
                    constant = 8e-9;
                } else if (to == Converter_ds.Unit.BYTE){
                    constant = 1e+6;
                } else  if (to == Converter_ds.Unit.KILOBYTE){
                    constant = 1000;
                } else if (to == Converter_ds.Unit.GIGABYTE){
                    constant = 0.001;
                } else if (to == Converter_ds.Unit.TERABYTE){
                    constant = 1e-6;
                } else if (to == Converter_ds.Unit.PETABYTE){
                    constant = 1e-9;
                }
                break;
            case GIGABYTE:
                if (to == Converter_ds.Unit.BIT) {
                    constant = 8e+9;
                } else if (to == Converter_ds.Unit.KILOBIT) {
                    constant = 8e+6;
                } else if (to == Converter_ds.Unit.MEGABIT) {
                    constant = 8000;
                } else if (to == Converter_ds.Unit.GIGABIT) {
                    constant = 8;
                } else if (to == Converter_ds.Unit.TERABIT) {
                    constant = 0.008;
                } else if (to == Converter_ds.Unit.PETABIT) {
                    constant = 8e-6;
                } else if (to == Converter_ds.Unit.BYTE){
                    constant = 1e+9;
                } else  if (to == Converter_ds.Unit.KILOBYTE){
                    constant = 1e+6;
                } else if (to == Converter_ds.Unit.MEGABYTE){
                    constant = 1000;
                } else if (to == Converter_ds.Unit.TERABYTE){
                    constant = 0.001;
                } else if (to == Converter_ds.Unit.PETABYTE){
                    constant = 1e-6;
                }
                break;
            case TERABYTE:
                if (to == Converter_ds.Unit.BIT) {
                    constant = 8e+12;
                } else if (to == Converter_ds.Unit.KILOBIT) {
                    constant = 8e+9;
                } else if (to == Converter_ds.Unit.MEGABIT) {
                    constant = 8e+6;
                } else if (to == Converter_ds.Unit.GIGABIT) {
                    constant = 8000;
                } else if (to == Converter_ds.Unit.TERABIT) {
                    constant = 8;
                } else if (to == Converter_ds.Unit.PETABIT) {
                    constant = 0.008;
                } else if (to == Converter_ds.Unit.BYTE){
                    constant = 1e+12;
                } else  if (to == Converter_ds.Unit.KILOBYTE){
                    constant = 1e+9;
                } else if (to == Converter_ds.Unit.MEGABYTE){
                    constant = 1e+6;
                } else if (to == Converter_ds.Unit.GIGABYTE){
                    constant = 1000;
                } else if (to == Converter_ds.Unit.PETABYTE){
                    constant = 0.001;
                }
                break;
            case PETABYTE:
                if (to == Converter_ds.Unit.BIT) {
                    constant = 8e+15;
                } else if (to == Converter_ds.Unit.KILOBIT) {
                    constant = 8e+12;
                } else if (to == Converter_ds.Unit.MEGABIT) {
                    constant = 8e+9;
                } else if (to == Converter_ds.Unit.GIGABIT) {
                    constant = 8e+6;
                } else if (to == Converter_ds.Unit.TERABIT) {
                    constant = 8000;
                } else if (to == Converter_ds.Unit.PETABIT) {
                    constant = 8;
                } else if (to == Converter_ds.Unit.BYTE){
                    constant = 1e+15;
                } else  if (to == Converter_ds.Unit.KILOBYTE){
                    constant = 1e+12;
                } else if (to == Converter_ds.Unit.MEGABYTE){
                    constant = 1e+9;
                } else if (to == Converter_ds.Unit.GIGABYTE){
                    constant = 1e+6;
                } else if (to == Converter_ds.Unit.TERABYTE){
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
