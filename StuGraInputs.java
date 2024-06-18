package StudnetGradeCalculator;

public class StuGraInputs 
{   
    private int subject1;
    private int subject2;
    private int subject3;
    private int subject4;
    private int subject5;
    private int subject6;
    private int total;
    private int percentage;
    private String grade;

    public StuGraInputs(int subject1, int subject2, int subject3, int subject4, int subject5, int subject6)
    {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
        this.subject5 = subject5;
        this.subject6 = subject6;
    }
    public int getSubject1() 
    {
        return subject1;
    }
    public void setSubject1(int subject1) 
    {
        this.subject1 = subject1;
    }
    public int getSubject2() 
    {
        return subject2;
    }
    public void setSubject2(int subject2) 
    {
        this.subject2 = subject2;
    }
    public int getSubject3() 
    {
        return subject3;
    }
    public void setSubject3(int subject3) 
    {
        this.subject3 = subject3;
    }
    public int getSubject4() 
    {
        return subject4;
    }
    public void setSubject4(int subject4) 
    {
        this.subject4 = subject4;
    }
    public int getSubject5() 
    {
        return subject5;
    }
    public void setSubject5(int subject5) 
    {
        this.subject5 = subject5;
    }
    public int getSubject6() 
    {
        return subject6;
    }
    public void setSubject6(int subject6)
    {
        this.subject6 = subject6;
    }
    public int getTotal()
    {
        return total;
    }
    public void setTotal() 
    {
        this.total = subject1 + subject2 + subject3 + subject4 + subject5 + subject6;
    }
    public int getpercentage() 
    {
        return percentage;
    }
    public void setpercentage() 
    {
        this.percentage = (subject1 + subject2 + subject3 + subject4 + subject5 + subject6)/6;
    }
    public String getGrade() 
    {
        return grade;
    }
    public void setGrade() {
        if(percentage >= 85)
        this.grade = "A+";
        else if(percentage >= 80 && percentage < 85)
        this.grade = "A";
        else if(percentage >= 70 && percentage < 80)
        this.grade = "B+";
        else if(percentage >= 65 && percentage < 70)
        this.grade = "B";
        else if(percentage >= 50 && percentage < 65)
        this.grade = "C+";
        else if(percentage < 50)
        this.grade = "C";
    }
}

