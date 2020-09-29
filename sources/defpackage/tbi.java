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

/* renamed from: tbi reason: default package */
public class tbi extends tho implements a, uqq {
    public tjj T;
    public tkx U;
    public tif V;
    public tlh W;
    public vdy X;
    public tby Y;
    public vdw Z;
    public tit a;
    private SleepTimerButton aA;
    private ConnectView aB;
    private ShareButton aC;
    public vdq aa;
    public veg ab;
    public tbw ac;
    public wzi<tjd> ad;
    public tjf ae;
    public tlf af;
    public tko ag;
    public tkn ah;
    public tme ai;
    public tmc aj;
    public tix ak;
    public tmv al;
    public tbl am;
    public tcm an;
    public tce ao;
    public tcg ap;
    private CloseButton aq;
    private TitleHeader ar;
    private ContextMenuButton at;
    private MarqueeTrackInfoView au;
    private PersistentSeekbarView av;
    private SpeedControlButton aw;
    private SeekBackwardButton ax;
    private PlayPauseButton ay;
    private SeekForwardButton az;
    public tjw b;

    public static tbi a(fqn fqn) {
        tbi tbi = new tbi();
        fqo.a((Fragment) tbi, fqn);
        return tbi;
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
        this.T.a((tjk) this.at);
        TrackCarouselView trackCarouselView = (TrackCarouselView) overlayHidingGradientBackgroundView.findViewById(R.id.track_carousel);
        trackCarouselView.a((tig<ith<PlayerTrack>>) this.V);
        this.U.a(trackCarouselView);
        this.au = (MarqueeTrackInfoView) overlayHidingGradientBackgroundView.findViewById(R.id.track_info_view);
        this.W.a(this.au);
        this.av = (PersistentSeekbarView) overlayHidingGradientBackgroundView.findViewById(R.id.seek_bar_view);
        this.X.a((vdz) this.av);
        this.aw = (SpeedControlButton) overlayHidingGradientBackgroundView.findViewById(R.id.speed_control_button);
        tby tby = this.Y;
        tby.b = this.aw;
        tby.b.a((a) tby);
        this.ax = (SeekBackwardButton) overlayHidingGradientBackgroundView.findViewById(R.id.seek_backward_button);
        this.Z.a((vdx) this.ax);
        this.ay = (PlayPauseButton) overlayHidingGradientBackgroundView.findViewById(R.id.play_pause_button);
        this.aa.a((vdr) this.ay);
        this.az = (SeekForwardButton) overlayHidingGradientBackgroundView.findViewById(R.id.seek_forward_button);
        this.ab.a((veh) this.az);
        this.aA = (SleepTimerButton) overlayHidingGradientBackgroundView.findViewById(R.id.sleep_timer_button);
        tbw tbw = this.ac;
        tbw.b = (tbx) fbp.a(this.aA);
        tbw.b.a((a) tbw);
        tbw.a.a((a<T>) tbw);
        this.aB = (ConnectView) overlayHidingGradientBackgroundView.findViewById(R.id.connect_view_root);
        ((tjd) this.ad.get()).a(this.ae.a(this.aB));
        this.aC = (ShareButton) overlayHidingGradientBackgroundView.findViewById(R.id.share_button);
        this.af.a(this.aC);
        this.ag.a(overlayHidingGradientBackgroundView);
        this.ah.a(overlayHidingGradientBackgroundView);
        this.an.a((tcn) inflate.findViewById(R.id.widgets_container));
        this.ao.a(overlayHidingGradientBackgroundView, (tdq) inflate.findViewById(R.id.scroll_container));
        this.ap.a((tdq) inflate.findViewById(R.id.scroll_container));
        this.aj.a((vcz<ImmersiveMode>) this.ai.a(tkm.a(overlayHidingGradientBackgroundView)));
        return inflate;
    }

    public final uqm ag() {
        return uqo.ax;
    }

    public final gkq aj() {
        return PageIdentifiers.NOWPLAYING;
    }
}
