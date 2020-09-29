package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.EntitySorting;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

/* renamed from: pef reason: default package */
public final class pef extends EntitySorting {
    private static final b<Object, String> a = b.b("podcast");

    public pef(Context context, jyg jyg, rwl rwl) {
        super(context, jyg, rwl);
    }

    public final b<Object, String> a() {
        return a;
    }
}
