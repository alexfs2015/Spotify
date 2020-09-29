package defpackage;

import android.content.Context;
import com.spotify.music.features.assistedcuration.loader.RecentlyPlayedTracksLoader;

/* renamed from: lvp reason: default package */
public final class lvp implements wig<lvo> {
    private final wzi<Context> a;
    private final wzi<RecentlyPlayedTracksLoader> b;
    private final wzi<lvi> c;

    public static lvo a(Context context, RecentlyPlayedTracksLoader recentlyPlayedTracksLoader, Object obj) {
        return new lvo(context, recentlyPlayedTracksLoader, (lvi) obj);
    }

    public final /* synthetic */ Object get() {
        return new lvo((Context) this.a.get(), (RecentlyPlayedTracksLoader) this.b.get(), (lvi) this.c.get());
    }
}
