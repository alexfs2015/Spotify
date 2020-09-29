package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: qrk reason: default package */
public final class qrk implements wig<qrj> {
    private final wzi<a> a;

    private qrk(wzi<a> wzi) {
        this.a = wzi;
    }

    public static qrk a(wzi<a> wzi) {
        return new qrk(wzi);
    }

    public final /* synthetic */ Object get() {
        return new qrj((a) this.a.get());
    }
}
