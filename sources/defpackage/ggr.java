package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import com.spotify.music.features.connect.dialogs.SwitchDeviceActivity;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Consumer;

/* renamed from: ggr reason: default package */
public final class ggr {
    private final ggv a;
    private final ggu b;
    private final ggt c;

    public ggr(ggv ggv, ggu ggu, ggt ggt) {
        this.a = ggv;
        this.b = ggu;
        this.c = ggt;
    }

    public final ObservableTransformer<ggn, ggo> a() {
        return klb.a().a(a.class, (ObservableTransformer<G, E>) new $$Lambda$ggr$JCcj_BjJLudmb6_rnEEeWYNf3Fc<G,E>(this.b, this.c)).a(c.class, (ObservableTransformer<G, E>) new $$Lambda$ggr$8fUSzjXXc7LiE7mOOs5jNNB5EI<G,E>(this.b)).a(b.class, (Consumer<G>) new $$Lambda$ggr$_qoSjUDb0Eqxz2BmNPbmGtAXHiY<G>(this)).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        ggv ggv = this.a;
        GaiaDevice a2 = this.c.a(bVar.a);
        Intent intent = new Intent(ggv.a, SwitchDeviceActivity.class);
        intent.putExtra("active_device", a2);
        ggv.a.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ggo a(ggt ggt, GaiaDevice gaiaDevice) {
        return new a(gaiaDevice.getIdentifier(), ggt.a(gaiaDevice));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ggo a(Throwable th) {
        return new d();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ggo a(GaiaDevice gaiaDevice) {
        return new e();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ggo b(Throwable th) {
        return new d();
    }
}
