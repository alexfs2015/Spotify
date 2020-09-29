package defpackage;

import com.spotify.music.features.nowplayingbar.domain.model.Accessory;

/* renamed from: nxz reason: default package */
public final class nxz implements kjd<nxd, nxd> {
    private final vol a;
    private final nxx b;
    private final wlc<nyc> c;

    /* renamed from: nxz$2 reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.nxz.AnonymousClass2.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(a aVar) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(c cVar) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(g gVar) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(i iVar) {
    }

    public nxz(wlc<nyc> wlc, vol vol, nxx nxx) {
        this.c = wlc;
        this.a = vol;
        this.b = nxx;
    }

    public final kje<nxd> connect(final kkn<nxd> kkn) {
        return new kje<nxd>() {
            public final void dispose() {
            }

            public final /* synthetic */ void accept(Object obj) {
                nxd nxd = (nxd) obj;
                nxd.a((gcs<f>) new $$Lambda$nxz$pNmM5gsdailZvw3lQ1v0P4vdIeA<f>(nxz.this), (gcs<d>) new $$Lambda$nxz$eR5d8RVVMqnJoUM4D1AiAakjIWY<d>(nxz.this), (gcs<h>) new $$Lambda$nxz$C5nRqTamBeV7z6n6yGBuUqPkrE<h>(nxz.this), (gcs<b>) new $$Lambda$nxz$NIbhu2NTTMvLu_u5kSSqQpWiUfE<b>(nxz.this), (gcs<e>) new $$Lambda$nxz$dxBvHtQkwMUMc1sou_n3D9GsMPM<e>(nxz.this), (gcs<g>) $$Lambda$nxz$HL03_QrKHe8uEp3bPgqYGjBqvtE.INSTANCE, (gcs<a>) $$Lambda$nxz$LyFDFEpbUDiNaRfW528JBwBgP2Q.INSTANCE, (gcs<c>) $$Lambda$nxz$4kuR86WfQMDbgI7Y8jK9y9TKaZA.INSTANCE, (gcs<i>) $$Lambda$nxz$UqEl4O0HP9bDVHbj92DKlYD5POE.INSTANCE);
                kkn.accept(nxd);
            }
        };
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(f fVar) {
        nyc nyc = (nyc) this.c.get();
        String a2 = nyc.a();
        if (nyc.c()) {
            this.a.a(this.b.b().a(a2));
        } else {
            this.a.a(this.b.b().b(a2));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(d dVar) {
        this.a.a(nxx.b(((nyc) this.c.get()).a()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(h hVar) {
        this.a.a(nxx.a(((nyc) this.c.get()).a()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        nyc nyc = (nyc) this.c.get();
        int i = AnonymousClass2.a[nyc.d().ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                a();
            }
        } else if (nyc.b()) {
            this.a.a(this.b.c().b(nyc.a()));
        } else {
            this.a.a(this.b.c().a(nyc.a()));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(e eVar) {
        a();
    }

    private void a() {
        this.a.a(nxx.a());
    }
}
