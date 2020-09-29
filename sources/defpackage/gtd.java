package defpackage;

import com.spotify.mobile.android.connect.ConnectManager;

/* renamed from: gtd reason: default package */
public final class gtd implements wig<a> {
    private final wzi<ConnectManager> a;

    private gtd(wzi<ConnectManager> wzi) {
        this.a = wzi;
    }

    public static gtd a(wzi<ConnectManager> wzi) {
        return new gtd(wzi);
    }

    public final /* synthetic */ Object get() {
        return (a) wil.a(CC.a((ConnectManager) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
