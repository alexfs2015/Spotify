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

/* renamed from: jrv reason: default package */
public class jrv extends jry {
    private static final Optional<String> aa = Optional.b("premium");
    public gvm T;
    public lon U;
    public jrt V;
    public viy W;
    public hgz X;
    public jvf a;
    private final SerialDisposable ab = new SerialDisposable();
    /* access modifiers changed from: private */
    public fqn ac;
    private hlv ad;
    private final BroadcastReceiver ae = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            int intExtra = intent.getIntExtra("error_code", -1);
            GaiaDevice gaiaDevice = (GaiaDevice) intent.getParcelableExtra("connect_device");
            gsz.a(context, gaiaDevice, new GaiaTransferError(intExtra, gaiaDevice.getIdentifier()), ViewUris.a);
        }
    };
    private final c af = new c() {
        public final void onFlagsChanged(fqn fqn) {
            jrv.this.ac = fqn;
        }
    };
    public hlw b;

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Boolean bool) {
        return this.W.b().c((Function<? super T, ? extends R>) new $$Lambda$jrv$_O0YL2d_E6sqfVSP3x0DOv7SfY0<Object,Object>(bool));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ jrs a(Boolean bool, PlayerError playerError) {
        return new jrs(playerError, bool.booleanValue());
    }

    public static jrv a(fqn fqn) {
        jrv jrv = new jrv();
        fqo.a((Fragment) jrv, fqn);
        return jrv;
    }

    private void a(Context context, int i, String str) {
        LinkType linkType = jva.a(str).b;
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
                    gsz.a(context, ViewUris.a);
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

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Throwable th) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(jrs jrs) {
        Context n = n();
        if (jrs.a != 99) {
            String str = jrs.b;
            StringBuilder sb = new StringBuilder("unexpected track uri: ");
            sb.append(str);
            Assertion.a(sb.toString(), str.isEmpty() || str.startsWith("spotify:track:") || str.startsWith("spotify:local:") || str.startsWith("spotify:ad:") || str.startsWith("spotify:episode:") || str.startsWith(InterruptionUtil.INTERRUPTION_PREFIX) || str.startsWith("spotify:live:") || str.startsWith("spotify:vdebug"));
            if (!this.T.a(this.ac)) {
                a(n, jrs.a, str);
            }
        }
    }

    public final void A() {
        super.A();
        this.ab.a(Disposables.a());
        this.V.c.a().a(jrt.a).a(jrt.b).b();
    }

    public final void a(Context context) {
        why.a(this);
        super.a(context);
    }

    public final void aP_() {
        super.aP_();
        this.ad.a(this.af);
        this.ad.a();
        kf p = p();
        BroadcastReceiver broadcastReceiver = this.ae;
        IntentFilter intentFilter = new IntentFilter("com.spotify.mobile.android.service.broadcast.connect.CONNECT_TRANSFER_ERROR");
        intentFilter.addCategory("android.intent.category.DEFAULT");
        p.registerReceiver(broadcastReceiver, intentFilter);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.ac = fqo.a((Fragment) this);
        this.ad = new hlv(p(), getClass().getSimpleName(), this.b.a);
        if (bundle != null) {
            this.ac = fqo.a(bundle);
        }
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putParcelable("FlagsArgumentHelper.Flags", this.ac);
    }

    public final void h() {
        super.h();
        this.ad.b();
        this.ad.b(this.af);
        p().unregisterReceiver(this.ae);
    }

    public final void z() {
        super.z();
        if (this.V.c.e(jrt.a)) {
            jrt jrt = this.V;
            fbp.a(jrt.c.e(jrt.a));
            int b2 = jrt.c.b(jrt.a);
            jrt jrt2 = this.V;
            fbp.a(jrt2.c.e(jrt.b));
            String c = jrt2.c.c(jrt.b);
            if (!this.T.a(this.ac)) {
                a(p(), b2, c);
            }
        }
        SerialDisposable serialDisposable = this.ab;
        Observable b3 = wit.b(this.X.a(MoatAdEvent.EVENT_TYPE).e((xiy<? super T, ? extends R>) $$Lambda$aq41lIFDp7Cwi2mwNXWh1pDloKU.INSTANCE));
        Optional<String> optional = aa;
        optional.getClass();
        serialDisposable.a(b3.c((Function<? super T, ? extends R>) new $$Lambda$SiUSHCGvbVttS2l2iSJlkhkikbA<Object,Object>(optional)).a(Functions.a()).h(new $$Lambda$jrv$pzOguS0STo9GVyAaU4vAZ3exRQo(this)).a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$jrv$LJCax4FyGRI125vh3WxlGYaZ8KQ<Object>(this), (Consumer<? super Throwable>) $$Lambda$jrv$UrlvcTxQUQluA197Vxk_cHtC0.INSTANCE));
    }
}
