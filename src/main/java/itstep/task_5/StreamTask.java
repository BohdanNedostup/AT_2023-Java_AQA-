package itstep.task_5;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask {
    public static void main(String[] args) {
        //    Stream:
        //    a) Generate 10 random object using class from previous class
        //    b) Sort it using any two fields using stream.
        //    b) Filter it by any two fields custom filter.
        //    c) Collect it to List with *main field(s).

        int n = 0;
        if (args.length > 0) {
            try {
                n = Integer.parseInt(args[0]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else n = 10;

        List<User> usersList = generateUserList(n);

        System.out.println("Generated list of 10 users: ");
        System.out.println(usersList);

        System.out.println("Sorted by name and street from address: ");
        System.out.println(usersList.stream().sorted().collect(Collectors.toList()));

        System.out.println("Filtered by city number from address (> 7): ");
        System.out.println(usersList.stream().filter(user -> Integer.parseInt(user.getAddress().getCity().substring(6)) > 7).collect(Collectors.toList()));

    }

    public static List<User> generateUserList(int n) {
        List<User> userList = new ArrayList<>();
        IntStream.range(1, n).forEach(i -> {
            Address address = new Address("Street " + UUID.randomUUID().toString().subSequence(0, 5), "City #" + i, "State #" + i);
            User user = new User(false, "Name " + UUID.randomUUID().toString().subSequence(0, 5), address);
            userList.add(user);
        });
        return userList;
    }

}
