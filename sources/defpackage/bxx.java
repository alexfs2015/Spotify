package defpackage;

import android.content.Intent;

/* renamed from: bxx reason: default package */
final class bxx extends bwj {
    private final /* synthetic */ Intent a;
    private final /* synthetic */ bsv b;
    private final /* synthetic */ int c;

    bxx(Intent intent, bsv bsv, int i) {
        this.a = intent;
        this.b = bsv;
        this.c = i;
    }

    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, this.c);
        }
    }
}
