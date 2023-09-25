import java.util.Objects;

public class Singer {
    String name;
    String Gender;
    String Nationality;
    Date  debutYear;

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDebutYear() {
        return debutYear;
    }

    public void setDebutYear(Date debutYear) {
        this.debutYear = debutYear;
    }

    public Singer(String name, String gender, String nationality, Date debutYear) {
        this.name = name;
        Gender = gender;
        Nationality = nationality;
        this.debutYear = debutYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Singer)) return false;
        Singer singer = (Singer) o;
        return Objects.equals(getName(), singer.getName()) && Objects.equals(getGender(), singer.getGender()) && Objects.equals(getNationality(), singer.getNationality()) && Objects.equals(getDebutYear(), singer.getDebutYear());
    }


    public String toString(){
        return String.format("Name: %s\n Gender: %s\nNationality: %s\nDate of birth: %s\n",name,Gender,Nationality,debutYear);
    }
}

