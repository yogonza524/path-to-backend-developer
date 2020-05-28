import com.google.gson.*;

/*
El Hola Mundo en cualquier lenguaje es siempre una experiencia gratificante,
te invito a pensar qué esta sucediendo en el siguiente trozo de código. Buena suerte!
*/
class Main {
  public static void main(String[] args) {
    Gson g = new Gson();
    Student s = new Student();
    s.setName("Gonzalo");
    System.out.println(g.toJson(s));
  }
}

class Student {
  private String name;
  private String email;
  private String country;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
}