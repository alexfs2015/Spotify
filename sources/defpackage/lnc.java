package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import java.util.concurrent.TimeUnit;

/* renamed from: lnc reason: default package */
public final class lnc implements taa {
    private final rqb a;
    private final grw b;
    private final Scheduler c;

    public lnc(rqb rqb, grw grw, Scheduler scheduler) {
        this.a = rqb;
        this.b = grw;
        this.c = scheduler;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Single a(Intent intent, fqn fqn, SessionState sessionState) {
        jva a2 = jva.a(intent.getDataString());
        return this.a.a(fqn) ? a(a2, fqn) : a(a2);
    }

    private Single<tad> a(jva jva) {
        LinkType linkType = jva.b;
        fbp.a(linkType == LinkType.TRACK || linkType == LinkType.TRACK_AUTOPLAY);
        return this.b.c(jva.q()).f($$Lambda$lnc$rJtmeGqD7BvoVvR1q1uCWSUu14U.INSTANCE).a(10, TimeUnit.SECONDS, this.c).h($$Lambda$lnc$Poqk15DA2RDLhEXlG2mBj4t8s.INSTANCE).f($$Lambda$wLFgFQHhgNtcBrihDEKhqfIm2c.INSTANCE);
    }

    private static Single<tad> a(jva jva, fqn fqn) {
        String q = jva.q();
        return q == null ? Single.b(tad.a(jva.a("spotify:startpage"))) : Single.b(tad.a((jqx) nek.a(q, fqn, jva.n(), jva.a.getQueryParameter("si"))));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Single b(Intent intent, fqn fqn, SessionState sessionState) {
        jva a2 = jva.a(intent.getDataString());
        if (this.a.a(fqn)) {
            return a(a2, fqn);
        }
        if (!a2.d()) {
            return a(a2);
        }
        jva e = a2.e();
        return e == null ? Single.b(tad.a(a2)) : Single.b(tad.a(e));
    }

    public final void a(szz szz) {
        szz.a(tah.a(LinkType.TRACK), "Handle track links", (szx) new $$Lambda$lnc$G9DrzZBdJNMhvaSEJearzc0sIfc(this));
        szz.a(tah.a(LinkType.TRACK_AUTOPLAY), "Handle track autoplay links", (szx) new $$Lambda$lnc$U4k0pKtApRQC78jVEhFtYengu4(this));
    }
}
