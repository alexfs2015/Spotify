package defpackage;

import android.support.v4.media.session.MediaSessionCompat;
import com.spotify.music.libs.mediabrowserservice.RecentlyUsedComparator;
import java.util.Set;

/* renamed from: scy reason: default package */
public final class scy implements wig<scx> {
    private final wzi<MediaSessionCompat> a;
    private final wzi<Set<scp>> b;
    private final wzi<scn> c;
    private final wzi<RecentlyUsedComparator> d;

    private scy(wzi<MediaSessionCompat> wzi, wzi<Set<scp>> wzi2, wzi<scn> wzi3, wzi<RecentlyUsedComparator> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static scy a(wzi<MediaSessionCompat> wzi, wzi<Set<scp>> wzi2, wzi<scn> wzi3, wzi<RecentlyUsedComparator> wzi4) {
        return new scy(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new scx((MediaSessionCompat) this.a.get(), (Set) this.b.get(), (scn) this.c.get(), (RecentlyUsedComparator) this.d.get());
    }
}
