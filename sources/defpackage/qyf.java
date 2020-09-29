package defpackage;

import com.spotify.mobile.android.connect.ConnectManager;

/* renamed from: qyf reason: default package */
public final class qyf implements wig<qye> {
    private final wzi<ConnectManager> a;

    private qyf(wzi<ConnectManager> wzi) {
        this.a = wzi;
    }

    public static qyf a(wzi<ConnectManager> wzi) {
        return new qyf(wzi);
    }

    public final /* synthetic */ Object get() {
        return new qye((ConnectManager) this.a.get());
    }
}
