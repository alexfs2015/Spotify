package defpackage;

import io.reactivex.subjects.PublishSubject;

/* renamed from: kfk reason: default package */
public final class kfk implements keu, kfn {
    public final PublishSubject<kfg> a = PublishSubject.a();
    private final jrp b;

    public kfk(jrp jrp) {
        this.b = jrp;
    }

    public final void a(String str) {
        this.a.onNext(new c(str));
    }

    public final void c() {
        this.a.onNext(new b(this.b.c()));
    }

    public final void d() {
        this.a.onNext(new e(this.b.c()));
    }

    public final void a() {
        this.a.onNext(new a());
    }

    public final void b() {
        this.a.onNext(new f(this.b.c()));
    }
}
