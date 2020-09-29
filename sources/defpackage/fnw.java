package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import io.reactivex.functions.Predicate;

/* renamed from: fnw reason: default package */
public final class fnw extends Observable<Integer> {
    private final TextView a;
    private final Predicate<? super Integer> b;

    /* renamed from: fnw$a */
    static final class a extends MainThreadDisposable implements OnEditorActionListener {
        private final TextView a;
        private final Observer<? super Integer> b;
        private final Predicate<? super Integer> c;

        a(TextView textView, Observer<? super Integer> observer, Predicate<? super Integer> predicate) {
            this.a = textView;
            this.b = observer;
            this.c = predicate;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            try {
                if (!b() && this.c.test(Integer.valueOf(i))) {
                    this.b.onNext(Integer.valueOf(i));
                    return true;
                }
            } catch (Exception e) {
                this.b.onError(e);
                bf_();
            }
            return false;
        }

        public final void T_() {
            this.a.setOnEditorActionListener(null);
        }
    }

    public fnw(TextView textView, Predicate<? super Integer> predicate) {
        this.a = textView;
        this.b = predicate;
    }

    public final void a(Observer<? super Integer> observer) {
        if (fnr.a(observer)) {
            a aVar = new a(this.a, observer, this.b);
            observer.onSubscribe(aVar);
            this.a.setOnEditorActionListener(aVar);
        }
    }
}
