package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import com.bmwgroup.connected.car.app.ApplicationManager;
import com.bmwgroup.connected.car.internal.SdkManager;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.Player.ActionCallback;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.R;
import com.spotify.music.features.bmw.lockscreen.LockScreenController;
import com.squareup.picasso.Picasso;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import rx.internal.util.InternalObservableUtils;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: lxt reason: default package */
public final class lxt implements acx, a<hpt>, a {
    private final Context a;
    private final lxy b;
    private final lyh c;
    private final rzt d;
    private final lxv e;
    private final hhc f;
    private final xok g = new xok();
    private final Picasso h;
    private lya i;
    private acw j;
    private hqr k;
    private hpt l;

    public lxt(Context context, lyh lyh, lxy lxy, rzt rzt, hhc hhc, Picasso picasso, lxw lxw) {
        this.a = (Context) fbp.a(context);
        this.c = (lyh) fbp.a(lyh);
        this.b = (lxy) fbp.a(lxy);
        this.d = (rzt) fbp.a(rzt);
        this.f = hhc;
        this.h = picasso;
        this.e = new lxv((a) lxw.a(this, 1), (Picasso) lxw.a(lxw.a.get(), 2), (hhc) lxw.a(lxw.b.get(), 3));
    }

    private static int a(long j2, long j3) {
        if (j3 <= 0) {
            return 0;
        }
        double d2 = (double) j2;
        Double.isNaN(d2);
        double d3 = d2 * 100.0d;
        double d4 = (double) j3;
        Double.isNaN(d4);
        return Math.max(0, Math.min(100, (int) (d3 / d4)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(PlayerState playerState) {
        return Boolean.valueOf(playerState.track() != null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(xii xii) {
        return xii.b(500, TimeUnit.MILLISECONDS, wit.a(this.f.b()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Integer num) {
        Logger.b("updateTrackPosition: %d", num);
        acw acw = this.j;
        if (acw != null) {
            acw.a(num.intValue());
        }
    }

    /* access modifiers changed from: private */
    public void a(String str) {
        if (!fbo.a(str)) {
            Uri parse = Uri.parse(str);
            lxv lxv = this.e;
            lxv.c = true;
            String str2 = "bmw_image_tag";
            lxv.a.a((Object) str2);
            lxv lxv2 = this.e;
            lxv2.c = false;
            lxv2.a.a(parse).b(320, 320).a((Object) str2).a((wgx) lxv2);
        }
    }

    /* access modifiers changed from: private */
    public void a(Map<String, String> map) {
        String str = (String) map.get("title");
        boolean parseBoolean = Boolean.parseBoolean((String) map.get("is_advertisement"));
        String str2 = parseBoolean ? (String) map.get("advertiser") : (String) map.get("artist_name");
        String str3 = parseBoolean ? "" : (String) map.get("album_title");
        Logger.b("updateMultimediaInfo, 1: %s,2: %s,3: %s", str2, str3, str);
        acw acw = this.j;
        if (acw != null) {
            acw.a(str2, str3, str);
        }
        lya lya = this.i;
        if (lya != null) {
            lya.c = str2;
            lya.d = str3;
            lya.e = str;
            if (lya.b != null) {
                lya.b.d().a(str);
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean b(PlayerState playerState) {
        return Boolean.valueOf(playerState.track() != null);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String b(Map map) {
        return (String) map.get("image_url");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Integer c(PlayerState playerState) {
        return playerState.isPlaying() ? Integer.valueOf(a(playerState.currentPlaybackPosition(), playerState.duration())) : Integer.valueOf(a(0, 0));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii d(PlayerState playerState) {
        return xjp.b(ScalarSynchronousObservable.d(playerState), InternalObservableUtils.a(new $$Lambda$lxt$ywJGKIg2f2umPOjQt9Y5tmqfQE(this)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean e(PlayerState playerState) {
        return Boolean.valueOf(playerState != null);
    }

    public final void a() {
        hpt hpt = this.l;
        if (hpt != null && this.k != null) {
            hpt.d().a(this.k.d(), (ActionCallback) null);
        }
    }

    public final void a(hpt hpt) {
        this.l = hpt;
        this.k = this.l.a(this.d);
        this.k.b();
        lxy lxy = this.b;
        Context context = this.a;
        hqr hqr = this.k;
        hpt hpt2 = this.l;
        Picasso picasso = this.h;
        lya lya = new lya(context, hqr, hpt2, lxy.a, lxy.b, lxy.a(context, hqr, hpt2, picasso, "bmw.car_screen_listener"));
        this.i = lya;
        Context context2 = this.a;
        Logger.b("getApplication context %s listener %s", context2, this);
        ApplicationManager applicationManager = ApplicationManager.INSTANCE;
        if (context2 != null) {
            if (applicationManager.mApplication == null) {
                if (this instanceof acx) {
                    applicationManager.mApplication = new ads(context2, this);
                } else {
                    applicationManager.mApplication = new adr(context2, this);
                }
                ((adr) applicationManager.mApplication).b();
            }
            applicationManager.mAppId = context2.getPackageName();
            context2.registerReceiver(applicationManager.mDisconnectReceiver, new IntentFilter(applicationManager.mDisconnectReceiverAction));
            this.j = (acw) applicationManager.mApplication;
            this.j.a((acr) this.i);
            xii e2 = hpt.d().a().c((xiy<? super T, Boolean>) $$Lambda$lxt$tNYZmudv6A_9aiUwuLleuI4iTFE.INSTANCE).b(wit.a(this.f.b())).d().e();
            this.g.a(e2.h(new $$Lambda$lxt$BNEfKXe6uKosBjHufLHvxIfq9jk(this)).e((xiy<? super T, ? extends R>) $$Lambda$lxt$5hfxlkuPBzqTVvGHEB1hIOLy6O4.INSTANCE).b().a(wit.a(this.f.c())).a((xis<? super T>) new $$Lambda$lxt$RDcg4xb3J1QoMCCamGolKRtExMA<Object>(this), (xis<Throwable>) $$Lambda$lxt$_Xnp2b9HmJzEXrSNGMqQYXYj0CU.INSTANCE));
            this.g.a(e2.c((xiy<? super T, Boolean>) $$Lambda$lxt$hx6CPZoVqzTvHcCWSTmdrGH7fGM.INSTANCE).e((xiy<? super T, ? extends R>) $$Lambda$CU4HsHLF6o7BOT68dmlohDtLFvQ.INSTANCE).b().e((xiy<? super T, ? extends R>) $$Lambda$irK7afWsWuwAT0LqOpT18U8iPV4.INSTANCE).e((xiy<? super T, ? extends R>) $$Lambda$lxt$U7Nlb8wVYokdj1C8OUc249i8ipI.INSTANCE).a(wit.a(this.f.c())).a((xis<? super T>) new $$Lambda$lxt$Pokv6B48DIwSTNIkivCUepVEW0<Object>(this), (xis<Throwable>) $$Lambda$lxt$FH_TDd_kkPJhR5uJPdS7qxusjkA.INSTANCE));
            this.g.a(e2.c((xiy<? super T, Boolean>) $$Lambda$lxt$co0YfXDTkKnycvN2biDjfcn9Q.INSTANCE).e((xiy<? super T, ? extends R>) $$Lambda$CU4HsHLF6o7BOT68dmlohDtLFvQ.INSTANCE).b().e((xiy<? super T, ? extends R>) $$Lambda$irK7afWsWuwAT0LqOpT18U8iPV4.INSTANCE).a(wit.a(this.f.c())).a((xis<? super T>) new $$Lambda$lxt$jsXjquWJubyQPXABwnmmm9FRgEU<Object>(this), (xis<Throwable>) $$Lambda$lxt$fedeWkCIv0kU7jVSkY4WreV8.INSTANCE));
            int i2 = -1;
            if ("BMW".equalsIgnoreCase(this.d.f)) {
                i2 = R.drawable.lockscreen_logo_bmw;
            } else {
                if ("MINI".equalsIgnoreCase(this.d.f)) {
                    i2 = R.drawable.lockscreen_logo_mini;
                }
            }
            LockScreenController.a(this.a, "Bmw", i2, true);
            if (this.k != null && this.j != null) {
                Logger.b("setStatusBarIfApplicationAndExternalIntegrationServiceIsPresent", new Object[0]);
                this.j.a(this.a.getString(R.string.app_name));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Context shouldn't be null!");
    }

    public final void a(byte[] bArr) {
        acw acw = this.j;
        if (acw != null) {
            acw.a(bArr);
        }
    }

    public final void b() {
        hpt hpt = this.l;
        if (hpt != null && this.k != null) {
            hpt.d().a(this.k.d());
        }
    }

    public final void c() {
        hpt hpt = this.l;
        if (hpt != null && this.k != null) {
            hpt.d().b(this.k.d(), null);
        }
    }

    public final void d() {
        hpt hpt = this.l;
        if (hpt != null && this.k != null) {
            hpt.d().c(this.k.d(), null);
        }
    }

    public final void e() {
        LockScreenController.a(this.a, "Bmw");
        hqr hqr = this.k;
        if (hqr != null) {
            hqr.c();
        }
        lya lya = this.i;
        if (lya != null) {
            lya.a.a();
        }
        this.g.a();
        this.e.b.a();
        ApplicationManager applicationManager = ApplicationManager.INSTANCE;
        SdkManager.INSTANCE.b();
        applicationManager.mApplication = null;
    }
}
