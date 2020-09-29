package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: bka reason: default package */
final class bka implements OnClickListener {
    private final /* synthetic */ bkj a;
    private final /* synthetic */ bjx b;

    bka(bjx bjx, bkj bkj) {
        this.b = bjx;
        this.a = bkj;
    }

    public final void onClick(View view) {
        this.a.a = true;
        if (this.b.b != null) {
            this.b.b.c();
        }
    }
}
