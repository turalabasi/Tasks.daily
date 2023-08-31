public class Developer extends Employee {

    private String favLanguage;

    public Developer (String name,String surname,Double salary,String favlanguage){
        super(name,surname,salary);
        System.out.println("developer constructor called");
        this.favLanguage=favlanguage;
    }
}
