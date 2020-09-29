package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;

/* renamed from: quo reason: default package */
public final class quo {
    public static qun b(ImmutableList<MusicItem> immutableList) {
        return a(immutableList, qum.f);
    }

    public static qun a(ImmutableList<MusicItem> immutableList, qum qum) {
        return qun.n().a(false).a(immutableList.size()).b(0).a(immutableList).a(MusicItem.p).a(qum).a((qun) null).a();
    }

    public static qun a(boolean z, int i, int i2, ImmutableList<MusicItem> immutableList, qum qum, MusicItem musicItem) {
        return qun.n().a(z).a(i).b(i2).a(immutableList).a(qum).a(musicItem).a((qun) null).a();
    }

    public static qun a(qun qun, int i, int i2) {
        a g = ImmutableList.g();
        int i3 = i2 + i;
        for (int i4 = i; i4 < i3; i4++) {
            g.c(qun.a(i4));
        }
        return a(qun.l(), qun.k(), i, g.a(), qun.f(), qun.e());
    }

    private static qun a(qun qun, qun qun2) {
        qun g = qun.g();
        if (g == null) {
            return qun.h().a(qun2).a();
        }
        return qun.h().a(a(g, qun2)).a();
    }

    public static qun a(ImmutableList<qun> immutableList) {
        qun qun = qun.h;
        for (int size = immutableList.size() - 1; size >= 0; size--) {
            qun qun2 = (qun) immutableList.get(size);
            if (qun.equals(qun.h)) {
                qun = qun2;
            } else {
                qun = a(qun2, qun);
            }
        }
        return qun;
    }
}
