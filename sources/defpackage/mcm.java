package defpackage;

import com.spotify.music.libs.viewuri.ViewUris.SubView;

/* renamed from: mcm reason: default package */
public final class mcm implements vua<SubView> {
    private final wlc<mbu> a;

    public static SubView a(mbu mbu) {
        return (SubView) vuf.a(CC.a(mbu), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((mbu) this.a.get());
    }
}
