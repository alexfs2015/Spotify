package defpackage;

import com.spotify.mobile.android.util.Assertion;

/* renamed from: pfz reason: default package */
public final class pfz {
    public static kjn<pga, pfx> a(pga pga) {
        return (kjn) pga.a(new $$Lambda$pfz$J5d7Dyl29pL8W2dWaNxUNOt5fY(pga), $$Lambda$pfz$V4kEf12Mq6jARDXcT0SKnHzkoE.INSTANCE, new $$Lambda$pfz$wlv3hvbOrLj87l8iacGKKkYKLY(pga));
    }

    public static kjx<pga, pfx> a(pga pga, pfy pfy) {
        return (kjx) pfy.a(new $$Lambda$pfz$kPOoZTN0n34sGtu62aImJUdjs(pga), new $$Lambda$pfz$Dbrr6Q2GYf7UljEIaA4WS0eRzk(pga), new $$Lambda$pfz$sa0gmumYmtW3_GBkO9RADjJadG0(pga), new $$Lambda$pfz$19AYKosTYHSq78A9_4UOXi1yKXE(pga), new $$Lambda$pfz$IwLckyNTtfwpoJyKgM3qcLo1a8(pga), new $$Lambda$pfz$ew9f66adT6XRtOUT9NrH9BAslb4(pga));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(pga pga, f fVar) {
        if (!"premium".equals(fVar.a)) {
            return kjx.e();
        }
        return kjx.a(kjk.a(new d()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(pga pga, e eVar) {
        if (!(pga instanceof c) || ((c) pga).a) {
            return kjx.e();
        }
        return kjx.b(pga.a(true));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(pga pga, a aVar) {
        if (pga instanceof b) {
            Assertion.b("backendRequestFailed when model is loaded");
            return kjx.e();
        } else if ((pga instanceof a) && ((a) pga).a == aVar.a) {
            return kjx.e();
        } else {
            a aVar2 = new a(aVar.a);
            if (!(pga instanceof c)) {
                return kjx.b(aVar2);
            }
            return kjx.a(aVar2, kjk.a(pfx.a(aVar2)));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(pga pga, b bVar) {
        if (pga instanceof b) {
            Assertion.b("backendViewModelReceived when model is loaded");
            return kjx.e();
        }
        gzz gzz = bVar.a;
        pga a = pga.a(gzz);
        if (pga instanceof c) {
            return kjx.a(a, kjk.a(pfx.a(gzz, bVar.b), pfx.a(a)));
        }
        return kjx.a(a, kjk.a(pfx.a(gzz, bVar.b)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(pga pga, c cVar) {
        if (pga instanceof b) {
            Assertion.b("cacheMiss when model is loaded");
            return kjx.e();
        }
        return kjx.a(kjk.a(new a()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(pga pga, d dVar) {
        if (pga instanceof b) {
            Assertion.b("cacheViewModelReceived when model is loaded.");
            return kjx.e();
        }
        if (!(dVar.b <= 0)) {
            return kjx.b(pga.a(dVar.a));
        }
        return kjx.a(kjk.a(new a()));
    }
}
