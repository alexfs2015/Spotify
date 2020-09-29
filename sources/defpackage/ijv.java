package defpackage;

import android.content.Context;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/* renamed from: ijv reason: default package */
public final class ijv extends ikf {
    private final Context c;
    private final ijh d;
    private AppProtocol.Context e;
    private Disposable f;

    public ijv(Context context, hne hne, a aVar, ijh ijh) {
        super(hne, aVar);
        this.c = (Context) fay.a(context);
        this.d = ijh;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.f = this.d.a().c((Function<? super T, ? extends R>) new $$Lambda$ijv$eKbz2oHbHRnFlAOnvORjNhSnWE<Object,Object>(this)).a((Consumer<? super T>) new $$Lambda$ijv$AzF2Z5ulYmFI14H0uBvMPhA8KOI<Object>(this), (Consumer<? super Throwable>) $$Lambda$ijv$nr6YFVv_A49dpIfglOmunNVvh0.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ AppProtocol.Context a(ho hoVar) {
        if (hoVar.b == null) {
            return AppProtocol.Context.EMPTY;
        }
        return new AppProtocol.Context((tcf) fay.a(((ho) hoVar.b).b), (PlayerState) fay.a(((ho) hoVar.b).a), this.c);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        Disposable disposable = this.f;
        if (disposable != null && !disposable.b()) {
            this.f.bf_();
        }
    }

    public final void a(ija ija, int i) {
        AppProtocol.Context context = this.e;
        if (context != null) {
            a((Object) context);
            return;
        }
        if (this.f == null) {
            a();
        }
    }

    /* access modifiers changed from: private */
    public void a(AppProtocol.Context context) {
        if (!context.equals(this.e)) {
            this.e = context;
            a((Object) context);
        }
    }
}
