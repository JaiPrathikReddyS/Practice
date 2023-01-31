package project;

class JuniorEngineer extends Employee {
    private double assessmentScore;
    private String feedback;
    public JuniorEngineer(int empId, String empName, double empSalary,Address address,
    		double assessmentScore, String feedback) {
        super(empId, empName, empSalary, address,"Junior Engineer");
        this.assessmentScore = assessmentScore;
        this.feedback = feedback;
    }
    public double getAssessmentScore() {
        return assessmentScore;
    }
    public String getFeedback() {
        return feedback;
    }
    public void setAssessmentScore(double assessmentScore) {
        this.assessmentScore = assessmentScore;
}
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
    public void printDetails() {
        System.out.println("empID: " + getEmpId() + ", empName: " + getEmpName() + 
        		", Salary: " + getEmpSalary() + ", Assessment Score: " + assessmentScore + 
        		", Feedback: " + feedback);
    }
}
