// а) Интерфейс "Товар"
interface Product {
    void setProductName(String name);
    void setProductPrice(double price);
    void setProductRating(int rating);
}

// б) Классы, реализующие интерфейс "Товар"
class Book implements Product {
    private String name;
    private double price;
    private int rating;

    @Override
    public void setProductName(String name) {
        this.name = name;
    }

    @Override
    public void setProductPrice(double price) {
        this.price = price;
    }

    @Override
    public void setProductRating(int rating) {
        this.rating = rating;
    }
}

class Laptop implements Product {
    private String name;
    private double price;
    private int rating;

    @Override
    public void setProductName(String name) {
        this.name = name;
    }

    @Override
    public void setProductPrice(double price) {
        this.price = price;
    }

    @Override
    public void setProductRating(int rating) {
        this.rating = rating;
    }
}

class Clothing implements Product {
    private String name;
    private double price;
    private int rating;

    @Override
    public void setProductName(String name) {
        this.name = name;
    }

    @Override
    public void setProductPrice(double price) {
        this.price = price;
    }

    @Override
    public void setProductRating(int rating) {
        this.rating = rating;
    }
}

// г) Интерфейс "Пользователь"
interface User {
    void setLogin(String login);
    void setPassword(String password);
}

// д) Классы, реализующие интерфейс "Пользователь"
class Customer implements User {
    private String login;
    private String password;

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }
}

class Admin implements User {
    private String login;
    private String password;

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }
}

class Seller implements User {
    private String login;
    private String password;

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }
}

// е) Класс, реализующий одновременно интерфейсы "Товар" и "Пользователь"
class CustomerPurchase implements Product, User {
    private String productName;
    private double productPrice;
    private int productRating;
    private String userLogin;
    private String userPassword;

    @Override
    public void setProductName(String name) {
        this.productName = name;
    }

    @Override
    public void setProductPrice(double price) {
        this.productPrice = price;
    }

    @Override
    public void setProductRating(int rating) {
        this.productRating = rating;
    }

    @Override
    public void setLogin(String login) {
        this.userLogin = login;
    }

    @Override
    public void setPassword(String password) {
        this.userPassword = password;
    }

    // Метод для вывода сообщения о покупке
    public void makePurchase() {
        System.out.println("Пользователь " + userLogin + " купил товар " + productName);
    }
}

public class Main {
    public static void main(String[] args) {
        // в) Создание экземпляров классов
        Book book = new Book();
        book.setProductName("Java Programming");
        book.setProductPrice(49.99);
        book.setProductRating(5);

        Laptop laptop = new Laptop();
        laptop.setProductName("Laptop X");
        laptop.setProductPrice(999.99);
        laptop.setProductRating(4);

        Clothing clothing = new Clothing();
        clothing.setProductName("T-Shirt");
        clothing.setProductPrice(19.99);
        clothing.setProductRating(3);

        // д) Создание экземпляров классов, реализующих интерфейс "Пользователь"
        Customer customer = new Customer();
        customer.setLogin("john_doe");
        customer.setPassword("password123");

        Admin admin = new Admin();
        admin.setLogin("admin");
        admin.setPassword("admin123");

        Seller seller = new Seller();
        seller.setLogin("seller1");
        seller.setPassword("sellerpass");

        // е) Создание экземпляра класса, реализующего оба интерфейса
        CustomerPurchase customerPurchase = new CustomerPurchase();
        customerPurchase.setProductName("Smartphone");
        customerPurchase.setProductPrice(299.99);
        customerPurchase.setProductRating(4);
        customerPurchase.setLogin("customer1");
        customerPurchase.setPassword("customerpass");

        // Вызов метода для вывода сообщения о покупке
        customerPurchase.makePurchase();
    }
}
