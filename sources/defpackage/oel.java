package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.nowplayingbar.domain.model.Accessory;

/* renamed from: oel reason: default package */
public final class oel implements kmm<odq, odq> {
    private final wbt a;
    private final oej b;
    private Optional<oeo> c = Optional.e();

    /* renamed from: oel$2 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.oel.AnonymousClass2.<clinit>():void");
        }
    }

    public oel(wbt wbt, oej oej) {
        this.a = wbt;
        this.b = oej;
    }

    private void a() {
        this.a.a(oej.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(a aVar) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(c cVar) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(e eVar) {
        a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(g gVar) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(i iVar) {
    }

    static /* synthetic */ void a(oel oel, odq odq) {
        if (oel.c.b()) {
            oeo oeo = (oeo) oel.c.c();
            odq.a((ged<f>) new $$Lambda$oel$xK8Vf_951PQNauwCi9yVGG4gdKM<f>(oel, oeo), (ged<d>) new $$Lambda$oel$G5OJiIRqelmbn1sRTrwiZA0N9JI<d>(oel, oeo), (ged<h>) new $$Lambda$oel$nBJkOZfqoYQBzQ5c6iHd9RGpqhA<h>(oel, oeo), (ged<b>) new $$Lambda$oel$Ykzf2MXkLcVdCAAQqW8iiArO0_w<b>(oel, oeo), (ged<e>) new $$Lambda$oel$9xZ6DwyP1SbgDSMza0plePp_TNU<e>(oel), (ged<g>) $$Lambda$oel$hjdNoxcxHM1Z56uHss9jFPbXbI.INSTANCE, (ged<a>) $$Lambda$oel$ugxB7gO0kdnbF3SbSwNcNxkxTPs.INSTANCE, (ged<c>) $$Lambda$oel$8Y1TjiWO8t4ohR2nyFoaxNc8qVI.INSTANCE, (ged<i>) $$Lambda$oel$U2SInEJkCWlmD16SZePefGzXgTI.INSTANCE);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(oeo oeo, b bVar) {
        int i = AnonymousClass2.a[oeo.d().ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                a();
            }
        } else if (oeo.b()) {
            this.a.a(this.b.c().b(oeo.a()));
        } else {
            this.a.a(this.b.c().a(oeo.a()));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(oeo oeo, d dVar) {
        this.a.a(oej.b(oeo.a()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(oeo oeo, f fVar) {
        String a2 = oeo.a();
        if (oeo.c()) {
            this.a.a(this.b.b().a(a2));
        } else {
            this.a.a(this.b.b().b(a2));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(oeo oeo, h hVar) {
        this.a.a(oej.a(oeo.a()));
    }

    public final void a(oeo oeo) {
        this.c = Optional.c(oeo);
    }

    public final kmn<odq> connect(final knw<odq> knw) {
        return new kmn<odq>() {
            public final /* synthetic */ void accept(Object obj) {
                odq odq = (odq) obj;
                oel.a(oel.this, odq);
                knw.accept(odq);
            }

            public final void dispose() {
            }
        };
    }
}
