package defpackage;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;

/* renamed from: fsr reason: default package */
public final class fsr {
    CharSequence a;
    CharSequence b;
    OnClickListener c;
    OnClickListener d;
    public boolean e = true;
    public OnCancelListener f;
    public OnDismissListener g;
    public fsw h;
    final fsq i;
    private final Context j;

    public fsr(Context context, fsq fsq) {
        this.j = context;
        this.i = fsq;
    }

    public final fsr a(CharSequence charSequence, OnClickListener onClickListener) {
        this.a = charSequence;
        this.c = onClickListener;
        return this;
    }

    public final fsr b(CharSequence charSequence, OnClickListener onClickListener) {
        this.b = charSequence;
        this.d = onClickListener;
        return this;
    }

    public final fsp a() {
        return new fsv(this.j, 2132017714, this);
    }
}
