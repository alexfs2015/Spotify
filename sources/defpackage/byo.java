package defpackage;

import android.content.Intent;

/* renamed from: byo reason: default package */
final class byo extends bxa {
    private final /* synthetic */ Intent a;
    private final /* synthetic */ btm b;
    private final /* synthetic */ int c;

    byo(Intent intent, btm btm, int i) {
        this.a = intent;
        this.b = btm;
        this.c = i;
    }

    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, this.c);
        }
    }
}
