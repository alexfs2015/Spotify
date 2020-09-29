package defpackage;

import com.google.common.collect.Sets;
import com.spotify.music.features.nowplayingbar.domain.model.Accessory;
import java.util.HashSet;
import java.util.Set;

/* renamed from: nxe reason: default package */
public final class nxe {

    /* renamed from: nxe$1 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.nxe.AnonymousClass1.<clinit>():void");
        }
    }

    public static kjx<nxn, nxc> a(nxn nxn, nxd nxd) {
        return (kjx) nxd.a((gct<f, R_>) new $$Lambda$nxe$ZixMxR03EZxS1dwscFT_k1PGKQ<f,R_>(nxn), (gct<d, R_>) new $$Lambda$nxe$22zQJqZev1B2CLaZrZ7L2VsYQ1U<d,R_>(nxn), (gct<h, R_>) new $$Lambda$nxe$BLoHJqqwqNsgYGmu4xfYEpGddE<h,R_>(nxn), (gct<b, R_>) new $$Lambda$nxe$RLzA2S6jXRibF9S1PTTUOteXt3U<b,R_>(nxn), (gct<e, R_>) $$Lambda$nxe$Fmaxb_5eskyK3sVZ7p2MrBgIsL4.INSTANCE, (gct<g, R_>) new $$Lambda$nxe$2siGg_DVqqHOdacBxITxk0kqOY<g,R_>(nxn), (gct<a, R_>) new $$Lambda$nxe$3PMyJSNufnd48M5iowZJCZYfts<a,R_>(nxn), (gct<c, R_>) new $$Lambda$nxe$89tBsGTIROryFv4EmFZ_2mEpI<c,R_>(nxn), (gct<i, R_>) new $$Lambda$nxe$6LrcHE10RD4bB_d7oDMCYDMkjrI<i,R_>(nxn));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(nxn nxn, f fVar) {
        return (kjx) nxn.a().a($$Lambda$nxe$cHV4EsozczfieGhpxt5v3Y8TE.INSTANCE, $$Lambda$nxe$au4WvfiMjnNovXM5ZvkRz9CAiw.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(nxn nxn, d dVar) {
        return (kjx) nxn.a().a($$Lambda$nxe$4q05FE1okhVQbgsuykvcvkDwyVA.INSTANCE, $$Lambda$nxe$gI9nwG_XgeoaGaKTPVChzSHoZ1k.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(nxn nxn, h hVar) {
        return (kjx) nxn.a().a($$Lambda$nxe$1VTYvmty9eu_1aoF4VVX3M_pTNA.INSTANCE, $$Lambda$nxe$onwgiA1hyWn_dkfGMPGBkVi33g.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx b(b bVar) {
        if (bVar.d.d()) {
            return kjx.e();
        }
        return kjx.a(kjk.a(new f()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx c(b bVar) {
        if (bVar.d.c()) {
            return kjx.e();
        }
        HashSet a = Sets.a((E[]) new nxc[]{new e(), new g()});
        if (bVar.d.e()) {
            a.add(new h());
        }
        return kjx.a((Set<? extends F>) a);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx d(b bVar) {
        kjx kjx;
        if (bVar.c.a()) {
            if (bVar.d.b()) {
                kjx = kjx.e();
            } else {
                return kjx.a(kjk.a(new c()));
            }
        } else if (bVar.d.a()) {
            return kjx.e();
        } else {
            kjx = kjx.a(kjk.a(new d()));
        }
        return kjx;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(nxn nxn, b bVar) {
        int i = AnonymousClass1.a[nxn.b().ordinal()];
        if (i == 1) {
            return (kjx) nxn.a().a($$Lambda$nxe$Y5Q9Us4KQrWwXywg7oJ6ApnknM.INSTANCE, $$Lambda$nxe$h1yR2hPfeRsfNPxvUQEdH7TM5gM.INSTANCE);
        }
        if (i == 2 || i == 3) {
            return kjx.a(kjk.a(new b()));
        }
        StringBuilder sb = new StringBuilder("Unknown accessory type: ");
        sb.append(nxn.b());
        throw new IllegalArgumentException(sb.toString());
    }
}
