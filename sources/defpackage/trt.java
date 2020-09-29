package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.spotlets.ads.skippable.view.SkippableAdTextView;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.music.R;
import com.spotify.music.nowplaying.core.immersive.ImmersiveMode;
import com.spotify.music.nowplaying.videoads.overlay.VideoAdOverlayHidingFrameLayout;
import com.spotify.music.nowplaying.videoads.widget.view.PlayPauseButton;
import com.spotify.music.nowplaying.videoads.widget.view.VideoAdsActionView;
import com.spotify.music.nowplaying.videoads.widget.view.VideoAdsInfoView;
import com.spotify.music.nowplaying.videoads.widget.view.VideoAdsRendererView;
import com.spotify.music.nowplaying.videoads.widget.view.VideoAdsTitleView;

/* renamed from: trt reason: default package */
public class trt extends tho implements uqq {
    public vdq T;
    public tsp U;
    public tsl V;
    public tsk W;
    public kbd X;
    public tmv Y;
    public tmc Z;
    public tsn a;
    public tme aa;
    public tko ab;
    public trq ac;
    public trp ad;
    public tru ae;
    public tsi af;
    public ibq ag;
    private SkippableAdTextView ah;
    private VideoSurfaceView ai;
    private PlayPauseButton aj;
    public tss b;

    public static trt a(fqn fqn) {
        fbp.a(fqn);
        trt trt = new trt();
        trt.g(new Bundle());
        fqo.a((Fragment) trt, fqn);
        return trt;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VideoAdOverlayHidingFrameLayout videoAdOverlayHidingFrameLayout = (VideoAdOverlayHidingFrameLayout) layoutInflater.inflate(R.layout.fragment_video_ads_npv, viewGroup, false);
        videoAdOverlayHidingFrameLayout.a(videoAdOverlayHidingFrameLayout.findViewById(R.id.video_ads_player_overlay));
        this.Y.a();
        this.ab.a(videoAdOverlayHidingFrameLayout);
        videoAdOverlayHidingFrameLayout.b = this.ag.c.a(ibq.a, 2000);
        this.ad.a((tsj) videoAdOverlayHidingFrameLayout);
        trq trq = this.ac;
        ConstraintLayout constraintLayout = (ConstraintLayout) videoAdOverlayHidingFrameLayout.findViewById(R.id.video_ads_renderer_layout);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) videoAdOverlayHidingFrameLayout.findViewById(R.id.video_ads_player_overlay);
        ViewGroup viewGroup2 = (ViewGroup) videoAdOverlayHidingFrameLayout.findViewById(R.id.play_pause_button_container);
        trq.c = videoAdOverlayHidingFrameLayout;
        trq.d = (ConstraintLayout) fbp.a(constraintLayout);
        trq.e = (ConstraintLayout) fbp.a(constraintLayout2);
        trq.f = (ViewGroup) fbp.a(viewGroup2);
        trq.c.setFitsSystemWindows(true);
        trq.a.a((a<T>) trq);
        this.ac.b = this.ad;
        VideoAdsTitleView videoAdsTitleView = (VideoAdsTitleView) videoAdOverlayHidingFrameLayout.findViewById(R.id.video_ads_display_title);
        tss tss = this.b;
        tss.b = videoAdsTitleView;
        tss.a.a((a<T>) tss);
        VideoAdsInfoView videoAdsInfoView = (VideoAdsInfoView) videoAdOverlayHidingFrameLayout.findViewById(R.id.video_ads_info);
        tsn tsn = this.a;
        tsn.b = videoAdsInfoView;
        tsn.a.a((a<T>) tsn);
        this.aj = (PlayPauseButton) videoAdOverlayHidingFrameLayout.findViewById(R.id.play_pause_button);
        this.T.a((vdr) this.aj);
        VideoAdsActionView videoAdsActionView = (VideoAdsActionView) videoAdOverlayHidingFrameLayout.findViewById(R.id.ad_call_to_action);
        tsl tsl = this.V;
        tsl.d.a(tsl.g);
        tsl.b.a(tsl.h);
        tsl.c = videoAdsActionView;
        tsl.c.a((a) tsl);
        tsl.a.a((a<T>) tsl);
        this.ah = (SkippableAdTextView) videoAdOverlayHidingFrameLayout.findViewById(R.id.skip_ad_button);
        tsk tsk = this.W;
        tsk.b = this.ah;
        tsk.b.a((a) tsk);
        tsk.a.a((a<T>) tsk);
        tsu tsu = new tsu((ProgressBar) videoAdOverlayHidingFrameLayout.findViewById(R.id.playback_progress));
        tsp tsp = this.U;
        tsp.b = tsu;
        tsp.a.a((a<T>) tsp);
        this.ai = ((VideoAdsRendererView) videoAdOverlayHidingFrameLayout.findViewById(R.id.video_ads_renderer_view)).b;
        this.Z.a((vcz<ImmersiveMode>) this.aa.a(tkm.a(videoAdOverlayHidingFrameLayout)));
        this.af.a();
        return videoAdOverlayHidingFrameLayout;
    }

    public final void aP_() {
        super.aP_();
        this.X.a(this.ai);
    }

    public final gkq aj() {
        return PageIdentifiers.NOWPLAYINGV2;
    }

    public final void h() {
        super.h();
        this.X.b(this.ai);
    }
}
