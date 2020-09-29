package defpackage;

import com.spotify.mobile.android.wrapped2019.stories.loading.StoryStatus;

/* renamed from: kee reason: default package */
public final class kee {
    public static kjx<kef, kec> a(kef kef, ked ked) {
        return (kjx) ked.a(new $$Lambda$kee$aLja8ApQHEB1y8_Zd1RKrBlYkmM(kef), new $$Lambda$kee$sWVKivR3Rhh8PXqiZq978j1VfU(kef), new $$Lambda$kee$EH6cWG2pZdyymuIsKdtnXtvPxUg(kef), new $$Lambda$kee$H6oQLtDTs8MrV4w4g76kXJqdYAA(kef), new $$Lambda$kee$EM6AQdJod_dzKK8cFMsiH4A3PSI(kef), new $$Lambda$kee$6m4KY16TwB3dwERxExL3URb8QdU(kef), new $$Lambda$kee$YlULANx7_O8sHAsxKRnYDWXitY(kef), new $$Lambda$kee$LYWAVYqaDH5pAkzORA89lFQJ2SE(kef), new $$Lambda$kee$lsWWKkcBJ58cCMvIoSjPUQBV4vQ(kef), new $$Lambda$kee$W4DX8n_9sUWxdwn688xjscrno0(kef), new $$Lambda$kee$ccbseMvkVtzx86nsmN0AM1VFYio(kef), $$Lambda$kee$4vkQZQD4FqFtrIckrDxVbWdRY.INSTANCE);
    }

    public static kjn<kef, kec> a(kef kef) {
        return kjn.a(kef, kjk.a(new f()));
    }

    /* access modifiers changed from: private */
    public static kjx<kef, kec> a(kef kef, keb keb, int i) {
        int i2 = (keb instanceof b ? -1 : 1) + i;
        if (kef.a().isEmpty() || i2 >= kef.a().size() || i2 < 0) {
            return kjx.e();
        }
        return kjx.a(kef.a(i2), kjk.a(kec.a(kei.a((kdo) kef.a().get(i), (kdo) kef.a().get(i2), keb, i))));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(kef kef, d dVar) {
        kef kef2;
        kdo g = kef.g();
        if (g == null) {
            return kjx.e();
        }
        if (kef.h() == StoryStatus.READY) {
            kef2 = kef;
        } else {
            kef2 = kef.a(new a().a(StoryStatus.LOADING).a(g).a());
        }
        return kjx.a(kef2, kjk.a(kec.a(kef.i())));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(kef kef, b bVar) {
        kei kei;
        boolean z = !kef.e();
        kdo g = kef.g();
        kef a = kef.f().b(z).a();
        if (g == null) {
            return kjx.a(a, kjk.a(kec.b(z)));
        }
        int c = kef.c();
        if (z) {
            kei = new a(g, c);
        } else {
            kei = new c(g, c);
        }
        return kjx.a(a, kjk.a(kec.b(z), kec.a(kei)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(kef kef, h hVar) {
        if (kef.h() != StoryStatus.READY) {
            return kjx.e();
        }
        return a(kef, new c(), kef.c());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(kef kef, e eVar) {
        if (kef.h() != StoryStatus.READY) {
            return kjx.e();
        }
        return a(kef, new b(), kef.c());
    }
}
