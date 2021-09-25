package com.example.dedsgift.rendom;

public class Converter_energy {

    public enum Unit {
        JOULE,
        KILOJOULE,
        GRAMCALARIE,
        KILOCALARIE,
        WATTHOUR,
        KILOWATT_HOUR,
        ELECTRONVOLT,
        BRITISH_THERMAL_UNIT,
        US_THERM,
        FOOT_POUND;

        // Helper method to convert text to one of the above constants
        public static Converter_energy.Unit fromString(String text) {
            if (text != null) {
                for (Converter_energy.Unit unit : Converter_energy.Unit.values()) {
                    if (text.equalsIgnoreCase(unit.toString())) {
                        return unit;
                    }
                }
            }

            throw new IllegalArgumentException("Cannot find a value for " + text);
        }
    }

    private final double multiplier;
    public Converter_energy(Converter_energy.Unit from, Converter_energy.Unit to) {
        double constant = 1;
        // Set the multiplier, else if fromUnit = toUnit, then it is 1
        switch (from) {
            case JOULE:
                if (to == Converter_energy.Unit.KILOJOULE) {
                    constant = 0.001;
                } else if (to == Converter_energy.Unit.GRAMCALARIE) {
                    constant = 0.239006;
                } else if (to == Converter_energy.Unit.KILOCALARIE) {
                    constant = 0.000239006;
                } else if (to == Converter_energy.Unit.WATTHOUR) {
                    constant = 0.000277778;
                } else if (to == Converter_energy.Unit.KILOWATT_HOUR) {
                    constant = 2.7778e-7;
                } else if (to == Converter_energy.Unit.ELECTRONVOLT) {
                    constant = 6.242e+18;
                } else if (to == Converter_energy.Unit.BRITISH_THERMAL_UNIT) {
                    constant = 0.000947817;
                } else if (to == Converter_energy.Unit.US_THERM){
                    constant = 9.4804e-9;
                } else if (to == Converter_energy.Unit.FOOT_POUND){
                    constant = 0.737562;
                }
                break;
            case KILOJOULE:
                if (to == Converter_energy.Unit.JOULE) {
                    constant = 1000;
                } else if (to == Converter_energy.Unit.GRAMCALARIE) {
                    constant = 239.006;
                } else if (to == Converter_energy.Unit.KILOCALARIE) {
                    constant = 0.239006;
                } else if (to == Converter_energy.Unit.WATTHOUR) {
                    constant = 0.277778;
                } else if (to == Converter_energy.Unit.KILOWATT_HOUR) {
                    constant = 0.000277778;
                } else if (to == Converter_energy.Unit.ELECTRONVOLT) {
                    constant = 6.242e+21;
                } else if (to == Converter_energy.Unit.BRITISH_THERMAL_UNIT){
                    constant = 0.947817;
                } else if (to == Converter_energy.Unit.US_THERM){
                    constant = 9.4804e-6;
                } else if (to == Converter_energy.Unit.FOOT_POUND){
                    constant = 737.562;
                }
                break;
            case GRAMCALARIE:
                if (to == Converter_energy.Unit.JOULE) {
                    constant = 4.184;
                } else if (to == Converter_energy.Unit.KILOJOULE) {
                    constant = 0.004184;
                } else if (to == Converter_energy.Unit.KILOCALARIE) {
                    constant = 0.001;
                } else if (to == Converter_energy.Unit.WATTHOUR) {
                    constant = 0.00116222;
                } else if (to == Converter_energy.Unit.KILOWATT_HOUR) {
                    constant = 1.1622e-6;
                } else if (to == Converter_energy.Unit.ELECTRONVOLT) {
                    constant = 2.611e+19;
                } else if (to == Converter_energy.Unit.BRITISH_THERMAL_UNIT){
                    constant = 0.00396567;
                } else if (to == Converter_energy.Unit.US_THERM){
                    constant = 3.9666e-8;
                } else if (to == Converter_energy.Unit.FOOT_POUND){
                    constant = 3.08596;
                }
                break;
            case KILOCALARIE:
                if (to == Converter_energy.Unit.JOULE) {
                    constant = 4184;
                } else if (to == Converter_energy.Unit.KILOJOULE) {
                    constant = 4.184;
                } else if (to == Converter_energy.Unit.GRAMCALARIE) {
                    constant = 1000;
                } else if (to == Converter_energy.Unit.WATTHOUR) {
                    constant = 1.16222;
                } else if (to == Converter_energy.Unit.KILOWATT_HOUR) {
                    constant = 0.00116222;
                } else if (to == Converter_energy.Unit.ELECTRONVOLT) {
                    constant = 2.611e+22;
                } else if (to == Converter_energy.Unit.BRITISH_THERMAL_UNIT){
                    constant = 3.96567;
                } else  if (to == Converter_energy.Unit.US_THERM){
                    constant = 3.9666e-5;
                } else if (to == Converter_energy.Unit.FOOT_POUND){
                    constant = 3085.96;
                }
                break;
            case WATTHOUR:
                if (to == Converter_energy.Unit.JOULE) {
                    constant = 3600;
                } else if (to == Converter_energy.Unit.KILOJOULE) {
                    constant = 3.6;
                } else if (to == Converter_energy.Unit.GRAMCALARIE) {
                    constant = 860.421;
                } else if (to == Converter_energy.Unit.KILOCALARIE) {
                    constant = 0.860421;
                } else if (to == Converter_energy.Unit.KILOWATT_HOUR) {
                    constant = 0.001;
                } else if (to == Converter_energy.Unit.ELECTRONVOLT) {
                    constant = 2.247e+22;
                } else if (to == Converter_energy.Unit.BRITISH_THERMAL_UNIT){
                    constant = 3.41214;
                } else  if (to == Converter_energy.Unit.US_THERM){
                    constant = 3.413e-5;
                } else if (to == Converter_energy.Unit.FOOT_POUND){
                    constant = 2655.22;
                }
                break;
            case KILOWATT_HOUR:
                if (to == Converter_energy.Unit.JOULE) {
                    constant = 3.6e+6;
                } else if (to == Converter_energy.Unit.KILOJOULE) {
                    constant = 3600;
                } else if (to == Converter_energy.Unit.GRAMCALARIE) {
                    constant = 860421;
                } else if (to == Converter_energy.Unit.KILOCALARIE) {
                    constant = 860.421;
                } else if (to == Converter_energy.Unit.WATTHOUR) {
                    constant = 1000;
                } else if (to == Converter_energy.Unit.ELECTRONVOLT) {
                    constant = 2.247e+25;
                } else if (to == Converter_energy.Unit.BRITISH_THERMAL_UNIT){
                    constant = 3412.14;
                } else  if (to == Converter_energy.Unit.US_THERM){
                    constant = 0.0341296;
                } else if (to == Converter_energy.Unit.FOOT_POUND){
                    constant = 2.655e+6;
                }
                break;
            case ELECTRONVOLT:
                if (to == Converter_energy.Unit.JOULE) {
                    constant = 1.6022e-19;
                } else if (to == Converter_energy.Unit.KILOJOULE) {
                    constant = 1.6022e-22;
                } else if (to == Converter_energy.Unit.GRAMCALARIE) {
                    constant = 3.8293e-20;
                } else if (to == Converter_energy.Unit.KILOCALARIE) {
                    constant = 3.8293e-23;
                } else if (to == Converter_energy.Unit.WATTHOUR) {
                    constant = 4.4505e-23;
                } else if (to == Converter_energy.Unit.KILOWATT_HOUR) {
                    constant = 4.4505e-26;
                } else if (to == Converter_energy.Unit.BRITISH_THERMAL_UNIT){
                    constant = 1.5186e-22;
                } else  if (to == Converter_energy.Unit.US_THERM){
                    constant = 1.5189e-27;
                } else if (to == Converter_energy.Unit.FOOT_POUND){
                    constant = 1.1817e-19;
                }
                break;
            case BRITISH_THERMAL_UNIT:
                if (to == Converter_energy.Unit.JOULE) {
                    constant = 1055.06;
                } else if (to == Converter_energy.Unit.KILOJOULE) {
                    constant = 1.05506;
                } else if (to == Converter_energy.Unit.GRAMCALARIE) {
                    constant = 252.164;
                } else if (to == Converter_energy.Unit.KILOCALARIE) {
                    constant = 0.252164;
                } else if (to == Converter_energy.Unit.WATTHOUR) {
                    constant = 0.293071;
                } else if (to == Converter_energy.Unit.KILOWATT_HOUR) {
                    constant = 0.000293071;
                } else if (to == Converter_energy.Unit.ELECTRONVOLT){
                    constant = 6.585e+21;
                } else  if (to == Converter_energy.Unit.US_THERM){
                    constant = 1.0002e-5;
                } else if (to == Converter_energy.Unit.FOOT_POUND){
                    constant = 778.169;
                }
                break;
            case US_THERM:
                if (to == Converter_energy.Unit.JOULE) {
                    constant = 1.055e+8;
                } else if (to == Converter_energy.Unit.KILOJOULE) {
                    constant = 105480;
                } else if (to == Converter_energy.Unit.GRAMCALARIE) {
                    constant = 2.521e+7;
                } else if (to == Converter_energy.Unit.KILOCALARIE) {
                    constant = 25210.4;
                } else if (to == Converter_energy.Unit.WATTHOUR) {
                    constant = 29300.1;
                } else if (to == Converter_energy.Unit.KILOWATT_HOUR) {
                    constant = 29.3001;
                } else if (to == Converter_energy.Unit.ELECTRONVOLT){
                    constant = 6.584e+26;
                } else  if (to == Converter_energy.Unit.BRITISH_THERMAL_UNIT){
                    constant = 99976.1;
                } else if (to == Converter_energy.Unit.FOOT_POUND){
                    constant = 7.78e+7;
                }
                break;
            case FOOT_POUND:
                if (to == Converter_energy.Unit.JOULE) {
                    constant = 1.35582;
                } else if (to == Converter_energy.Unit.KILOJOULE) {
                    constant = 0.00135582;
                } else if (to == Converter_energy.Unit.GRAMCALARIE) {
                    constant = 0.324048;
                } else if (to == Converter_energy.Unit.KILOCALARIE) {
                    constant = 0.000324048;
                } else if (to == Converter_energy.Unit.WATTHOUR) {
                    constant = 0.000376616;
                } else if (to == Converter_energy.Unit.KILOWATT_HOUR) {
                    constant = 3.7662e-7;
                } else if (to == Converter_energy.Unit.ELECTRONVOLT){
                    constant = 8.462e+18;
                } else  if (to == Converter_energy.Unit.BRITISH_THERMAL_UNIT){
                    constant = 0.00128507;
                } else if (to == Converter_energy.Unit.US_THERM){
                    constant = 1.2854e-8;
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
