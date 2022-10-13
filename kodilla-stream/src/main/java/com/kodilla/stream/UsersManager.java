package com.kodilla.stream;

import java.sql.SQLOutput;
import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
        List<String> over45Age = filterOver45Age();
        System.out.println(over45Age);
        List<String> over45AgeAndMoreThan1Post = filterOver45AgeAndMoreThan1Post();
        System.out.println(over45AgeAndMoreThan1Post);
    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }
    public static List<String>filterOver45Age(){
        List<String> age = UsersRepository.getUsersList()
                .stream()
                .filter(ages->ages.getAge()>45)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return age;
    }
    public static List<String>filterOver45AgeAndMoreThan1Post(){
        List<String> post = UsersRepository.getUsersList()
                .stream()
                .filter(ages->ages.getAge()>45)
                .filter(posts->posts.getNumberOfPost()>0)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return post;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }
}
