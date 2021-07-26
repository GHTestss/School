public final class Parent extends BasePerson {


    Parent(String firstName, String lastName, char gender, int age, String status) {
        super(firstName, lastName, gender, age, status);
    }

    @Override
    public void setAge(int age) {
        if (age > 18) {
            this.setAge(age);
        }
    }




}
