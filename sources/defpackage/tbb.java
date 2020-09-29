package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.connect.view.ConnectView;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.R;
import com.spotify.music.newplaying.scroll.container.WidgetsContainer;
import com.spotify.music.newplaying.scroll.view.PeekScrollView;
import com.spotify.music.nowplaying.common.view.background.OverlayHidingGradientBackgroundView;
import com.spotify.music.nowplaying.common.view.ban.BanButton;
import com.spotify.music.nowplaying.common.view.canvas.artist.CanvasArtistWidgetView;
import com.spotify.music.nowplaying.common.view.close.CloseButton;
import com.spotify.music.nowplaying.common.view.contextmenu.ContextMenuButton;
import com.spotify.music.nowplaying.common.view.header.TitleHeader;
import com.spotify.music.nowplaying.common.view.heart.HeartButton;
import com.spotify.music.nowplaying.common.view.pager.TrackCarouselView;
import com.spotify.music.nowplaying.common.view.share.ShareButton;
import com.spotify.music.nowplaying.common.view.trackinfo.MarqueeTrackInfoView;
import com.spotify.nowplaying.ui.components.controls.next.NextButton;
import com.spotify.nowplaying.ui.components.controls.playpause.PlayPauseButton;
import com.spotify.nowplaying.ui.components.controls.previous.PreviousButton;
import com.spotify.nowplaying.ui.components.controls.seekbar.PersistentSeekbarView;
import com.squareup.picasso.Picasso;

/* renamed from: tbb reason: default package */
public class tbb extends tho implements a, uqq {
    public tjj T;
    public tbh U;
    public tif V;
    public tlh W;
    public vdy X;
    public tjz Y;
    public vdt Z;
    public tit a;
    private NextButton aA;
    private BanButton aB;
    private ConnectView aC;
    private ShareButton aD;
    private WidgetsContainer aE;
    public vdq aa;
    public tbg ab;
    public tht ac;
    public wzi<tjd> ad;
    public tjf ae;
    public tlf af;
    public tib ag;
    public tcm ah;
    public tix ai;
    public tmv aj;
    public tkn ak;
    public tce al;
    public tcg am;
    public tba an;
    public Picasso ao;
    public trg ap;
    public trk aq;
    private CloseButton ar;
    private TitleHeader at;
    private ContextMenuButton au;
    private MarqueeTrackInfoView av;
    private PersistentSeekbarView aw;
    private HeartButton ax;
    private PreviousButton ay;
    private PlayPauseButton az;
    public tjw b;

    public static tbb a(fqn fqn) {
        tbb tbb = new tbb();
        fqo.a((Fragment) tbb, fqn);
        return tbb;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.aj.a();
        View inflate = layoutInflater.inflate(R.layout.newplaying_scrolling_freetier_player, viewGroup, false);
        PeekScrollView peekScrollView = (PeekScrollView) inflate.findViewById(R.id.scroll_container);
        OverlayHidingGradientBackgroundView overlayHidingGradientBackgroundView = (OverlayHidingGradientBackgroundView) inflate.findViewById(R.id.overlay_hiding_layout);
        overlayHidingGradientBackgroundView.a(overlayHidingGradientBackgroundView.findViewById(R.id.player_overlay));
        this.ai.a(overlayHidingGradientBackgroundView);
        this.ar = (CloseButton) overlayHidingGradientBackgroundView.findViewById(R.id.close_button);
        this.a.a(this.ar);
        this.at = (TitleHeader) overlayHidingGradientBackgroundView.findViewById(R.id.title_header);
        this.b.a(this.at);
        this.au = (ContextMenuButton) overlayHidingGradientBackgroundView.findViewById(R.id.context_menu_button);
        this.T.a((tjk) this.au);
        TrackCarouselView trackCarouselView = (TrackCarouselView) overlayHidingGradientBackgroundView.findViewById(R.id.track_carousel);
        trackCarouselView.a((tig<ith<PlayerTrack>>) this.V);
        this.U.a(trackCarouselView);
        this.av = (MarqueeTrackInfoView) overlayHidingGradientBackgroundView.findViewById(R.id.track_info_view);
        this.W.a(this.av);
        this.aw = (PersistentSeekbarView) overlayHidingGradientBackgroundView.findViewById(R.id.seek_bar_view);
        this.X.a((vdz) this.aw);
        this.ax = (HeartButton) overlayHidingGradientBackgroundView.findViewById(R.id.heart_button);
        this.Y.a(this.ax);
        this.ay = (PreviousButton) overlayHidingGradientBackgroundView.findViewById(R.id.previous_button);
        this.Z.a((vdu) this.ay);
        this.az = (PlayPauseButton) overlayHidingGradientBackgroundView.findViewById(R.id.play_pause_button);
        this.aa.a((vdr) this.az);
        this.aA = (NextButton) overlayHidingGradientBackgroundView.findViewById(R.id.next_button);
        this.ab.a((vdn) this.aA);
        this.aB = (BanButton) overlayHidingGradientBackgroundView.findViewById(R.id.ban_button);
        this.ac.a(this.aB);
        this.aC = (ConnectView) overlayHidingGradientBackgroundView.findViewById(R.id.connect_view_root);
        ((tjd) this.ad.get()).a(this.ae.a(this.aC));
        this.aD = (ShareButton) overlayHidingGradientBackgroundView.findViewById(R.id.share_button);
        this.af.a(this.aD);
        CanvasArtistWidgetView canvasArtistWidgetView = (CanvasArtistWidgetView) overlayHidingGradientBackgroundView.findViewById(R.id.canvas_artist_view);
        canvasArtistWidgetView.a = this.ao;
        this.ag.a(canvasArtistWidgetView, overlayHidingGradientBackgroundView);
        this.aE = (WidgetsContainer) inflate.findViewById(R.id.widgets_container);
        this.ah.a((tcn) this.aE);
        this.al.a(overlayHidingGradientBackgroundView, (tdq) inflate.findViewById(R.id.scroll_container));
        this.am.a(peekScrollView);
        this.ak.a(overlayHidingGradientBackgroundView);
        this.ap.a((ViewGroup) inflate, (SeekBar) this.aw.findViewById(R.id.seek_bar), new $$Lambda$tbb$RVc1jlmlQaP2x3Qpv51uYU_B96c(peekScrollView), this.aq);
        return inflate;
    }

    public final uqm ag() {
        return uqo.ax;
    }

    public final gkq aj() {
        return PageIdentifiers.NOWPLAYING;
    }
}
