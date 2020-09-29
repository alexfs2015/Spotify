package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

/* renamed from: uhs reason: default package */
public final class uhs {
    public static final b<Object, Boolean> a = b.b("scannables_onboarding_completed");
    public final jvy b;

    public uhs(jvy jvy) {
        this.b = jvy;
    }

    public static String a(String str) {
        String a2 = gbm.a(str, far.c);
        StringBuilder sb = new StringBuilder("https://scannables.scdn.co/uri/800/");
        sb.append(a2);
        return sb.toString();
    }

    public static String a(String str, String str2, boolean z) {
        return a(str2);
    }
}
