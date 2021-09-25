package com.example.dedsgift.rendom;

public class Converter_area {


        public enum Unit {
            SquareINCH,
            SquareCENTIMETER,
            SquareFOOT,
            SquareYARD,
            SquareMETER,
            SquareMILE,
            SquareKILOMETER,
            ACRE,
            HECTARE;

            // Helper method to convert text to one of the above constants
            public static Unit fromString(String text) {
                if (text != null) {
                    for (Unit unit : Unit.values()) {
                        if (text.equalsIgnoreCase(unit.toString())) {
                            return unit;
                        }
                    }
                }

                throw new IllegalArgumentException("Cannot find a value for " + text);
            }
        }

        private final double multiplier;
        public Converter_area(Unit from, Unit to) {
            double constant = 1;
            // Set the multiplier, else if fromUnit = toUnit, then it is 1
            switch (from) {
                case SquareINCH:
                    if (to == Unit.SquareCENTIMETER) {
                        constant = 6.4516;
                    } else if (to == Unit.SquareFOOT) {
                        constant = 0.00694444;
                    } else if (to == Unit.SquareYARD) {
                        constant = 0.000771605;
                    } else if (to == Unit.SquareMETER) {
                        constant = 0.00064516;
                    } else if (to == Unit.SquareMILE) {
                        constant = 2.491e-10;
                    } else if (to == Unit.SquareKILOMETER) {
                        constant = 6.4516e-10;
                    } else if (to == Unit.HECTARE) {
                        constant = 6.4516e-8;
                    } else if (to == Unit.ACRE){
                        constant = 1.5942e-7;
                    }
                    break;
                case SquareCENTIMETER:
                    if (to == Unit.SquareINCH) {
                        constant = 0.155;
                    } else if (to == Unit.SquareFOOT) {
                        constant = 0.00107639;
                    } else if (to == Unit.SquareYARD) {
                        constant = 0.000119599;
                    } else if (to == Unit.SquareMETER) {
                        constant = 1e-4;
                    } else if (to == Unit.SquareMILE) {
                        constant = 3.861e-11;
                    } else if (to == Unit.SquareKILOMETER) {
                        constant = 1e-10;
                    } else if (to == Unit.HECTARE){
                        constant = 1e-8;
                    } else if (to == Unit.ACRE){
                        constant = 2.4711e-8;
                    }
                    break;
                case SquareFOOT:
                    if (to == Unit.SquareINCH) {
                        constant = 144;
                    } else if (to == Unit.SquareCENTIMETER) {
                        constant = 929.03;
                    } else if (to == Unit.SquareYARD) {
                        constant = 0.111111;
                    } else if (to == Unit.SquareMETER) {
                        constant = 0.092903;
                    } else if (to == Unit.SquareMILE) {
                        constant = 3.587e-8;
                    } else if (to == Unit.SquareKILOMETER) {
                        constant = 9.2903e-8;
                    } else if (to == Unit.HECTARE){
                        constant = 9.2903e-6;
                    } else if (to == Unit.ACRE){
                        constant = 2.2957e-5;
                    }
                    break;
                case SquareYARD:
                    if (to == Unit.SquareINCH) {
                        constant = 1296;
                    } else if (to == Unit.SquareCENTIMETER) {
                        constant = 8361.27;
                    } else if (to == Unit.SquareFOOT) {
                        constant = 9;
                    } else if (to == Unit.SquareMETER) {
                        constant = 0.836127;
                    } else if (to == Unit.SquareMILE) {
                        constant = 3.2283e-7;
                    } else if (to == Unit.SquareKILOMETER) {
                        constant = 8.3613e-7;
                    } else if (to == Unit.HECTARE){
                        constant = 8.3613e-5;
                    } else  if (to == Unit.ACRE){
                        constant = 0.000206612;
                    }
                    break;
                case SquareMETER:
                    if (to == Unit.SquareINCH) {
                        constant = 1550;
                    } else if (to == Unit.SquareCENTIMETER) {
                        constant = 10000;
                    } else if (to == Unit.SquareFOOT) {
                        constant = 10.7639;
                    } else if (to == Unit.SquareYARD) {
                        constant = 1.19599;
                    } else if (to == Unit.SquareMILE) {
                        constant = 3.861e-7;
                    } else if (to == Unit.SquareKILOMETER) {
                        constant = 1e-6;
                    } else if (to == Unit.HECTARE){
                        constant = 1e-4;
                    } else  if (to == Unit.ACRE){
                        constant = 0.000247105;
                    }
                    break;
                case SquareMILE:
                    if (to == Unit.SquareINCH) {
                        constant = 4.014e+9;
                    } else if (to == Unit.SquareCENTIMETER) {
                        constant = 2.59e+10;
                    } else if (to == Unit.SquareFOOT) {
                        constant = 2.788e+7;
                    } else if (to == Unit.SquareYARD) {
                        constant = 3.098e+6;
                    } else if (to == Unit.SquareMETER) {
                        constant = 2.59e+6;
                    } else if (to == Unit.SquareKILOMETER) {
                        constant = 2.58999;
                    } else if (to == Unit.HECTARE){
                        constant = 258.99;
                    } else  if (to == Unit.ACRE){
                        constant = 640;
                    }
                    break;
                case SquareKILOMETER:
                    if (to == Unit.SquareINCH) {
                        constant = 1.55e+9;
                    } else if (to == Unit.SquareCENTIMETER) {
                        constant = 1e+10;
                    } else if (to == Unit.SquareFOOT) {
                        constant = 1.076e+7;
                    } else if (to == Unit.SquareYARD) {
                        constant = 1.196e+6;
                    } else if (to == Unit.SquareMETER) {
                        constant = 1e+6;
                    } else if (to == Unit.SquareMILE) {
                        constant = 0.386102;
                    } else if (to == Unit.HECTARE){
                        constant = 100;
                    } else  if (to == Unit.ACRE){
                        constant = 247.105;
                    }
                    break;
                case HECTARE:
                    if (to == Unit.SquareINCH) {
                        constant = 1.55e+7;
                    } else if (to == Unit.SquareCENTIMETER) {
                        constant = 1e+8;
                    } else if (to == Unit.SquareFOOT) {
                        constant = 107639;
                    } else if (to == Unit.SquareYARD) {
                        constant = 11959.9;
                    } else if (to == Unit.SquareMETER) {
                        constant = 10000;
                    } else if (to == Unit.SquareMILE) {
                        constant = 0.00386102;
                    } else if (to == Unit.SquareKILOMETER){
                        constant = 0.01;
                    } else  if (to == Unit.ACRE){
                        constant = 2.47105;
                    }
                    break;
                case ACRE:
                    if (to == Unit.SquareINCH) {
                        constant = 6.273e+6;
                    } else if (to == Unit.SquareCENTIMETER) {
                        constant = 4.047e+7;
                    } else if (to == Unit.SquareFOOT) {
                        constant = 43560;
                    } else if (to == Unit.SquareYARD) {
                        constant = 4840;
                    } else if (to == Unit.SquareMETER) {
                        constant = 4046.86;
                    } else if (to == Unit.SquareMILE) {
                        constant = 0.0015625;
                    } else if (to == Unit.SquareKILOMETER){
                        constant = 0.00404686;
                    } else  if (to == Unit.HECTARE){
                        constant = 0.404686;
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


