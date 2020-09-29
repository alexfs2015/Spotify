package defpackage;

import com.spotify.libs.signup.validators.PasswordValidator;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Action;

/* renamed from: vmu reason: default package */
public final class vmu {
    private final PasswordValidator a;
    private final gmx b;
    private final vkd c;
    private final vnh d;
    private final boolean e;

    public vmu(PasswordValidator passwordValidator, gmx gmx, vkd vkd, vnh vnh, boolean z) {
        this.a = passwordValidator;
        this.b = gmx;
        this.c = vkd;
        this.d = vnh;
        this.e = z;
    }

    public final ObservableTransformer<vmp, vmq> a() {
        return klb.a().a(b.class, (Action) new $$Lambda$vmu$o58cYgOtcFR8BFVeU8DzqKoYwA(this), AndroidSchedulers.a()).a(a.class, (ObservableTransformer<G, E>) new $$Lambda$vmu$tV3Fjd3MZMicmVVY3rikVwThPBY<G,E>(this.a)).a(c.class, (ObservableTransformer<G, E>) new $$Lambda$vmu$nGBUIuBCJXknIhwok2FOVAzAXEs<G,E>(!this.e, this.b)).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.c.a().b();
        this.d.b();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(boolean z, gmx gmx, c cVar) {
        if (z) {
            return gmx.a(cVar.a).f(new $$Lambda$vmu$cVHbMzUlhoQIN9NRms2Wx2PKZdc(cVar)).d();
        }
        return Observable.b(vmq.a(cVar.a, new a(true, false, null)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ vmq a(PasswordValidator passwordValidator, a aVar) {
        return new a(aVar.a, passwordValidator.a(aVar.a));
    }
}
