package defpackage;

import com.spotify.mobile.android.storylines.model.Storylines;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: uzo reason: default package */
public final class uzo {
    static final b<Object, Set<String>> a = b.b("storylines_entity_key");
    static final b<Object, Long> b = b.b("storylines_last_cached_key");
    static final long c = TimeUnit.HOURS.toMillis(4);
    final SpSharedPreferences<Object> d;
    final jtz e;

    public uzo(SpSharedPreferences<Object> spSharedPreferences, jtz jtz) {
        this.d = spSharedPreferences;
        this.e = jtz;
    }

    public final Storylines a() {
        return new Storylines(this.d.a(a, Collections.emptySet()));
    }
}
