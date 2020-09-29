package defpackage;

import android.os.Bundle;
import java.io.IOException;

/* renamed from: fif reason: default package */
final /* synthetic */ class fif implements Runnable {
    private final fie a;
    private final Bundle b;
    private final eya c;

    fif(fie fie, Bundle bundle, eya eya) {
        this.a = fie;
        this.b = bundle;
        this.c = eya;
    }

    public final void run() {
        fie fie = this.a;
        Bundle bundle = this.b;
        eya eya = this.c;
        try {
            eya.a(fie.a.a(bundle));
        } catch (IOException e) {
            eya.a((Exception) e);
        }
    }
}
