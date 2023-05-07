import javax.security.auth.login.LoginException;

public class Main {



    public static void main(String[] args) {
        String str = "Abc_123";
        boolean result = str.matches("[a-zA-Z0-9_]+");
        System.out.println(result);
        try {
            transport("java_skypro_go", "D_1hWiKjjP_9", "равен ConfilmPassword");
        } catch (WrongPasswordException e) {
            throw new RuntimeException(e);
        } catch (WrongLoginException e){
            throw new RuntimeException(e);
        }

        finally {
            System.out.println("финал-конец");
        }

    }
    private static void transport(String login,String password,String confilmPassword) throws WrongPasswordException {

        if (login.length() > 20) {
            throw new WrongLoginException();
        }

        if (password.length() >= 20 || !password.equals(confilmPassword)) throw new WrongPasswordException();
        //dsd
    }

    }
