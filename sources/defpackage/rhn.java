package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.a;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.b;

/* renamed from: rhn reason: default package */
public final class rhn {
    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(rho rho, a aVar) {
        rho a = rho.i().a(Optional.b(Boolean.valueOf(aVar.a))).a();
        if (a.c() && !((Boolean) a.h().a(Boolean.FALSE)).booleanValue()) {
            a = a.a(false);
        }
        a j = ImmutableSet.j();
        if (a(a)) {
            a = a.a(true);
            j.b(b(a));
        }
        return kng.a(c(a), j.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(rho rho, d dVar) {
        rho a = rho.i().a(dVar.a).a();
        a j = ImmutableSet.j();
        if (a(a)) {
            a = a.a(true);
            j.b(b(a));
        }
        return kng.a(c(a), j.a());
    }

    public static kng<rho, rhl> a(rho rho, rhm rhm) {
        return (kng) rhm.a(new $$Lambda$rhn$QPcmxst5YOenp_TPTZyHFrO7Ygo(rho), new $$Lambda$rhn$p7teIsiL4IeWJz1rAY2h55U0PLI(rho), new $$Lambda$rhn$ONti03YbcXOc9LZtNdfTm0L7Hk(rho), new $$Lambda$rhn$wvvq9WL2_3M0_MZWEzu2Ar3lZfI(rho));
    }

    private static boolean a(rho rho) {
        return !rho.c() && rho.e().isEmpty() && !rho.d().isEmpty() && rho.d().size() < rho.b() && ((Boolean) rho.h().a(Boolean.FALSE)).booleanValue();
    }

    private static rhl b(rho rho) {
        return rhl.a(50, rho.d(), ImmutableList.d());
    }

    private static rho c(rho rho) {
        int size = rho.d().size();
        if (size == 0 || size >= rho.b()) {
            return rho.a(ImmutableList.d());
        }
        int b = rho.b() - size;
        int i = 0;
        ImmutableList.a g = ImmutableList.g();
        fdz R_ = rho.f().R_();
        while (R_.hasNext()) {
            MusicItem musicItem = (MusicItem) R_.next();
            if (musicItem.v() && !musicItem.w().b() && !rho.d().contains(musicItem.j())) {
                g.c(musicItem.r().a((b) musicItem.w().k().f(((Boolean) rho.h().a(Boolean.TRUE)).booleanValue()).a()).b(i).a());
                i++;
                if (i == b) {
                    break;
                }
            }
        }
        return rho.a(g.a());
    }
}
