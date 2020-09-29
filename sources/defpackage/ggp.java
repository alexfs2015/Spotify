package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.flags.RolloutFlag;

/* renamed from: ggp reason: default package */
public final class ggp {
    public static kjo<ggq, ggn> a(String str) {
        return new $$Lambda$ggp$ceZxNcf8KYA7pUkJjuoSBjMTXwI(str);
    }

    public static kjx<ggq, ggn> a(ggq ggq, ggo ggo) {
        return (kjx) ggo.a(new $$Lambda$ggp$luAhJhnzbCqQUME5sGC5KnhwGJk(ggq), new $$Lambda$ggp$a7hIzaSRZuiNpMUj_aUq8au9Bi8(ggq), new $$Lambda$ggp$6pc0TBBCoiEPLQiSknOEMPYi0k(ggq), new $$Lambda$ggp$mgs1DUx4ldpRowHHZImvxN4ICA(ggq), new $$Lambda$ggp$xZ7B1jphT0DFDcprae8ZdCcHXw(ggq));
    }

    /* access modifiers changed from: private */
    public static kjx<ggq, ggn> a(ggq ggq) {
        if (!ggq.b().b() || !ggq.a().b()) {
            return kjx.b(ggq);
        }
        if (((Boolean) ggq.a().c()).booleanValue()) {
            return kjx.a(ggq, ImmutableSet.d(ggn.b((String) ggq.b().c())));
        }
        return kjx.b(b(ggq));
    }

    private static ggq b(ggq ggq) {
        return ggq.d().b(Optional.e()).c(Optional.e()).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(ggq ggq, e eVar) {
        if (ggq.c().b()) {
            return kjx.a(b(ggq), ImmutableSet.d(new b((String) ggq.c().c())));
        }
        return kjx.b(b(ggq));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(ggq ggq, c cVar) {
        if ((!cVar.a || cVar.b) && cVar.c == RolloutFlag.ENABLED) {
            return a(ggq.d().a(Optional.b(Boolean.TRUE)).a());
        }
        return kjx.b(ggq.d().a(Optional.b(Boolean.FALSE)).a());
    }
}
