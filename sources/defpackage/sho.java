package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewTreeObserver.OnDrawListener;
import android.widget.EditText;

/* renamed from: sho reason: default package */
public final class sho implements TextWatcher {
    /* access modifiers changed from: private */
    public int a;
    private final OnDrawListener b = new OnDrawListener() {
        public final void onDraw() {
            sho.this.i.postInvalidateOnAnimation();
            sho.this.i.setLinkTextColor(sho.this.a = sho.this.a + 1);
        }
    };
    private final shn c;
    private final shm d;
    private final shm e;
    private final shm f;
    private final shm g;
    private final shm h;
    /* access modifiers changed from: private */
    public final EditText i;

    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public sho(EditText editText) {
        this.i = editText;
        this.c = new shn();
        this.d = new shm(editText.getContext(), 0);
        this.e = new shm(editText.getContext(), 1);
        this.f = new shm(editText.getContext(), 2);
        this.g = new shm(editText.getContext(), 3);
        this.h = new shm(editText.getContext(), 4);
    }

    public final void afterTextChanged(Editable editable) {
        if ("pride".equalsIgnoreCase(editable.toString())) {
            editable.setSpan(this.c, 0, 5, 33);
            editable.setSpan(this.d, 0, 1, 33);
            editable.setSpan(this.e, 1, 2, 33);
            editable.setSpan(this.f, 2, 3, 33);
            editable.setSpan(this.g, 3, 4, 33);
            editable.setSpan(this.h, 4, 5, 33);
            this.i.getViewTreeObserver().addOnDrawListener(this.b);
            return;
        }
        editable.removeSpan(this.c);
        editable.removeSpan(this.d);
        editable.removeSpan(this.e);
        editable.removeSpan(this.f);
        editable.removeSpan(this.g);
        editable.removeSpan(this.h);
        this.i.getViewTreeObserver().removeOnDrawListener(this.b);
    }
}
