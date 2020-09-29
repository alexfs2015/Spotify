package defpackage;

import com.google.common.base.Optional;

/* renamed from: kae reason: default package */
public final class kae implements kby {
    public xip a = xon.b();
    private final hgz b;
    private Optional<String> c = Optional.e();

    public kae(hgz hgz) {
        this.b = hgz;
    }

    /* access modifiers changed from: private */
    public void a(String str) {
        this.c = Optional.c(str);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Throwable th) {
        throw new RuntimeException("RxJava 1 exception in ProductStateStreamingRulesProvider", th);
    }

    public final Optional<String> a() {
        return this.c;
    }

    public final void b() {
        hhf.a(this.a);
        this.c = Optional.e();
        this.a = this.b.a("streaming-rules").a((xis<? super T>) new $$Lambda$kae$Xo6KFHErw0hlrk2d2BKD8g8jKZY<Object>(this), (xis<Throwable>) $$Lambda$kae$n7trEw4rA5n6Hw3O1p5UuKm_HZ8.INSTANCE);
    }
}
