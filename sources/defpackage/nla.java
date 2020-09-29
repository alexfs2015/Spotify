package defpackage;

import android.content.Context;
import com.spotify.android.paste.graphics.SpotifyIconV2;

/* renamed from: nla reason: default package */
public final class nla implements wig<hap> {
    private final wzi<Context> a;

    private nla(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static nla a(wzi<Context> wzi) {
        return new nla(wzi);
    }

    public final /* synthetic */ Object get() {
        return (hap) wil.a(new hap((Context) this.a.get(), SpotifyIconV2.TRACK), "Cannot return null from a non-@Nullable @Provides method");
    }
}
