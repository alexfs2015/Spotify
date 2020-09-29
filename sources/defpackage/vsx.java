package defpackage;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.functions.Function;

/* renamed from: vsx reason: default package */
public final class vsx extends Observable<c> {
    static final Function<Observable<c>, vsx> a = new Function<Observable<c>, vsx>() {
        public final /* synthetic */ Object apply(Object obj) {
            return new vsx((Observable) obj);
        }
    };
    private final Observable<c> b;

    public vsx(Observable<c> observable) {
        this.b = observable;
    }

    public final void a(Observer<? super c> observer) {
        this.b.subscribe(observer);
    }
}
