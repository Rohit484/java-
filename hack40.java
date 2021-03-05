class Student extends Person{
    private int[] testScores;

    Student(String fn, String ln, int id, int[] ts) {
        super(fn, ln, id);
        this.testScores = ts;
    }


    public String calculate() {
        int sum =0;
        for(int i : this.testScores) {
            sum+=i;
        }
        double avg = sum/testScores.length;
        if (avg<=100 && avg>=90)
            {
            return “O”;
        }else if(avg<90 && avg>=80)
            {
             return “E”;
        }
        else if(avg<80 && avg>=70)
            {
             return “A”;
        }
        else if(avg<70 && avg>=55)
            {
             return “P”;
        }
         else if(avg<55 && avg>=40)
            {
             return “D”;
        }
        else{
             return “T”;
        }

    }
}
