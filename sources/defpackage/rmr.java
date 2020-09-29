package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

/* renamed from: rmr reason: default package */
public final class rmr {
    public static final b<Object, String> a = b.b("preferred_locale_reporter_username");
    public static final b<Object, String> b = b.b("preferred_locale_reporter_locale");
    public final Context c;
    public final hee d;
    public final jvy e;

    rmr(Context context, hee hee, jvy jvy) {
        this.c = context;
        this.d = hee;
        this.e = jvy;
    }
}
