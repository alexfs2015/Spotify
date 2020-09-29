package defpackage;

import android.net.Uri;
import com.google.common.base.Optional;
import com.spotify.cosmos.android.RxResolver;
import io.reactivex.Scheduler;

@Deprecated
/* renamed from: gsu reason: default package */
public final class gsu {
    private final RxResolver a;
    private final rnf b;
    private final kqe c;
    private final gsy d;
    private final uxc e;
    private final wlc<ioa> f;
    private final Scheduler g;

    public gsu(RxResolver rxResolver, rnf rnf, kqe kqe, gsy gsy, uxc uxc, wlc<ioa> wlc, Scheduler scheduler) {
        this.a = rxResolver;
        this.b = rnf;
        this.c = kqe;
        this.d = gsy;
        this.e = uxc;
        this.f = wlc;
        this.g = scheduler;
    }

    @Deprecated
    public final Optional<gst> a(String str) {
        jst a2 = jst.a(str);
        Object obj = null;
        switch (a2.b) {
            case TRACK:
            case SHOW_EPISODE:
                obj = new gta(a2, null);
                break;
            case COLLECTION_ROOT:
            case COLLECTION_TRACKS:
                obj = new gtb(a2, this.a, jre.a(Uri.parse(str)));
                break;
            case PROFILE_PLAYLIST:
            case PLAYLIST_V2:
                obj = new gsw(a2, this.e);
                break;
            case ALBUM:
                obj = new gsn(a2, this.a, this.g);
                break;
            case COLLECTION_ALBUM:
                obj = new gsr(a2, this.f);
                break;
            case ARTIST:
                obj = new gsq(a2, this.c);
                break;
            case COLLECTION_ARTIST:
                obj = new gss(this.a, a2, this.b);
                break;
            case SHOW_SHOW:
                obj = new gsx(str, new rxi(this.a, str), this.d);
                break;
        }
        return Optional.c(obj);
    }
}
