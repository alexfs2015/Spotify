package defpackage;

import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: dkk reason: default package */
public final class dkk extends dkn {
    private final View d;

    public dkk(djc djc, String str, String str2, dci dci, int i, View view) {
        super(djc, str, str2, dci, i, 57);
        this.d = view;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        if (this.d != null) {
            DisplayMetrics displayMetrics = this.a.a().getResources().getDisplayMetrics();
            djl djl = new djl((String) this.c.invoke(null, new Object[]{this.d, displayMetrics}));
            ddx ddx = new ddx();
            ddx.a = djl.a;
            ddx.b = djl.b;
            ddx.c = djl.c;
            this.b.M = ddx;
        }
    }
}
