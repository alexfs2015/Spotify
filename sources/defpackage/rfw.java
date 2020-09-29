package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.music.follow.FollowManager;

/* renamed from: rfw reason: default package */
public final class rfw implements wig<rfv> {
    private final wzi<rls> a;
    private final wzi<FollowManager> b;
    private final wzi<rep> c;
    private final wzi<a> d;

    private rfw(wzi<rls> wzi, wzi<FollowManager> wzi2, wzi<rep> wzi3, wzi<a> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static rfw a(wzi<rls> wzi, wzi<FollowManager> wzi2, wzi<rep> wzi3, wzi<a> wzi4) {
        return new rfw(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new rfv((rls) this.a.get(), (FollowManager) this.b.get(), (rep) this.c.get(), (a) this.d.get());
    }
}
