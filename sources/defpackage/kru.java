package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import com.spotify.music.behindthelyrics.model.business.TracksAndResources;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: kru reason: default package */
public final class kru {
    static final b<Object, Set<String>> a = b.b("btl_tracks_key");
    static final b<Object, Long> b = b.b("btl_last_cached_key");
    private static long e = TimeUnit.HOURS.toMillis(8);
    final SpSharedPreferences<Object> c;
    final jrp d;

    public kru(SpSharedPreferences<Object> spSharedPreferences, jrp jrp) {
        this.c = spSharedPreferences;
        this.d = jrp;
    }

    public final TracksAndResources a() {
        return new TracksAndResources(this.c.a(a, Collections.emptySet()));
    }

    public final boolean b() {
        return this.d.a() - this.c.a(b, -1) >= e;
    }
}
