package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerProviders;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: mbs reason: default package */
public final class mbs {
    final String a;
    final Map<String, String> b;

    public mbs() {
        this(Locale.getDefault());
    }

    private mbs(Locale locale) {
        this.a = locale.toString();
        this.b = new HashMap(67);
        this.b.put("bg_BG", "bg");
        this.b.put("ca_AD", PlayerProviders.ADS);
        this.b.put("cs_CZ", "cz");
        this.b.put("da_DK", "dk");
        this.b.put("de_AT", "at");
        this.b.put("de_CH", "ch");
        this.b.put("de_DE", "de");
        this.b.put("de_LI", "li");
        this.b.put("de_LU", "lu-de");
        this.b.put("el_GR", "gr");
        this.b.put("en_AU", "au");
        this.b.put("en_CA", "ca-en");
        this.b.put("en_CY", "cy");
        this.b.put("en_GB", "gb");
        this.b.put("en_HK", "hk-en");
        this.b.put("en_IE", "ie");
        this.b.put("en_IN", "in");
        this.b.put("en_MT", "mt");
        String str = "my-ms";
        this.b.put("en_MY", str);
        this.b.put("en_NZ", "nz");
        this.b.put("en_PH", "ph");
        this.b.put("en_SG", "sg-eg");
        String str2 = "th";
        this.b.put("en_TH", str2);
        this.b.put("en_US", "us");
        this.b.put("es_AR", "ar");
        this.b.put("es_BO", "bo");
        this.b.put("es_CL", "cl");
        this.b.put("es_CO", "co");
        this.b.put("es_CR", "cr");
        this.b.put("es_DO", "do");
        this.b.put("es_EC", "ec");
        String str3 = "es";
        this.b.put("es_ES", str3);
        this.b.put("es_GT", "gt");
        this.b.put("es_HN", "hn");
        this.b.put("es_MX", "mx");
        this.b.put("es_NI", "ni");
        this.b.put("es_PA", "pa");
        this.b.put("es_PE", "pe");
        this.b.put("es_PY", "py");
        this.b.put("es_SV", "sv");
        this.b.put("es_US", str3);
        this.b.put("es_UY", "uy");
        this.b.put("et_EE", "ee");
        this.b.put("fi_FI", "fi");
        this.b.put("fr_BE", "be-fr");
        this.b.put("fr_CA", "ca-fr");
        this.b.put("fr_FR", "fr");
        this.b.put("fr_LU", "lu-fr");
        this.b.put("fr_MC", "mc");
        this.b.put("hu_HU", "hu");
        this.b.put("in_ID", "id");
        this.b.put("is_IS", "is");
        this.b.put("it_IT", "it");
        this.b.put("ja_JP", "jp");
        this.b.put("lt_LT", "lt");
        this.b.put("lv_LV", "lv");
        this.b.put("my_MY", str);
        String str4 = "no";
        this.b.put("nb_NO", str4);
        this.b.put("nl_BE", "be-nl");
        this.b.put("nl_NL", "nl");
        this.b.put("nn_NO", str4);
        this.b.put("pl_PL", "pl");
        this.b.put("pt_BR", "br");
        this.b.put("pt_PT", "pt");
        this.b.put("sk_SK", "sk");
        this.b.put("th_TH", str2);
        this.b.put("sv_SE", "se");
        this.b.put("tr_TR", "tr");
        this.b.put("zh_HK", "hk-zh");
        this.b.put("zh_TW", "tw");
    }
}
