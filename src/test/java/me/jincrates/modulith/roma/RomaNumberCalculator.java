package me.jincrates.modulith.roma;

public class RomaNumberCalculator {

    public String calculator(int arabicNumber) {
        switch (arabicNumber) {
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 6:
                return "VI";
            case 7:
                return "VII";
            case 8:
                return "VIII";
            case 9:
                return "IX";
            case 10:
                return "X";
            default:
                throw new IllegalArgumentException("계산할 수 없는 숫자입니다. arabicNumber: " + arabicNumber);
        }
    }
}
