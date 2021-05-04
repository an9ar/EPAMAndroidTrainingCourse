public class TeacherJava {

    String name;
    String surname;
    int age;
    SchoolClass schoolClass;
    Double workExperience;

    public TeacherJava(String name, String surname, int age, SchoolClass schoolClass, Double workExperience) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.schoolClass = schoolClass;
        this.workExperience = workExperience;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public SchoolClass getSchoolClass() {
        return schoolClass;
    }

    public Double getWorkExperience() {
        return workExperience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TeacherJava)) return false;
        TeacherJava that = (TeacherJava) o;
        return getAge() == that.getAge() &&
                getName().equals(that.getName()) &&
                getSurname().equals(that.getSurname()) &&
                getSchoolClass() == that.getSchoolClass() &&
                getWorkExperience().equals(that.getWorkExperience());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getAge(), getSchoolClass(), getWorkExperience());
    }

    @Override
    public String toString() {
        return "TeacherJava{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", schoolClass=" + schoolClass +
                ", workExperience=" + workExperience +
                '}';
    }
}