package defpackage;

import io.reactivex.Completable;
import io.reactivex.functions.Action;

/* renamed from: rjt reason: default package */
public final class rjt implements rjz {
    private final lal a;

    public rjt(lal lal) {
        this.a = lal;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(String str, String str2) {
        this.a.b(str, str2, false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(String str, String str2) {
        this.a.a(str, str2, false);
    }

    public final Completable a(String str, String str2) {
        return Completable.a();
    }

    public final Completable a(String str, String str2, String str3) {
        return Completable.a();
    }

    public final Completable b(String str, String str2) {
        return Completable.a((Action) new $$Lambda$rjt$tmrhMO3pGrqb_xLoZIo9U63rRKo(this, str, str2));
    }

    public final Completable b(String str, String str2, String str3) {
        return Completable.a();
    }

    public final Completable c(String str, String str2) {
        return Completable.a((Action) new $$Lambda$rjt$k10B965Y1zHav4A1BVAUtFR2LwE(this, str, str2));
    }

    public final Completable c(String str, String str2, String str3) {
        return Completable.a();
    }
}
