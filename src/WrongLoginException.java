public class WrongLoginException extends RuntimeException {


    private static void transport(String login, String password, String confilmPassword) {
        if (login.length() > 20) {
            throw new WrongLoginException();
        }
    }
}