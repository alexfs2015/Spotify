package defpackage;

import com.spotify.music.follow.FollowManager;

/* renamed from: mwf reason: default package */
public final class mwf implements wig<mwe> {
    private final wzi<FollowManager> a;
    private final wzi<rls> b;

    private mwf(wzi<FollowManager> wzi, wzi<rls> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static mwf a(wzi<FollowManager> wzi, wzi<rls> wzi2) {
        return new mwf(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new mwe((FollowManager) this.a.get(), (rls) this.b.get());
    }
}
