package defpackage;

import android.content.Context;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/* renamed from: imi reason: default package */
public final class imi extends ims {
    private final Context c;
    private final ilu d;
    private AppProtocol.Context e;
    private Disposable f;

    public imi(Context context, hpt hpt, a aVar, ilu ilu) {
        super(hpt, aVar);
        this.c = (Context) fbp.a(context);
        this.d = ilu;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ AppProtocol.Context a(ho hoVar) {
        return hoVar.b == null ? AppProtocol.Context.EMPTY : new AppProtocol.Context((tmm) fbp.a(((ho) hoVar.b).b), (PlayerState) fbp.a(((ho) hoVar.b).a), this.c);
    }

    /* access modifiers changed from: private */
    public void a(AppProtocol.Context context) {
        if (!context.equals(this.e)) {
            this.e = context;
            a((Object) context);
        }
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.f = this.d.a().c((Function<? super T, ? extends R>) new $$Lambda$imi$a502kAljr8vf3SN6jJfCc0xofA<Object,Object>(this)).a((Consumer<? super T>) new $$Lambda$imi$j1c3nLe_WAfHCXt17CZ_HFyJAeQ<Object>(this), (Consumer<? super Throwable>) $$Lambda$imi$p7w4bJ2V4FKyDtdtzuvJKIaYxs0.INSTANCE);
    }

    public final void a(iln iln, int i) {
        AppProtocol.Context context = this.e;
        if (context != null) {
            a((Object) context);
            return;
        }
        if (this.f == null) {
            a();
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        Disposable disposable = this.f;
        if (disposable != null && !disposable.b()) {
            this.f.bd_();
        }
    }
}
