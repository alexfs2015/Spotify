package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: vbf reason: default package */
public final class vbf {
    public static kjx<vbg, vbd> a(vbg vbg, vbe vbe) {
        return (kjx) vbe.a(new $$Lambda$vbf$SbR9ehRNC7sSVjWSZ4Uw92yHWk(vbg), new $$Lambda$vbf$GEPxz5pslfJ9iatwDuW3_pjFRlk(vbg), new $$Lambda$vbf$ywnXgviXfxOwmJnjIlP1Ys9bx0(vbg), new $$Lambda$vbf$u140Kq01GiVszgXNdndRjJ3nJE(vbg), new $$Lambda$vbf$uKVhbcg8K4HqUnGPIcPg6uka7c(vbg), new $$Lambda$vbf$l_proh5RRts_JiaQTAbv_JyYDtE(vbg), new $$Lambda$vbf$XSTWXSh_3RLbw2PvxOYzrZqu02k(vbg), new $$Lambda$vbf$7yqr_zIgWjOTytwlKuN9U9DweBo(vbg), new $$Lambda$vbf$AEdm8fFkWdRJffPuZntFJZhhNXI(vbg), new $$Lambda$vbf$lSbInPFjg9ltienaMY3MYdcy6U(vbg));
    }

    /* access modifiers changed from: private */
    public static kjx<vbg, vbd> b(vbg vbg) {
        if ((vbg.a() instanceof a) || !vbg.b()) {
            return kjx.a(kjk.a(new b()));
        }
        return kjx.a(kjk.a(new f()));
    }

    public static kjn<vbg, vbd> a(vbg vbg) {
        return kjn.a(vbg, kjk.a(new a()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(vbg vbg, b bVar) {
        boolean z = bVar.a;
        if (vbg.a() instanceof c) {
            if (!z) {
                return kjx.b(vbg.a(z).a(vbh.a((vbc) new b())));
            }
        } else if (vbg.a() instanceof b) {
            return kjx.b(vbg.a(z).e().b(z).a());
        } else {
            vbc vbc = ((a) vbg.a()).a;
            if (z && (vbc instanceof b)) {
                return kjx.a(vbg.a(z).a((vbh) new c()), kjk.a(new a()));
            }
        }
        return kjx.b(vbg.a(z));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(vbg vbg, f fVar) {
        if (vbg.a() instanceof a) {
            return kjx.a(kjk.a(new b()));
        }
        return kjx.a(kjk.a(new b(), new d(vbg.f())));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(vbg vbg, c cVar) {
        if (!vbg.f().isEmpty() || vbg.d()) {
            return kjx.a(kjk.a(new c(vbg.f())));
        }
        return kjx.a(kjk.a(new f()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(vbg vbg, g gVar) {
        ArrayList arrayList = new ArrayList(((b) vbg.a()).a);
        int i = gVar.a;
        vbq vbq = (vbq) arrayList.get(i);
        if (vbq instanceof vbs) {
            arrayList.set(i, ((vbs) vbq).a(false));
            return kjx.b(vbg.a(vbh.a(ImmutableList.a((Collection<? extends E>) arrayList))));
        } else if (!(vbq instanceof vbr)) {
            return kjx.e();
        } else {
            arrayList.set(i, ((vbr) vbq).a(false));
            return kjx.b(vbg.a(vbh.a(ImmutableList.a((Collection<? extends E>) arrayList))));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(vbg vbg, h hVar) {
        ArrayList arrayList = new ArrayList(((b) vbg.a()).a);
        int i = hVar.a;
        vbq vbq = (vbq) arrayList.get(i);
        if (vbq instanceof vbs) {
            arrayList.set(i, ((vbs) vbq).a(true));
            return kjx.b(vbg.a(vbh.a(ImmutableList.a((Collection<? extends E>) arrayList))));
        } else if (!(vbq instanceof vbr)) {
            return kjx.e();
        } else {
            arrayList.set(i, ((vbr) vbq).a(true));
            return kjx.b(vbg.a(vbh.a(ImmutableList.a((Collection<? extends E>) arrayList))));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(vbg vbg, i iVar) {
        if (!(vbg.a() instanceof c)) {
            return kjx.e();
        }
        return kjx.a(vbg.a(vbh.a((vbc) new a())), kjk.a(new e()));
    }
}
