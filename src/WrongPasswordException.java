public class WrongPasswordException extends RuntimeException{
    private static void transport(String login, String password, String confilmPassword) throws WrongPasswordException {

        if (password.length() >= 20 || password.equals(confilmPassword)) {
            throw new WrongPasswordException();
        }
    }
}
