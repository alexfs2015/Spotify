package defpackage;

import com.spotify.player.model.PlayOrigin;

/* renamed from: vih reason: default package */
public final class vih implements wig<vig> {
    private final wzi<PlayOrigin> a;

    private vih(wzi<PlayOrigin> wzi) {
        this.a = wzi;
    }

    public static vih a(wzi<PlayOrigin> wzi) {
        return new vih(wzi);
    }

    public final /* synthetic */ Object get() {
        return new vig((PlayOrigin) this.a.get());
    }
}
