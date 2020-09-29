package defpackage;

import android.support.v4.media.session.MediaSessionCompat;
import com.spotify.music.libs.mediabrowserservice.RecentlyUsedComparator;

/* renamed from: sdc reason: default package */
public final class sdc implements wig<sdb> {
    private final wzi<MediaSessionCompat> a;
    private final wzi<scx> b;
    private final wzi<RecentlyUsedComparator> c;

    private sdc(wzi<MediaSessionCompat> wzi, wzi<scx> wzi2, wzi<RecentlyUsedComparator> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static sdc a(wzi<MediaSessionCompat> wzi, wzi<scx> wzi2, wzi<RecentlyUsedComparator> wzi3) {
        return new sdc(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new sdb((MediaSessionCompat) this.a.get(), (scx) this.b.get(), (RecentlyUsedComparator) this.c.get());
    }
}
