package defpackage;

import com.spotify.music.libs.viewuri.ViewUris.SubView;

/* renamed from: mcl reason: default package */
public final class mcl implements vua<mbv> {
    private final wlc<jjf> a;
    private final wlc<SubView> b;

    public static mbv a(jjf jjf, SubView subView) {
        return (mbv) vuf.a(CC.a(jjf, subView), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((jjf) this.a.get(), (SubView) this.b.get());
    }
}
