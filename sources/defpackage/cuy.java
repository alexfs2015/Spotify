package defpackage;

import android.view.View;

/* renamed from: cuy reason: default package */
final class cuy implements Runnable {
    private final /* synthetic */ View a;
    private final /* synthetic */ clb b;
    private final /* synthetic */ int c;
    private final /* synthetic */ cuw d;

    cuy(cuw cuw, View view, clb clb, int i) {
        this.d = cuw;
        this.a = view;
        this.b = clb;
        this.c = i;
    }

    public final void run() {
        this.d.a(this.a, this.b, this.c - 1);
    }
}
