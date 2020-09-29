package defpackage;

import com.spotify.music.follow.FollowManager;

/* renamed from: gxs reason: default package */
public final class gxs implements wig<gxr> {
    private final wzi<FollowManager> a;

    private gxs(wzi<FollowManager> wzi) {
        this.a = wzi;
    }

    public static gxs a(wzi<FollowManager> wzi) {
        return new gxs(wzi);
    }

    public final /* synthetic */ Object get() {
        return new gxr((FollowManager) this.a.get());
    }
}
