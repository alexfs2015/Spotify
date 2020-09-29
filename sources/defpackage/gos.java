package defpackage;

import com.google.common.collect.ImmutableMap;
import java.util.Locale;

/* renamed from: gos reason: default package */
public final class gos {
    private static final ImmutableMap<String, String> a;
    private static final ImmutableMap<String, String> b;
    private static final ImmutableMap<String, String> c = ImmutableMap.g().b("in", "id").b("ji", "yi").b("iw", "he").b();

    static {
        String str = "es";
        a = ImmutableMap.g().b("es_ES", str).b("fr_CA", "fr-ca").b("pt_PT", "pt-pt").b();
        b = ImmutableMap.g().b(str, "es-419").b("pt", "pt-br").b("zh", "zh-tw").b();
    }

    public static String a(Locale locale) {
        String str = "en";
        if (locale == null) {
            return str;
        }
        String locale2 = locale.toString();
        if (locale2.length() < 2) {
            return str;
        }
        String str2 = (String) a.get(locale2);
        if (str2 != null) {
            return str2;
        }
        String language = locale.getLanguage();
        if (a(language)) {
            return str;
        }
        String str3 = (String) b.get(language);
        if (str3 != null) {
            return str3;
        }
        String str4 = (String) c.get(language);
        return str4 != null ? str4 : language;
    }

    public static String a(Locale locale, String str) {
        boolean z;
        String str2 = "en";
        if (a(locale != null ? locale.getLanguage() : str2)) {
            z = true;
        } else {
            str2 = a(locale);
            z = false;
        }
        if (a.containsValue(str2) || b.containsValue(str2) || locale == null || z || locale.getCountry().isEmpty()) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        if (str.isEmpty()) {
            str = "_";
        }
        sb.append(str);
        sb.append(locale.getCountry());
        return sb.toString();
    }

    private static boolean a(String str) {
        return str.length() < 2 || str.charAt(0) < 'a' || str.charAt(0) > 'z' || str.charAt(1) < 'a' || str.charAt(1) > 'z';
    }
}
