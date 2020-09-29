package defpackage;

import com.google.common.collect.Sets;
import com.spotify.music.features.nowplayingbar.domain.model.Accessory;
import java.util.HashSet;
import java.util.Set;

/* renamed from: odr reason: default package */
public final class odr {

    /* renamed from: odr$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[Accessory.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.music.features.nowplayingbar.domain.model.Accessory[] r0 = com.spotify.music.features.nowplayingbar.domain.model.Accessory.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.features.nowplayingbar.domain.model.Accessory r1 = com.spotify.music.features.nowplayingbar.domain.model.Accessory.HEART     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.features.nowplayingbar.domain.model.Accessory r1 = com.spotify.music.features.nowplayingbar.domain.model.Accessory.CHEVRON     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.music.features.nowplayingbar.domain.model.Accessory r1 = com.spotify.music.features.nowplayingbar.domain.model.Accessory.VIDEO     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.odr.AnonymousClass1.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(oea oea, b bVar) {
        int i = AnonymousClass1.a[oea.b().ordinal()];
        if (i == 1) {
            return (kng) oea.a().a($$Lambda$odr$F6P0RcHFmG1Tm0kfZZmEKvFGvQ0.INSTANCE, $$Lambda$odr$VnQUXIMw7Kv9D6ahqfwkyYujS5c.INSTANCE);
        }
        if (i == 2 || i == 3) {
            return kng.a(kmt.a(new b()));
        }
        StringBuilder sb = new StringBuilder("Unknown accessory type: ");
        sb.append(oea.b());
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(oea oea, d dVar) {
        return (kng) oea.a().a($$Lambda$odr$E0r6dRkF714tBvzVlqfS5BZVS64.INSTANCE, $$Lambda$odr$P8BU2a7TRKOu9dy0o8QOcrD34_0.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(oea oea, f fVar) {
        return (kng) oea.a().a($$Lambda$odr$NilLwpgtSkF9K4v27GU1GukCwU.INSTANCE, $$Lambda$odr$Y1XGL0fgSHfkrlSoNvQDzggVokg.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(oea oea, h hVar) {
        return (kng) oea.a().a($$Lambda$odr$xwzu3G3xwmlRHl3GiAmZ1Vdg4Bs.INSTANCE, $$Lambda$odr$m8Je_mRJxhrC5MXcPqj6Ozx3M7A.INSTANCE);
    }

    public static kng<oea, odp> a(oea oea, odq odq) {
        return (kng) odq.a((gee<f, R_>) new $$Lambda$odr$COlE3w6VmH0rUV_plfvNZBN5Jas<f,R_>(oea), (gee<d, R_>) new $$Lambda$odr$8Mmt5HDQ8xkcSftoLAekWrEADg<d,R_>(oea), (gee<h, R_>) new $$Lambda$odr$MK1Aicy1EeUVvDTUDtPOceYUAvo<h,R_>(oea), (gee<b, R_>) new $$Lambda$odr$icd32EUy_NxV_k_jdbKcsKZ_uzQ<b,R_>(oea), (gee<e, R_>) $$Lambda$odr$sC8C8zqXlorlkvAP6KRFDjuhW44.INSTANCE, (gee<g, R_>) new $$Lambda$odr$4xTC2B7MFS0o2oLHDil32XbMS8<g,R_>(oea), (gee<a, R_>) new $$Lambda$odr$dyOn69wV1pqlIKzJKw7l5BTszo<a,R_>(oea), (gee<c, R_>) new $$Lambda$odr$rDd45I06HcxvrgtrhziDBTy0Z0<c,R_>(oea), (gee<i, R_>) new $$Lambda$odr$QAYagUnvaFNvQCsgsL2lWMd5cmw<i,R_>(oea));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng b(b bVar) {
        if (bVar.d.d()) {
            return kng.e();
        }
        return kng.a(kmt.a(new f()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng c(b bVar) {
        if (bVar.d.c()) {
            return kng.e();
        }
        HashSet a = Sets.a((E[]) new odp[]{new e(), new g()});
        if (bVar.d.e()) {
            a.add(new h());
        }
        return kng.a((Set<? extends F>) a);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng d(b bVar) {
        kng kng;
        if (bVar.c.a()) {
            if (bVar.d.b()) {
                kng = kng.e();
            } else {
                return kng.a(kmt.a(new c()));
            }
        } else if (bVar.d.a()) {
            return kng.e();
        } else {
            kng = kng.a(kmt.a(new d()));
        }
        return kng;
    }
}
