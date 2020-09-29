package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.ads.voice.VoiceAdService;
import com.spotify.nowplaying.ui.components.controls.playpause.PlayPauseButton;
import io.reactivex.disposables.CompositeDisposable;

/* renamed from: thi reason: default package */
public final class thi implements ServiceConnection, a, a, a<Ad> {
    public final tgy a;
    public final CompositeDisposable b = new CompositeDisposable();
    public thn c;
    public thm d;
    public PlayPauseButton e;
    private final szp f;
    private final krn g;
    private VoiceAdService h;
    /* access modifiers changed from: private */
    public boolean i;
    private String j;
    private kqu k;

    public thi(tgy tgy, szp szp, krn krn, a aVar) {
        this.a = tgy;
        this.f = szp;
        this.g = krn;
        aVar.a(new c() {
            public final void a() {
                if (thi.this.i) {
                    thi.this.d.e();
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(krf krf) {
        Logger.b("[VoiceAd] Mobius model emitted: %s", krf);
        new Handler(Looper.getMainLooper()).post(new $$Lambda$thi$wNnrjgKCrNEEpRRIOM0FwChK_qw(this, krf));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(krf krf) {
        if ((krf.a() instanceof c) || (krf.a() instanceof a)) {
            this.c.b(false);
        } else if (krf.a() instanceof b) {
            this.c.b(true);
            this.e.setEnabled(false);
        }
        if (krf.f()) {
            this.f.a(krf.b().g());
        }
    }

    public final void a() {
        kqu kqu = this.k;
        if (kqu != null) {
            kqu.b.a(new d());
        }
    }

    public final void b() {
        this.k.a();
        this.k = null;
        this.h = null;
    }

    public final void c() {
        this.b.a(this.g.a("settings_opened", this.j));
        this.c.a();
        this.f.a("spotify:internal:preferences");
    }

    public final void d() {
        this.b.a(this.g.a("mic_tapped", this.j));
    }

    public final /* synthetic */ void onChanged(Object obj) {
        Ad ad = (Ad) obj;
        if (this.i) {
            this.d.e();
        }
        this.i = ad.isVoiceAd();
        this.c.a(this.i);
        if (this.i) {
            this.d.c();
            this.j = ad.id();
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.h = VoiceAdService.this;
        this.k = this.h.a;
        Logger.b("[VoiceAd] Service - connected", new Object[0]);
        this.k.a((knw<krf>) new $$Lambda$thi$LDoI_39bFXDDNxdA2CXul4m4Rww<krf>(this));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        b();
    }
}
