package defpackage;

import io.reactivex.Observable;

/* renamed from: rdh reason: default package */
public final class rdh {
    public final Observable<rdd> a;

    /* renamed from: rdh$a */
    public interface a {
        Observable<rdd> getObservable();
    }

    /* renamed from: rdh$b */
    public interface b {
        rdh af();
    }

    private rdh(Observable<rdd> observable) {
        this.a = observable;
    }

    public static rdh a(gjf gjf, String str) {
        return new rdh(Observable.b(rde.a(gjf.a(), str)));
    }

    public static rdh a(a aVar) {
        return new rdh(aVar.getObservable());
    }

    public static rdh a(String str) {
        return new rdh(Observable.b(rde.a(str)));
    }
}
