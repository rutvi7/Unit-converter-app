package com.example.dedsgift.rendom;

public class Converter_time {

    public enum Unit {
        NANOSECOND,
        MICROSECOND,
        MILLISECOND,
        SECOND,
        MINUTE,
        HOUR,
        DAY,
        WEEK,
        MONTH,
        YEAR,
        DECADE,
        CENTURY;


        // Helper method to convert text to one of the above constants
        public static Converter_time.Unit fromString(String text) {
            if (text != null) {
                for (Converter_time.Unit unit : Converter_time.Unit.values()) {
                    if (text.equalsIgnoreCase(unit.toString())) {
                        return unit;
                    }
                }
            }

            throw new IllegalArgumentException("Cannot find a value for " + text);
        }
    }

    private final double multiplier;
    public Converter_time(Converter_time.Unit from, Converter_time.Unit to) {
        double constant = 1;
        // Set the multiplier, else if fromUnit = toUnit, then it is 1
        switch (from) {
            case NANOSECOND:
                if (to == Converter_time.Unit.MICROSECOND) {
                    constant = 0.001;
                } else if (to == Converter_time.Unit.MILLISECOND) {
                    constant = 1e-6;
                } else if (to == Converter_time.Unit.SECOND) {
                    constant = 1e-9;
                } else if (to == Converter_time.Unit.MINUTE) {
                    constant = 1.6667e-11;
                } else if (to == Converter_time.Unit.HOUR) {
                    constant = 2.7778e-13;
                } else if (to == Converter_time.Unit.DAY) {
                    constant = 1.1574e-14;
                } else if (to == Converter_time.Unit.WEEK) {
                    constant = 1.6534e-15;
                } else if (to == Converter_time.Unit.MONTH){
                    constant = 3.8052e-16;
                } else if (to == Converter_time.Unit.YEAR){
                    constant = 3.171e-17;
                } else if (to == Unit.DECADE){
                    constant = 3.171e-18;
                } else if (to == Unit.CENTURY){
                    constant = 3.171e-19;
                }
                break;
            case MICROSECOND:
                if (to == Converter_time.Unit.NANOSECOND) {
                    constant = 1000;
                } else if (to == Converter_time.Unit.MILLISECOND) {
                    constant = 0.001;
                } else if (to == Converter_time.Unit.SECOND) {
                    constant = 1e-6;
                } else if (to == Converter_time.Unit.MINUTE) {
                    constant = 1.6667e-8;
                } else if (to == Converter_time.Unit.HOUR) {
                    constant = 2.778e-10;
                } else if (to == Converter_time.Unit.DAY) {
                    constant = 1.1574e-11;
                } else if (to == Converter_time.Unit.WEEK){
                    constant = 1.6534e-12;
                } else if (to == Converter_time.Unit.MONTH){
                    constant = 3.8052e-13;
                } else if (to == Converter_time.Unit.YEAR){
                    constant = 3.171e-14;
                } else if (to == Unit.DECADE){
                    constant = 3.171e-15;
                } else if (to == Unit.CENTURY){
                    constant = 3.171e-16;
                }
                break;
            case MILLISECOND:
                if (to == Converter_time.Unit.NANOSECOND) {
                    constant = 1e+6;
                } else if (to == Converter_time.Unit.MICROSECOND) {
                    constant = 1000;
                } else if (to == Converter_time.Unit.SECOND) {
                    constant = 0.001;
                } else if (to == Converter_time.Unit.MINUTE) {
                    constant = 1.6667e-5;
                } else if (to == Converter_time.Unit.HOUR) {
                    constant = 2.7778e-7;
                } else if (to == Converter_time.Unit.DAY) {
                    constant = 1.1574e-8;
                } else if (to == Converter_time.Unit.WEEK){
                    constant = 1.16534e-9;
                } else if (to == Converter_time.Unit.MONTH){
                    constant = 3.8052e-10;
                } else if (to == Converter_time.Unit.YEAR){
                    constant = 3.171e-11;
                } else if (to == Unit.DECADE){
                    constant = 3.171e-12;
                } else if (to == Unit.CENTURY){
                    constant = 3.171e-13;
                }
                break;
            case SECOND:
                if (to == Converter_time.Unit.NANOSECOND) {
                    constant = 1e+9;
                } else if (to == Converter_time.Unit.MICROSECOND) {
                    constant = 1e+6;
                } else if (to == Converter_time.Unit.MILLISECOND) {
                    constant = 1000;
                } else if (to == Converter_time.Unit.MINUTE) {
                    constant = 0.0166667;
                } else if (to == Converter_time.Unit.HOUR) {
                    constant = 0.000277778;
                } else if (to == Converter_time.Unit.DAY) {
                    constant = 1.1574e-5;
                } else if (to == Converter_time.Unit.WEEK){
                    constant = 1.6534e-6;
                } else  if (to == Converter_time.Unit.MONTH){
                    constant = 3.8052e-7;
                } else if (to == Converter_time.Unit.YEAR){
                    constant = 3.171e-8;
                } else if (to == Unit.DECADE){
                    constant = 3.171e-9;
                } else if (to == Unit.CENTURY){
                    constant = 3.171e-10;
                }
                break;
            case MINUTE:
                if (to == Converter_time.Unit.NANOSECOND) {
                    constant = 6e+10;
                } else if (to == Converter_time.Unit.MICROSECOND) {
                    constant = 6e+7;
                } else if (to == Converter_time.Unit.MILLISECOND) {
                    constant = 60000;
                } else if (to == Converter_time.Unit.SECOND) {
                    constant = 60;
                } else if (to == Converter_time.Unit.HOUR) {
                    constant = 0.0166667;
                } else if (to == Converter_time.Unit.DAY) {
                    constant = 0.000694444;
                } else if (to == Converter_time.Unit.WEEK){
                    constant = 9.9206e-5;
                } else  if (to == Converter_time.Unit.MONTH){
                    constant = 2.2831e-5;
                } else if (to == Converter_time.Unit.YEAR){
                    constant = 1.9026e-6;
                } else if (to == Unit.DECADE){
                    constant = 1.9026e-7;
                } else if (to == Unit.CENTURY){
                    constant = 1.9026e-8;
                }
                break;
            case HOUR:
                if (to == Converter_time.Unit.NANOSECOND) {
                    constant = 3.6e+12;
                } else if (to == Converter_time.Unit.MICROSECOND) {
                    constant = 3.6e+9;
                } else if (to == Converter_time.Unit.MILLISECOND) {
                    constant = 3.6e+6;
                } else if (to == Converter_time.Unit.SECOND) {
                    constant = 3600;
                } else if (to == Converter_time.Unit.MINUTE) {
                    constant = 60;
                } else if (to == Converter_time.Unit.DAY) {
                    constant = 0.0416667;
                } else if (to == Converter_time.Unit.WEEK){
                    constant = 0.00595238;
                } else  if (to == Converter_time.Unit.MONTH){
                    constant = 0.00136986;
                } else if (to == Converter_time.Unit.YEAR){
                    constant = 0.000114155;
                } else if (to == Unit.DECADE){
                    constant = 1.1416e-5;
                } else if (to == Unit.CENTURY){
                    constant = 1.1416e-6;
                }
                break;
            case DAY:
                if (to == Converter_time.Unit.NANOSECOND) {
                    constant = 8.64e+13;
                } else if (to == Converter_time.Unit.MICROSECOND) {
                    constant = 8.64e+10;
                } else if (to == Converter_time.Unit.MILLISECOND) {
                    constant = 8.64e+7;
                } else if (to == Converter_time.Unit.SECOND) {
                    constant = 86400;
                } else if (to == Converter_time.Unit.MINUTE) {
                    constant = 1440;
                } else if (to == Converter_time.Unit.HOUR) {
                    constant = 24;
                } else if (to == Converter_time.Unit.WEEK){
                    constant = 0.142857;
                } else  if (to == Converter_time.Unit.MONTH){
                    constant = 0.0328767;
                } else if (to == Converter_time.Unit.YEAR){
                    constant = 0.00273973;
                } else if (to == Unit.DECADE){
                    constant = 0.000273973;
                } else if (to == Unit.CENTURY){
                    constant = 2.7397e-5;
                }
                break;
            case WEEK:
                if (to == Converter_time.Unit.NANOSECOND) {
                    constant = 6.048e+14;
                } else if (to == Converter_time.Unit.MICROSECOND) {
                    constant = 6.048e+11;
                } else if (to == Converter_time.Unit.MILLISECOND) {
                    constant = 6.048e+8;
                } else if (to == Converter_time.Unit.SECOND) {
                    constant = 604800;
                } else if (to == Converter_time.Unit.MINUTE) {
                    constant = 10080;
                } else if (to == Converter_time.Unit.HOUR) {
                    constant = 168;
                } else if (to == Converter_time.Unit.DAY){
                    constant = 7;
                } else  if (to == Converter_time.Unit.MONTH){
                    constant = 0.230137;
                } else if (to == Converter_time.Unit.YEAR){
                    constant = 0.0191781;
                } else if (to == Unit.DECADE){
                    constant = 0.00191781;
                } else if (to == Unit.CENTURY){
                    constant = 0.000191781;
                }
                break;
            case MONTH:
                if (to == Converter_time.Unit.NANOSECOND) {
                    constant = 2.628e+15;
                } else if (to == Converter_time.Unit.MICROSECOND) {
                    constant = 2.628e+12;
                } else if (to == Converter_time.Unit.MILLISECOND) {
                    constant = 2.628e+9;
                } else if (to == Converter_time.Unit.SECOND) {
                    constant = 2.628e+6;
                } else if (to == Converter_time.Unit.MINUTE) {
                    constant = 43800;
                } else if (to == Converter_time.Unit.HOUR) {
                    constant = 730.001;
                } else if (to == Converter_time.Unit.DAY){
                    constant = 30.4167;
                } else  if (to == Converter_time.Unit.WEEK){
                    constant = 4.34524;
                } else if (to == Converter_time.Unit.YEAR){
                    constant = 0.0833334;
                } else if (to == Unit.DECADE){
                    constant = 0.00833334;
                } else if (to == Unit.CENTURY){
                    constant = 0.000833334;
                }
                break;
            case YEAR:
                if (to == Converter_time.Unit.NANOSECOND) {
                    constant = 3.154e+16;
                } else if (to == Converter_time.Unit.MICROSECOND) {
                    constant = 3.154e+13;
                } else if (to == Converter_time.Unit.MILLISECOND) {
                    constant = 3.154e+10;
                } else if (to == Converter_time.Unit.SECOND) {
                    constant = 3.154e+7;
                } else if (to == Converter_time.Unit.MINUTE) {
                    constant = 525600;
                } else if (to == Converter_time.Unit.HOUR) {
                    constant = 8760;
                } else if (to == Converter_time.Unit.DAY){
                    constant = 365;
                } else  if (to == Converter_time.Unit.WEEK){
                    constant = 52.1429;
                } else if (to == Converter_time.Unit.MONTH){
                    constant = 12;
                } else if (to == Unit.DECADE){
                    constant = 0.1;
                } else if (to == Unit.CENTURY){
                    constant = 0.01;
                }
                break;
            case DECADE:
                if (to == Converter_time.Unit.NANOSECOND) {
                    constant = 3.154e+17;
                } else if (to == Converter_time.Unit.MICROSECOND) {
                    constant = 3.154e+14;
                } else if (to == Converter_time.Unit.MILLISECOND) {
                    constant = 3.154e+11;
                } else if (to == Converter_time.Unit.SECOND) {
                    constant = 3.154e+8;
                } else if (to == Converter_time.Unit.MINUTE) {
                    constant = 5.256e+6;
                } else if (to == Converter_time.Unit.HOUR) {
                    constant = 87600;
                } else if (to == Converter_time.Unit.DAY){
                    constant = 3650;
                } else  if (to == Converter_time.Unit.WEEK){
                    constant = 521.429;
                } else if (to == Converter_time.Unit.MONTH){
                    constant = 120;
                } else if (to == Unit.YEAR){
                    constant = 10;
                } else if (to == Unit.CENTURY){
                    constant = 0.1;
                }
                break;
            case CENTURY:
                if (to == Converter_time.Unit.NANOSECOND) {
                    constant = 3.154e+18;
                } else if (to == Converter_time.Unit.MICROSECOND) {
                    constant = 3.154e+15;
                } else if (to == Converter_time.Unit.MILLISECOND) {
                    constant = 3.154e+12;
                } else if (to == Converter_time.Unit.SECOND) {
                    constant = 3.154e+19;
                } else if (to == Converter_time.Unit.MINUTE) {
                    constant = 5.256e+7;
                } else if (to == Converter_time.Unit.HOUR) {
                    constant = 876000;
                } else if (to == Converter_time.Unit.DAY){
                    constant = 36500;
                } else  if (to == Converter_time.Unit.WEEK){
                    constant = 5214.29;
                } else if (to == Converter_time.Unit.MONTH){
                    constant = 1200;
                } else if (to == Unit.YEAR){
                    constant = 100;
                } else if (to == Unit.DECADE){
                    constant = 10;
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
