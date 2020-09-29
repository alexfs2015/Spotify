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

/* renamed from: tgp reason: default package */
public class tgp extends tho implements thm, uqq {
    public vdy T;
    public tit U;
    public thf V;
    public the W;
    public tmc X;
    public tme Y;
    public tgq Z;
    public thg a;
    public vdt aa;
    public vdq ab;
    public thj ac;
    public thh ad;
    public tmv ae;
    public thi af;
    public gfk<fli> ag;
    public jtz ah;
    public iil ai;
    private CloseButton aj;
    private PlayPauseButton ak;
    private AudioAdsNextButton al;
    private PreviousButton am;
    private boolean an;
    private Handler ao;
    public thd b;

    public static tgp a(fqn fqn) {
        fbp.a(fqn);
        tgp tgp = new tgp();
        fqo.a((Fragment) tgp, fqn);
        return tgp;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) layoutInflater.inflate(R.layout.fragment_audio_ads_npv, viewGroup, false);
        coordinatorLayout.setFitsSystemWindows(!jvi.b(p()));
        this.ae.a();
        this.aj = (CloseButton) coordinatorLayout.findViewById(R.id.audio_ads_close_button);
        this.U.a(this.aj);
        AudioAdsHeaderView audioAdsHeaderView = (AudioAdsHeaderView) coordinatorLayout.findViewById(R.id.audio_ads_header);
        thg thg = this.a;
        thg.c = audioAdsHeaderView;
        thg.a.a((a<T>) thg);
        thg.b.a(thg.d);
        this.b.a((thk) (AudioAdsActionsView) coordinatorLayout.findViewById(R.id.audio_ads_action));
        this.T.a((vdz) (PersistentSeekbarView) coordinatorLayout.findViewById(R.id.seek_bar_view));
        this.am = (PreviousButton) coordinatorLayout.findViewById(R.id.btn_prev);
        this.aa.a((vdu) this.am);
        this.ak = (PlayPauseButton) coordinatorLayout.findViewById(R.id.btn_play);
        this.ab.a((vdr) this.ak);
        this.al = (AudioAdsNextButton) coordinatorLayout.findViewById(R.id.btn_next);
        thj thj = this.ac;
        thj.b = this.al;
        thj.b.a((a) thj);
        thj.a.a((a<T>) thj);
        OverlayHidingGradientBackgroundView overlayHidingGradientBackgroundView = (OverlayHidingGradientBackgroundView) coordinatorLayout.findViewById(R.id.overlay_hiding_layout);
        overlayHidingGradientBackgroundView.a(false);
        this.X.a((vcz<ImmersiveMode>) this.Y.a(tkm.a(overlayHidingGradientBackgroundView)));
        the the = this.W;
        the.b = overlayHidingGradientBackgroundView;
        the.a.a((a<T>) the);
        this.V.a((ImageView) coordinatorLayout.findViewById(R.id.image));
        SkippableAdTextView skippableAdTextView = (SkippableAdTextView) coordinatorLayout.findViewById(R.id.skip_ad_countdown);
        thh thh = this.ad;
        thj thj2 = this.ac;
        thh.c = skippableAdTextView;
        thh.b = thj2;
        thh.c.e();
        thh.a.a((a<T>) thh);
        VoiceAdsView voiceAdsView = (VoiceAdsView) coordinatorLayout.findViewById(R.id.voice_ads_options);
        thi thi = this.af;
        PlayPauseButton playPauseButton = this.ak;
        thi.c = voiceAdsView;
        thi.e = playPauseButton;
        thi.d = this;
        thi.a.a((a<T>) thi);
        thi.c.a((a) thi);
        thd thd = this.b;
        thi thi2 = this.af;
        thd.a = thi2;
        this.V.a = thi2;
        this.ao = new Handler();
        return coordinatorLayout;
    }

    public final void a(int i, int i2, Intent intent) {
        super.a(i, i2, intent);
        if (i == 1 && i2 == -1) {
            a a2 = PermissionsRequestActivity.a(intent);
            if (a2 != null) {
                boolean a3 = a2.a("android.permission.RECORD_AUDIO");
                this.ag.a((VoiceAdLog) VoiceAdLog.k().a(a3 ? "mic_permission_accept" : "mic_permission_deny").a(this.ah.a()).b("audio_psa").g());
                if (!a3) {
                    this.ai.a((Fragment) this);
                }
            }
        }
    }

    public final gkq aj() {
        return PageIdentifiers.NOWPLAYING;
    }

    public final void aw_() {
        super.aw_();
        this.af.b.c();
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
}
