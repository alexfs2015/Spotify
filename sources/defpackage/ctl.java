package defpackage;

import android.view.View;

/* renamed from: ctl reason: default package */
final class ctl implements Runnable {
    private final /* synthetic */ View a;
    private final /* synthetic */ clb b;
    private final /* synthetic */ int c;
    private final /* synthetic */ ctj d;

    ctl(ctj ctj, View view, clb clb, int i) {
        this.d = ctj;
        this.a = view;
        this.b = clb;
        this.c = i;
    }

    public final void run() {
        this.d.a(this.a, this.b, this.c - 1);
    }
}
