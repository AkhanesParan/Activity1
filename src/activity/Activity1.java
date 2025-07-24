package activity;
import java.util.Scanner;

public class Activity1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        String Name;
        int mScience, mHistory, mMath, mSoc, mArts;
        float mTotal, Average;
        
        System.out.println("Enter name: ");
        Name = scan.nextLine();
        System.out.println("Enter marks in Science: ");
        mScience = scan.nextInt();
        System.out.println("Enter marks in History: ");
        mHistory = scan.nextInt();
        System.out.println("Enter marks in Math: ");
        mMath = scan.nextInt();
        System.out.println("Enter marks in Soc: ");
        mSoc = scan.nextInt();
        System.out.println("Enter marks in Arts: ");
        mArts = scan.nextInt();
        mTotal = mScience + mHistory + mMath + mSoc + mArts;
        Average = mTotal/5;
        System.out.println("Total Marks: "+ Math.round(mTotal));
        System.out.println("Total Percentage: "+Average);
        
        
        
        if (Average >= 91 && Average <= 100) {
            System.out.println("Remarks: Excellent");
            System.out.println("Congratulations " + Name + ", you passed!");
        } else if (Average >= 86) {
            System.out.println("Remarks: Very Good");
            System.out.println("Congratulations " + Name + ", you passed!");
        } else if (Average >= 81) {
            System.out.println("Remarks: Good");
            System.out.println("Congratulations " + Name + ", you passed!");
        } else if (Average >= 76) {
            System.out.println("Remarks: Fair");
            System.out.println("Congratulations " + Name + ", you passed!");
        } else if (Average >= 71) {
            System.out.println("Remarks: Poor");
            System.out.println("Congratulations " + Name + ", you passed!");
        } else {
            System.out.println("Remarks: Fail");
            System.out.println("Try again " + Name + ", you failed.");
        }
        
    }
}