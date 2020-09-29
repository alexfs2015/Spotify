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

/* renamed from: ltu reason: default package */
public final class ltu implements acj, a<hne>, a {
    private final Context a;
    private final ltz b;
    private final lui c;
    private final rqi d;
    private final ltw e;
    private final heg f;
    private final xag g = new xag();
    private final Picasso h;
    private lub i;
    private aci j;
    private hop k;
    private hne l;

    public ltu(Context context, lui lui, ltz ltz, rqi rqi, heg heg, Picasso picasso, ltx ltx) {
        this.a = (Context) fay.a(context);
        this.c = (lui) fay.a(lui);
        this.b = (ltz) fay.a(ltz);
        this.d = (rqi) fay.a(rqi);
        this.f = heg;
        this.h = picasso;
        this.e = new ltw((a) ltx.a(this, 1), (Picasso) ltx.a(ltx.a.get(), 2), (heg) ltx.a(ltx.b.get(), 3));
    }

    public final void a(hne hne) {
        this.l = hne;
        this.k = this.l.a(this.d);
        this.k.b();
        ltz ltz = this.b;
        Context context = this.a;
        hop hop = this.k;
        hne hne2 = this.l;
        Picasso picasso = this.h;
        lub lub = new lub(context, hop, hne2, ltz.a, ltz.b, ltz.a(context, hop, hne2, picasso, "bmw.car_screen_listener"));
        this.i = lub;
        Context context2 = this.a;
        Logger.b("getApplication context %s listener %s", context2, this);
        ApplicationManager applicationManager = ApplicationManager.INSTANCE;
        if (context2 != null) {
            if (applicationManager.mApplication == null) {
                if (this instanceof acj) {
                    applicationManager.mApplication = new ade(context2, this);
                } else {
                    applicationManager.mApplication = new add(context2, this);
                }
                ((add) applicationManager.mApplication).b();
            }
            applicationManager.mAppId = context2.getPackageName();
            context2.registerReceiver(applicationManager.mDisconnectReceiver, new IntentFilter(applicationManager.mDisconnectReceiverAction));
            this.j = (aci) applicationManager.mApplication;
            this.j.a((acd) this.i);
            wud e2 = hne.d().a().c((wut<? super T, Boolean>) $$Lambda$ltu$PUYgw2eZ2wf7Iz7Hcf5D4Vi1s0.INSTANCE).b(vun.a(this.f.b())).d().e();
            this.g.a(e2.i(new $$Lambda$ltu$_Qu5BI6ikAcMZ9zAZdPNSpP3LY(this)).f($$Lambda$ltu$nNy9fgs_shddyyiAvKz57FmTg.INSTANCE).b().a(vun.a(this.f.c())).a((wun<? super T>) new $$Lambda$ltu$BVH2iAdHdpdj1pwUtFAuzXfRsI<Object>(this), (wun<Throwable>) $$Lambda$ltu$_7AOpncDWG7DsgY5LhtwLukcHlk.INSTANCE));
            this.g.a(e2.c((wut<? super T, Boolean>) $$Lambda$ltu$eFy5f1TkDgiWup92OUOuuYqHoA.INSTANCE).f($$Lambda$s7vez6vRc_C5e28uHCZYajeVDaw.INSTANCE).b().f($$Lambda$U8_xtr1bgvxx8aEvOh8JzJaUp4.INSTANCE).f($$Lambda$ltu$FVtRndr1bvUeQBP8WJC2X9FnfP4.INSTANCE).a(vun.a(this.f.c())).a((wun<? super T>) new $$Lambda$ltu$V3UHbA8CC2PEnVzj_sGNjennx58<Object>(this), (wun<Throwable>) $$Lambda$ltu$xUsozg8e7jRMCOtRCjgU_TflQYU.INSTANCE));
            this.g.a(e2.c((wut<? super T, Boolean>) $$Lambda$ltu$e630f4a52tWkkTP2oZGrlKCCGyo.INSTANCE).f($$Lambda$s7vez6vRc_C5e28uHCZYajeVDaw.INSTANCE).b().f($$Lambda$U8_xtr1bgvxx8aEvOh8JzJaUp4.INSTANCE).a(vun.a(this.f.c())).a((wun<? super T>) new $$Lambda$ltu$by2pEuTQI77qBErtYZWlbwT3A<Object>(this), (wun<Throwable>) $$Lambda$ltu$QcZAf_QxMLCAChtUoPVlJgHoLA.INSTANCE));
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

    public final void a() {
        hne hne = this.l;
        if (hne != null && this.k != null) {
            hne.d().a(this.k.d(), (ActionCallback) null);
        }
    }

    public final void b() {
        hne hne = this.l;
        if (hne != null && this.k != null) {
            hne.d().a(this.k.d());
        }
    }

    public final void c() {
        hne hne = this.l;
        if (hne != null && this.k != null) {
            hne.d().b(this.k.d(), null);
        }
    }

    public final void d() {
        hne hne = this.l;
        if (hne != null && this.k != null) {
            hne.d().c(this.k.d(), null);
        }
    }

    public final void a(byte[] bArr) {
        aci aci = this.j;
        if (aci != null) {
            aci.a(bArr);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean e(PlayerState playerState) {
        return Boolean.valueOf(playerState != null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(wud wud) {
        return wud.b(500, TimeUnit.MILLISECONDS, vun.a(this.f.b()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Integer c(PlayerState playerState) {
        if (playerState.isPlaying()) {
            return Integer.valueOf(a(playerState.currentPlaybackPosition(), playerState.duration()));
        }
        return Integer.valueOf(a(0, 0));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Integer num) {
        Logger.b("updateTrackPosition: %d", num);
        aci aci = this.j;
        if (aci != null) {
            aci.a(num.intValue());
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
    public static /* synthetic */ Boolean a(PlayerState playerState) {
        return Boolean.valueOf(playerState.track() != null);
    }

    /* access modifiers changed from: private */
    public void a(Map<String, String> map) {
        String str;
        String str2;
        String str3 = (String) map.get("title");
        boolean parseBoolean = Boolean.parseBoolean((String) map.get("is_advertisement"));
        if (parseBoolean) {
            str = (String) map.get("advertiser");
        } else {
            str = (String) map.get("artist_name");
        }
        if (parseBoolean) {
            str2 = "";
        } else {
            str2 = (String) map.get("album_title");
        }
        Logger.b("updateMultimediaInfo, 1: %s,2: %s,3: %s", str, str2, str3);
        aci aci = this.j;
        if (aci != null) {
            aci.a(str, str2, str3);
        }
        lub lub = this.i;
        if (lub != null) {
            lub.c = str;
            lub.d = str2;
            lub.e = str3;
            if (lub.b != null) {
                lub.b.d().a(str3);
            }
        }
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

    public final void e() {
        LockScreenController.a(this.a, "Bmw");
        hop hop = this.k;
        if (hop != null) {
            hop.c();
        }
        lub lub = this.i;
        if (lub != null) {
            lub.a.a();
        }
        this.g.a();
        this.e.b.a();
        ApplicationManager applicationManager = ApplicationManager.INSTANCE;
        SdkManager.INSTANCE.b();
        applicationManager.mApplication = null;
    }

    /* access modifiers changed from: private */
    public void a(String str) {
        if (!fax.a(str)) {
            Uri parse = Uri.parse(str);
            ltw ltw = this.e;
            ltw.c = true;
            String str2 = "bmw_image_tag";
            ltw.a.a((Object) str2);
            ltw ltw2 = this.e;
            ltw2.c = false;
            ltw2.a.a(parse).b(320, 320).a((Object) str2).a((vsr) ltw2);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud d(PlayerState playerState) {
        return wvk.b(ScalarSynchronousObservable.d(playerState), InternalObservableUtils.a(new $$Lambda$ltu$vNY0sDGfpt_Z8gGqutK_8sDRag8(this)));
    }
}
