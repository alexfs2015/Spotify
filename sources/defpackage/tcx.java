package defpackage;

import com.spotify.music.newplaying.scroll.flags.NowPlayingWidgetDebugDataSourceFlag;

/* renamed from: tcx reason: default package */
public final class tcx implements wig<tcu> {
    private final wzi<fqn> a;
    private final wzi<tcs> b;
    private final wzi<tcq> c;

    private tcx(wzi<fqn> wzi, wzi<tcs> wzi2, wzi<tcq> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static tcx a(wzi<fqn> wzi, wzi<tcs> wzi2, wzi<tcq> wzi3) {
        return new tcx(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        Object obj = (tcs) this.b.get();
        Object obj2 = (tcq) this.c.get();
        if (((fqn) this.a.get()).a(tdc.a) != NowPlayingWidgetDebugDataSourceFlag.CONTROL) {
            obj = obj2;
        }
        return (tcu) wil.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
