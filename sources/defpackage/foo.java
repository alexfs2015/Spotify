package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.jakewharton.rxbinding2.internal.Notification;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: foo reason: default package */
final class foo extends Observable<Object> {
    private final View a;

    /* renamed from: foo$a */
    static final class a extends MainThreadDisposable implements OnClickListener {
        private final View a;
        private final Observer<? super Object> b;

        a(View view, Observer<? super Object> observer) {
            this.a = view;
            this.b = observer;
        }

        public final void T_() {
            this.a.setOnClickListener(null);
        }

        public final void onClick(View view) {
            if (!b()) {
                this.b.onNext(Notification.INSTANCE);
            }
        }
    }

    foo(View view) {
        this.a = view;
    }

    public final void a(Observer<? super Object> observer) {
        if (fol.a(observer)) {
            a aVar = new a(this.a, observer);
            observer.onSubscribe(aVar);
            this.a.setOnClickListener(aVar);
        }
    }
}
