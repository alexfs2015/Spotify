package defpackage;

import io.reactivex.Observable;
import io.reactivex.subjects.ReplaySubject;

/* renamed from: rkd reason: default package */
public final class rkd implements rkc {
    public boolean a = false;
    public boolean b = false;
    public boolean c = false;
    public final ReplaySubject<Boolean> d = ReplaySubject.c(1);
    public final ReplaySubject<Boolean> e;
    public final ReplaySubject<Boolean> f;

    public rkd() {
        this.d.onNext(Boolean.FALSE);
        this.e = ReplaySubject.c(1);
        this.e.onNext(Boolean.FALSE);
        this.f = ReplaySubject.c(1);
        this.f.onNext(Boolean.FALSE);
    }

    public final Observable<Boolean> a() {
        return this.d;
    }

    public final Observable<Boolean> b() {
        return this.e;
    }

    public final Observable<Boolean> c() {
        return this.f;
    }
}
