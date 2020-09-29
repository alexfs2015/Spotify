package defpackage;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;

/* renamed from: ftl reason: default package */
public final class ftl {
    CharSequence a;
    CharSequence b;
    OnClickListener c;
    OnClickListener d;
    public boolean e = true;
    public OnCancelListener f;
    public OnDismissListener g;
    public ftq h;
    final ftk i;
    private final Context j;

    public ftl(Context context, ftk ftk) {
        this.j = context;
        this.i = ftk;
    }

    public final ftj a() {
        return new ftp(this.j, 2132017717, this);
    }

    public final ftl a(CharSequence charSequence, OnClickListener onClickListener) {
        this.a = charSequence;
        this.c = onClickListener;
        return this;
    }

    public final ftl b(CharSequence charSequence, OnClickListener onClickListener) {
        this.b = charSequence;
        this.d = onClickListener;
        return this;
    }
}
