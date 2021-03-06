package Logic;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Loan {
    private int catalogueID;
    private int borrowerID;
    private String name;
    private String loanStartDate;
    private String loanEndDate;

    //const
    public Loan(int catalogueID, String name) {
        this.catalogueID = catalogueID;
        this.name = name;
        setLoanStartEndDate();
    }

    private void setLoanStartEndDate() {
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date date = new Date();

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        this.loanStartDate = sdf.format(cal.getTime());

        cal.add(Calendar.DATE, 14);
        this.loanEndDate = sdf.format(cal.getTime());
    }

    public int getCatalogueID() {
        return catalogueID;
    }

    public int getBorrowerID() {
        return borrowerID;
    }

    public String getName() {
        return name;
    }

    public String getLoanStartDate() {
        return loanStartDate;
    }

    public String getLoanEndDate() {
        return loanEndDate;
    }

    public void setCatalogueID(int catalogueID) {
        this.catalogueID = catalogueID;
    }

    public void setBorrowerID(int borrowerID) {
        this.borrowerID = borrowerID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLoanStartDate(String loanStartDate) {
        this.loanStartDate = loanStartDate;
    }

    public void setLoanEndDate(String loanEndDate) {
        this.loanEndDate = loanEndDate;
    }

    @Override
    public String toString() {
        return String.format("%d, %d, %s, %s", catalogueID, borrowerID, loanStartDate, loanEndDate);
    }

}


//        try {
//            date = sdf.parse("2013-02-55");
//            cal.setTime(date);
//            System.out.println(sdf.format(cal.getTime()));
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }