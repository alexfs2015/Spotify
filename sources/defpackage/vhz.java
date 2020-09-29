package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import java.util.List;

/* renamed from: vhz reason: default package */
public final class vhz<T> implements ObservableOnSubscribe<T> {
    private final String a;
    private final Observable<T> b;
    private final StackTraceElement[] c = vid.a();
    private final vif<T> d;

    public vhz(String str, Observable<T> observable) {
        this.a = str;
        this.b = observable;
        this.d = new vif<>();
    }

    public final void subscribe(ObservableEmitter<T> observableEmitter) {
        this.d.b(this.a, this.c, this.b, observableEmitter);
    }

    public final synchronized List<vie> a() {
        return this.d.a();
    }
}
