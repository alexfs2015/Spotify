package defpackage;

import com.spotify.mobile.android.connect.ConnectManager.ConnectState;
import com.spotify.music.autoplay.RadioSeedBundle;

/* renamed from: kqv reason: default package */
public final class kqv implements vua<jwc<RadioSeedBundle>> {
    private final wlc<hvl> a;
    private final wlc<wud<ConnectState>> b;

    public static jwc<RadioSeedBundle> a(hvl hvl, wud<ConnectState> wud) {
        return (jwc) vuf.a(CC.a(hvl, wud), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((hvl) this.a.get(), (wud) this.b.get());
    }
}
