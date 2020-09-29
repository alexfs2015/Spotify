package defpackage;

import com.google.common.base.Optional;

/* renamed from: jye reason: default package */
public final class jye implements jzy {
    public wuk a = xaj.b();
    private final hed b;
    private Optional<String> c = Optional.e();

    public jye(hed hed) {
        this.b = hed;
    }

    public final Optional<String> a() {
        return this.c;
    }

    public final void b() {
        hej.a(this.a);
        this.c = Optional.e();
        this.a = this.b.a("streaming-rules").a((wun<? super T>) new $$Lambda$jye$1yBDi9I5qaaeLr6yEYxSSLskRXs<Object>(this), (wun<Throwable>) $$Lambda$jye$lJlytXE37NyBYnO8vqgs6CGdMZs.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Throwable th) {
        throw new RuntimeException("RxJava 1 exception in ProductStateStreamingRulesProvider", th);
    }

    /* access modifiers changed from: private */
    public void a(String str) {
        this.c = Optional.c(str);
    }
}
