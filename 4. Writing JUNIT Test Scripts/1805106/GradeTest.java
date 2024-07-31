import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradeTest {
    private Grade gradeTest;
    @Before
    public void setUpObject(){
        gradeTest = new Grade();
    }


    //Grade A
    @Test
    public void gradeA_mid_3(){
        assertEquals("Grade A for Credit 3 (mark 291)", "A", gradeTest.calculateGrade(291, 3));
    }
    @Test
    public void gradeA_mid_4(){
        assertEquals("Grade A for Credit 4 (mark 331)", "A", gradeTest.calculateGrade(331, 4));
    }
    @Test
    public void gradeA_up_3(){
        assertEquals("Grade A for Credit 3 (mark 400)", "A", gradeTest.calculateGrade(400, 3));
    }
    @Test
    public void gradeA_up_4(){
        assertEquals("Grade A for Credit 4 (mark 400)", "A", gradeTest.calculateGrade(400, 4));
    }
    @Test
    public void gradeA_low_3(){
        assertEquals("Grade A for Credit 3 (mark 239.001)", "A", gradeTest.calculateGrade(239.001, 3));
    }
    @Test
    public void gradeA_low_4(){
        assertEquals("Grade A for Credit 4 (mark 319.0001)", "A", gradeTest.calculateGrade(319.0001, 4));
    }


    //Grade B
    @Test
    public void gradeB_mid_3(){
        assertEquals("Grade B for Credit 3 (mark 215)", "B", gradeTest.calculateGrade(215, 3));
    }
    @Test
    public void gradeB_mid_4(){
        assertEquals("Grade B for Credit 4 (mark 300)", "B", gradeTest.calculateGrade(300, 4));
    }
    @Test
    public void gradeB_up_3(){
        assertEquals("Grade B for Credit 3 (mark 239)", "B", gradeTest.calculateGrade(239, 3));
    }
    @Test
    public void gradeB_up_4(){
        assertEquals("Grade B for Credit 4 (mark 319)", "B", gradeTest.calculateGrade(319, 4));
    }
    @Test
    public void gradeB_low_3(){
        assertEquals("Grade B for Credit 3 (mark 209.05)", "B", gradeTest.calculateGrade(209.05, 3));
    }
    @Test
    public void gradeB_low_4(){
        assertEquals("Grade B for Credit 4 (mark 279.003)", "B", gradeTest.calculateGrade(279.003, 4));
    }




    //Grade C
    @Test
    public void gradeC_mid_3(){
        assertEquals("Grade C for Credit 3 (mark 195)", "C", gradeTest.calculateGrade(195, 3));
    }
    @Test
    public void gradeC_mid_4(){
        assertEquals("Grade C for Credit 4 (mark 260)", "C", gradeTest.calculateGrade(260, 4));
    }
    @Test
    public void gradeC_up_3(){
        assertEquals("Grade C for Credit 3 (mark 209)", "C", gradeTest.calculateGrade(209, 3));
    }
    @Test
    public void gradeC_up_4(){
        assertEquals("Grade C for Credit 4 (mark 279)", "C", gradeTest.calculateGrade(279, 4));
    }
    @Test
    public void gradeC_low_3(){
        assertEquals("Grade C for Credit 3 (mark 179.1)", "C", gradeTest.calculateGrade(179.1, 3));
    }
    @Test
    public void gradeC_low_4(){
        assertEquals("Grade C for Credit 4 (mark 239.33)", "C", gradeTest.calculateGrade(239.33, 4));
    }


    //Grade F
    @Test
    public void gradeF_mid_3(){
        assertEquals("Grade F for Credit 3 (mark 91)", "F", gradeTest.calculateGrade(91, 3));
    }
    @Test
    public void gradeF_mid_4(){
        assertEquals("Grade F for Credit 4 (mark 120)", "F", gradeTest.calculateGrade(120, 4));
    }
    @Test
    public void gradeF_up_3(){
        assertEquals("Grade F for Credit 3 (mark 179)", "F", gradeTest.calculateGrade(179, 3));
    }
    @Test
    public void gradeF_up_4(){
        assertEquals("Grade F for Credit 4 (mark 239)", "F", gradeTest.calculateGrade(239, 4));
    }
    @Test
    public void gradeF_low_3(){
        assertEquals("Grade F for Credit 3 (mark 0)", "F", gradeTest.calculateGrade(0, 3));
    }
    @Test
    public void gradeF_low_4(){
        assertEquals("Grade F for Credit 4 (mark 0)", "F", gradeTest.calculateGrade(0, 4));
    }


    //Invalid Tests
    @Test
    public void invalidTooHigh_3(){
        assertEquals("Too High For Credit 3 (mark 1000000)", "Invalid Input", gradeTest.calculateGrade(1000000, 3));
    }
    @Test
    public void invalidTooHigh_4(){
        assertEquals("Too High For Credit 4 (mark 1000000)", "Invalid Input", gradeTest.calculateGrade(1000000, 4));
    }

    @Test
    public void invalidTooLow_3(){
        assertEquals("Too Low For Credit 3 (mark -1000000)", "Invalid Input", gradeTest.calculateGrade(-1000000, 3));
    }
    @Test
    public void invalidTooLow_4(){
        assertEquals("Too Low For Credit 4 (mark -1000000)", "Invalid Input", gradeTest.calculateGrade(-1000000, 4));
    }

    @Test
    public void invalidBorderHigh_3(){
        assertEquals("Border High For Credit 3 (mark 400.01)", "Invalid Input", gradeTest.calculateGrade(400.01, 3));
    }
    @Test
    public void invalidBorderHigh_4(){
        assertEquals("Border High For Credit 4 (mark 400.01)", "Invalid Input", gradeTest.calculateGrade(400.01, 4));
    }

    @Test
    public void invalidBorderLow_3(){
        assertEquals("Border Low For Credit 3 (mark -0.001)", "Invalid Input", gradeTest.calculateGrade(-0.001, 3));
    }
    @Test
    public void invalidBorderLow_4(){
        assertEquals("Border Low For Credit 4 (mark -0.01)", "Invalid Input", gradeTest.calculateGrade(-0.01, 4));
    }
    @Test
    public void invalidCredit_3_5(){
        assertEquals("Invalid Credit 3.5 (mark 250)", "Invalid Input", gradeTest.calculateGrade(250, 3.5));
    }


    //Not A Number

    @Test
    public void invalidMarksString(){
        assertEquals("Not A Number, String Marks", "Non-number Input", gradeTest.calculateGrade("250", 4));
    }

    @Test
    public void invalidMarksGradeClass(){
        assertEquals("Not A Number, Class Marks", "Non-number Input", gradeTest.calculateGrade(gradeTest, 4));
    }

    @Test
    public void invalidCreditString(){
        assertEquals("Not A Number, String Credit", "Non-number Input", gradeTest.calculateGrade(250, "4"));
    }

    @Test
    public void invalidCreditMark(){
        assertEquals("Not A Number, String Marks, Class Credit", "Non-number Input", gradeTest.calculateGrade("250", gradeTest));
    }


}