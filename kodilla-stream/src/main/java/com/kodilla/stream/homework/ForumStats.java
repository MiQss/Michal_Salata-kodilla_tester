package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {
    public static void main(String[] args) {
        double avgOver40 = UsersRepository.getUsersList()
                .stream()
                .filter(age->age.getAge()>=40)
                .mapToInt(n->n.getNumberOfPost())
                .average()
                .getAsDouble();
        System.out.println("Average number of posts for users over 40: "+avgOver40);

        double avgUnder40 = UsersRepository.getUsersList()
                .stream()
                .filter(age->age.getAge()<40)
                .mapToInt(n->n.getNumberOfPost())
                .average()
                .getAsDouble();
        System.out.println("Average number of posts for users under 40: "+avgUnder40);
    }
    public static double getAverageNumberOFPostForUsersOver40(List<User>userList){
        double avgOver40 = UsersRepository.getUsersList()
                .stream()
                .filter(age->age.getAge()>=40)
                .mapToInt(n->n.getNumberOfPost())
                .average()
                .getAsDouble();
        return avgOver40;
    }
    public static double getAverageNumberOFPostForUsersUnder40(List<User>userList){
        double avgUnder40 = UsersRepository.getUsersList()
                .stream()
                .filter(age->age.getAge()<40)
                .mapToInt(n->n.getNumberOfPost())
                .average()
                .getAsDouble();
        return avgUnder40;
    }
}
