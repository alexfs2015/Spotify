package defpackage;

import com.spotify.music.follow.FollowManager;

/* renamed from: nbv reason: default package */
public final class nbv implements wig<nbu> {
    private final wzi<FollowManager> a;

    private nbv(wzi<FollowManager> wzi) {
        this.a = wzi;
    }

    public static nbv a(wzi<FollowManager> wzi) {
        return new nbv(wzi);
    }

    public final /* synthetic */ Object get() {
        return new nbu((FollowManager) this.a.get());
    }
}
