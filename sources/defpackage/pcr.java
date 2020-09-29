package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

/* renamed from: pcr reason: default package */
public final class pcr implements pcq {
    private final pcu b;
    private final pdn c;
    private final pdj d;
    private final pdf e;

    /* renamed from: pcr$a */
    interface a {
        pcx transform(b bVar);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ pcx b(defpackage.pcx.a aVar) {
        return aVar;
    }

    public pcr(pcu pcu, pdn pdn, pdj pdj, pdf pdf) {
        this.b = pcu;
        this.c = pdn;
        this.d = pdj;
        this.e = pdf;
    }

    public final Observable<pcw> fetch(String str) {
        return Observable.a((ObservableSource<? extends T1>) this.b.a(str).f(new $$Lambda$pcr$FAcEAtV5FrEipOR2oLeUtYRHc5s(this)).d(), (ObservableSource<? extends T2>) this.c.a(), (BiFunction<? super T1, ? super T2, ? extends R>) new $$Lambda$pcr$Kahw4uIzRf4NXbx5thMH89qoE4<Object,Object,Object>(this)).c((Function<? super T, ? extends R>) $$Lambda$pcr$JaIwVPVTxr3Wxu1IOI5ud7CjU.INSTANCE).a(Functions.a());
    }

    /* access modifiers changed from: private */
    public pcx a(pcx pcx) {
        return a(pcx, (a) new $$Lambda$pcr$xu94gtGhstk99Lzxp0Iv2J0Pl4A(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ pcx b(b bVar) {
        pdf pdf = this.e;
        return pcx.a(pdf.a.a(bVar.a));
    }

    /* access modifiers changed from: private */
    public pcx a(pcx pcx, pdm pdm) {
        return a(pcx, (a) new $$Lambda$pcr$ultvlAmL1RxOkqahnYZH_ew4(this, pdm));
    }

    private static pcx a(pcx pcx, a aVar) {
        $$Lambda$pcr$co7B3D2hK1omNsFYnpjzlrUP7R8 r0 = $$Lambda$pcr$co7B3D2hK1omNsFYnpjzlrUP7R8.INSTANCE;
        aVar.getClass();
        return (pcx) pcx.a(r0, new $$Lambda$gKFR_M9PHFCvmFi15HKBs82b1M4(aVar));
    }

    /* access modifiers changed from: private */
    public static pcw b(pcx pcx) {
        return (pcw) pcx.a($$Lambda$pcr$zLYYSvM2DmGfhqGrrRdeyc28VH0.INSTANCE, $$Lambda$pcr$mMkOQvbdETeMlNJ4HFOVHubVTGw.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ pcw a(b bVar) {
        return new c(bVar.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ pcx a(pdm pdm, b bVar) {
        return pcx.a(pdj.a(bVar.a, pdm));
    }
}
