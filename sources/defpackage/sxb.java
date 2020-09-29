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

/* renamed from: sxb reason: default package */
public final class sxb implements ServiceConnection, a, a, a<Ad> {
    public final swr a;
    public final CompositeDisposable b = new CompositeDisposable();
    public sxg c;
    public sxf d;
    public PlayPauseButton e;
    private final spi f;
    private final koe g;
    private VoiceAdService h;
    /* access modifiers changed from: private */
    public boolean i;
    private String j;
    private knl k;

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

    public sxb(swr swr, spi spi, koe koe, a aVar) {
        this.a = swr;
        this.f = spi;
        this.g = koe;
        aVar.a(new c() {
            public final void a() {
                if (sxb.this.i) {
                    sxb.this.d.e();
                }
            }
        });
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.h = VoiceAdService.this;
        this.k = this.h.a;
        Logger.b("[VoiceAd] Service - connected", new Object[0]);
        this.k.a((kkn<knw>) new $$Lambda$sxb$eaW1daWzlFVny1coFTNMP0AeaqE<knw>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(knw knw) {
        Logger.b("[VoiceAd] Mobius model emitted: %s", knw);
        new Handler(Looper.getMainLooper()).post(new $$Lambda$sxb$5AeB0bfZSrZxcvXtkqoi2dpaiew(this, knw));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(knw knw) {
        if ((knw.a() instanceof c) || (knw.a() instanceof a)) {
            this.c.b(false);
        } else if (knw.a() instanceof b) {
            this.c.b(true);
            this.e.setEnabled(false);
        }
        if (knw.f()) {
            this.f.a(knw.b().g());
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        b();
    }

    public final void b() {
        this.k.a();
        this.k = null;
        this.h = null;
    }

    public final void a() {
        knl knl = this.k;
        if (knl != null) {
            knl.b.a(new d());
        }
    }

    public final void c() {
        this.b.a(this.g.a("settings_opened", this.j));
        this.c.a();
        this.f.a("spotify:internal:preferences");
    }

    public final void d() {
        this.b.a(this.g.a("mic_tapped", this.j));
    }
}
