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
import com.spotify.nowplaying.ui.components.repeat.RepeatButton;
import com.spotify.nowplaying.ui.components.shuffle.ShuffleButton;
import com.squareup.picasso.Picasso;

/* renamed from: tal reason: default package */
public class tal extends tho implements a, uqq {
    public tjj T;
    public tkx U;
    public tif V;
    public tlh W;
    public tke X;
    public vdy Y;
    public veq Z;
    public tit a;
    private PreviousButton aA;
    private PlayPauseButton aB;
    private NextButton aC;
    private RepeatButton aD;
    private ConnectView aE;
    private QueueButton aF;
    private WidgetsContainer aG;
    public vdt aa;
    public vdq ab;
    public vdm ac;
    public vel ad;
    public wzi<tjd> ae;
    public tjf af;
    public tlb ag;
    public tib ah;
    public tcm ai;
    public tix aj;
    public tmv ak;
    public tkn al;
    public tce am;
    public tcg an;
    public tak ao;
    public Picasso ap;
    public trg aq;
    public trk ar;
    private CloseButton at;
    private TitleHeader au;
    private ContextMenuButton av;
    private MarqueeTrackInfoView aw;
    private HeartButton ax;
    private PersistentSeekbarView ay;
    private ShuffleButton az;
    public tjw b;

    public static tal a(fqn fqn) {
        tal tal = new tal();
        fqo.a((Fragment) tal, fqn);
        return tal;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ak.a();
        View inflate = layoutInflater.inflate(R.layout.newplaying_scrolling_default_player, viewGroup, false);
        PeekScrollView peekScrollView = (PeekScrollView) inflate.findViewById(R.id.scroll_container);
        OverlayHidingGradientBackgroundView overlayHidingGradientBackgroundView = (OverlayHidingGradientBackgroundView) inflate.findViewById(R.id.overlay_hiding_layout);
        this.aj.a(overlayHidingGradientBackgroundView);
        this.at = (CloseButton) overlayHidingGradientBackgroundView.findViewById(R.id.close_button);
        this.a.a(this.at);
        this.au = (TitleHeader) overlayHidingGradientBackgroundView.findViewById(R.id.title_header);
        this.b.a(this.au);
        this.av = (ContextMenuButton) overlayHidingGradientBackgroundView.findViewById(R.id.context_menu_button);
        this.T.a((tjk) this.av);
        TrackCarouselView trackCarouselView = (TrackCarouselView) overlayHidingGradientBackgroundView.findViewById(R.id.track_carousel);
        trackCarouselView.a((tig<ith<PlayerTrack>>) this.V);
        this.U.a(trackCarouselView);
        this.aw = (MarqueeTrackInfoView) overlayHidingGradientBackgroundView.findViewById(R.id.track_info_view);
        this.W.a(this.aw);
        this.ax = (HeartButton) overlayHidingGradientBackgroundView.findViewById(R.id.heart_button);
        this.X.a(this.ax);
        this.ay = (PersistentSeekbarView) overlayHidingGradientBackgroundView.findViewById(R.id.seek_bar_view);
        this.Y.a((vdz) this.ay);
        this.az = (ShuffleButton) overlayHidingGradientBackgroundView.findViewById(R.id.shuffle_button);
        this.Z.a((ver) this.az);
        this.aA = (PreviousButton) overlayHidingGradientBackgroundView.findViewById(R.id.previous_button);
        this.aa.a((vdu) this.aA);
        this.aB = (PlayPauseButton) overlayHidingGradientBackgroundView.findViewById(R.id.play_pause_button);
        this.ab.a((vdr) this.aB);
        this.aC = (NextButton) overlayHidingGradientBackgroundView.findViewById(R.id.next_button);
        this.ac.a((vdn) this.aC);
        this.aD = (RepeatButton) overlayHidingGradientBackgroundView.findViewById(R.id.repeat_button);
        this.ad.a((vem) this.aD);
        this.aE = (ConnectView) overlayHidingGradientBackgroundView.findViewById(R.id.connect_view_root);
        ((tjd) this.ae.get()).a(this.af.a(this.aE));
        this.aF = (QueueButton) overlayHidingGradientBackgroundView.findViewById(R.id.queue_button);
        this.ag.a((tlc) this.aF);
        CanvasArtistWidgetView canvasArtistWidgetView = (CanvasArtistWidgetView) overlayHidingGradientBackgroundView.findViewById(R.id.canvas_artist_view);
        canvasArtistWidgetView.a = this.ap;
        this.ah.a(canvasArtistWidgetView, overlayHidingGradientBackgroundView);
        this.aG = (WidgetsContainer) inflate.findViewById(R.id.widgets_container);
        this.ai.a((tcn) this.aG);
        this.am.a(overlayHidingGradientBackgroundView, (tdq) inflate.findViewById(R.id.scroll_container));
        this.an.a(peekScrollView);
        this.al.a(overlayHidingGradientBackgroundView);
        this.aq.a((ViewGroup) inflate, (SeekBar) this.ay.findViewById(R.id.seek_bar), new $$Lambda$tal$Or1BDwRvN5V6coMYhgaSkah6zI(peekScrollView), this.ar);
        return inflate;
    }

    public final uqm ag() {
        return uqo.ax;
    }

    public final gkq aj() {
        return PageIdentifiers.NOWPLAYING;
    }
}