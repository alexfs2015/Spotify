package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;
import com.google.common.collect.ImmutableSet;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.b;

/* renamed from: qyy reason: default package */
public final class qyy {
    public static kjx<qyz, qyw> a(qyz qyz, qyx qyx) {
        return (kjx) qyx.a(new $$Lambda$qyy$dUPsmiSqKo4G9RDiq2oILDXQvaI(qyz), new $$Lambda$qyy$annwW90FEEqdF9jR9mXmZ9oldUQ(qyz), new $$Lambda$qyy$KT31Nl_4wXdbrPYGLEP8jMuvUq4(qyz), new $$Lambda$qyy$gDllkAHlEItJXV3w_wzUx9YJ72U(qyz));
    }

    private static boolean a(qyz qyz) {
        return !qyz.c() && qyz.e().isEmpty() && !qyz.d().isEmpty() && qyz.d().size() < qyz.b() && ((Boolean) qyz.h().a(Boolean.FALSE)).booleanValue();
    }

    private static qyw b(qyz qyz) {
        return qyw.a(50, qyz.d(), ImmutableList.d());
    }

    private static qyz c(qyz qyz) {
        int size = qyz.d().size();
        if (size == 0 || size >= qyz.b()) {
            return qyz.a(ImmutableList.d());
        }
        int b = qyz.b() - size;
        int i = 0;
        a g = ImmutableList.g();
        fdh R_ = qyz.f().R_();
        while (R_.hasNext()) {
            MusicItem musicItem = (MusicItem) R_.next();
            if (musicItem.v() && !musicItem.w().b() && !qyz.d().contains(musicItem.j())) {
                g.c(musicItem.r().a((b) musicItem.w().k().f(((Boolean) qyz.h().a(Boolean.TRUE)).booleanValue()).a()).b(i).a());
                i++;
                if (i == b) {
                    break;
                }
            }
        }
        return qyz.a(g.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(qyz qyz, a aVar) {
        qyz a = qyz.i().a(Optional.b(Boolean.valueOf(aVar.a))).a();
        if (a.c() && !((Boolean) a.h().a(Boolean.FALSE)).booleanValue()) {
            a = a.a(false);
        }
        ImmutableSet.a j = ImmutableSet.j();
        if (a(a)) {
            a = a.a(true);
            j.b(b(a));
        }
        return kjx.a(c(a), j.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(qyz qyz, d dVar) {
        qyz a = qyz.i().a(dVar.a).a();
        ImmutableSet.a j = ImmutableSet.j();
        if (a(a)) {
            a = a.a(true);
            j.b(b(a));
        }
        return kjx.a(c(a), j.a());
    }
}
