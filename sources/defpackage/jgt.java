package defpackage;

import com.spotify.base.java.logging.Logger;

/* renamed from: jgt reason: default package */
public final class jgt extends irw<String> {
    private final jgu a;

    public final /* synthetic */ void onNext(Object obj) {
        if ("car".equals((String) obj)) {
            this.a.a("bluetooth", true);
        }
    }

    public jgt(jgu jgu) {
        this.a = (jgu) fay.a(jgu);
    }

    public final void onError(Throwable th) {
        Logger.e("Categorization failed. Could not resolve category for CarConnectedState: %s", th);
    }
}
