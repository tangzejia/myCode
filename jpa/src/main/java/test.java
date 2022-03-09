import org.apache.commons.lang.RandomStringUtils;

public class test {
    public static void main(String[] args) {
        t();
    }

    private static void t() {
        String filename= RandomStringUtils.randomAlphanumeric(2);
        System.out.println(filename);

    }
}
