import java.util.*;

class User {
    int userId;
    String name;
    int age;
    List<Integer> friends; // List of friend IDs
    User next;

    public User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friends = new ArrayList<>();
        this.next = null;
    }
}

class SocialMedia {
    User head;

    public void addUser(int userId, String name, int age) {
        User newUser = new User(userId, name, age);
        if (head == null) {
            head = newUser;
        } else {
            User temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newUser;
        }
    }

    public User findUserById(int userId) {
        User temp = head;
        while (temp != null) {
            if (temp.userId == userId) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void addFriend(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);
        if (user1 != null && user2 != null && userId1 != userId2) {
            if (!user1.friends.contains(userId2)) {
                user1.friends.add(userId2);
            }
            if (!user2.friends.contains(userId1)) {
                user2.friends.add(userId1);
            }
        }
    }

    public void removeFriend(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);
        if (user1 != null && user2 != null) {
            user1.friends.remove(Integer.valueOf(userId2));
            user2.friends.remove(Integer.valueOf(userId1));
        }
    }

    public void displayFriends(int userId) {
        User user = findUserById(userId);
        if (user == null) {
            System.out.println("User not found");
            return;
        }
        System.out.println(user.name + "'s friends:");
        for (Integer fid : user.friends) {
            User friend = findUserById(fid);
            if (friend != null) {
                System.out.println(friend.userId + " - " + friend.name);
            }
        }
    }

    public void searchUser(String input) {
        try {
            int id = Integer.parseInt(input);
            User user = findUserById(id);
            if (user != null) {
                System.out.println("Found: " + user.name + ", Age: " + user.age);
                return;
            }
        } catch (NumberFormatException e) {
            // Not an integer, treat as name
        }

        User temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(input)) {
                System.out.println("Found: ID " + temp.userId + ", Age: " + temp.age);
                return;
            }
            temp = temp.next;
        }

        System.out.println("User not found");
    }

    public void mutualFriends(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found");
            return;
        }

        Set<Integer> set = new HashSet<>(user1.friends);
        System.out.println("Mutual friends:");
        for (Integer fid : user2.friends) {
            if (set.contains(fid)) {
                User mutual = findUserById(fid);
                if (mutual != null) {
                    System.out.println(mutual.userId + " - " + mutual.name);
                }
            }
        }
    }

    public void countFriendsForEachUser() {
        User temp = head;
        while (temp != null) {
            System.out.println(temp.name + " has " + temp.friends.size() + " friends.");
            temp = temp.next;
        }
    }
}
