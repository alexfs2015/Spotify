package defpackage;

import android.content.ContentResolver;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: jud reason: default package */
public final class jud implements wig<juc> {
    private final wzi<ContentResolver> a;
    private final wzi<SpSharedPreferences<Object>> b;

    private jud(wzi<ContentResolver> wzi, wzi<SpSharedPreferences<Object>> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static jud a(wzi<ContentResolver> wzi, wzi<SpSharedPreferences<Object>> wzi2) {
        return new jud(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new juc((ContentResolver) this.a.get(), (SpSharedPreferences) this.b.get());
    }
}
