package defpackage;

import android.content.Context;
import com.spotify.mobile.android.playlist.sorting.EntitySorting;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import java.util.List;

/* renamed from: hct reason: default package */
public final class hct extends EntitySorting {
    private static final b<Object, String> a = b.b("playlist");

    public final /* bridge */ /* synthetic */ vns a(String str, vns vns, List list) {
        return super.a(str, vns, list);
    }

    public final /* bridge */ /* synthetic */ void a(String str, vns vns) {
        super.a(str, vns);
    }

    public hct(Context context, jvy jvy, rnf rnf) {
        super(context, jvy, rnf);
    }

    public final b<Object, String> a() {
        return a;
    }
}
