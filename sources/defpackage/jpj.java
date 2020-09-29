package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.google.common.base.Optional;
import com.moat.analytics.mobile.MoatAdEvent;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import com.spotify.mobile.android.connect.model.GaiaTransferError;
import com.spotify.mobile.android.cosmos.player.v2.InterruptionUtil;
import com.spotify.mobile.android.service.feature.FeatureService.c;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.player.model.PlayerError;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

/* renamed from: jpj reason: default package */
public class jpj extends jpm {
    private static final Optional<String> aa = Optional.b("premium");
    public gtm T;
    public lkn U;
    public jph V;
    public uww W;
    public hed X;
    public jsz a;
    private final SerialDisposable ab = new SerialDisposable();
    /* access modifiers changed from: private */
    public fpt ac;
    private hjd ad;
    private final BroadcastReceiver ae = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            int intExtra = intent.getIntExtra("error_code", -1);
            GaiaDevice gaiaDevice = (GaiaDevice) intent.getParcelableExtra("connect_device");
            gra.a(context, gaiaDevice, new GaiaTransferError(intExtra, gaiaDevice.getIdentifier()), ViewUris.b);
        }
    };
    private final c af = new c() {
        public final void onFlagsChanged(fpt fpt) {
            jpj.this.ac = fpt;
        }
    };
    public hje b;

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Throwable th) {
    }

    public static jpj a(fpt fpt) {
        jpj jpj = new jpj();
        fpu.a((Fragment) jpj, fpt);
        return jpj;
    }

    public final void a(Context context) {
        vts.a(this);
        super.a(context);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.ac = fpu.a((Fragment) this);
        this.ad = hje.a(p(), getClass().getSimpleName());
        if (bundle != null) {
            this.ac = fpu.a(bundle);
        }
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putParcelable("FlagsArgumentHelper.Flags", this.ac);
    }

    public final void g() {
        super.g();
        this.ad.a(this.af);
        this.ad.a();
        ka p = p();
        BroadcastReceiver broadcastReceiver = this.ae;
        IntentFilter intentFilter = new IntentFilter("com.spotify.mobile.android.service.broadcast.connect.CONNECT_TRANSFER_ERROR");
        intentFilter.addCategory("android.intent.category.DEFAULT");
        p.registerReceiver(broadcastReceiver, intentFilter);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Boolean bool) {
        return this.W.a().c((Function<? super T, ? extends R>) new $$Lambda$jpj$Axdp7oMhKjT6XQHxIl_oXmcJIK4<Object,Object>(bool));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ jpg a(Boolean bool, PlayerError playerError) {
        return new jpg(playerError, bool.booleanValue());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(jpg jpg) {
        Context n = n();
        if (jpg.a != 99) {
            String str = jpg.b;
            StringBuilder sb = new StringBuilder("unexpected track uri: ");
            sb.append(str);
            Assertion.a(sb.toString(), str.isEmpty() || str.startsWith("spotify:track:") || str.startsWith("spotify:local:") || str.startsWith("spotify:ad:") || str.startsWith("spotify:episode:") || str.startsWith(InterruptionUtil.INTERRUPTION_PREFIX) || str.startsWith("spotify:live:") || str.startsWith("spotify:vdebug"));
            if (!this.T.a(this.ac)) {
                a(n, jpg.a, str);
            }
        }
    }

    public final void h() {
        super.h();
        this.ad.b();
        this.ad.b(this.af);
        p().unregisterReceiver(this.ae);
    }

    public final void z() {
        super.z();
        if (this.V.c.e(jph.a)) {
            jph jph = this.V;
            fay.a(jph.c.e(jph.a));
            int b2 = jph.c.b(jph.a);
            jph jph2 = this.V;
            fay.a(jph2.c.e(jph.b));
            String c = jph2.c.c(jph.b);
            if (!this.T.a(this.ac)) {
                a(p(), b2, c);
            }
        }
        SerialDisposable serialDisposable = this.ab;
        Observable b3 = vun.b(this.X.a(MoatAdEvent.EVENT_TYPE).f($$Lambda$aCKf3hOvaO2phPFK29rd7bVLuPY.INSTANCE));
        Optional<String> optional = aa;
        optional.getClass();
        serialDisposable.a(b3.c((Function<? super T, ? extends R>) new $$Lambda$SiUSHCGvbVttS2l2iSJlkhkikbA<Object,Object>(optional)).a(Functions.a()).h(new $$Lambda$jpj$_cez9rea8B57oc5toLG9P2POvPs(this)).a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$jpj$fzs793YNP20oaVpOzTlaIxhZTWo<Object>(this), (Consumer<? super Throwable>) $$Lambda$jpj$SYVzLokK4li5pkkj4PohUehJ3s.INSTANCE));
    }

    public final void A() {
        super.A();
        this.ab.a(Disposables.a());
        this.V.c.a().a(jph.a).a(jph.b).b();
    }

    private void a(Context context, int i, String str) {
        LinkType linkType = jst.a(str).b;
        if (i == 2) {
            this.a.a((int) R.string.toast_feature_premium_discovered, 1, new Object[0]);
        } else if (i == 14) {
            this.a.a((int) R.string.toast_feature_premium_discovered, 1, new Object[0]);
        } else if (i == 30) {
            this.U.a(str, str);
        } else if (i == 16) {
            this.a.a((int) R.string.toast_feature_premium_discovered, 1, new Object[0]);
        } else if (i != 17) {
            switch (i) {
                case 20:
                    this.a.a((int) R.string.toast_unavailable_video_playback_error, 0, new Object[0]);
                    return;
                case 21:
                case 26:
                    this.a.a((int) R.string.toast_unavailable_video_georestricted_error, 0, new Object[0]);
                    return;
                case 22:
                    this.a.a((int) R.string.toast_unavailable_video_unsupported_platform_error, 0, new Object[0]);
                    return;
                case 23:
                    this.a.a((int) R.string.toast_unavailable_video_unsupported_client_error, 0, new Object[0]);
                    return;
                case 24:
                    this.a.a((int) R.string.toast_unavailable_video_manifest_deleted, 0, new Object[0]);
                    return;
                case 25:
                    gra.a(context, ViewUris.b);
                    return;
                case 27:
                    this.a.a((int) R.string.toast_unavailable_video_unavailable, 0, new Object[0]);
                    return;
                case 28:
                    this.a.a((int) R.string.toast_feature_premium_discovered, 1, new Object[0]);
                    return;
                default:
                    if (linkType == LinkType.SHOW_EPISODE) {
                        this.a.a((int) R.string.toast_unavailable_episode, 0, new Object[0]);
                        return;
                    } else {
                        this.a.a((int) R.string.toast_unavailable_track, 0, new Object[0]);
                        return;
                    }
            }
        } else {
            this.a.a((int) R.string.toast_feature_premium_discovered, 0, new Object[0]);
        }
    }
}
