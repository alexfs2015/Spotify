package defpackage;

import android.content.Intent;
import androidx.fragment.app.Fragment;

/* renamed from: byn reason: default package */
final class byn extends bxa {
    private final /* synthetic */ Intent a;
    private final /* synthetic */ Fragment b;
    private final /* synthetic */ int c;

    byn(Intent intent, Fragment fragment, int i) {
        this.a = intent;
        this.b = fragment;
        this.c = i;
    }

    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, this.c);
        }
    }
}
