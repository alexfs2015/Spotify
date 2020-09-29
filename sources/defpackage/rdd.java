package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;

/* renamed from: rdd reason: default package */
public final class rdd {
    public static rdc a(ImmutableList<rdc> immutableList) {
        rdc rdc = rdc.h;
        for (int size = immutableList.size() - 1; size >= 0; size--) {
            rdc rdc2 = (rdc) immutableList.get(size);
            rdc = rdc.equals(rdc.h) ? rdc2 : a(rdc2, rdc);
        }
        return rdc;
    }

    public static rdc a(ImmutableList<MusicItem> immutableList, rdb rdb) {
        return rdc.n().a(false).a(immutableList.size()).b(0).a(immutableList).a(MusicItem.p).a(rdb).a((rdc) null).a();
    }

    public static rdc a(rdc rdc, int i, int i2) {
        a g = ImmutableList.g();
        int i3 = i2 + i;
        for (int i4 = i; i4 < i3; i4++) {
            g.c(rdc.a(i4));
        }
        return a(rdc.l(), rdc.k(), i, g.a(), rdc.f(), rdc.e());
    }

    private static rdc a(rdc rdc, rdc rdc2) {
        rdc g = rdc.g();
        return g == null ? rdc.h().a(rdc2).a() : rdc.h().a(a(g, rdc2)).a();
    }

    public static rdc a(boolean z, int i, int i2, ImmutableList<MusicItem> immutableList, rdb rdb, MusicItem musicItem) {
        return rdc.n().a(z).a(i).b(i2).a(immutableList).a(rdb).a(musicItem).a((rdc) null).a();
    }

    public static rdc b(ImmutableList<MusicItem> immutableList) {
        return a(immutableList, rdb.f);
    }
}
