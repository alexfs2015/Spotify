package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.cosmos.android.ResolverCallbackReceiver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.music.features.connect.dialogs.newdevice.NewDeviceActivity;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import java.nio.charset.Charset;

/* renamed from: mfx reason: default package */
public class mfx extends jpm implements defpackage.hhe.a<ConnectManager> {
    public heo T;
    public Scheduler U;
    private boolean V;
    private Observable<a> W;
    private Intent X;
    public hip a;
    private ConnectManager aa;
    private Disposable ab = Disposables.b();
    public FireAndForgetResolver b;

    /* renamed from: mfx$a */
    static class a {
        final GaiaDevice a;

        a(GaiaDevice gaiaDevice) {
            this.a = gaiaDevice;
        }
    }

    public static mfx a(fpt fpt) {
        mfx mfx = new mfx();
        fpu.a((Fragment) mfx, fpt);
        return mfx;
    }

    public final void a(Context context) {
        vts.a(this);
        super.a(context);
    }

    public final void g() {
        super.g();
        this.ab = this.W.a((Consumer<? super T>) new $$Lambda$mfx$h0NZzhcbXUiy8Zpuftuf1upy8<Object>(this), (Consumer<? super Throwable>) $$Lambda$mfx$Dp5Fros3dkeeAuUStIMLMXq8Ls.INSTANCE);
        this.a.a(this);
        this.a.a();
    }

    public final void h() {
        super.h();
        this.ab.bf_();
        hip hip = this.a;
        if (hip != null && hip.d()) {
            this.a.b(this);
            this.a.b();
        }
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        if (bundle != null) {
            this.V = bundle.getBoolean("dialog_queued", false);
        }
        Context n = n();
        IntentFilter intentFilter = new IntentFilter("com.spotify.mobile.android.service.broadcast.connect.CONNECT_ONBOARDING");
        intentFilter.addCategory("android.intent.category.DEFAULT");
        this.W = vun.b(heo.a(n, intentFilter, vun.a(this.U)).f($$Lambda$mfx$okBNXsIjGd6z9kiqafaiZL3nEs.INSTANCE));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ a a(ho hoVar) {
        return new a(hoVar.b != null ? (GaiaDevice) ((Intent) hoVar.b).getParcelableExtra("connect_device") : null);
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putBoolean("dialog_queued", this.V);
    }

    public final void c() {
        super.c();
        Intent intent = this.X;
        if (intent != null) {
            startActivityForResult(intent, this.Z);
        }
    }

    public final void e() {
        this.aa = null;
    }

    /* access modifiers changed from: private */
    public void a(a aVar) {
        GaiaDevice gaiaDevice = aVar.a;
        Logger.c("Spotify Connect: Onboarding request triggered", new Object[0]);
        ka p = p();
        if (p != null) {
            this.X = NewDeviceActivity.a(p, gaiaDevice);
            if (this.Y != null && !this.V) {
                this.V = true;
                this.Y.a((jpm) this);
            }
        }
    }

    public final void a(int i, int i2, Intent intent) {
        if ((intent != null && i2 == 0) || i2 == -1) {
            GaiaDevice gaiaDevice = (GaiaDevice) intent.getParcelableExtra("device");
            boolean z = i2 == -1;
            Request build = RequestBuilder.post("sp://connect/v1/reportflow").build();
            String identifier = gaiaDevice.getIdentifier();
            String str = z ? "1" : Ad.DEFAULT_SKIPPABLE_AD_DELAY;
            build.setBody(fau.a("\n").a(identifier, str, new Object[0]).getBytes(Charset.defaultCharset()));
            this.b.resolve(build, new ResolverCallbackReceiver(null, str) {
                private /* synthetic */ String a;

                {
                    this.a = r3;
                }

                public final void onResolved(Response response) {
                    Logger.c("Spotify Connect: Reporting onboarding flow as %s", this.a);
                }

                public final void onError(Throwable th) {
                    Logger.e(th, "Spotify Connect: Failed to report onboarding flow", new Object[0]);
                }
            });
            if (z) {
                String identifier2 = gaiaDevice.getIdentifier();
                if (this.aa != null) {
                    Logger.b("Transfer playback to onboarding device:%s", identifier2);
                    this.aa.c(identifier2);
                }
            }
        }
        super.a(i, i2, intent);
        this.V = false;
    }

    public final /* synthetic */ void a(Object obj) {
        this.aa = (ConnectManager) this.a.i();
    }
}
