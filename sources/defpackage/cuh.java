package defpackage;

import android.view.View;

/* renamed from: cuh reason: default package */
final class cuh implements Runnable {
    private final /* synthetic */ View a;
    private final /* synthetic */ ckk b;
    private final /* synthetic */ int c;
    private final /* synthetic */ cuf d;

    cuh(cuf cuf, View view, ckk ckk, int i) {
        this.d = cuf;
        this.a = view;
        this.b = ckk;
        this.c = i;
    }

    public final void run() {
        this.d.a(this.a, this.b, this.c - 1);
    }
}
