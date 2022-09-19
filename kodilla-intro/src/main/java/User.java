public class User {
    String name;
    int  age;
    public User (String name, int age){
        this.name = name;
        this.age = age;
    }

public static void main(String[]args){
    User ala = new User ("Ala",5);
    User kuba = new User("Kuba", 7);
    User aneta = new User("Aneta", 37);
    User mike = new User("Mike", 35);
    User darek = new User("Darek", 63);
    User joanna = new User("Joanna", 64);

    User [] users ={ala, kuba,aneta,mike,darek,joanna};

    int sum = 0;

    for (int i=0; i<users.length;i++){
        sum=sum+users[i].age;
    }
    System.out.println(sum);

    int averageAge = sum/users.length;
    System.out.println(averageAge);

    for (int i=0; i<users.length;i++){
        if (averageAge>users[i].age){
            System.out.println("Osoby, których wiek jest poniżej średniej:" + users[i].name);
        }
    }
    }
}
