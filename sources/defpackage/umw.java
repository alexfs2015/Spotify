package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;

/* renamed from: umw reason: default package */
public final class umw {
    public final une a;
    public final umu b;

    public umw(une une, umu umu) {
        this.a = une;
        this.b = umu;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(Boolean bool, Boolean bool2) {
        return Boolean.valueOf(bool.booleanValue() || bool2.booleanValue());
    }

    public final long a() {
        if (this.a.c()) {
            return this.a.a();
        }
        return -1;
    }

    public final Observable<Boolean> b() {
        return Observable.a((ObservableSource<? extends T1>) this.b.a(), (ObservableSource<? extends T2>) this.a.d(), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$umw$5C_9EheH5jAvX6S5i9YRK_hasc.INSTANCE);
    }

    public final void c() {
        if (this.a.c()) {
            this.a.b();
            return;
        }
        if (this.b.a) {
            this.b.b();
        }
    }

    public final boolean d() {
        return this.b.a || this.a.c();
    }
}
