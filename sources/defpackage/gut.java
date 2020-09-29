package defpackage;

import android.net.Uri;
import com.google.common.base.Optional;
import com.spotify.cosmos.android.RxResolver;
import io.reactivex.Scheduler;

@Deprecated
/* renamed from: gut reason: default package */
public final class gut {
    private final RxResolver a;
    private final rwl b;
    private final ktn c;
    private final gux d;
    private final vje e;
    private final wzi<iqn> f;
    private final Scheduler g;

    public gut(RxResolver rxResolver, rwl rwl, ktn ktn, gux gux, vje vje, wzi<iqn> wzi, Scheduler scheduler) {
        this.a = rxResolver;
        this.b = rwl;
        this.c = ktn;
        this.d = gux;
        this.e = vje;
        this.f = wzi;
        this.g = scheduler;
    }

    @Deprecated
    public final Optional<gus> a(String str) {
        jva a2 = jva.a(str);
        Object obj = null;
        switch (a2.b) {
            case TRACK:
            case SHOW_EPISODE:
                obj = new guz(a2, null);
                break;
            case COLLECTION_ROOT:
            case COLLECTION_TRACKS:
                Uri parse = Uri.parse(str);
                obj = new gva(a2, this.a, parse.getQuery() == null ? false : parse.toString().contains("filterOffline=true"));
                break;
            case PROFILE_PLAYLIST:
            case PLAYLIST_V2:
                obj = new guv(a2, this.e);
                break;
            case ALBUM:
                obj = new gum(a2, this.a, this.g);
                break;
            case COLLECTION_ALBUM:
                obj = new guq(a2, this.f);
                break;
            case ARTIST:
                obj = new gup(a2, this.c);
                break;
            case COLLECTION_ARTIST:
                obj = new gur(this.a, a2, this.b);
                break;
            case SHOW_SHOW:
                obj = new guw(str, new sgs(this.a, str), this.d);
                break;
        }
        return Optional.c(obj);
    }
}
