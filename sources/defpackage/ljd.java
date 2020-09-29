package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import java.util.concurrent.TimeUnit;

/* renamed from: ljd reason: default package */
public final class ljd implements spt {
    private final rgz a;
    private final gpx b;
    private final Scheduler c;

    public ljd(rgz rgz, gpx gpx, Scheduler scheduler) {
        this.a = rgz;
        this.b = gpx;
        this.c = scheduler;
    }

    public final void a(sps sps) {
        sps.a(sqa.a(LinkType.TRACK), "Handle track links", (spq) new $$Lambda$ljd$yjMKZ2DvyKKptNdGXC2NDAJPjM(this));
        sps.a(sqa.a(LinkType.TRACK_AUTOPLAY), "Handle track autoplay links", (spq) new $$Lambda$ljd$bJQfMMnDi158wuy8v5hto4ptgqg(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Single b(Intent intent, fpt fpt, SessionState sessionState) {
        jst a2 = jst.a(intent.getDataString());
        if (this.a.a(fpt)) {
            return a(a2, fpt);
        }
        if (!a2.d()) {
            return a(a2);
        }
        jst e = a2.e();
        if (e == null) {
            return Single.b(spw.a(a2));
        }
        return Single.b(spw.a(e));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Single a(Intent intent, fpt fpt, SessionState sessionState) {
        jst a2 = jst.a(intent.getDataString());
        if (this.a.a(fpt)) {
            return a(a2, fpt);
        }
        return a(a2);
    }

    private static Single<spw> a(jst jst, fpt fpt) {
        String q = jst.q();
        if (q == null) {
            return Single.b(spw.a(jst.a("spotify:startpage")));
        }
        return Single.b(spw.a((jol) mzd.a(q, fpt, jst.n(), jst.a.getQueryParameter("si"))));
    }

    private Single<spw> a(jst jst) {
        LinkType linkType = jst.b;
        fay.a(linkType == LinkType.TRACK || linkType == LinkType.TRACK_AUTOPLAY);
        return this.b.c(jst.q()).f($$Lambda$ljd$EQ8LCXkXICjBtLglUtp9_eozuWY.INSTANCE).a(10, TimeUnit.SECONDS, this.c).h($$Lambda$ljd$XvaFUr8Ko6UQ8Yhe6WrA3D8lk.INSTANCE).f($$Lambda$PWfSeQVlrEF9jZefHTMwv3ltMrk.INSTANCE);
    }
}
