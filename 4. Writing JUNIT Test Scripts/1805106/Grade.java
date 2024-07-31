public class Grade {
    String calculateGrade(Object marks, Object credit){
        //System.out.println(marks + " " + credit);
        Double mrk, crd;
        if(marks instanceof Number){
            mrk = ((Number) marks).doubleValue();
        }else{
            return "Non-number Input";
        }

        if(credit instanceof Number){
            crd = ((Number) credit).doubleValue();
        }else{
            return "Non-number Input";
        }

        if(crd != 3 && crd != 4)return "Invalid Input";

        if(mrk > 400.0 || mrk < 0)return "Invalid Input";

        mrk = Math.ceil(mrk);

        if(mrk >= 80 * crd) return "A";
        else if(mrk >= 70 * crd) return "B";
        else if(mrk >= 60 * crd) return "C";
        else return "F";
    }
}
