package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: qdu reason: default package */
public abstract class qdu implements qea {
    final Context a;
    protected frh b;
    OnClickListener c;
    private final View d;

    public final void a(OnClickListener onClickListener) {
        this.c = onClickListener;
    }

    public final void a() {
        OnClickListener onClickListener = this.c;
        if (onClickListener != null) {
            onClickListener.onClick(this.d);
        }
    }

    public qdu(View view, frh frh) {
        this.d = view;
        this.a = view.getContext();
        this.b = frh;
        this.b.d().setEllipsize(null);
        this.b.d().setSingleLine(false);
    }

    public void a(String str) {
        this.b.a(str);
    }

    public void a(CharSequence charSequence) {
        this.b.b(charSequence);
    }

    public View getView() {
        return this.d;
    }

    public final void a(int i) {
        getView().setId(i);
    }

    public void a(boolean z) {
        getView().setEnabled(z);
    }
}
