package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.connect.view.ConnectView;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.R;
import com.spotify.music.newplaying.podcast.sleeptimer.SleepTimerButton;
import com.spotify.music.newplaying.podcast.speedcontrol.SpeedControlButton;
import com.spotify.music.nowplaying.common.view.background.OverlayHidingGradientBackgroundView;
import com.spotify.music.nowplaying.common.view.close.CloseButton;
import com.spotify.music.nowplaying.common.view.contextmenu.ContextMenuButton;
import com.spotify.music.nowplaying.common.view.header.TitleHeader;
import com.spotify.music.nowplaying.common.view.pager.TrackCarouselView;
import com.spotify.music.nowplaying.common.view.share.ShareButton;
import com.spotify.music.nowplaying.common.view.trackinfo.MarqueeTrackInfoView;
import com.spotify.music.nowplaying.core.immersive.ImmersiveMode;
import com.spotify.nowplaying.ui.components.controls.playpause.PlayPauseButton;
import com.spotify.nowplaying.ui.components.controls.seekbackward.SeekBackwardButton;
import com.spotify.nowplaying.ui.components.controls.seekbar.PersistentSeekbarView;
import com.spotify.nowplaying.ui.components.controls.seekforward.SeekForwardButton;

/* renamed from: srb reason: default package */
public class srb extends sxh implements a, udv {
    public szc T;
    public taq U;
    public sxy V;
    public tba W;
    public ust X;
    public srr Y;
    public usr Z;
    public sym a;
    private SleepTimerButton aA;
    private ConnectView aB;
    private ShareButton aC;
    public usl aa;
    public utb ab;
    public srp ac;
    public wlc<syw> ad;
    public syy ae;
    public tay af;
    public tah ag;
    public tag ah;
    public tbx ai;
    public tbv aj;
    public syq ak;
    public tco al;
    public sre am;
    public ssf an;
    public srx ao;
    public srz ap;
    private CloseButton aq;
    private TitleHeader ar;
    private ContextMenuButton at;
    private MarqueeTrackInfoView au;
    private PersistentSeekbarView av;
    private SpeedControlButton aw;
    private SeekBackwardButton ax;
    private PlayPauseButton ay;
    private SeekForwardButton az;
    public szp b;

    public static srb a(fpt fpt) {
        srb srb = new srb();
        fpu.a((Fragment) srb, fpt);
        return srb;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.al.a();
        View inflate = layoutInflater.inflate(R.layout.newplaying_scrolling_podcast_player, viewGroup, false);
        OverlayHidingGradientBackgroundView overlayHidingGradientBackgroundView = (OverlayHidingGradientBackgroundView) inflate.findViewById(R.id.overlay_hiding_layout);
        this.ak.a(overlayHidingGradientBackgroundView);
        this.aq = (CloseButton) overlayHidingGradientBackgroundView.findViewById(R.id.close_button);
        this.a.a(this.aq);
        this.ar = (TitleHeader) overlayHidingGradientBackgroundView.findViewById(R.id.title_header);
        this.b.a(this.ar);
        this.at = (ContextMenuButton) overlayHidingGradientBackgroundView.findViewById(R.id.context_menu_button);
        this.T.a((szd) this.at);
        TrackCarouselView trackCarouselView = (TrackCarouselView) overlayHidingGradientBackgroundView.findViewById(R.id.track_carousel);
        trackCarouselView.a((sxz<iqu<PlayerTrack>>) this.V);
        this.U.a(trackCarouselView);
        this.au = (MarqueeTrackInfoView) overlayHidingGradientBackgroundView.findViewById(R.id.track_info_view);
        this.W.a(this.au);
        this.av = (PersistentSeekbarView) overlayHidingGradientBackgroundView.findViewById(R.id.seek_bar_view);
        this.X.a((usu) this.av);
        this.aw = (SpeedControlButton) overlayHidingGradientBackgroundView.findViewById(R.id.speed_control_button);
        srr srr = this.Y;
        srr.b = this.aw;
        srr.b.a((a) srr);
        this.ax = (SeekBackwardButton) overlayHidingGradientBackgroundView.findViewById(R.id.seek_backward_button);
        this.Z.a((uss) this.ax);
        this.ay = (PlayPauseButton) overlayHidingGradientBackgroundView.findViewById(R.id.play_pause_button);
        this.aa.a((usm) this.ay);
        this.az = (SeekForwardButton) overlayHidingGradientBackgroundView.findViewById(R.id.seek_forward_button);
        this.ab.a((utc) this.az);
        this.aA = (SleepTimerButton) overlayHidingGradientBackgroundView.findViewById(R.id.sleep_timer_button);
        srp srp = this.ac;
        srp.b = (srq) fay.a(this.aA);
        srp.b.a((a) srp);
        srp.a.a((a<T>) srp);
        this.aB = (ConnectView) overlayHidingGradientBackgroundView.findViewById(R.id.connect_view_root);
        ((syw) this.ad.get()).a(syy.a(this.aB));
        this.aC = (ShareButton) overlayHidingGradientBackgroundView.findViewById(R.id.share_button);
        this.af.a(this.aC);
        this.ag.a(overlayHidingGradientBackgroundView);
        this.ah.a(overlayHidingGradientBackgroundView);
        this.an.a((ssg) inflate.findViewById(R.id.widgets_container));
        this.ao.a(overlayHidingGradientBackgroundView, (stj) inflate.findViewById(R.id.scroll_container));
        this.ap.a((stj) inflate.findViewById(R.id.scroll_container));
        this.aj.a((uru<ImmersiveMode>) this.ai.a(taf.a(overlayHidingGradientBackgroundView)));
        return inflate;
    }

    public final udr ag() {
        return udt.ax;
    }

    public final gjf aj() {
        return PageIdentifiers.NOWPLAYING;
    }
}
