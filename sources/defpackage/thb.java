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

/* renamed from: thb reason: default package */
public class thb extends sxh implements udv {
    public usl T;
    public thx U;
    public tht V;
    public ths W;
    public jzd X;
    public tco Y;
    public tbv Z;
    public thv a;
    public tbx aa;
    public tah ab;
    public tgy ac;
    public tgx ad;
    public thc ae;
    public thq af;
    public hze ag;
    private SkippableAdTextView ah;
    private VideoSurfaceView ai;
    private PlayPauseButton aj;
    public tia b;

    public static thb a(fpt fpt) {
        fay.a(fpt);
        thb thb = new thb();
        thb.g(new Bundle());
        fpu.a((Fragment) thb, fpt);
        return thb;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VideoAdOverlayHidingFrameLayout videoAdOverlayHidingFrameLayout = (VideoAdOverlayHidingFrameLayout) layoutInflater.inflate(R.layout.fragment_video_ads_npv, viewGroup, false);
        videoAdOverlayHidingFrameLayout.a(videoAdOverlayHidingFrameLayout.findViewById(R.id.video_ads_player_overlay));
        this.Y.a();
        this.ab.a(videoAdOverlayHidingFrameLayout);
        videoAdOverlayHidingFrameLayout.b = this.ag.c.a(hze.a, 2000);
        this.ad.a((thr) videoAdOverlayHidingFrameLayout);
        tgy tgy = this.ac;
        ConstraintLayout constraintLayout = (ConstraintLayout) videoAdOverlayHidingFrameLayout.findViewById(R.id.video_ads_renderer_layout);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) videoAdOverlayHidingFrameLayout.findViewById(R.id.video_ads_player_overlay);
        ViewGroup viewGroup2 = (ViewGroup) videoAdOverlayHidingFrameLayout.findViewById(R.id.play_pause_button_container);
        tgy.c = videoAdOverlayHidingFrameLayout;
        tgy.d = (ConstraintLayout) fay.a(constraintLayout);
        tgy.e = (ConstraintLayout) fay.a(constraintLayout2);
        tgy.f = (ViewGroup) fay.a(viewGroup2);
        tgy.c.setFitsSystemWindows(true);
        tgy.a.a((a<T>) tgy);
        this.ac.b = this.ad;
        VideoAdsTitleView videoAdsTitleView = (VideoAdsTitleView) videoAdOverlayHidingFrameLayout.findViewById(R.id.video_ads_display_title);
        tia tia = this.b;
        tia.b = videoAdsTitleView;
        tia.a.a((a<T>) tia);
        VideoAdsInfoView videoAdsInfoView = (VideoAdsInfoView) videoAdOverlayHidingFrameLayout.findViewById(R.id.video_ads_info);
        thv thv = this.a;
        thv.b = videoAdsInfoView;
        thv.a.a((a<T>) thv);
        this.aj = (PlayPauseButton) videoAdOverlayHidingFrameLayout.findViewById(R.id.play_pause_button);
        this.T.a((usm) this.aj);
        VideoAdsActionView videoAdsActionView = (VideoAdsActionView) videoAdOverlayHidingFrameLayout.findViewById(R.id.ad_call_to_action);
        tht tht = this.V;
        tht.d.a(tht.g);
        tht.b.a(tht.h);
        tht.c = videoAdsActionView;
        tht.c.a((a) tht);
        tht.a.a((a<T>) tht);
        this.ah = (SkippableAdTextView) videoAdOverlayHidingFrameLayout.findViewById(R.id.skip_ad_button);
        ths ths = this.W;
        ths.b = this.ah;
        ths.b.a((a) ths);
        ths.a.a((a<T>) ths);
        tic tic = new tic((ProgressBar) videoAdOverlayHidingFrameLayout.findViewById(R.id.playback_progress));
        thx thx = this.U;
        thx.b = tic;
        thx.a.a((a<T>) thx);
        this.ai = ((VideoAdsRendererView) videoAdOverlayHidingFrameLayout.findViewById(R.id.video_ads_renderer_view)).b;
        this.Z.a((uru<ImmersiveMode>) this.aa.a(taf.a(videoAdOverlayHidingFrameLayout)));
        this.af.a();
        return videoAdOverlayHidingFrameLayout;
    }

    public final void g() {
        super.g();
        this.X.a(this.ai);
    }

    public final void h() {
        super.h();
        this.X.b(this.ai);
    }

    public final gjf aj() {
        return PageIdentifiers.NOWPLAYINGV2;
    }
}
