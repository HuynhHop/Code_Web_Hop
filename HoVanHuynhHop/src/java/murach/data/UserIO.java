package murach.data;

import java.io.*;
import java.util.*;
//import murach.business.User;
import murach.business.User_ch05_ex1;

public class UserIO {

    public static void addRecord(User_ch05_ex1 user, String filename) throws IOException {
        File file = new File(filename);
        PrintWriter out = new PrintWriter(
                new FileWriter(file, true));
        out.println(user.getEmail() + "|"
                + user.getFirstName() + "|"
                + user.getLastName());
        out.close();
    }

    public static User_ch05_ex1 getUser(String emailAddress, String filename) throws IOException {
        File file = new File(filename);
        BufferedReader in = new BufferedReader(
                new FileReader(file));
        User_ch05_ex1 user = new User_ch05_ex1();
        String line = in.readLine();
        while (line != null) {
            StringTokenizer t = new StringTokenizer(line, "|");
            String email = t.nextToken();
            if (email.equalsIgnoreCase(emailAddress)) {
                String firstName = t.nextToken();
                String lastName = t.nextToken();
                user.setEmail(emailAddress);
                user.setFirstName(firstName);
                user.setLastName(lastName);
            }
            line = in.readLine();
        }
        in.close();
        return user;
    }

    public static ArrayList<User_ch05_ex1> getUsers(String filename) throws IOException {
        ArrayList<User_ch05_ex1> users = new ArrayList<User_ch05_ex1>();
        BufferedReader in = new BufferedReader(
                new FileReader(filename));
        String line = in.readLine();
        while (line != null) {
            try {
                StringTokenizer t = new StringTokenizer(line, "|");
                String emailAddress = t.nextToken();
                String firstName = t.nextToken();
                String lastName = t.nextToken();
                User_ch05_ex1 user = new User_ch05_ex1(firstName, lastName, emailAddress);
                users.add(user);
                line = in.readLine();
            } catch (NoSuchElementException e) {
                line = in.readLine();
            }
        }
        in.close();
        return users;
    }

    public static HashMap<String, User_ch05_ex1> getUsersMap(String filename) throws IOException {
        HashMap<String, User_ch05_ex1> users = new HashMap<String, User_ch05_ex1>();
        BufferedReader in = new BufferedReader(
                new FileReader(filename));
        String line = in.readLine();
        while (line != null) {
            try {
                StringTokenizer t = new StringTokenizer(line, "|");
                String emailAddress = t.nextToken();
                String firstName = t.nextToken();
                String lastName = t.nextToken();
                User_ch05_ex1 user = new User_ch05_ex1(firstName, lastName, emailAddress);
                users.put(emailAddress, user);
                line = in.readLine();
            } catch (NoSuchElementException e) {
                line = in.readLine();
            }
        }
        in.close();
        return users;
    }

    public static void add(User_ch05_ex1 user, String path) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}