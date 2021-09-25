package com.example.dedsgift.rendom;

public class Converter_volume {
    
    

        public enum Unit {
            LITER,
            MILLILITER,
            GALLON,
            US_LIQUID_GALLON,
            US_LIQUID_QUART,
            US_LIQUID_PINT,
            US_LIQUID_CUP,
            US_FLUID_OUNCE,
            US_TABLESPOON,
            US_TEASPOON,
            CUBIC_METER,
            CUBIC_FOOT,
            CUBIC_INCH,
            IMPERIAL_QUART,
            IMPERIAL_PINT,
            IMPERIAL_CUP,
            IMPERIAL_OUNCE,
            IMPERIAL_TABLESPOON,
            IMPERIAL_TEASPOON,
            ;



            // Helper method to convert text to one of the above constants
            public static Converter_volume.Unit fromString(String text) {
                if (text != null) {
                    for (Converter_volume.Unit unit : Converter_volume.Unit.values()) {
                        if (text.equalsIgnoreCase(unit.toString())) {
                            return unit;
                        }
                    }
                }

                throw new IllegalArgumentException("Cannot find a value for " + text);
            }
        }

        private final double multiplier;
        public Converter_volume(Converter_volume.Unit from, Converter_volume.Unit to) {
            double constant = 1;
            // Set the multiplier, else if fromUnit = toUnit, then it is 1
            switch (from) {
                case LITER:
                    if (to == Unit.MILLILITER) {
                        constant = 1000;
                    } else if (to == Unit.GALLON) {
                        constant = 0.219969;
                    } else if (to == Unit.US_LIQUID_GALLON) {
                        constant = 0.264172;
                    } else if (to == Unit.US_LIQUID_QUART) {
                        constant = 1.05669;
                    } else if (to == Unit.US_LIQUID_PINT) {
                        constant = 2.11338;
                    } else if (to == Unit.US_LIQUID_CUP) {
                        constant = 4.16667;
                    } else if (to == Unit.US_FLUID_OUNCE) {
                        constant = 33.814;
                    } else if (to == Unit.US_TABLESPOON){
                        constant = 67.628;
                    } else if (to == Unit.US_TEASPOON){
                        constant = 202.884;
                    } else if (to == Unit.CUBIC_METER){
                        constant = 0.001;
                    } else if (to == Unit.CUBIC_FOOT) {
                        constant = 0.0353147;
                    } else if (to == Unit.CUBIC_INCH){
                        constant = 61.0237;
                    } else if (to == Unit.IMPERIAL_QUART) {
                        constant = 0.879877;
                    } else if (to == Unit.IMPERIAL_PINT) {
                        constant = 1.75975;
                    } else if (to == Unit.IMPERIAL_CUP) {
                        constant = 3.51951;
                    } else if (to == Unit.IMPERIAL_OUNCE) {
                        constant = 35.1951;
                    } else if (to == Unit.IMPERIAL_TABLESPOON){
                        constant = 56.3121;
                    } else if (to == Unit.IMPERIAL_TEASPOON){
                        constant = 168.936;
                    }
                    break;
                case MILLILITER:
                    if (to == Unit.LITER) {
                        constant = 0.001;
                    } else if (to == Unit.GALLON) {
                        constant = 0.000219969;
                    } else if (to == Unit.US_LIQUID_GALLON) {
                        constant = 0.00264172;
                    } else if (to == Unit.US_LIQUID_QUART) {
                        constant = 0.00105669;
                    } else if (to == Unit.US_LIQUID_PINT) {
                        constant = 0.00211338;
                    } else if (to == Unit.US_LIQUID_CUP) {
                        constant = 0.00416667;
                    } else if (to == Unit.US_FLUID_OUNCE) {
                        constant = 0.033816;
                    } else if (to == Unit.US_TABLESPOON){
                        constant = 0.067628;
                    } else if (to == Unit.US_TEASPOON){
                        constant = 0.202884;
                    } else if (to == Unit.CUBIC_METER){
                        constant = 1e-6;
                    } else if (to == Unit.CUBIC_FOOT) {
                        constant = 3.5315e-5;
                    } else if (to == Unit.CUBIC_INCH){
                        constant = 0.0610237;
                    } else if (to == Unit.IMPERIAL_QUART) {
                        constant = 0.000879877;
                    } else if (to == Unit.IMPERIAL_PINT) {
                        constant = 0.00175975;
                    } else if (to == Unit.IMPERIAL_CUP) {
                        constant = 0.00351951;
                    } else if (to == Unit.IMPERIAL_OUNCE) {
                        constant = 0.0351951;
                    } else if (to == Unit.IMPERIAL_TABLESPOON){
                        constant = 0.0563121;
                    } else if (to == Unit.IMPERIAL_TEASPOON){
                        constant = 0.168936;
                    }
                    break;
                case GALLON:
                    if (to == Unit.LITER) {
                        constant = 4.54609;
                    } else if (to == Unit.MILLILITER) {
                        constant = 4546.09;
                    } else if (to == Unit.US_LIQUID_GALLON) {
                        constant = 1.20095;
                    } else if (to == Unit.US_LIQUID_QUART) {
                        constant = 4.8038;
                    } else if (to == Unit.US_LIQUID_PINT) {
                        constant = 9.6076;
                    } else if (to == Unit.US_LIQUID_CUP) {
                        constant = 18.942;
                    } else if (to == Unit.US_FLUID_OUNCE) {
                        constant = 153.722;
                    } else if (to == Unit.US_TABLESPOON){
                        constant = 307.443;
                    } else if (to == Unit.US_TEASPOON){
                        constant = 922.33;
                    } else if (to == Unit.CUBIC_METER){
                        constant = 0.00454609;
                    } else if (to == Unit.CUBIC_FOOT) {
                        constant = 0.160544;
                    } else if (to == Unit.CUBIC_INCH){
                        constant = 277.419;
                    } else if (to == Unit.IMPERIAL_QUART) {
                        constant = 4;
                    } else if (to == Unit.IMPERIAL_PINT) {
                        constant = 8;
                    } else if (to == Unit.IMPERIAL_CUP) {
                        constant = 16;
                    } else if (to == Unit.IMPERIAL_OUNCE) {
                        constant = 160;
                    } else if (to == Unit.IMPERIAL_TABLESPOON){
                        constant = 256;
                    } else if (to == Unit.IMPERIAL_TEASPOON){
                        constant = 768;
                    }
                    break;
                case US_LIQUID_GALLON:
                    if (to == Unit.LITER) {
                        constant = 3.78541;
                    } else if (to == Unit.MILLILITER) {
                        constant = 3785.61;
                    } else if (to == Unit.GALLON) {
                        constant = 0.832674;
                    } else if (to == Unit.US_LIQUID_QUART) {
                        constant = 4;
                    } else if (to == Unit.US_LIQUID_PINT) {
                        constant = 8;
                    } else if (to == Unit.US_LIQUID_CUP) {
                        constant = 15.7725;
                    } else if (to == Unit.US_FLUID_OUNCE) {
                        constant = 128;
                    } else if (to == Unit.US_TABLESPOON){
                        constant = 256;
                    } else if (to == Unit.US_TEASPOON){
                        constant = 768;
                    } else if (to == Unit.CUBIC_METER){
                        constant = 0.00378541;
                    } else if (to == Unit.CUBIC_FOOT) {
                        constant =0.133681;
                    } else if (to == Unit.CUBIC_INCH){
                        constant = 231;
                    } else if (to == Unit.IMPERIAL_QUART) {
                        constant = 3.3307;
                    } else if (to == Unit.IMPERIAL_PINT) {
                        constant = 6.66139;
                    } else if (to == Unit.IMPERIAL_CUP) {
                        constant = 13.3228;
                    } else if (to == Unit.IMPERIAL_OUNCE) {
                        constant = 133.228;
                    } else if (to == Unit.IMPERIAL_TABLESPOON){
                        constant = 213.165;
                    } else if (to == Unit.IMPERIAL_TEASPOON){
                        constant = 639.494;
                    }
                    break;
                case US_LIQUID_QUART:
                    if (to == Unit.LITER) {
                        constant = 0.946353;
                    } else if (to == Unit.MILLILITER) {
                        constant = 946.353;
                    } else if (to == Unit.GALLON) {
                        constant = 0.208169;
                    } else if (to == Unit.US_LIQUID_GALLON) {
                        constant = 0.25;
                    } else if (to == Unit.US_LIQUID_PINT) {
                        constant = 2;
                    } else if (to == Unit.US_LIQUID_CUP) {
                        constant = 3.94314;
                    } else if (to == Unit.US_FLUID_OUNCE) {
                        constant = 32;
                    } else if (to == Unit.US_TABLESPOON){
                        constant = 64;
                    } else if (to == Unit.US_TEASPOON){
                        constant = 192;
                    } else if (to == Unit.CUBIC_METER){
                        constant = 0.000946353;
                    } else if (to == Unit.CUBIC_FOOT) {
                        constant = 0.0334201;
                    } else if (to == Unit.CUBIC_INCH){
                        constant = 57.75;
                    } else if (to == Unit.IMPERIAL_QUART) {
                        constant = 0.832674;
                    } else if (to == Unit.IMPERIAL_PINT) {
                        constant = 1.66535;
                    } else if (to == Unit.IMPERIAL_CUP) {
                        constant = 3.3307;
                    } else if (to == Unit.IMPERIAL_OUNCE) {
                        constant = 33.307;
                    } else if (to == Unit.IMPERIAL_TABLESPOON){
                        constant = 53.2911;
                    } else if (to == Unit.IMPERIAL_TEASPOON){
                        constant = 159.873;
                    }
                    break;
                case US_LIQUID_PINT:
                    if (to == Unit.LITER) {
                        constant = 0.473176;
                    } else if (to == Unit.MILLILITER) {
                        constant = 473.176;
                    } else if (to == Unit.GALLON) {
                        constant = 0.104084;
                    } else if (to == Unit.US_LIQUID_GALLON) {
                        constant = 0.125;
                    } else if (to == Unit.US_LIQUID_QUART) {
                        constant = 0.5;
                    } else if (to == Unit.US_LIQUID_CUP) {
                        constant = 1.97157;
                    } else if (to == Unit.US_FLUID_OUNCE) {
                        constant = 16;
                    } else if (to == Unit.US_TABLESPOON){
                        constant = 32;
                    } else if (to == Unit.US_TEASPOON){
                        constant = 96;
                    } else if (to == Unit.CUBIC_METER){
                        constant = 0.000473176;
                    } else if (to == Unit.CUBIC_FOOT) {
                        constant = 0.0167101;
                    } else if (to == Unit.CUBIC_INCH){
                        constant = 28.875;
                    } else if (to == Unit.IMPERIAL_QUART) {
                        constant = 0.416337;
                    } else if (to == Unit.IMPERIAL_PINT) {
                        constant = 0.832674;
                    } else if (to == Unit.IMPERIAL_CUP) {
                        constant = 1.66535;
                    } else if (to == Unit.IMPERIAL_OUNCE) {
                        constant = 16.6535;
                    } else if (to == Unit.IMPERIAL_TABLESPOON){
                        constant = 26.6456;
                    } else if (to == Unit.IMPERIAL_TEASPOON){
                        constant = 79.9367;
                    }
                    break;
                case US_LIQUID_CUP:
                    if (to == Unit.LITER) {
                        constant = 0.24;
                    } else if (to == Unit.MILLILITER) {
                        constant = 240;
                    } else if (to == Unit.GALLON) {
                        constant = 0.0527926;
                    } else if (to == Unit.US_LIQUID_GALLON) {
                        constant = 0.0634013;
                    } else if (to == Unit.US_LIQUID_QUART) {
                        constant = 0.25305;
                    } else if (to == Unit.US_LIQUID_PINT) {
                        constant = 0.50721;
                    } else if (to == Unit.US_FLUID_OUNCE) {
                        constant = 8.11537;
                    } else if (to == Unit.US_TABLESPOON){
                        constant = 16.2307;
                    } else if (to == Unit.US_TEASPOON){
                        constant = 48.6922;
                    } else if (to == Unit.CUBIC_METER){
                        constant = 0.00024;
                    } else if (to == Unit.CUBIC_FOOT) {
                        constant = 0.00847552;
                    } else if (to == Unit.CUBIC_INCH){
                        constant = 14.6457;
                    } else if (to == Unit.IMPERIAL_QUART) {
                        constant = 0.21117;
                    } else if (to == Unit.IMPERIAL_PINT) {
                        constant = 0.422341;
                    } else if (to == Unit.IMPERIAL_CUP) {
                        constant = 0.844682;
                    } else if (to == Unit.IMPERIAL_OUNCE) {
                        constant = 8.44682;
                    } else if (to == Unit.IMPERIAL_TABLESPOON){
                        constant = 13.5149;
                    } else if (to == Unit.IMPERIAL_TEASPOON){
                        constant = 40.5447;
                    }
                    break;
                case US_FLUID_OUNCE:
                    if (to == Unit.LITER) {
                        constant = 0.0295735;
                    } else if (to == Unit.MILLILITER) {
                        constant = 29.5735;
                    } else if (to == Unit.GALLON) {
                        constant = 0.00650527;
                    } else if (to == Unit.US_LIQUID_GALLON) {
                        constant = 0.0078125;
                    } else if (to == Unit.US_LIQUID_QUART) {
                        constant = 0.03125;
                    } else if (to == Unit.US_LIQUID_PINT) {
                        constant = 0.0625;
                    } else if (to == Unit.US_LIQUID_CUP) {
                        constant = 0.123223;
                    } else if (to == Unit.US_TABLESPOON){
                        constant = 2;
                    } else if (to == Unit.US_TEASPOON){
                        constant = 6;
                    } else if (to == Unit.CUBIC_METER){
                        constant = 2.9574e-5;
                    } else if (to == Unit.CUBIC_FOOT) {
                        constant = 0.00104438;
                    } else if (to == Unit.CUBIC_INCH){
                        constant = 1.80469;
                    } else if (to == Unit.IMPERIAL_QUART) {
                        constant = 0.0260211;
                    } else if (to == Unit.IMPERIAL_PINT) {
                        constant = 0.0520421;
                    } else if (to == Unit.IMPERIAL_CUP) {
                        constant = 0.104084;
                    } else if (to == Unit.IMPERIAL_OUNCE) {
                        constant = 1.04084;
                    } else if (to == Unit.IMPERIAL_TABLESPOON){
                        constant = 1.66535;
                    } else if (to == Unit.IMPERIAL_TEASPOON){
                        constant = 4.99604;
                    }
                    break;
                case US_TABLESPOON:
                    if (to == Unit.LITER) {
                        constant = 0.0147868;
                    } else if (to == Unit.MILLILITER) {
                        constant = 14.7868;
                    } else if (to == Unit.GALLON) {
                        constant = 0.00325263;
                    } else if (to == Unit.US_LIQUID_GALLON) {
                        constant = 0.00390625;
                    } else if (to == Unit.US_LIQUID_QUART) {
                        constant = 0.015625;
                    } else if (to == Unit.US_LIQUID_PINT) {
                        constant = 0.03125;
                    } else if (to == Unit.US_LIQUID_CUP) {
                        constant = 0.0616115;
                    } else if (to == Unit.US_FLUID_OUNCE){
                        constant = 0.5;
                    } else if (to == Unit.US_TEASPOON){
                        constant = 3;
                    } else if (to == Unit.CUBIC_METER){
                        constant = 1.4787e-5;
                    } else if (to == Unit.CUBIC_FOOT) {
                        constant = 0.00052219;
                    } else if (to == Unit.CUBIC_INCH){
                        constant = 0.902344;
                    } else if (to == Unit.IMPERIAL_QUART) {
                        constant = 0.0130105;
                    } else if (to == Unit.IMPERIAL_PINT) {
                        constant = 0.0260211;
                    } else if (to == Unit.IMPERIAL_CUP) {
                        constant = 0.0520421;
                    } else if (to == Unit.IMPERIAL_OUNCE) {
                        constant = 0.520421;
                    } else if (to == Unit.IMPERIAL_TABLESPOON){
                        constant = 0.832674;
                    } else if (to == Unit.IMPERIAL_TEASPOON){
                        constant = 2.49802;
                    }
                    break;
                case US_TEASPOON:
                    if (to == Unit.LITER) {
                        constant = 0.00492892;
                    } else if (to == Unit.MILLILITER) {
                        constant = 4.92892;
                    } else if (to == Unit.GALLON) {
                        constant = 0.00108421;
                    } else if (to == Unit.US_LIQUID_GALLON) {
                        constant = 0.00130208;
                    } else if (to == Unit.US_LIQUID_QUART) {
                        constant = 0.00520833;
                    } else if (to == Unit.US_LIQUID_PINT) {
                        constant = 0.0104167;
                    } else if (to == Unit.US_LIQUID_CUP) {
                        constant = 0.0205372;
                    } else if (to == Unit.US_FLUID_OUNCE){
                        constant = 0.166667;
                    } else if (to == Unit.US_TABLESPOON){
                        constant = 0.333333;
                    } else if (to == Unit.CUBIC_METER){
                        constant = 4.9289e-6;
                    } else if (to == Unit.CUBIC_FOOT) {
                        constant = 0.000174063;
                    } else if (to == Unit.CUBIC_INCH){
                        constant = 0.300781;
                    } else if (to == Unit.IMPERIAL_QUART) {
                        constant = 0.00433684;
                    } else if (to == Unit.IMPERIAL_PINT) {
                        constant = 0.00867369;
                    } else if (to == Unit.IMPERIAL_CUP) {
                        constant = 0.0173474;
                    } else if (to == Unit.IMPERIAL_OUNCE) {
                        constant = 0.173474;
                    } else if (to == Unit.IMPERIAL_TABLESPOON){
                        constant = 0.277558;
                    } else if (to == Unit.IMPERIAL_TEASPOON){
                        constant = 0.832674;
                    }
                    break;
                case CUBIC_METER:
                    if (to == Unit.LITER) {
                        constant = 1000;
                    } else if (to == Unit.MILLILITER) {
                        constant = 1e+6;
                    } else if (to == Unit.GALLON) {
                        constant = 219.969;
                    } else if (to == Unit.US_LIQUID_GALLON) {
                        constant = 264.172;
                    } else if (to == Unit.US_LIQUID_QUART) {
                        constant = 1056.69;
                    } else if (to == Unit.US_LIQUID_PINT) {
                        constant = 2113.38;
                    } else if (to == Unit.US_LIQUID_CUP) {
                        constant = 4166.67;
                    } else if (to == Unit.US_FLUID_OUNCE){
                        constant = 33814;
                    } else if (to == Unit.US_TABLESPOON){
                        constant = 67628;
                    } else if (to == Unit.US_TEASPOON){
                        constant = 202884;
                    } else if (to == Unit.CUBIC_FOOT) {
                        constant = 35.3147;
                    } else if (to == Unit.CUBIC_INCH){
                        constant = 61023.7;
                    } else if (to == Unit.IMPERIAL_QUART) {
                        constant = 879.877;
                    } else if (to == Unit.IMPERIAL_PINT) {
                        constant = 1759.75;
                    } else if (to == Unit.IMPERIAL_CUP) {
                        constant = 3519.51;
                    } else if (to == Unit.IMPERIAL_OUNCE) {
                        constant = 35195.1;
                    } else if (to == Unit.IMPERIAL_TABLESPOON){
                        constant = 56312.1;
                    } else if (to == Unit.IMPERIAL_TEASPOON){
                        constant = 168936;
                    }
                    break;
                case CUBIC_FOOT:
                    if (to == Unit.LITER) {
                        constant = 28.3168;
                    } else if (to == Unit.MILLILITER) {
                        constant = 28316.8;
                    } else if (to == Unit.GALLON) {
                        constant = 6.22884;
                    } else if (to == Unit.US_LIQUID_GALLON) {
                        constant = 7.48052;
                    } else if (to == Unit.US_LIQUID_QUART) {
                        constant = 29.9221;
                    } else if (to == Unit.US_LIQUID_PINT) {
                        constant = 59.8442;
                    } else if (to == Unit.US_LIQUID_CUP) {
                        constant = 117.987;
                    } else if (to == Unit.US_FLUID_OUNCE){
                        constant = 957.506;
                    } else if (to == Unit.US_TABLESPOON){
                        constant = 1915.01;
                    } else if (to == Unit.US_TEASPOON){
                        constant = 5745.04;
                    } else if (to == Unit.CUBIC_METER) {
                        constant = 0.0283168;
                    } else if (to == Unit.CUBIC_INCH){
                        constant = 1728;
                    } else if (to == Unit.IMPERIAL_QUART) {
                        constant = 24.9153;
                    } else if (to == Unit.IMPERIAL_PINT) {
                        constant = 49.8307;
                    } else if (to == Unit.IMPERIAL_CUP) {
                        constant = 99.6614;
                    } else if (to == Unit.IMPERIAL_OUNCE) {
                        constant = 996.614;
                    } else if (to == Unit.IMPERIAL_TABLESPOON){
                        constant = 1594.58;
                    } else if (to == Unit.IMPERIAL_TEASPOON){
                        constant = 4783.74;
                    }
                    break;
                case CUBIC_INCH:
                    if (to == Unit.LITER) {
                        constant = 0.0163871;
                    } else if (to == Unit.MILLILITER) {
                        constant = 16.3871;
                    } else if (to == Unit.GALLON) {
                        constant = 0.00360465;
                    } else if (to == Unit.US_LIQUID_GALLON) {
                        constant = 0.004329;
                    } else if (to == Unit.US_LIQUID_QUART) {
                        constant = 0.017316;
                    } else if (to == Unit.US_LIQUID_PINT) {
                        constant = 0.034632;
                    } else if (to == Unit.US_LIQUID_CUP) {
                        constant = 0.0682794;
                    } else if (to == Unit.US_FLUID_OUNCE){
                        constant = 0.554113;
                    } else if (to == Unit.US_TABLESPOON){
                        constant = 1.10823;
                    } else if (to == Unit.US_TEASPOON){
                        constant = 3.32468;
                    } else if (to == Unit.CUBIC_METER) {
                        constant = 1.6387e-5;
                    } else if (to == Unit.CUBIC_FOOT){
                        constant = 0.000578704;
                    } else if (to == Unit.IMPERIAL_QUART) {
                        constant = 0.0144186;
                    } else if (to == Unit.IMPERIAL_PINT) {
                        constant = 0.0288372;
                    } else if (to == Unit.IMPERIAL_CUP) {
                        constant = 0.0576744;
                    } else if (to == Unit.IMPERIAL_OUNCE) {
                        constant = 0.576744;
                    } else if (to == Unit.IMPERIAL_TABLESPOON){
                        constant = 0.92279;
                    } else if (to == Unit.IMPERIAL_TEASPOON){
                        constant = 2.76837;
                    }
                    break;
                case IMPERIAL_QUART:
                    if (to == Unit.LITER) {
                        constant = 1.13652;
                    } else if (to == Unit.MILLILITER) {
                        constant = 1136.52;
                    } else if (to == Unit.GALLON) {
                        constant = 0.25;
                    } else if (to == Unit.US_LIQUID_GALLON) {
                        constant = 0.300237;
                    } else if (to == Unit.US_LIQUID_QUART) {
                        constant = 1.20095;
                    } else if (to == Unit.US_LIQUID_PINT) {
                        constant = 2.4019;
                    } else if (to == Unit.US_LIQUID_CUP) {
                        constant = 4.73551;
                    } else if (to == Unit.US_FLUID_OUNCE){
                        constant = 38.4304;
                    } else if (to == Unit.US_TABLESPOON){
                        constant = 76.8608;
                    } else if (to == Unit.US_TEASPOON){
                        constant = 230.582;
                    } else if (to == Unit.CUBIC_METER) {
                        constant = 0.00113652;
                    } else if (to == Unit.CUBIC_FOOT){
                        constant = 0.0401359;
                    } else if (to == Unit.CUBIC_INCH) {
                        constant = 69.3549;
                    } else if (to == Unit.IMPERIAL_PINT) {
                        constant = 2;
                    } else if (to == Unit.IMPERIAL_CUP) {
                        constant = 4;
                    } else if (to == Unit.IMPERIAL_OUNCE) {
                        constant = 40;
                    } else if (to == Unit.IMPERIAL_TABLESPOON){
                        constant = 64;
                    } else if (to == Unit.IMPERIAL_TEASPOON){
                        constant = 192;
                    }
                    break;
                case IMPERIAL_PINT:
                    if (to == Unit.LITER) {
                        constant = 0.568261;
                    } else if (to == Unit.MILLILITER) {
                        constant = 568.261;
                    } else if (to == Unit.GALLON) {
                        constant = 0.125;
                    } else if (to == Unit.US_LIQUID_GALLON) {
                        constant = 0.150119;
                    } else if (to == Unit.US_LIQUID_QUART) {
                        constant = 0.600475;
                    } else if (to == Unit.US_LIQUID_PINT) {
                        constant = 1.20095;
                    } else if (to == Unit.US_LIQUID_CUP) {
                        constant = 2.36776;
                    } else if (to == Unit.US_FLUID_OUNCE){
                        constant = 19.2152;
                    } else if (to == Unit.US_TABLESPOON){
                        constant = 38.4304;
                    } else if (to == Unit.US_TEASPOON){
                        constant = 115.291;
                    } else if (to == Unit.CUBIC_METER) {
                        constant = 0.000568261;
                    } else if (to == Unit.CUBIC_FOOT){
                        constant = 0.020068;
                    } else if (to == Unit.CUBIC_INCH) {
                        constant = 34.6774;
                    } else if (to == Unit.IMPERIAL_QUART) {
                        constant = 0.5;
                    } else if (to == Unit.IMPERIAL_CUP) {
                        constant = 2;
                    } else if (to == Unit.IMPERIAL_OUNCE) {
                        constant = 20;
                    } else if (to == Unit.IMPERIAL_TABLESPOON){
                        constant = 32;
                    } else if (to == Unit.IMPERIAL_TEASPOON){
                        constant = 96;
                    }
                    break;
                case IMPERIAL_CUP:
                    if (to == Unit.LITER) {
                        constant = 0.284131;
                    } else if (to == Unit.MILLILITER) {
                        constant = 284.131;
                    } else if (to == Unit.GALLON) {
                        constant = 0.0625;
                    } else if (to == Unit.US_LIQUID_GALLON) {
                        constant = 0.0750594;
                    } else if (to == Unit.US_LIQUID_QUART) {
                        constant = 0.300237;
                    } else if (to == Unit.US_LIQUID_PINT) {
                        constant = 0.600475;
                    } else if (to == Unit.US_LIQUID_CUP) {
                        constant = 1.18388;
                    } else if (to == Unit.US_FLUID_OUNCE){
                        constant = 9.6076;
                    } else if (to == Unit.US_TABLESPOON){
                        constant = 19.2152;
                    } else if (to == Unit.US_TEASPOON){
                        constant = 57.6456;
                    } else if (to == Unit.CUBIC_METER) {
                        constant = 0.00284131;
                    } else if (to == Unit.CUBIC_FOOT){
                        constant = 0.010034;
                    } else if (to == Unit.CUBIC_INCH) {
                        constant = 17.3387;
                    } else if (to == Unit.IMPERIAL_QUART) {
                        constant = 0.25;
                    } else if (to == Unit.IMPERIAL_PINT) {
                        constant = 0.5;
                    } else if (to == Unit.IMPERIAL_OUNCE) {
                        constant = 10;
                    } else if (to == Unit.IMPERIAL_TABLESPOON){
                        constant = 16;
                    } else if (to == Unit.IMPERIAL_TEASPOON){
                        constant = 48;
                    }
                    break;
                case IMPERIAL_OUNCE:
                    if (to == Unit.LITER) {
                        constant = 0.0284131;
                    } else if (to == Unit.MILLILITER) {
                        constant = 28.4131;
                    } else if (to == Unit.GALLON) {
                        constant = 0.00625;
                    } else if (to == Unit.US_LIQUID_GALLON) {
                        constant = 0.00750594;
                    } else if (to == Unit.US_LIQUID_QUART) {
                        constant = 0.0300237;
                    } else if (to == Unit.US_LIQUID_PINT) {
                        constant = 0.0600475;
                    } else if (to == Unit.US_LIQUID_CUP) {
                        constant = 0.118388;
                    } else if (to == Unit.US_FLUID_OUNCE){
                        constant = 0.96076;
                    } else if (to == Unit.US_TABLESPOON){
                        constant = 1.92152;
                    } else if (to == Unit.US_TEASPOON){
                        constant = 5.76458;
                    } else if (to == Unit.CUBIC_METER) {
                        constant = 2.8413e-5;
                    } else if (to == Unit.CUBIC_FOOT){
                        constant = 0.0010034;
                    } else if (to == Unit.CUBIC_INCH) {
                        constant = 1.73387;
                    } else if (to == Unit.IMPERIAL_QUART) {
                        constant = 0.025;
                    } else if (to == Unit.IMPERIAL_PINT) {
                        constant = 0.05;
                    } else if (to == Unit.IMPERIAL_CUP) {
                        constant = 0.1;
                    } else if (to == Unit.IMPERIAL_TABLESPOON){
                        constant = 1.6;
                    } else if (to == Unit.IMPERIAL_TEASPOON){
                        constant = 4.8;
                    }
                    break;
                case IMPERIAL_TABLESPOON:
                    if (to == Unit.LITER) {
                        constant = 0.0177582;
                    } else if (to == Unit.MILLILITER) {
                        constant = 17.7582;
                    } else if (to == Unit.GALLON) {
                        constant = 0.00390625;
                    } else if (to == Unit.US_LIQUID_GALLON) {
                        constant = 0.00469121;
                    } else if (to == Unit.US_LIQUID_QUART) {
                        constant = 0.0187649;
                    } else if (to == Unit.US_LIQUID_PINT) {
                        constant = 0.0375297;
                    } else if (to == Unit.US_LIQUID_CUP) {
                        constant = 0.0739924;
                    } else if (to == Unit.US_FLUID_OUNCE){
                        constant = 0.600475;
                    } else if (to == Unit.US_TABLESPOON){
                        constant = 1.20095;
                    } else if (to == Unit.US_TEASPOON){
                        constant = 3.60285;
                    } else if (to == Unit.CUBIC_METER) {
                        constant = 1.7758e-5;
                    } else if (to == Unit.CUBIC_FOOT){
                        constant = 0.000627124;
                    } else if (to == Unit.CUBIC_INCH) {
                        constant = 1.08367;
                    } else if (to == Unit.IMPERIAL_QUART) {
                        constant = 0.015625;
                    } else if (to == Unit.IMPERIAL_PINT) {
                        constant = 0.03125;
                    } else if (to == Unit.IMPERIAL_CUP) {
                        constant = 0.0625;
                    } else if (to == Unit.IMPERIAL_OUNCE){
                        constant = 0.625;
                    } else if (to == Unit.IMPERIAL_TEASPOON){
                        constant = 3;
                    }
                    break;
                case IMPERIAL_TEASPOON:
                    if (to == Unit.LITER) {
                        constant = 0.00591939;
                    } else if (to == Unit.MILLILITER) {
                        constant = 5.91939;
                    } else if (to == Unit.GALLON) {
                        constant = 0.00130208;
                    } else if (to == Unit.US_LIQUID_GALLON) {
                        constant = 0.00156374;
                    } else if (to == Unit.US_LIQUID_QUART) {
                        constant = 0.00625495;
                    } else if (to == Unit.US_LIQUID_PINT) {
                        constant = 0.0125099;
                    } else if (to == Unit.US_LIQUID_CUP) {
                        constant = 0.0246641;
                    } else if (to == Unit.US_FLUID_OUNCE){
                        constant = 0.200158;
                    } else if (to == Unit.US_TABLESPOON){
                        constant = 0.400317;
                    } else if (to == Unit.US_TEASPOON){
                        constant = 1.20095;
                    } else if (to == Unit.CUBIC_METER) {
                        constant = 5.9194e-6;
                    } else if (to == Unit.CUBIC_FOOT){
                        constant = 0.000209041;
                    } else if (to == Unit.CUBIC_INCH) {
                        constant = 0.361223;
                    } else if (to == Unit.IMPERIAL_QUART) {
                        constant = 0.00520834;
                    } else if (to == Unit.IMPERIAL_PINT) {
                        constant = 0.0104167;
                    } else if (to == Unit.IMPERIAL_CUP) {
                        constant = 0.0208333;
                    } else if (to == Unit.IMPERIAL_OUNCE){
                        constant = 0.208333;
                    } else if (to == Unit.IMPERIAL_TABLESPOON){
                        constant = 0.333333;
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




