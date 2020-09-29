package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: for reason: invalid class name and default package */
final class Cfor extends foj<CharSequence> {
    private final TextView a;

    /* renamed from: for$a */
    static final class a extends MainThreadDisposable implements TextWatcher {
        private final TextView a;
        private final Observer<? super CharSequence> b;

        a(TextView textView, Observer<? super CharSequence> observer) {
            this.a = textView;
            this.b = observer;
        }

        public final void T_() {
            this.a.removeTextChangedListener(this);
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!b()) {
                this.b.onNext(charSequence);
            }
        }
    }

    Cfor(TextView textView) {
        this.a = textView;
    }

    public final /* synthetic */ Object a() {
        return this.a.getText();
    }

    public final void b(Observer<? super CharSequence> observer) {
        a aVar = new a(this.a, observer);
        observer.onSubscribe(aVar);
        this.a.addTextChangedListener(aVar);
    }
}
