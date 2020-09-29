package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;
import com.spotify.music.newplaying.scroll.NowPlayingWidget.Type;

/* renamed from: ssl reason: default package */
public final class ssl implements ssn {
    private final sst a;
    private final fpt b;

    public ssl(sst sst, fpt fpt) {
        this.a = sst;
        this.b = fpt;
    }

    public final ImmutableList<Type> a() {
        ImmutableList immutableList;
        ImmutableList immutableList2;
        a g = ImmutableList.g();
        fpt fpt = this.b;
        String str = "Treatment";
        boolean z = true;
        if (fpt != null && ((String) fpt.a(ssv.c)).startsWith(str)) {
            immutableList = g.c(Type.PIVOTS_MUSIC).a();
        } else if (sst.a(this.b)) {
            immutableList = g.b((E[]) new Type[]{Type.LYRICS, Type.BEHIND_THE_LYRICS}).a();
        } else {
            immutableList = g.b((E[]) new Type[]{Type.LYRICS, Type.STORYLINES, Type.BEHIND_THE_LYRICS}).a();
        }
        fpt fpt2 = this.b;
        if (fpt2 == null || !((String) fpt2.a(ssv.d)).startsWith(str)) {
            z = false;
        }
        if (z) {
            immutableList2 = ImmutableList.a(Type.PIVOTS_PODCAST);
        } else {
            immutableList2 = ImmutableList.d();
        }
        return ImmutableList.a((Iterable<? extends E>) fbx.a((Iterable<? extends T>) immutableList, (Iterable<? extends T>) immutableList2));
    }
}
