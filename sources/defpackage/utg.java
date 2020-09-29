package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

/* renamed from: utg reason: default package */
public final class utg {
    public static final b<Object, Boolean> a = b.b("scannables_onboarding_completed");
    public final jyg b;

    public utg(jyg jyg) {
        this.b = jyg;
    }

    public static String a(String str) {
        String a2 = gck.a(str, fbi.c);
        StringBuilder sb = new StringBuilder("https://scannables.scdn.co/uri/800/");
        sb.append(a2);
        return sb.toString();
    }

    public static String a(String str, String str2, boolean z) {
        return a(str2);
    }
}
