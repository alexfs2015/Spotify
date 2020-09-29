package defpackage;

import android.app.Dialog;

/* renamed from: bvp reason: default package */
final class bvp extends bus {
    private final /* synthetic */ Dialog a;
    private final /* synthetic */ bvo b;

    bvp(bvo bvo, Dialog dialog) {
        this.b = bvo;
        this.a = dialog;
    }

    public final void a() {
        this.b.a.f();
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}
