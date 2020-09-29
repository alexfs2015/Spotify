package defpackage;

import com.spotify.mobile.android.connect.ConnectManager.ConnectState;
import com.spotify.music.autoplay.RadioSeedBundle;

/* renamed from: kue reason: default package */
public final class kue implements wig<jyk<RadioSeedBundle>> {
    private final wzi<hxx> a;
    private final wzi<xii<ConnectState>> b;

    public static jyk<RadioSeedBundle> a(hxx hxx, xii<ConnectState> xii) {
        return (jyk) wil.a(CC.a(hxx, xii), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((hxx) this.a.get(), (xii) this.b.get());
    }
}
