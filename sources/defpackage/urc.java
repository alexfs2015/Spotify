package defpackage;

import com.spotify.music.spotlets.offline.util.OffliningLogger;

/* renamed from: urc reason: default package */
public final class urc implements wig<OffliningLogger> {
    private final wzi<sso> a;

    private urc(wzi<sso> wzi) {
        this.a = wzi;
    }

    public static urc a(wzi<sso> wzi) {
        return new urc(wzi);
    }

    public final /* synthetic */ Object get() {
        return new OffliningLogger((sso) this.a.get());
    }
}
