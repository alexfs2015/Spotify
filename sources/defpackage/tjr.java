package defpackage;

import android.content.Context;
import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: tjr reason: default package */
public final class tjr implements wig<tjq> {
    private final wzi<Context> a;
    private final wzi<Player> b;
    private final wzi<vdj> c;

    private tjr(wzi<Context> wzi, wzi<Player> wzi2, wzi<vdj> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static tjr a(wzi<Context> wzi, wzi<Player> wzi2, wzi<vdj> wzi3) {
        return new tjr(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new tjq((Context) this.a.get(), (Player) this.b.get(), (vdj) this.c.get());
    }
}
