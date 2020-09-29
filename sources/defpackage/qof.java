package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.EntitySorting;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

/* renamed from: qof reason: default package */
public final class qof extends EntitySorting {
    private static final b<Object, String> a = b.b("show");

    public qof(Context context, jyg jyg, rwl rwl) {
        super(context, jyg, rwl);
    }

    public final b<Object, String> a() {
        return a;
    }
}
