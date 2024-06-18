package StudnetGradeCalculator;
import java.util.Scanner;
public class StuGraCalcii 
{
    int array[] = new int[6];
    int Percentage=0;
    int Total;
    int marks;
    String Grade;
    Boolean result = true;
    Scanner sc =new Scanner(System.in);
    public void Marks()
    {
        for(int i=0;i<6;i++)
        {
            result=true;
            System.out.println("Enter the marks of "+"subject "+(i+1)+" out of 100 ");
            marks = sc.nextInt();
            while(result==true)
            {
                if(marks>=0 && marks<100)
                {
                    array[i]=marks;
                    result=false;
                }
                else
                {
                    System.out.println("You're not entering the marks within the range\nKindly enter a proper marks os subject "+ (i+1));
                    marks=sc.nextInt();
                    result=true;
                }
                
            }
        }
        StuGraInputs inputs = new StuGraInputs(array[0], array[1], array[2], array[3], array[4], array[5]);
        inputs.setpercentage();
        inputs.setGrade();
        inputs.setTotal();
        Total=inputs.getTotal();
        Percentage= inputs.getpercentage();
        Grade=inputs.getGrade();
        System.out.println( " You've got a total marks of "+Total+" out of 600 in your final exam");
        System.out.println( " You've got "+Percentage+"% percentage in your final exam");
        System.out.println("Therefore, we congratulate you for You've achieved "+Grade+" Grade in your academics");
    }

}