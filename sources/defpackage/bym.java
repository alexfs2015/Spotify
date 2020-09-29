package defpackage;

import android.app.Activity;
import android.content.Intent;

/* renamed from: bym reason: default package */
final class bym extends bxa {
    private final /* synthetic */ Intent a;
    private final /* synthetic */ Activity b;
    private final /* synthetic */ int c;

    bym(Intent intent, Activity activity, int i) {
        this.a = intent;
        this.b = activity;
        this.c = i;
    }

    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, this.c);
        }
    }
}
