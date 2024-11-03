import java.util.ArrayList;
class BankName {
    private ArrayList<User> users;

    public BankName() {
        users = new ArrayList<>();
        // Adding a test user
        users.add(new User("user1", "1234", 1000));
    }

    public boolean authenticateUser(String userID, String pin) {
        for (User user : users) {
            if (user.getUserID().equals(userID) && user.getPin().equals(pin)) {
                return true;
            }
        }
        return false;
    }

    public User getUser(String userID) {
        for (User user : users) {
            if (user.getUserID().equals(userID)) {
                return user;
            }
        }
        return null;
    }
}


