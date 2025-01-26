package packages;

import packages.a.User;
import packages.a.User2;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        packages.b.User userB= new packages.b.User();
    }
}
