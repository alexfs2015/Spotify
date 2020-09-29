package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: qmx reason: default package */
public abstract class qmx implements qnd {
    final Context a;
    protected fsb b;
    OnClickListener c;
    private final View d;

    public qmx(View view, fsb fsb) {
        this.d = view;
        this.a = view.getContext();
        this.b = fsb;
        this.b.d().setEllipsize(null);
        this.b.d().setSingleLine(false);
    }

    public final void a() {
        OnClickListener onClickListener = this.c;
        if (onClickListener != null) {
            onClickListener.onClick(this.d);
        }
    }

    public final void a(int i) {
        getView().setId(i);
    }

    public final void a(OnClickListener onClickListener) {
        this.c = onClickListener;
    }

    public void a(CharSequence charSequence) {
        this.b.b(charSequence);
    }

    public void a(String str) {
        this.b.a(str);
    }

    public void a(boolean z) {
        getView().setEnabled(z);
    }

    public View getView() {
        return this.d;
    }
}
