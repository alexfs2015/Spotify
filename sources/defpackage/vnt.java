package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: vnt reason: default package */
public final class vnt {
    public static kmw<vnu, vnr> a(vnu vnu) {
        return kmw.a(vnu, kmt.a(new a()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(vnu vnu, b bVar) {
        boolean z = bVar.a;
        if (vnu.a() instanceof c) {
            if (!z) {
                return kng.b(vnu.a(z).a(vnv.a((vnq) new b())));
            }
        } else if (vnu.a() instanceof b) {
            return kng.b(vnu.a(z).e().b(z).a());
        } else {
            vnq vnq = ((a) vnu.a()).a;
            if (z && (vnq instanceof b)) {
                return kng.a(vnu.a(z).a((vnv) new c()), kmt.a(new a()));
            }
        }
        return kng.b(vnu.a(z));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(vnu vnu, c cVar) {
        if (!vnu.f().isEmpty() || vnu.d()) {
            return kng.a(kmt.a(new c(vnu.f())));
        }
        return kng.a(kmt.a(new f()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(vnu vnu, f fVar) {
        if (vnu.a() instanceof a) {
            return kng.a(kmt.a(new b()));
        }
        return kng.a(kmt.a(new b(), new d(vnu.f())));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(vnu vnu, g gVar) {
        ArrayList arrayList = new ArrayList(((b) vnu.a()).a);
        int i = gVar.a;
        voe voe = (voe) arrayList.get(i);
        if (voe instanceof vog) {
            arrayList.set(i, ((vog) voe).a(false));
            return kng.b(vnu.a(vnv.a(ImmutableList.a((Collection<? extends E>) arrayList))));
        } else if (!(voe instanceof vof)) {
            return kng.e();
        } else {
            arrayList.set(i, ((vof) voe).a(false));
            return kng.b(vnu.a(vnv.a(ImmutableList.a((Collection<? extends E>) arrayList))));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(vnu vnu, h hVar) {
        ArrayList arrayList = new ArrayList(((b) vnu.a()).a);
        int i = hVar.a;
        voe voe = (voe) arrayList.get(i);
        if (voe instanceof vog) {
            arrayList.set(i, ((vog) voe).a(true));
            return kng.b(vnu.a(vnv.a(ImmutableList.a((Collection<? extends E>) arrayList))));
        } else if (!(voe instanceof vof)) {
            return kng.e();
        } else {
            arrayList.set(i, ((vof) voe).a(true));
            return kng.b(vnu.a(vnv.a(ImmutableList.a((Collection<? extends E>) arrayList))));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(vnu vnu, i iVar) {
        if (!(vnu.a() instanceof c)) {
            return kng.e();
        }
        return kng.a(vnu.a(vnv.a((vnq) new a())), kmt.a(new e()));
    }

    public static kng<vnu, vnr> a(vnu vnu, vns vns) {
        return (kng) vns.a(new $$Lambda$vnt$SvowhSvOguLnUNbWFGhl6eAxkC8(vnu), new $$Lambda$vnt$gb01uTZGY4rfH_712ZhRkAf0VPA(vnu), new $$Lambda$vnt$jrjSCgWADPuY_SRpX9rStW_g61I(vnu), new $$Lambda$vnt$M0VxxT3QdFiiNRKefe85giCBVBU(vnu), new $$Lambda$vnt$PsXrNYqcrkSfI_GgKNEFoZEuNQ0(vnu), new $$Lambda$vnt$0YCPAMBkNs_QMfFu13AzTaY9fE4(vnu), new $$Lambda$vnt$jugL7M1iqSOysvi1GDhJwcZMufM(vnu), new $$Lambda$vnt$yWGS_MQSwmKt76yLzLZIsGvkG30(vnu), new $$Lambda$vnt$BCqxK_RciL7rx8GDFORd5_ZHrYk(vnu), new $$Lambda$vnt$523L2nwS_jQZKl6gXWxPEn9to(vnu));
    }

    /* access modifiers changed from: private */
    public static kng<vnu, vnr> b(vnu vnu) {
        if ((vnu.a() instanceof a) || !vnu.b()) {
            return kng.a(kmt.a(new b()));
        }
        return kng.a(kmt.a(new f()));
    }
}
