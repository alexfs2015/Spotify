package defpackage;

import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/* renamed from: vyu reason: default package */
public final class vyu {
    private final vyw a;
    private final vxe b;
    private final wan c;
    private final vyz d;
    private final vzs e;
    private final wao f;

    public vyu(vyw vyw, vxe vxe, wan wan, vyz vyz, vzs vzs, wao wao) {
        this.a = vyw;
        this.b = vxe;
        this.c = wan;
        this.d = vyz;
        this.e = vzs;
        this.f = wao;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ vyq a(g gVar, vyx vyx) {
        return new f(vyx, gVar.b);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ vyx a(g gVar, Throwable th) {
        return new a(gVar.a);
    }

    /* access modifiers changed from: private */
    public void a(a aVar) {
        this.e.a(aVar.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(c cVar) {
        this.b.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(e eVar) {
        this.d.a(eVar.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(f fVar) {
        this.f.a(fVar.a);
    }

    public final ObservableTransformer<vyp, vyq> a() {
        wan wan = this.c;
        wan.getClass();
        vyz vyz = this.d;
        vyz.getClass();
        return kok.a().a(b.class, (Action) new $$Lambda$EB8L1MCRVraCQV6HHmLkjEBHvM4(wan), AndroidSchedulers.a()).a(d.class, (Action) new $$Lambda$_buwskTW3XkOezCceWIB6Mn0WQ8(vyz), AndroidSchedulers.a()).a(f.class, (Consumer<G>) new $$Lambda$vyu$ZPm2P4lfcPEV6S_6EH7qZ07RBo<G>(this), AndroidSchedulers.a()).a(e.class, (Consumer<G>) new $$Lambda$vyu$NyDdtegNyZz3Ray1hlENcf7lLvQ<G>(this), AndroidSchedulers.a()).a(c.class, (Consumer<G>) new $$Lambda$vyu$lLekDRZsH5aQxPik2EVpDa1_h7s<G>(this)).a(a.class, (Consumer<G>) new $$Lambda$vyu$hE7VhRCaso_sG8wKUoUhlR_NYfg<G>(this), AndroidSchedulers.a()).a(g.class, (ObservableTransformer<G, E>) new $$Lambda$vyu$LRubO2qXtwTTIJWgUzNEEXiri9k<G,E>(this.a)).a();
    }
}
