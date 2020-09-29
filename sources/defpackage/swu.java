package defpackage;

import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.service.session.SessionState;
import java.util.Set;

/* renamed from: swu reason: default package */
public final class swu {
    public static kmw<swv, sws> a(swv swv) {
        return swv.c() ? kmw.a(swv, ImmutableSet.d(new g())) : kmw.a(swv);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(swv swv, a aVar) {
        return swv.c() ? kng.a((Set<? extends F>) ImmutableSet.d(new f())) : kng.e();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(swv swv, b bVar) {
        fqn fqn = bVar.a;
        swv a = swv.d().a(fqn).a();
        Set h = ImmutableSet.h();
        if (swv.e()) {
            if (swv.b() == null) {
                a = a.a(true);
                h = kmt.a(sws.a(fqn, (SessionState) fbp.a(swv.a())));
            } else if (swv.c()) {
                h = kmt.a(new c(fqn));
            }
        }
        return kng.a(a, h);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(swv swv, c cVar) {
        SessionState sessionState = cVar.a;
        swv a = swv.d().a(sessionState).a();
        Set h = ImmutableSet.h();
        SessionState a2 = a.a();
        if (!(a2 != null && !a2.loggedIn() && !a2.loggingIn() && !a2.loggingOut())) {
            if (swv.b() != null) {
                if (!swv.e() && a.e()) {
                    a = a.a(true);
                    h = kmt.a(sws.a((fqn) fbp.a(swv.b()), sessionState));
                } else if (swv.c()) {
                    h = kmt.a(new d(sessionState));
                }
            }
        } else if (swv.c()) {
            a = a.a(false);
            h = kmt.a(new a());
        } else {
            h = kmt.a(new b());
        }
        return kng.a(a, h);
    }

    public static kng<swv, sws> a(swv swv, swt swt) {
        return (kng) swt.a(new $$Lambda$swu$hZvEKH2dtMy02BBfvWfKXSzOQKY(swv), new $$Lambda$swu$KihW4_js0p4pUoReVBobhNuo5U(swv), new $$Lambda$swu$a9J8y_QM7Gl1meCxFD9aiwKAjkI(swv));
    }
}
