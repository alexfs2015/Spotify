package defpackage;

import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/* renamed from: vlo reason: default package */
public final class vlo {
    private final vlq a;
    private final vjy b;
    private final vnh c;
    private final vlt d;
    private final vmm e;
    private final vni f;

    public vlo(vlq vlq, vjy vjy, vnh vnh, vlt vlt, vmm vmm, vni vni) {
        this.a = vlq;
        this.b = vjy;
        this.c = vnh;
        this.d = vlt;
        this.e = vmm;
        this.f = vni;
    }

    public final ObservableTransformer<vlj, vlk> a() {
        vnh vnh = this.c;
        vnh.getClass();
        vlt vlt = this.d;
        vlt.getClass();
        return klb.a().a(b.class, (Action) new $$Lambda$QPea7LreyfRkCdCsUgpD7BzFUag(vnh), AndroidSchedulers.a()).a(d.class, (Action) new $$Lambda$Aszu1TxGu6yNPWVsNSFWrfhd6M(vlt), AndroidSchedulers.a()).a(f.class, (Consumer<G>) new $$Lambda$vlo$9Ejv_kLJXOhWqLhgiuIH0oIToKw<G>(this), AndroidSchedulers.a()).a(e.class, (Consumer<G>) new $$Lambda$vlo$2oeFVfm6kjhSkCS7h_BT3i34G8<G>(this), AndroidSchedulers.a()).a(c.class, (Consumer<G>) new $$Lambda$vlo$IhjbFyxTaShj4lE0PfBGx1nw13A<G>(this)).a(a.class, (Consumer<G>) new $$Lambda$vlo$x7z7cu6paaBdQKD1FaBqWOOs5ik<G>(this), AndroidSchedulers.a()).a(g.class, (ObservableTransformer<G, E>) new $$Lambda$vlo$whKiuFMEdnynUfESFUvWwC7y2DA<G,E>(this.a)).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(f fVar) {
        this.f.a(fVar.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(e eVar) {
        this.d.a(eVar.a);
    }

    /* access modifiers changed from: private */
    public void a(a aVar) {
        this.e.a(aVar.a);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ vlk a(g gVar, vlr vlr) {
        return new f(vlr, gVar.b);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ vlr a(g gVar, Throwable th) {
        return new a(gVar.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(c cVar) {
        this.b.a();
    }
}
