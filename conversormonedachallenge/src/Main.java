import com.aluracursos.conversormonedas.CurrencyConverter;
import com.aluracursos.conversormonedas.Menu;

public class Main {
    public static void main(String[] args) {

        CurrencyConverter converter = new CurrencyConverter();
        converter.setApiKey("9eb190eb2dcf3cf15cd2b049");

        Menu menu = new Menu(converter);
        menu.displayMenu();
    }
}