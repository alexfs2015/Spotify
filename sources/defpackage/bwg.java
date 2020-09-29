package defpackage;

import android.app.Dialog;

/* renamed from: bwg reason: default package */
final class bwg extends bvj {
    private final /* synthetic */ Dialog a;
    private final /* synthetic */ bwf b;

    bwg(bwf bwf, Dialog dialog) {
        this.b = bwf;
        this.a = dialog;
    }

    public final void a() {
        this.b.a.f();
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}
