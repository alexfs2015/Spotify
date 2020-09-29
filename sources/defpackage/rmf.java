package defpackage;

import io.reactivex.Observable;

/* renamed from: rmf reason: default package */
public final class rmf {
    public final Observable<rmb> a;

    /* renamed from: rmf$a */
    public interface a {
        Observable<rmb> getObservable();
    }

    /* renamed from: rmf$b */
    public interface b {
        rmf af();
    }

    private rmf(Observable<rmb> observable) {
        this.a = observable;
    }

    public static rmf a(gkq gkq, String str) {
        return new rmf(Observable.b(rmc.a(gkq.a(), str)));
    }

    public static rmf a(String str) {
        return new rmf(Observable.b(rmc.a(str)));
    }

    public static rmf a(a aVar) {
        return new rmf(aVar.getObservable());
    }
}
