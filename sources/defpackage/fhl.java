package defpackage;

import android.os.Bundle;
import java.io.IOException;

/* renamed from: fhl reason: default package */
final /* synthetic */ class fhl implements Runnable {
    private final fhk a;
    private final Bundle b;
    private final exj c;

    fhl(fhk fhk, Bundle bundle, exj exj) {
        this.a = fhk;
        this.b = bundle;
        this.c = exj;
    }

    public final void run() {
        fhk fhk = this.a;
        Bundle bundle = this.b;
        exj exj = this.c;
        try {
            exj.a(fhk.a.a(bundle));
        } catch (IOException e) {
            exj.a((Exception) e);
        }
    }
}
