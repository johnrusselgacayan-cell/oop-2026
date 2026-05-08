public class Main {

    public static void main(String[] args) {

        // STRING REPOSITORY
        Repository<String> guestNames = new Repository<>();

        guestNames.add("Alice");
        guestNames.add("Bob");
        guestNames.add("Charlie");

        System.out.println("=== Guest Repository ===");
        System.out.println("Total Guests: " + guestNames.size());

        // BANK ACCOUNT REPOSITORY
        Repository<BankAccount> accounts = new Repository<>();

        BankAccount acc1 =
                new BankAccount("1234", 1234, 10000.75f, "Alice Smith");

        BankAccount acc2 =
                new BankAccount("5678", 5566, 45.20f, "Bob Johnson");

        accounts.add(acc1);
        accounts.add(acc2);

        // GET ACCOUNT
        BankAccount retrieved = accounts.get(0);

        // RESULT OBJECT
        Result<BankAccount> result =
                new Result<>(retrieved,
                        "Load Successful",
                        true);

        System.out.println("\n=== Result Display ===");
        result.display();
    }
}