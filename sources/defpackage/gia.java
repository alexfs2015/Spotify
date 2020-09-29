package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.flags.RolloutFlag;

/* renamed from: gia reason: default package */
public final class gia {
    public static kmx<gib, ghy> a(String str) {
        return new $$Lambda$gia$uM8QvPINHisnGxUJkQ0gKKz9HmA(str);
    }

    /* access modifiers changed from: private */
    public static kng<gib, ghy> a(gib gib) {
        return (!gib.b().b() || !gib.a().b()) ? kng.b(gib) : ((Boolean) gib.a().c()).booleanValue() ? kng.a(gib, ImmutableSet.d(ghy.b((String) gib.b().c()))) : kng.b(b(gib));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(gib gib, c cVar) {
        return (!cVar.a || cVar.b) && cVar.c == RolloutFlag.ENABLED ? a(gib.d().a(Optional.b(Boolean.TRUE)).a()) : kng.b(gib.d().a(Optional.b(Boolean.FALSE)).a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(gib gib, e eVar) {
        return gib.c().b() ? kng.a(b(gib), ImmutableSet.d(new b((String) gib.c().c()))) : kng.b(b(gib));
    }

    public static kng<gib, ghy> a(gib gib, ghz ghz) {
        return (kng) ghz.a(new $$Lambda$gia$TFNPkj34UuBYuTy3kOk9PM72QZ0(gib), new $$Lambda$gia$iiCxCAJClC9Z8bSEV7hlJO8pjg(gib), new $$Lambda$gia$THPdE0LKsuS_Z6DM2I3ItJU0YQs(gib), new $$Lambda$gia$aFludkVZiJGqMY1PZDbiLSU1sI(gib), new $$Lambda$gia$mncUuPqyKx3u6nH51hQRkyCQi0E(gib));
    }

    private static gib b(gib gib) {
        return gib.d().b(Optional.e()).c(Optional.e()).a();
    }
}
