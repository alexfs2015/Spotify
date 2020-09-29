package defpackage;

import com.spotify.mobile.android.wrapped2019.stories.loading.StoryStatus;

/* renamed from: kgg reason: default package */
public final class kgg {
    public static kmw<kgh, kge> a(kgh kgh) {
        return kmw.a(kgh, kmt.a(new f()));
    }

    /* access modifiers changed from: private */
    public static kng<kgh, kge> a(kgh kgh, kgd kgd, int i) {
        int i2 = (kgd instanceof b ? -1 : 1) + i;
        if (kgh.a().isEmpty() || i2 >= kgh.a().size() || i2 < 0) {
            return kng.e();
        }
        return kng.a(kgh.a(i2), kmt.a(kge.a(kgk.a((kfp) kgh.a().get(i), (kfp) kgh.a().get(i2), kgd, i))));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(kgh kgh, b bVar) {
        boolean z = !kgh.e();
        kfp g = kgh.g();
        kgh a = kgh.f().b(z).a();
        if (g == null) {
            return kng.a(a, kmt.a(kge.b(z)));
        }
        int c = kgh.c();
        return kng.a(a, kmt.a(kge.b(z), kge.a(z ? new a(g, c) : new c(g, c))));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(kgh kgh, d dVar) {
        kfp g = kgh.g();
        if (g == null) {
            return kng.e();
        }
        return kng.a(kgh.h() == StoryStatus.READY ? kgh : kgh.a(new a().a(StoryStatus.LOADING).a(g).a()), kmt.a(kge.a(kgh.i())));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(kgh kgh, e eVar) {
        return kgh.h() != StoryStatus.READY ? kng.e() : a(kgh, new b(), kgh.c());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(kgh kgh, h hVar) {
        return kgh.h() != StoryStatus.READY ? kng.e() : a(kgh, new c(), kgh.c());
    }

    public static kng<kgh, kge> a(kgh kgh, kgf kgf) {
        return (kng) kgf.a(new $$Lambda$kgg$JRxgJ993OOZnuAzrnpqAALliwc(kgh), new $$Lambda$kgg$_ur1hXVcuI96uP6fc5hr5DkZJA(kgh), new $$Lambda$kgg$xEZezBjiMHRBCHWzGBLDebQGI(kgh), new $$Lambda$kgg$0jDz9WalchIsHMzHwz8mDV08RAc(kgh), new $$Lambda$kgg$4Dt1DJCHraZRPo9HY049JKtootQ(kgh), new $$Lambda$kgg$9EL9RJNdLiA0SEBLUP5VNMc20PU(kgh), new $$Lambda$kgg$H_22aypk8j8PTdMfOuq3PaS1Q(kgh), new $$Lambda$kgg$6fYAZ57fC_Z_cKCXShskAvjlHoU(kgh), new $$Lambda$kgg$lGeldouiyY8XuRPLnRVBDPWpKc(kgh), new $$Lambda$kgg$q8iQLJyqmiQPvvtvhGW5jzdpGIM(kgh), new $$Lambda$kgg$JSGNLmBpjgUmV7TN8PZYA8cRP_c(kgh), $$Lambda$kgg$LYFo0DTWEug__32T7Gt3XlRtRrY.INSTANCE);
    }
}
