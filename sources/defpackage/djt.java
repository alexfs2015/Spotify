package defpackage;

import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: djt reason: default package */
public final class djt extends djw {
    private final View d;

    public djt(dil dil, String str, String str2, dbr dbr, int i, View view) {
        super(dil, str, str2, dbr, i, 57);
        this.d = view;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        if (this.d != null) {
            DisplayMetrics displayMetrics = this.a.a().getResources().getDisplayMetrics();
            diu diu = new diu((String) this.c.invoke(null, new Object[]{this.d, displayMetrics}));
            ddg ddg = new ddg();
            ddg.a = diu.a;
            ddg.b = diu.b;
            ddg.c = diu.c;
            this.b.M = ddg;
        }
    }
}
