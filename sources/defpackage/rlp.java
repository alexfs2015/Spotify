package defpackage;

import com.spotify.music.follow.FollowManager;

/* renamed from: rlp reason: default package */
public final class rlp implements wig<rlo> {
    private final wzi<jvf> a;
    private final wzi<FollowManager> b;
    private final wzi<rlq> c;

    private rlp(wzi<jvf> wzi, wzi<FollowManager> wzi2, wzi<rlq> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static rlp a(wzi<jvf> wzi, wzi<FollowManager> wzi2, wzi<rlq> wzi3) {
        return new rlp(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new rlo((jvf) this.a.get(), (FollowManager) this.b.get(), (rlq) this.c.get());
    }
}
