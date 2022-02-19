package lesson1;

import lesson1.Players.*;
import lesson1.Obstacles.*;

public class Main {

    public static void main(String[] args) {

        Player [] players = {new Kiborg("Робокоп"), new Human("Борис"), new Bird("Кеша"), new Dog("Рекс")};
        Obstacle [] obstacles = {new Cross(100), new Wall(2), new Water(1)};

        Team team = new Team("Champions", players);

        System.out.println("new team");
        System.out.println(team.getTeamName());

        System.out.println("welcome team members");
        team.showResults();

        Course course = new Course(obstacles);
        System.out.println("team goes to course");
        course.doIt(team);

        System.out.println("show team Results");
        team.showResults();

        System.out.println("team members finished course");
        team.showMembersFinishedCourse();
    }
}