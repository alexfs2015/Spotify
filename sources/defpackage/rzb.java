package defpackage;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/* renamed from: rzb reason: default package */
public final class rzb {
    public final ryk a;
    public final CompositeDisposable b;
    public final a c;
    private final ryd d;
    private final rzd e;
    private final ryz f;
    private final seb g;
    private Optional<ryy> h = Optional.e();

    public rzb(ryk ryk, ryd ryd, rzd rzd, ryz ryz, seb seb) {
        this.a = ryk;
        this.d = ryd;
        this.e = rzd;
        this.f = ryz;
        this.g = seb;
        this.b = new CompositeDisposable();
        this.c = new $$Lambda$rzb$Uyc29s8dCv7MsEAgN_5bNiM4wWE(this);
    }

    private void a() {
        this.h = Optional.e();
        this.g.c().a(3);
        Logger.b("Connect volume controls disabled", new Object[0]);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fqn fqn) {
        if (this.a.a((fqm<?>) ryq.a)) {
            this.b.a(this.d.a.d((Consumer<? super T>) new $$Lambda$rzb$qSFF98p7MV2MfezhfenWHTPZ2I<Object>(this)));
            this.b.a(this.d.b.d((Consumer<? super T>) new $$Lambda$rzb$h_KJl7NIkZkI0V2WckF24z432I8<Object>(this)));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Float f2) {
        if (this.h.b()) {
            ((ryy) this.h.c()).a(ryy.a(Float.valueOf(f2.floatValue())));
            return;
        }
        this.h = Optional.b(new ryy(this.f.a, f2.floatValue()));
        this.g.c().a((mp) this.h.c());
        Logger.b("Connect volume controls enabled", new Object[0]);
    }

    private static boolean a(GaiaDevice gaiaDevice) {
        return GaiaTypes.CAST_AUDIO == gaiaDevice.getType() || GaiaTypes.CAST_VIDEO == gaiaDevice.getType();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(GaiaDevice gaiaDevice) {
        if (a(gaiaDevice)) {
            a();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(GaiaDevice gaiaDevice) {
        if (gaiaDevice.isSelf()) {
            a();
            return;
        }
        if (!a(gaiaDevice)) {
            this.b.a(this.e.c().b(1).d((Consumer<? super T>) new $$Lambda$rzb$2My8_NxTJ8GkkgzK3UEFtV84y4<Object>(this)));
        }
    }
}
