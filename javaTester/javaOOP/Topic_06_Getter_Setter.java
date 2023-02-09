package javaOOP;

public class Topic_06_Getter_Setter {

	private String personName;
	private int personAge;
	private int personPhone;
	private float personBankAccountAmout;

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		if (personName == null || personName.isEmpty()) {
			throw new IllegalArgumentException("Name input could not be empty");
		} else {
			this.personName = personName;

		}

	}

	public int getPersonAge() {
		return personAge;
	}

	public void setPersonAge(int personAge) {
		if (personAge < 15 || personAge > 60) {
			throw new IllegalArgumentException("Age input is illegal");
		} else {
			this.personAge = personAge;
		}

	}

	public int getPersonPhone() {
		return personPhone;
	}

	public void setPersonPhone(int personPhone) {
		this.personPhone = personPhone;
	}

	public float getPersonBankAccountAmout() {
		return personBankAccountAmout;
	}

	public void setPersonBankAccountAmout(float personBankAccountAmout) {
		this.personBankAccountAmout = personBankAccountAmout;
	}

}