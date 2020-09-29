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
import com.spotify.music.nowplaying.common.view.background.OverlayHidingGradientBackgroundView;
import com.spotify.music.nowplaying.common.view.close.CloseButton;
import com.spotify.music.nowplaying.common.view.contextmenu.ContextMenuButton;
import com.spotify.music.nowplaying.common.view.header.TitleHeader;
import com.spotify.music.nowplaying.common.view.pager.TrackCarouselView;
import com.spotify.music.nowplaying.common.view.share.ShareButton;
import com.spotify.music.nowplaying.common.view.trackinfo.MarqueeTrackInfoView;
import com.spotify.music.nowplaying.core.immersive.ImmersiveMode;
import com.spotify.nowplaying.ui.components.controls.next.NextButton;
import com.spotify.nowplaying.ui.components.controls.playpause.PlayPauseButton;
import com.spotify.nowplaying.ui.components.controls.previous.PreviousButton;
import com.spotify.nowplaying.ui.components.controls.seekbackward.SeekBackwardButton;
import com.spotify.nowplaying.ui.components.controls.seekbar.PersistentSeekbarView;
import com.spotify.nowplaying.ui.components.controls.seekforward.SeekForwardButton;

/* renamed from: svr reason: default package */
public class svr extends sxh implements a, udv {
    public szc T;
    public taq U;
    public svv V;
    public tba W;
    public ust X;
    public usy Y;
    public usr Z;
    public sym a;
    private ShareButton aA;
    public uso aa;
    public usl ab;
    public ush ac;
    public utb ad;
    public wlc<syw> ae;
    public syy af;
    public tay ag;
    public tah ah;
    public tbx ai;
    public tag aj;
    public tbv ak;
    public syq al;
    public tco am;
    public svu an;
    private CloseButton ao;
    private TitleHeader ap;
    private ContextMenuButton aq;
    private MarqueeTrackInfoView ar;
    private PersistentSeekbarView at;
    private SeekBackwardButton au;
    private PreviousButton av;
    private PlayPauseButton aw;
    private NextButton ax;
    private SeekForwardButton ay;
    private ConnectView az;
    public szp b;

    public static svr a(fpt fpt) {
        svr svr = new svr();
        fpu.a((Fragment) svr, fpt);
        return svr;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.am.a();
        OverlayHidingGradientBackgroundView overlayHidingGradientBackgroundView = (OverlayHidingGradientBackgroundView) layoutInflater.inflate(R.layout.newplaying_video_show_player, viewGroup, false);
        this.al.a(overlayHidingGradientBackgroundView);
        this.ao = (CloseButton) overlayHidingGradientBackgroundView.findViewById(R.id.close_button);
        this.a.a(this.ao);
        this.ap = (TitleHeader) overlayHidingGradientBackgroundView.findViewById(R.id.title_header);
        this.b.a(this.ap);
        this.aq = (ContextMenuButton) overlayHidingGradientBackgroundView.findViewById(R.id.context_menu_button);
        this.T.a((szd) this.aq);
        TrackCarouselView trackCarouselView = (TrackCarouselView) overlayHidingGradientBackgroundView.findViewById(R.id.track_carousel);
        trackCarouselView.a((sxz<iqu<PlayerTrack>>) this.V);
        this.U.a(trackCarouselView);
        this.ar = (MarqueeTrackInfoView) overlayHidingGradientBackgroundView.findViewById(R.id.track_info_view);
        this.W.a(this.ar);
        this.at = (PersistentSeekbarView) overlayHidingGradientBackgroundView.findViewById(R.id.seek_bar_view);
        this.X.a((usu) this.at);
        this.Y.a((usz) overlayHidingGradientBackgroundView.findViewById(R.id.live_indicator));
        this.au = (SeekBackwardButton) overlayHidingGradientBackgroundView.findViewById(R.id.seek_backward_button);
        this.Z.a((uss) this.au);
        this.av = (PreviousButton) overlayHidingGradientBackgroundView.findViewById(R.id.previous_button);
        this.aa.a((usp) this.av);
        this.aw = (PlayPauseButton) overlayHidingGradientBackgroundView.findViewById(R.id.play_pause_button);
        this.ab.a((usm) this.aw);
        this.ax = (NextButton) overlayHidingGradientBackgroundView.findViewById(R.id.next_button);
        this.ac.a((usi) this.ax);
        this.ay = (SeekForwardButton) overlayHidingGradientBackgroundView.findViewById(R.id.seek_forward_button);
        this.ad.a((utc) this.ay);
        this.az = (ConnectView) overlayHidingGradientBackgroundView.findViewById(R.id.connect_view_root);
        ((syw) this.ae.get()).a(syy.a(this.az));
        this.aA = (ShareButton) overlayHidingGradientBackgroundView.findViewById(R.id.share_button);
        this.ag.a(this.aA);
        this.ah.a(overlayHidingGradientBackgroundView);
        this.aj.a(overlayHidingGradientBackgroundView);
        this.ak.a((uru<ImmersiveMode>) this.ai.a(taf.a(overlayHidingGradientBackgroundView)));
        return overlayHidingGradientBackgroundView;
    }

    public final udr ag() {
        return udt.ax;
    }

    public final gjf aj() {
        return PageIdentifiers.NOWPLAYING;
    }
}
