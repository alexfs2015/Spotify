package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.messages.VoiceAdLog;
import com.spotify.mobile.android.spotlets.ads.skippable.view.SkippableAdTextView;
import com.spotify.mobile.android.ui.activity.PermissionsRequestActivity;
import com.spotify.mobile.android.ui.activity.PermissionsRequestActivity.a;
import com.spotify.music.R;
import com.spotify.music.ads.voice.VoiceAdService;
import com.spotify.music.nowplaying.ads.view.AudioAdsActionsView;
import com.spotify.music.nowplaying.ads.view.AudioAdsHeaderView;
import com.spotify.music.nowplaying.ads.view.VoiceAdsView;
import com.spotify.music.nowplaying.ads.view.nextbutton.AudioAdsNextButton;
import com.spotify.music.nowplaying.common.view.background.OverlayHidingGradientBackgroundView;
import com.spotify.music.nowplaying.common.view.close.CloseButton;
import com.spotify.music.nowplaying.core.immersive.ImmersiveMode;
import com.spotify.nowplaying.ui.components.controls.playpause.PlayPauseButton;
import com.spotify.nowplaying.ui.components.controls.previous.PreviousButton;
import com.spotify.nowplaying.ui.components.controls.seekbar.PersistentSeekbarView;

/* renamed from: swi reason: default package */
public class swi extends sxh implements sxf, udv {
    public ust T;
    public sym U;
    public swy V;
    public swx W;
    public tbv X;
    public tbx Y;
    public swj Z;
    public swz a;
    public uso aa;
    public usl ab;
    public sxc ac;
    public sxa ad;
    public tco ae;
    public sxb af;
    public gdz<fko> ag;
    public jrp ah;
    public ify ai;
    private CloseButton aj;
    private PlayPauseButton ak;
    private AudioAdsNextButton al;
    private PreviousButton am;
    private boolean an;
    private Handler ao;
    public sww b;

    public static swi a(fpt fpt) {
        fay.a(fpt);
        swi swi = new swi();
        fpu.a((Fragment) swi, fpt);
        return swi;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) layoutInflater.inflate(R.layout.fragment_audio_ads_npv, viewGroup, false);
        coordinatorLayout.setFitsSystemWindows(!jtc.b(p()));
        this.ae.a();
        this.aj = (CloseButton) coordinatorLayout.findViewById(R.id.audio_ads_close_button);
        this.U.a(this.aj);
        AudioAdsHeaderView audioAdsHeaderView = (AudioAdsHeaderView) coordinatorLayout.findViewById(R.id.audio_ads_header);
        swz swz = this.a;
        swz.c = audioAdsHeaderView;
        swz.a.a((a<T>) swz);
        swz.b.a(swz.d);
        this.b.a((sxd) (AudioAdsActionsView) coordinatorLayout.findViewById(R.id.audio_ads_action));
        this.T.a((usu) (PersistentSeekbarView) coordinatorLayout.findViewById(R.id.seek_bar_view));
        this.am = (PreviousButton) coordinatorLayout.findViewById(R.id.btn_prev);
        this.aa.a((usp) this.am);
        this.ak = (PlayPauseButton) coordinatorLayout.findViewById(R.id.btn_play);
        this.ab.a((usm) this.ak);
        this.al = (AudioAdsNextButton) coordinatorLayout.findViewById(R.id.btn_next);
        sxc sxc = this.ac;
        sxc.b = this.al;
        sxc.b.a((a) sxc);
        sxc.a.a((a<T>) sxc);
        OverlayHidingGradientBackgroundView overlayHidingGradientBackgroundView = (OverlayHidingGradientBackgroundView) coordinatorLayout.findViewById(R.id.overlay_hiding_layout);
        overlayHidingGradientBackgroundView.a(false);
        this.X.a((uru<ImmersiveMode>) this.Y.a(taf.a(overlayHidingGradientBackgroundView)));
        swx swx = this.W;
        swx.b = overlayHidingGradientBackgroundView;
        swx.a.a((a<T>) swx);
        this.V.a((ImageView) coordinatorLayout.findViewById(R.id.image));
        SkippableAdTextView skippableAdTextView = (SkippableAdTextView) coordinatorLayout.findViewById(R.id.skip_ad_countdown);
        sxa sxa = this.ad;
        sxc sxc2 = this.ac;
        sxa.c = skippableAdTextView;
        sxa.b = sxc2;
        sxa.c.e();
        sxa.a.a((a<T>) sxa);
        VoiceAdsView voiceAdsView = (VoiceAdsView) coordinatorLayout.findViewById(R.id.voice_ads_options);
        sxb sxb = this.af;
        PlayPauseButton playPauseButton = this.ak;
        sxb.c = voiceAdsView;
        sxb.e = playPauseButton;
        sxb.d = this;
        sxb.a.a((a<T>) sxb);
        sxb.c.a((a) sxb);
        sww sww = this.b;
        sxb sxb2 = this.af;
        sww.a = sxb2;
        this.V.a = sxb2;
        this.ao = new Handler();
        return coordinatorLayout;
    }

    public final void c() {
        if (!this.an) {
            Logger.b("[VoiceAd] Service - Binding VoiceAdService", new Object[0]);
            Context o = o();
            this.an = o.getApplicationContext().bindService(new Intent(o, VoiceAdService.class), this.af, 1);
        }
    }

    public final void e() {
        if (this.an) {
            Logger.b("[VoiceAd] Service - Unbinding VoiceAdService", new Object[0]);
            o().getApplicationContext().unbindService(this.af);
            this.af.b();
            this.ao.removeCallbacksAndMessages(null);
            this.an = false;
        }
    }

    public final void ax_() {
        super.ax_();
        this.af.b.c();
    }

    public final void a(int i, int i2, Intent intent) {
        super.a(i, i2, intent);
        if (i == 1 && i2 == -1) {
            a a2 = PermissionsRequestActivity.a(intent);
            if (a2 != null) {
                boolean a3 = a2.a("android.permission.RECORD_AUDIO");
                this.ag.a((VoiceAdLog) VoiceAdLog.k().a(a3 ? "mic_permission_accept" : "mic_permission_deny").a(this.ah.a()).b("").g());
                if (!a3) {
                    ify.a((Fragment) this);
                }
            }
        }
    }

    public final gjf aj() {
        return PageIdentifiers.NOWPLAYING;
    }
}
