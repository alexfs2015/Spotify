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

/* renamed from: sqm reason: default package */
public class sqm extends sxh implements a, udv {
    public szc T;
    public taq U;
    public sxy V;
    public tba W;
    public ust X;
    public szx Y;
    public uso Z;
    public sym a;
    private ConnectView aA;
    private QueueButton aB;
    private WidgetsContainer aC;
    public usl aa;
    public ush ab;
    public sxk ac;
    public wlc<syw> ad;
    public syy ae;
    public tau af;
    public sxu ag;
    public ssf ah;
    public syq ai;
    public tco aj;
    public tag ak;
    public srx al;
    public srz am;
    public sql an;
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
    public szp b;

    public static sqm a(fpt fpt) {
        sqm sqm = new sqm();
        fpu.a((Fragment) sqm, fpt);
        return sqm;
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
        this.T.a((szd) this.ar);
        TrackCarouselView trackCarouselView = (TrackCarouselView) overlayHidingGradientBackgroundView.findViewById(R.id.track_carousel);
        trackCarouselView.a((sxz<iqu<PlayerTrack>>) this.V);
        this.U.a(trackCarouselView);
        this.at = (MarqueeTrackInfoView) overlayHidingGradientBackgroundView.findViewById(R.id.track_info_view);
        this.W.a(this.at);
        this.au = (PersistentSeekbarView) overlayHidingGradientBackgroundView.findViewById(R.id.seek_bar_view);
        this.X.a((usu) this.au);
        this.av = (HeartButton) overlayHidingGradientBackgroundView.findViewById(R.id.heart_button);
        this.Y.a(this.av);
        this.aw = (PreviousButton) overlayHidingGradientBackgroundView.findViewById(R.id.previous_button);
        this.Z.a((usp) this.aw);
        this.ax = (PlayPauseButton) overlayHidingGradientBackgroundView.findViewById(R.id.play_pause_button);
        this.aa.a((usm) this.ax);
        this.ay = (NextButton) overlayHidingGradientBackgroundView.findViewById(R.id.next_button);
        this.ab.a((usi) this.ay);
        this.az = (BanButton) overlayHidingGradientBackgroundView.findViewById(R.id.ban_button);
        this.ac.a(this.az);
        this.aA = (ConnectView) overlayHidingGradientBackgroundView.findViewById(R.id.connect_view_root);
        ((syw) this.ad.get()).a(syy.a(this.aA));
        this.aB = (QueueButton) overlayHidingGradientBackgroundView.findViewById(R.id.queue_button);
        this.af.a((tav) this.aB);
        CanvasArtistWidgetView canvasArtistWidgetView = (CanvasArtistWidgetView) overlayHidingGradientBackgroundView.findViewById(R.id.canvas_artist_view);
        canvasArtistWidgetView.a = this.ao;
        this.ag.a(canvasArtistWidgetView, overlayHidingGradientBackgroundView);
        this.aC = (WidgetsContainer) inflate.findViewById(R.id.widgets_container);
        this.ah.a((ssg) this.aC);
        this.al.a(overlayHidingGradientBackgroundView, (stj) inflate.findViewById(R.id.scroll_container));
        this.am.a(peekScrollView);
        this.ak.a(overlayHidingGradientBackgroundView);
        return inflate;
    }

    public final udr ag() {
        return udt.ax;
    }

    public final gjf aj() {
        return PageIdentifiers.NOWPLAYING;
    }
}
