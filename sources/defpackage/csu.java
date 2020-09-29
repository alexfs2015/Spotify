package defpackage;

import android.view.View;

/* renamed from: csu reason: default package */
final class csu implements Runnable {
    private final /* synthetic */ View a;
    private final /* synthetic */ ckk b;
    private final /* synthetic */ int c;
    private final /* synthetic */ css d;

    csu(css css, View view, ckk ckk, int i) {
        this.d = css;
        this.a = view;
        this.b = ckk;
        this.c = i;
    }

    public final void run() {
        this.d.a(this.a, this.b, this.c - 1);
    }
}
