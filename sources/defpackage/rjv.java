package defpackage;

import io.reactivex.Completable;
import io.reactivex.functions.Action;

/* renamed from: rjv reason: default package */
public final class rjv implements rjz {
    private final ure a;

    public rjv(ure ure) {
        this.a = ure;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        this.a.d(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        this.a.b(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        this.a.c(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(String str) {
        this.a.a(str);
    }

    public final Completable a(String str, String str2) {
        ure ure = this.a;
        ure.getClass();
        return Completable.a((Action) new $$Lambda$pFY4NjviG_MjpmBPd2b38iIVcE0(ure));
    }

    public final Completable a(String str, String str2, String str3) {
        ure ure = this.a;
        ure.getClass();
        return Completable.a((Action) new $$Lambda$pl6fuzEGdXSjDMRBFa1O3ChmIAc(ure));
    }

    public final Completable b(String str, String str2) {
        return Completable.a((Action) new $$Lambda$rjv$q7wiWQPXUeA9n5vdMenvJxqFFQ(this, str));
    }

    public final Completable b(String str, String str2, String str3) {
        return Completable.a((Action) new $$Lambda$rjv$ZQ0xh9Hj4ZC4i5GQUahM2En4FZg(this, str3));
    }

    public final Completable c(String str, String str2) {
        return Completable.a((Action) new $$Lambda$rjv$EpXOQEgBCXxwdUydJg29YaTfdFM(this, str));
    }

    public final Completable c(String str, String str2, String str3) {
        return Completable.a((Action) new $$Lambda$rjv$JdaroJ3NwkJLf_WGbWap3EGx_c(this, str3));
    }
}
