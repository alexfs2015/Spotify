package defpackage;

import io.reactivex.subjects.PublishSubject;

/* renamed from: khm reason: default package */
public final class khm implements kgw, khp {
    public final PublishSubject<khi> a = PublishSubject.a();
    private final jtz b;

    public khm(jtz jtz) {
        this.b = jtz;
    }

    public final void a() {
        this.a.onNext(new a());
    }

    public final void a(String str) {
        this.a.onNext(new c(str));
    }

    public final void b() {
        this.a.onNext(new f(this.b.c()));
    }

    public final void c() {
        this.a.onNext(new b(this.b.c()));
    }

    public final void d() {
        this.a.onNext(new e(this.b.c()));
    }
}
