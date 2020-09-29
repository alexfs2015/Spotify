package defpackage;

import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.service.session.SessionState;
import java.util.Set;

/* renamed from: smn reason: default package */
public final class smn {
    public static kjn<smo, sml> a(smo smo) {
        if (smo.c()) {
            return kjn.a(smo, ImmutableSet.d(new g()));
        }
        return kjn.a(smo);
    }

    public static kjx<smo, sml> a(smo smo, smm smm) {
        return (kjx) smm.a(new $$Lambda$smn$FF1gFBw1it_YHYWYSfOvNDnTyGg(smo), new $$Lambda$smn$ew3BDDXolupJt6dYzUofTIGfE(smo), new $$Lambda$smn$KLgrTo54QpbBSuOM2a6a1Yj5tns(smo));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(smo smo, a aVar) {
        if (smo.c()) {
            return kjx.a((Set<? extends F>) ImmutableSet.d(new f()));
        }
        return kjx.e();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(smo smo, c cVar) {
        SessionState sessionState = cVar.a;
        smo a = smo.d().a(sessionState).a();
        Set h = ImmutableSet.h();
        SessionState a2 = a.a();
        if (!(a2 != null && !a2.loggedIn() && !a2.loggingIn() && !a2.loggingOut())) {
            if (smo.b() != null) {
                if (!smo.e() && a.e()) {
                    a = a.a(true);
                    h = kjk.a(sml.a((fpt) fay.a(smo.b()), sessionState));
                } else if (smo.c()) {
                    h = kjk.a(new d(sessionState));
                }
            }
        } else if (smo.c()) {
            a = a.a(false);
            h = kjk.a(new a());
        } else {
            h = kjk.a(new b());
        }
        return kjx.a(a, h);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(smo smo, b bVar) {
        fpt fpt = bVar.a;
        smo a = smo.d().a(fpt).a();
        Set h = ImmutableSet.h();
        if (smo.e()) {
            if (smo.b() == null) {
                a = a.a(true);
                h = kjk.a(sml.a(fpt, (SessionState) fay.a(smo.a())));
            } else if (smo.c()) {
                h = kjk.a(new c(fpt));
            }
        }
        return kjx.a(a, h);
    }
}
