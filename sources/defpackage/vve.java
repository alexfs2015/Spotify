package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import java.util.List;

/* renamed from: vve reason: default package */
public final class vve<T> implements ObservableOnSubscribe<T> {
    private final String a;
    private final Observable<T> b;
    private final StackTraceElement[] c = vvi.a();
    private final vvk<T> d;

    public vve(String str, Observable<T> observable) {
        this.a = str;
        this.b = observable;
        this.d = new vvk<>();
    }

    public final synchronized List<vvj> a() {
        return this.d.a();
    }

    public final void subscribe(ObservableEmitter<T> observableEmitter) {
        this.d.b(this.a, this.c, this.b, observableEmitter);
    }
}
