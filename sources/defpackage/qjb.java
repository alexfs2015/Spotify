package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: qjb reason: default package */
public final class qjb implements vua<qja> {
    private final wlc<a> a;

    private qjb(wlc<a> wlc) {
        this.a = wlc;
    }

    public static qjb a(wlc<a> wlc) {
        return new qjb(wlc);
    }

    public final /* synthetic */ Object get() {
        return new qja((a) this.a.get());
    }
}
