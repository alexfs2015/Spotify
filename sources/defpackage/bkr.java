package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: bkr reason: default package */
final class bkr implements OnClickListener {
    private final /* synthetic */ bla a;
    private final /* synthetic */ bko b;

    bkr(bko bko, bla bla) {
        this.b = bko;
        this.a = bla;
    }

    public final void onClick(View view) {
        this.a.a = true;
        if (this.b.b != null) {
            this.b.b.c();
        }
    }
}
