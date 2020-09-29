package defpackage;

import com.spotify.base.java.logging.Logger;

/* renamed from: jji reason: default package */
public final class jji extends itz<String> {
    private final jjj a;

    public jji(jjj jjj) {
        this.a = (jjj) fbp.a(jjj);
    }

    public final void onError(Throwable th) {
        Logger.e("Categorization failed. Could not resolve category for CarConnectedState: %s", th);
    }

    public final /* synthetic */ void onNext(Object obj) {
        if ("car".equals((String) obj)) {
            this.a.a("bluetooth", true);
        }
    }
}
