package id.jagokoding;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public interface LanguageProvider {

    List<String> getLanguages();

    @Component
    public static class DefaultLanguageProvider implements LanguageProvider {

        @Override
        public List<String> getLanguages() {
            List<String> languageList = new ArrayList<>();
//            System.out.println("LIST LANGUAGE");
            for (Locale locale : Locale.getAvailableLocales()) {
//            	System.out.println(locale.getDisplayLanguage());
                languageList.add(locale.getDisplayLanguage());
            }
            return languageList;
        }
    }
}