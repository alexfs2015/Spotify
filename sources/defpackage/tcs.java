package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;
import com.spotify.music.newplaying.scroll.NowPlayingWidget.Type;

/* renamed from: tcs reason: default package */
public final class tcs implements tcu {
    private final tda a;
    private final fqn b;

    public tcs(tda tda, fqn fqn) {
        this.a = tda;
        this.b = fqn;
    }

    public final ImmutableList<Type> a() {
        a g = ImmutableList.g();
        fqn fqn = this.b;
        String str = "Treatment";
        boolean z = true;
        ImmutableList immutableList = fqn != null && ((String) fqn.a(tdc.c)).startsWith(str) ? g.c(Type.PIVOTS_MUSIC).a() : tda.a(this.b) ? g.b((E[]) new Type[]{Type.LYRICS, Type.BEHIND_THE_LYRICS}).a() : g.b((E[]) new Type[]{Type.LYRICS, Type.STORYLINES, Type.BEHIND_THE_LYRICS}).a();
        fqn fqn2 = this.b;
        if (fqn2 == null || !((String) fqn2.a(tdc.d)).startsWith(str)) {
            z = false;
        }
        return ImmutableList.a((Iterable<? extends E>) fcp.a(immutableList, z ? ImmutableList.a(Type.PIVOTS_PODCAST) : ImmutableList.d()));
    }
}
