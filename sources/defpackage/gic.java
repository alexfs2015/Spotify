package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import com.spotify.music.features.connect.dialogs.SwitchDeviceActivity;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Consumer;

/* renamed from: gic reason: default package */
public final class gic {
    private final gig a;
    private final gif b;
    private final gie c;

    public gic(gig gig, gif gif, gie gie) {
        this.a = gig;
        this.b = gif;
        this.c = gie;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ghz a(GaiaDevice gaiaDevice) {
        return new e();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ghz a(gie gie, GaiaDevice gaiaDevice) {
        return new a(gaiaDevice.getIdentifier(), gie.a(gaiaDevice));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ghz a(Throwable th) {
        return new d();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        gig gig = this.a;
        GaiaDevice a2 = this.c.a(bVar.a);
        Intent intent = new Intent(gig.a, SwitchDeviceActivity.class);
        intent.putExtra("active_device", a2);
        gig.a.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ghz b(Throwable th) {
        return new d();
    }

    public final ObservableTransformer<ghy, ghz> a() {
        return kok.a().a(a.class, (ObservableTransformer<G, E>) new $$Lambda$gic$Lm16xtTTnHCiSbqQ25Y3q0pyyqQ<G,E>(this.b, this.c)).a(c.class, (ObservableTransformer<G, E>) new $$Lambda$gic$2Na46S3wBIyY6hVIsfeMU9aSS1k<G,E>(this.b)).a(b.class, (Consumer<G>) new $$Lambda$gic$Au2sQzWVBMh_9QHXdNTyLeQwQdo<G>(this)).a();
    }
}
