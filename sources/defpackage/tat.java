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
import com.spotify.music.nowplaying.common.view.queue.QueueButton;
import com.spotify.music.nowplaying.common.view.trackinfo.MarqueeTrackInfoView;
import com.spotify.nowplaying.ui.components.controls.next.NextButton;
import com.spotify.nowplaying.ui.components.controls.playpause.PlayPauseButton;
import com.spotify.nowplaying.ui.components.controls.previous.PreviousButton;
import com.spotify.nowplaying.ui.components.controls.seekbar.PersistentSeekbarView;
import com.squareup.picasso.Picasso;

/* renamed from: tat reason: default package */
public class tat extends tho implements a, uqq {
    public tjj T;
    public tkx U;
    public tif V;
    public tlh W;
    public vdy X;
    public tke Y;
    public vdt Z;
    public tit a;
    private ConnectView aA;
    private QueueButton aB;
    private WidgetsContainer aC;
    public vdq aa;
    public vdm ab;
    public thr ac;
    public wzi<tjd> ad;
    public tjf ae;
    public tlb af;
    public tib ag;
    public tcm ah;
    public tix ai;
    public tmv aj;
    public tkn ak;
    public tce al;
    public tcg am;
    public tas an;
    public Picasso ao;
    private CloseButton ap;
    private TitleHeader aq;
    private ContextMenuButton ar;
    private MarqueeTrackInfoView at;
    private PersistentSeekbarView au;
    private HeartButton av;
    private PreviousButton aw;
    private PlayPauseButton ax;
    private NextButton ay;
    private BanButton az;
    public tjw b;

    public static tat a(fqn fqn) {
        tat tat = new tat();
        fqo.a((Fragment) tat, fqn);
        return tat;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.aj.a();
        View inflate = layoutInflater.inflate(R.layout.newplaying_scrolling_feedback_player, viewGroup, false);
        PeekScrollView peekScrollView = (PeekScrollView) inflate.findViewById(R.id.scroll_container);
        OverlayHidingGradientBackgroundView overlayHidingGradientBackgroundView = (OverlayHidingGradientBackgroundView) inflate.findViewById(R.id.overlay_hiding_layout);
        this.ai.a(overlayHidingGradientBackgroundView);
        this.ap = (CloseButton) overlayHidingGradientBackgroundView.findViewById(R.id.close_button);
        this.a.a(this.ap);
        this.aq = (TitleHeader) overlayHidingGradientBackgroundView.findViewById(R.id.title_header);
        this.b.a(this.aq);
        this.ar = (ContextMenuButton) overlayHidingGradientBackgroundView.findViewById(R.id.context_menu_button);
        this.T.a((tjk) this.ar);
        TrackCarouselView trackCarouselView = (TrackCarouselView) overlayHidingGradientBackgroundView.findViewById(R.id.track_carousel);
        trackCarouselView.a((tig<ith<PlayerTrack>>) this.V);
        this.U.a(trackCarouselView);
        this.at = (MarqueeTrackInfoView) overlayHidingGradientBackgroundView.findViewById(R.id.track_info_view);
        this.W.a(this.at);
        this.au = (PersistentSeekbarView) overlayHidingGradientBackgroundView.findViewById(R.id.seek_bar_view);
        this.X.a((vdz) this.au);
        this.av = (HeartButton) overlayHidingGradientBackgroundView.findViewById(R.id.heart_button);
        this.Y.a(this.av);
        this.aw = (PreviousButton) overlayHidingGradientBackgroundView.findViewById(R.id.previous_button);
        this.Z.a((vdu) this.aw);
        this.ax = (PlayPauseButton) overlayHidingGradientBackgroundView.findViewById(R.id.play_pause_button);
        this.aa.a((vdr) this.ax);
        this.ay = (NextButton) overlayHidingGradientBackgroundView.findViewById(R.id.next_button);
        this.ab.a((vdn) this.ay);
        this.az = (BanButton) overlayHidingGradientBackgroundView.findViewById(R.id.ban_button);
        this.ac.a(this.az);
        this.aA = (ConnectView) overlayHidingGradientBackgroundView.findViewById(R.id.connect_view_root);
        ((tjd) this.ad.get()).a(this.ae.a(this.aA));
        this.aB = (QueueButton) overlayHidingGradientBackgroundView.findViewById(R.id.queue_button);
        this.af.a((tlc) this.aB);
        CanvasArtistWidgetView canvasArtistWidgetView = (CanvasArtistWidgetView) overlayHidingGradientBackgroundView.findViewById(R.id.canvas_artist_view);
        canvasArtistWidgetView.a = this.ao;
        this.ag.a(canvasArtistWidgetView, overlayHidingGradientBackgroundView);
        this.aC = (WidgetsContainer) inflate.findViewById(R.id.widgets_container);
        this.ah.a((tcn) this.aC);
        this.al.a(overlayHidingGradientBackgroundView, (tdq) inflate.findViewById(R.id.scroll_container));
        this.am.a(peekScrollView);
        this.ak.a(overlayHidingGradientBackgroundView);
        return inflate;
    }

    public final uqm ag() {
        return uqo.ax;
    }

    public final gkq aj() {
        return PageIdentifiers.NOWPLAYING;
    }
}
