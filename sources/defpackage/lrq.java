package defpackage;

import android.content.Context;
import com.spotify.music.features.assistedcuration.loader.RecentlyPlayedTracksLoader;

/* renamed from: lrq reason: default package */
public final class lrq implements vua<lrp> {
    private final wlc<Context> a;
    private final wlc<RecentlyPlayedTracksLoader> b;
    private final wlc<lrj> c;

    public static lrp a(Context context, RecentlyPlayedTracksLoader recentlyPlayedTracksLoader, Object obj) {
        return new lrp(context, recentlyPlayedTracksLoader, (lrj) obj);
    }

    public final /* synthetic */ Object get() {
        return new lrp((Context) this.a.get(), (RecentlyPlayedTracksLoader) this.b.get(), (lrj) this.c.get());
    }
}
