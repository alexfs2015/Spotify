package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.EntitySorting;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

/* renamed from: qfc reason: default package */
public final class qfc extends EntitySorting {
    private static final b<Object, String> a = b.b("show");

    public qfc(Context context, jvy jvy, rnf rnf) {
        super(context, jvy, rnf);
    }

    public final b<Object, String> a() {
        return a;
    }
}
