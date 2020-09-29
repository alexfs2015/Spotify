package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Locale;

/* renamed from: gnc reason: default package */
public final class gnc {
    private static final ImmutableMap<String, String> a;
    private static final ImmutableList<String> b;

    static {
        String str = "cs";
        String str2 = "es-ES";
        String str3 = "es";
        String str4 = "pt-BR";
        String str5 = "id";
        String str6 = "sv";
        String str7 = "th-TH";
        String str8 = "vi-VN";
        String str9 = "zh-TW";
        a = ImmutableMap.g().b("cz", str).b(str3, str2).b("br", str4).b("in", str5).b("se", str6).b("th", str7).b("vn", str8).b("vn-vi", str8).b("tw", str9).b("hk-zh", str9).b();
        b = ImmutableList.g().c("ar").c(str).c("de").c("el").c("en").c(str3).c(str2).c("fi").c("fr").c("hu").c(str5).c("it").c("ja").c("ms").c("nl").c("pl").c(str4).c(str6).c(str7).c("tr").c(str8).c(str9).a();
    }

    public static String a(Locale locale) {
        String str = "";
        if (locale == null) {
            return str;
        }
        String language = locale.getLanguage();
        String str2 = (String) a.get(language);
        if (str2 != null) {
            language = str2;
        }
        return b.contains(language) ? language : str;
    }
}
