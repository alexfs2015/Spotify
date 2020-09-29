package defpackage;

import android.content.Context;
import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: tjt reason: default package */
public final class tjt implements wig<tjs> {
    private final wzi<Context> a;
    private final wzi<Player> b;
    private final wzi<vdk> c;

    private tjt(wzi<Context> wzi, wzi<Player> wzi2, wzi<vdk> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static tjt a(wzi<Context> wzi, wzi<Player> wzi2, wzi<vdk> wzi3) {
        return new tjt(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new tjs((Context) this.a.get(), (Player) this.b.get(), (vdk) this.c.get());
    }
}
