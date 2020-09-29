package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewTreeObserver.OnDrawListener;
import android.widget.EditText;

/* renamed from: srv reason: default package */
public final class srv implements TextWatcher {
    /* access modifiers changed from: private */
    public int a;
    private final OnDrawListener b = new OnDrawListener() {
        public final void onDraw() {
            srv.this.i.postInvalidateOnAnimation();
            srv.this.i.setLinkTextColor(srv.this.a = srv.this.a + 1);
        }
    };
    private final sru c;
    private final srt d;
    private final srt e;
    private final srt f;
    private final srt g;
    private final srt h;
    /* access modifiers changed from: private */
    public final EditText i;

    public srv(EditText editText) {
        this.i = editText;
        this.c = new sru();
        this.d = new srt(editText.getContext(), 0);
        this.e = new srt(editText.getContext(), 1);
        this.f = new srt(editText.getContext(), 2);
        this.g = new srt(editText.getContext(), 3);
        this.h = new srt(editText.getContext(), 4);
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

    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }
}
