import fr.simplifia.input.exception.InputException;
import fr.simplifia.input.locale.LocaleExtractor;
import fr.simplifia.input.validator.SmpInputValidator;
import fr.simplifia.input.validator.impl.SmpInputValidatorFactory;
import fr.simplifia.transform.SmpDataTransformer;
import org.apache.commons.lang.StringUtils;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(final String[] arg) {
        final Scanner scanInput = new Scanner(System.in);
        System.out.println("Enter your locale (fr,en,de...): ");
        final String localeRead = scanInput.nextLine();
        final Locale locale = LocaleExtractor.toLocale(localeRead);


        System.out.println("Enter your text : ");
        String input = scanInput.nextLine();
        if (StringUtils.indexOf(input,'é')>=0 || StringUtils.indexOf(input,'ê')>=0 || StringUtils.indexOf(input,
                'è')>=0)
        {
            throw new InputException("given text character is not handled");
        }
        scanInput.close();

        final SmpInputValidator validator = SmpInputValidatorFactory.fromLocale(locale);
        final SmpDataTransformer transformer = new SmpDataTransformer(validator);
        final String transformedInput = transformer.transform(input);
        System.out.println(transformedInput);
    }
}
