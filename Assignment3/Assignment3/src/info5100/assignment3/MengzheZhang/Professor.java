package info5100.assignment3.MengzheZhang;

public class Professor {

    private String firstName;
    private String lastName;
    private int professorId;
 
    public static class Builder {
        private String firstName;
        private String lastName;
        private int professorId;
 
        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }



        public Builder setPersonalId(int professorId) {
            this.professorId = professorId;
            return this;
        }

        
        public Professor build() {
            // call the private constructor in the outer class
            return new Professor(firstName, lastName, professorId);
        }
    }

    public Professor(String firstName, String lastName, int professorId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.professorId = professorId;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public int getProfessorlId() {
        return professorId;
    }
}

class Main{
	public static void main(String[] args) {
		 Professor professor = new Professor.Builder("Tom", "Ford")
				    .setPersonalId(123456).build();

	}

}
