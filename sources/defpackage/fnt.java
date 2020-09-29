package defpackage;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import com.jakewharton.rxbinding2.internal.Notification;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: fnt reason: default package */
public final class fnt extends Observable<Object> {
    private final boolean a = false;
    private final View b;

    /* renamed from: fnt$a */
    static final class a extends MainThreadDisposable implements OnAttachStateChangeListener {
        private final View a;
        private final boolean b;
        private final Observer<? super Object> c;

        a(View view, boolean z, Observer<? super Object> observer) {
            this.a = view;
            this.b = z;
            this.c = observer;
        }

        public final void onViewAttachedToWindow(View view) {
            if (this.b && !b()) {
                this.c.onNext(Notification.INSTANCE);
            }
        }

        public final void onViewDetachedFromWindow(View view) {
            if (!this.b && !b()) {
                this.c.onNext(Notification.INSTANCE);
            }
        }

        public final void T_() {
            this.a.removeOnAttachStateChangeListener(this);
        }
    }

    public fnt(View view, boolean z) {
        this.b = view;
    }

    public final void a(Observer<? super Object> observer) {
        if (fnr.a(observer)) {
            a aVar = new a(this.b, this.a, observer);
            observer.onSubscribe(aVar);
            this.b.addOnAttachStateChangeListener(aVar);
        }
    }
}
