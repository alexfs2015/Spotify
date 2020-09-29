package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: fnx reason: default package */
final class fnx extends fnp<CharSequence> {
    private final TextView a;

    /* renamed from: fnx$a */
    static final class a extends MainThreadDisposable implements TextWatcher {
        private final TextView a;
        private final Observer<? super CharSequence> b;

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        a(TextView textView, Observer<? super CharSequence> observer) {
            this.a = textView;
            this.b = observer;
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!b()) {
                this.b.onNext(charSequence);
            }
        }

        public final void T_() {
            this.a.removeTextChangedListener(this);
        }
    }

    fnx(TextView textView) {
        this.a = textView;
    }

    public final void b(Observer<? super CharSequence> observer) {
        a aVar = new a(this.a, observer);
        observer.onSubscribe(aVar);
        this.a.addTextChangedListener(aVar);
    }

    public final /* synthetic */ Object a() {
        return this.a.getText();
    }
}
