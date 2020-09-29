package defpackage;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.functions.Function;

/* renamed from: whd reason: default package */
public final class whd extends Observable<c> {
    static final Function<Observable<c>, whd> a = new Function<Observable<c>, whd>() {
        public final /* synthetic */ Object apply(Object obj) {
            return new whd((Observable) obj);
        }
    };
    private final Observable<c> b;

    public whd(Observable<c> observable) {
        this.b = observable;
    }

    public final void a(Observer<? super c> observer) {
        this.b.subscribe(observer);
    }
}
