package defpackage;

import android.content.Context;
import com.spotify.mobile.android.playlist.sorting.EntitySorting;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import java.util.List;

/* renamed from: hfp reason: default package */
public final class hfp extends EntitySorting {
    private static final b<Object, String> a = b.b("playlist");

    public hfp(Context context, jyg jyg, rwl rwl) {
        super(context, jyg, rwl);
    }

    public final b<Object, String> a() {
        return a;
    }

    public final /* bridge */ /* synthetic */ way a(String str, way way, List list) {
        return super.a(str, way, list);
    }

    public final /* bridge */ /* synthetic */ void a(String str, way way) {
        super.a(str, way);
    }
}
