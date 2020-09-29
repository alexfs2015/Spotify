package defpackage;

import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import androidx.fragment.app.Fragment;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.ui.view.SuppressLayoutTextView;
import com.spotify.mobile.android.ui.view.snackbar.SnackBar.SnackAnimation;
import com.spotify.music.R;
import com.spotify.music.nowplaying.common.view.close.CloseButton;
import com.spotify.music.nowplaying.common.view.contextmenu.ContextMenuButton;
import com.spotify.music.nowplaying.common.view.heart.HeartButton;
import com.spotify.music.nowplaying.common.view.pager.TrackCarouselView;
import com.spotify.music.nowplaying.common.view.progressbar.TrackProgressBar;
import com.spotify.music.nowplaying.drivingmode.view.ads.DrivingAdNowPlayingBar;
import com.spotify.music.nowplaying.drivingmode.view.backgroundgradients.DrivingOverlayNpvGradientBackgroundView;
import com.spotify.music.nowplaying.drivingmode.view.ban.DrivingBanButton;
import com.spotify.music.nowplaying.drivingmode.view.coachmark.DrivingCoachMarkView;
import com.spotify.music.nowplaying.drivingmode.view.connectionlabel.ConnectionLabelView;
import com.spotify.music.nowplaying.drivingmode.view.contexttitle.ContextTitle;
import com.spotify.music.nowplaying.drivingmode.view.next.DrivingNextButton;
import com.spotify.music.nowplaying.drivingmode.view.pivot.PivotContainerView;
import com.spotify.music.nowplaying.drivingmode.view.playercontrols.DrivingPlayerControlsView;
import com.spotify.music.nowplaying.drivingmode.view.playpause.DrivingPlayPauseButton;
import com.spotify.music.nowplaying.drivingmode.view.previous.DrivingPreviousButton;
import com.spotify.music.nowplaying.drivingmode.view.seekbar.DrivingSeekbarView;
import com.spotify.music.nowplaying.drivingmode.view.showvoiceviewbutton.DrivingShowVoiceViewButton;
import com.spotify.music.nowplaying.drivingmode.view.shuffle.DrivingShuffleButton;
import com.spotify.music.nowplaying.drivingmode.view.verticalsplitlayout.VerticalSplitLayout;
import com.spotify.music.nowplaying.drivingmode.view.waze.WazeSnackBar;
import com.spotify.nowplaying.ui.components.controls.seekbackward.SeekBackwardButton;
import com.spotify.nowplaying.ui.components.controls.seekforward.SeekForwardButton;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: tow reason: default package */
public class tow extends tho implements OnKeyListener, tov, tpj, tqf, tqs, a, uqq {
    public tjw T;
    public tnx U;
    public vdw V;
    public veg W;
    public vdq X;
    public vdm Y;
    public vdt Z;
    public tit a;
    public toc aA;
    private wzi<tox> aB;
    private VerticalSplitLayout aC;
    private tpi aD;
    private ViewGroup aE;
    private View aF;
    private PivotContainerView aG;
    private DrivingCoachMarkView aH;
    private FrameLayout aI;
    private FrameLayout aJ;
    public vdq aa;
    public vdm ab;
    public vdt ac;
    public vdq ad;
    public vdm ae;
    public vdt af;
    public tny ag;
    public veq ah;
    public tnv ai;
    public toa aj;
    public tnz ak;
    public tpa al;
    public tob am;
    public toe an;
    public tnt ao;
    public tne ap;
    public tmv aq;
    public tog ar;
    public tok at;
    public tkz au;
    public tpb av;
    public tkx aw;
    public tns ax;
    public toq ay;
    public tnu az;
    public tnw b;

    public static tow a(fqn fqn) {
        tow tow = new tow();
        fqo.a((Fragment) tow, fqn);
        return tow;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ tox a(WazeSnackBar wazeSnackBar, DrivingPreviousButton drivingPreviousButton, DrivingPreviousButton drivingPreviousButton2, DrivingPlayPauseButton drivingPlayPauseButton, DrivingPlayPauseButton drivingPlayPauseButton2, DrivingNextButton drivingNextButton, DrivingNextButton drivingNextButton2, SeekBackwardButton seekBackwardButton, SeekForwardButton seekForwardButton, HeartButton heartButton, DrivingBanButton drivingBanButton, DrivingShuffleButton drivingShuffleButton, ConnectionLabelView connectionLabelView, DrivingSeekbarView drivingSeekbarView) {
        WazeSnackBar wazeSnackBar2 = wazeSnackBar;
        WazeSnackBar wazeSnackBar3 = wazeSnackBar2;
        tox tox = new tox(wazeSnackBar3, this, this.b, drivingPreviousButton, drivingPreviousButton2, drivingPlayPauseButton, drivingPlayPauseButton2, drivingNextButton, drivingNextButton2, seekBackwardButton, seekForwardButton, heartButton, drivingBanButton, drivingShuffleButton, connectionLabelView, this.aC, this.aG, drivingSeekbarView, this.aw);
        return tox;
    }

    /* access modifiers changed from: private */
    public void a(OnKeyListener onKeyListener) {
        this.aC.setOnKeyListener(onKeyListener);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(float f, boolean z) {
        toc toc = this.aA;
        toc.c.a(f, false);
        if (f == 1.0f) {
            if (z) {
                toc.a.b();
                return;
            }
            toc.a.a();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.aA.b.c();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(float f, boolean z) {
        toc toc = this.aA;
        toc.c.a(f, true);
        if (f == 1.0f) {
            if (z) {
                toc.a.d();
            } else if (toc.d) {
                toc.d = false;
            } else {
                toc.a.c();
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.aA.a(false);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = viewGroup;
        super.a(layoutInflater, viewGroup, bundle);
        this.aE = viewGroup2;
        Context context = viewGroup.getContext();
        View inflate = layoutInflater.inflate(R.layout.fragment_driving_mode, viewGroup2, false);
        this.aF = inflate.findViewById(R.id.driving_npv);
        DrivingOverlayNpvGradientBackgroundView drivingOverlayNpvGradientBackgroundView = (DrivingOverlayNpvGradientBackgroundView) inflate.findViewById(R.id.npv_gradient_view);
        this.al.a((vdc) drivingOverlayNpvGradientBackgroundView);
        this.ap.d.run();
        this.aq.a();
        this.aH = (DrivingCoachMarkView) inflate.findViewById(R.id.driving_coach_mark);
        tog tog = this.ar;
        tog.b = (tpe) fbp.a(this.aH);
        tog.b.a(tog);
        if (!tog.a) {
            tog.b.a();
        }
        ContextMenuButton contextMenuButton = (ContextMenuButton) this.aF.findViewById(R.id.context_menu_button);
        int a2 = tou.a(context, (int) R.dimen.driving_default_scalable_icon_size);
        SpotifyIconDrawable a3 = tou.a(context, SpotifyIconV2.DEVICE_CAR, a2, (int) R.color.cat_white);
        SpotifyIconDrawable a4 = tou.a(context, SpotifyIconV2.DEVICE_CAR, a2, (int) R.color.cat_white_40);
        SpotifyIconDrawable a5 = tou.a(context, SpotifyIconV2.DEVICE_CAR, a2, (int) R.color.cat_white_40);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842910}, a5);
        stateListDrawable.addState(new int[]{16842919}, a4);
        stateListDrawable.addState(new int[0], a3);
        contextMenuButton.setImageDrawable(tou.a(context, stateListDrawable, R.dimen.driving_top_bar_icons_padding_percent));
        tnw tnw = this.b;
        tnw.a = this;
        contextMenuButton.a((a) tnw);
        contextMenuButton.setScaleType(ScaleType.FIT_CENTER);
        ip.a((View) contextMenuButton, tou.h(context));
        CloseButton closeButton = (CloseButton) this.aF.findViewById(R.id.close_button);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIcon.CHEVRON_DOWN_24, (float) tou.a(context, (int) R.dimen.driving_default_scalable_icon_size));
        spotifyIconDrawable.a(fr.c(context, R.color.btn_now_playing_white));
        closeButton.setImageDrawable(tou.a(context, spotifyIconDrawable, R.dimen.driving_top_bar_icons_padding_percent));
        this.a.a(closeButton);
        closeButton.setScaleType(ScaleType.FIT_CENTER);
        ip.a((View) closeButton, tou.h(context));
        this.T.a((ContextTitle) this.aF.findViewById(R.id.context_title));
        TrackCarouselView trackCarouselView = (TrackCarouselView) this.aF.findViewById(R.id.driving_track_carousel);
        trackCarouselView.a((tig<ith<PlayerTrack>>) this.av);
        this.aw.a(trackCarouselView);
        DrivingSeekbarView drivingSeekbarView = (DrivingSeekbarView) inflate.findViewById(R.id.seekbar_view);
        SuppressLayoutTextView suppressLayoutTextView = (SuppressLayoutTextView) inflate.findViewById(R.id.seekbar_overlay_timestamp);
        drivingSeekbarView.g = inflate.findViewById(R.id.seekbar_overlay_view);
        drivingSeekbarView.c = suppressLayoutTextView;
        drivingSeekbarView.e = new veb(drivingSeekbarView.c, drivingSeekbarView.f);
        drivingSeekbarView.d = (int) (suppressLayoutTextView.getTextSize() / drivingSeekbarView.getResources().getDisplayMetrics().scaledDensity);
        drivingSeekbarView.h = inflate;
        this.am.a((tqe) drivingSeekbarView);
        DrivingPreviousButton drivingPreviousButton = (DrivingPreviousButton) this.aF.findViewById(R.id.driving_music_previous_button);
        this.Z.a((vdu) drivingPreviousButton);
        drivingPreviousButton.setImageDrawable(tou.c(context));
        ip.a((View) drivingPreviousButton, tou.h(context));
        DrivingPlayPauseButton drivingPlayPauseButton = (DrivingPlayPauseButton) this.aF.findViewById(R.id.driving_music_playpause_button);
        this.X.a((vdr) drivingPlayPauseButton);
        drivingPlayPauseButton.setImageDrawable(tou.a(context));
        DrivingNextButton drivingNextButton = (DrivingNextButton) this.aF.findViewById(R.id.driving_music_next_button);
        this.Y.a((vdn) drivingNextButton);
        drivingNextButton.setImageDrawable(tou.b(context));
        ip.a((View) drivingNextButton, tou.h(context));
        HeartButton heartButton = (HeartButton) this.aF.findViewById(R.id.heart_button);
        tny tny = this.ag;
        if (tny.b.a(tny.a)) {
            tny.d.a(heartButton);
        } else {
            tny.c.a(heartButton);
        }
        heartButton.setScaleType(ScaleType.FIT_CENTER);
        int a6 = tou.a(context, (int) R.dimen.driving_default_scalable_icon_size);
        SpotifyIconDrawable a7 = tou.a(context, SpotifyIconV2.HEART_ACTIVE, a6, (int) R.color.green);
        SpotifyIconDrawable a8 = tou.a(context, SpotifyIconV2.HEART_ACTIVE, a6, (int) R.color.green_light);
        SpotifyIconDrawable a9 = tou.a(context, SpotifyIconV2.HEART, a6, (int) R.color.white);
        SpotifyIconDrawable a10 = tou.a(context, SpotifyIconV2.HEART, a6, (int) R.color.white_70);
        SpotifyIconDrawable a11 = tou.a(context, SpotifyIconV2.HEART, a6, (int) R.color.white_50);
        StateListDrawable stateListDrawable2 = new StateListDrawable();
        DrivingSeekbarView drivingSeekbarView2 = drivingSeekbarView;
        stateListDrawable2.addState(new int[]{16843518, 16842910}, a7);
        stateListDrawable2.addState(new int[]{16843518, 16842919, 16842910}, a8);
        stateListDrawable2.addState(new int[]{16843518}, a7);
        stateListDrawable2.addState(new int[]{16842919, 16842910}, a10);
        stateListDrawable2.addState(new int[]{-16842910}, a11);
        stateListDrawable2.addState(new int[0], a9);
        heartButton.setImageDrawable(tou.a(context, stateListDrawable2, R.dimen.driving_secondary_button_icons_padding_percent));
        ip.a((View) heartButton, tou.h(context));
        DrivingShuffleButton drivingShuffleButton = (DrivingShuffleButton) this.aF.findViewById(R.id.shuffle_button);
        this.ah.a((ver) drivingShuffleButton);
        int a12 = tou.a(context, (int) R.dimen.driving_default_scalable_icon_size);
        SpotifyIconDrawable a13 = tou.a(context, SpotifyIconV2.SHUFFLE, a12, (int) R.color.green);
        SpotifyIconDrawable a14 = tou.a(context, SpotifyIconV2.SHUFFLE, a12, (int) R.color.green_light);
        SpotifyIconDrawable a15 = tou.a(context, SpotifyIconV2.SHUFFLE, a12, (int) R.color.white);
        SpotifyIconDrawable a16 = tou.a(context, SpotifyIconV2.SHUFFLE, a12, (int) R.color.white_70);
        SpotifyIconDrawable a17 = tou.a(context, SpotifyIconV2.SHUFFLE, a12, (int) R.color.white_10);
        StateListDrawable stateListDrawable3 = new StateListDrawable();
        HeartButton heartButton2 = heartButton;
        stateListDrawable3.addState(new int[]{16843518, 16842910}, a13);
        stateListDrawable3.addState(new int[]{16843518, 16842919, 16842910}, a14);
        stateListDrawable3.addState(new int[]{16843518}, a13);
        stateListDrawable3.addState(new int[]{16842919, 16842910}, a16);
        stateListDrawable3.addState(new int[]{-16842910}, a17);
        stateListDrawable3.addState(new int[0], a15);
        drivingShuffleButton.setImageDrawable(tou.a(context, stateListDrawable3, R.dimen.driving_secondary_button_icons_padding_percent));
        ip.a((View) drivingShuffleButton, tou.h(context));
        DrivingBanButton drivingBanButton = (DrivingBanButton) this.aF.findViewById(R.id.ban_button);
        tnv tnv = this.ai;
        if (tnv.b.a(tnv.a)) {
            tnv.d.a(drivingBanButton);
        } else {
            tnv.c.a(drivingBanButton);
        }
        float a18 = (float) tou.a(context, (int) R.dimen.driving_default_scalable_icon_size);
        SpotifyIconDrawable spotifyIconDrawable2 = new SpotifyIconDrawable(context, SpotifyIconV2.BAN_ACTIVE, a18);
        SpotifyIconDrawable spotifyIconDrawable3 = new SpotifyIconDrawable(context, SpotifyIconV2.BAN_ACTIVE, a18);
        SpotifyIconDrawable spotifyIconDrawable4 = new SpotifyIconDrawable(context, SpotifyIconV2.BAN, a18);
        SpotifyIconDrawable spotifyIconDrawable5 = new SpotifyIconDrawable(context, SpotifyIconV2.BAN, a18);
        SpotifyIconDrawable spotifyIconDrawable6 = new SpotifyIconDrawable(context, SpotifyIconV2.BAN, a18);
        spotifyIconDrawable2.a(fr.c(context, R.color.red));
        spotifyIconDrawable3.a(fr.c(context, R.color.red_light));
        spotifyIconDrawable4.a(fr.c(context, R.color.white));
        spotifyIconDrawable5.a(fr.c(context, R.color.white_70));
        spotifyIconDrawable6.a(fr.c(context, R.color.white_40));
        StateListDrawable stateListDrawable4 = new StateListDrawable();
        DrivingNextButton drivingNextButton2 = drivingNextButton;
        stateListDrawable4.addState(new int[]{16843518, 16842910}, spotifyIconDrawable2);
        stateListDrawable4.addState(new int[]{16842919, 16842910}, spotifyIconDrawable3);
        stateListDrawable4.addState(new int[]{16843518}, spotifyIconDrawable2);
        stateListDrawable4.addState(new int[]{16842919}, spotifyIconDrawable4);
        stateListDrawable4.addState(new int[]{-16842910}, spotifyIconDrawable6);
        stateListDrawable4.addState(new int[0], spotifyIconDrawable5);
        drivingBanButton.setImageDrawable(tou.a(context, stateListDrawable4, R.dimen.driving_secondary_button_icons_padding_percent));
        ip.a((View) drivingBanButton, tou.h(context));
        SeekBackwardButton seekBackwardButton = (SeekBackwardButton) this.aF.findViewById(R.id.driving_podcast_seek_backward_button);
        seekBackwardButton.setScaleType(ScaleType.FIT_CENTER);
        Context context2 = viewGroup.getContext();
        int a19 = tou.a(context2, (int) R.dimen.driving_default_scalable_icon_size);
        SpotifyIconDrawable a20 = tou.a(context2, SpotifyIconV2.SKIPBACK15, a19, (int) R.color.green);
        SpotifyIconDrawable a21 = tou.a(context2, SpotifyIconV2.SKIPBACK15, a19, (int) R.color.green_light);
        SpotifyIconDrawable a22 = tou.a(context2, SpotifyIconV2.SKIPBACK15, a19, (int) R.color.white);
        SpotifyIconDrawable a23 = tou.a(context2, SpotifyIconV2.SKIPBACK15, a19, (int) R.color.white_70);
        DrivingPlayPauseButton drivingPlayPauseButton2 = drivingPlayPauseButton;
        SpotifyIconDrawable a24 = tou.a(context2, SpotifyIconV2.SKIPBACK15, a19, (int) R.color.white_10);
        StateListDrawable stateListDrawable5 = new StateListDrawable();
        DrivingPreviousButton drivingPreviousButton2 = drivingPreviousButton;
        stateListDrawable5.addState(new int[]{16842912, 16842919, 16842910}, a21);
        stateListDrawable5.addState(new int[]{16842912, 16842910}, a20);
        stateListDrawable5.addState(new int[]{16842919, 16842910}, a23);
        stateListDrawable5.addState(new int[]{16842910}, a22);
        stateListDrawable5.addState(new int[]{16842912}, a20);
        stateListDrawable5.addState(new int[0], a24);
        seekBackwardButton.setImageDrawable(tou.a(context2, stateListDrawable5, R.dimen.driving_primary_button_icons_padding_percent));
        this.V.a((vdx) seekBackwardButton);
        ip.a((View) seekBackwardButton, tou.h(viewGroup.getContext()));
        DrivingPlayPauseButton drivingPlayPauseButton3 = (DrivingPlayPauseButton) this.aF.findViewById(R.id.driving_podcast_playpause_button);
        this.aa.a((vdr) drivingPlayPauseButton3);
        drivingPlayPauseButton3.setImageDrawable(tou.a(context));
        SeekForwardButton seekForwardButton = (SeekForwardButton) this.aF.findViewById(R.id.driving_podcast_seek_forward_button);
        seekForwardButton.setScaleType(ScaleType.FIT_CENTER);
        Context context3 = viewGroup.getContext();
        int a25 = tou.a(context3, (int) R.dimen.driving_default_scalable_icon_size);
        SpotifyIconDrawable a26 = tou.a(context3, SpotifyIconV2.SKIPFORWARD15, a25, (int) R.color.green);
        SpotifyIconDrawable a27 = tou.a(context3, SpotifyIconV2.SKIPFORWARD15, a25, (int) R.color.green_light);
        SpotifyIconDrawable a28 = tou.a(context3, SpotifyIconV2.SKIPFORWARD15, a25, (int) R.color.white);
        SpotifyIconDrawable a29 = tou.a(context3, SpotifyIconV2.SKIPFORWARD15, a25, (int) R.color.white_70);
        SeekBackwardButton seekBackwardButton2 = seekBackwardButton;
        SpotifyIconDrawable a30 = tou.a(context3, SpotifyIconV2.SKIPFORWARD15, a25, (int) R.color.white_10);
        StateListDrawable stateListDrawable6 = new StateListDrawable();
        stateListDrawable6.addState(new int[]{16842912, 16842919, 16842910}, a27);
        stateListDrawable6.addState(new int[]{16842912, 16842910}, a26);
        stateListDrawable6.addState(new int[]{16842919, 16842910}, a29);
        stateListDrawable6.addState(new int[]{16842910}, a28);
        stateListDrawable6.addState(new int[]{16842912}, a26);
        stateListDrawable6.addState(new int[0], a30);
        seekForwardButton.setImageDrawable(tou.a(context3, stateListDrawable6, R.dimen.driving_primary_button_icons_padding_percent));
        this.W.a((veh) seekForwardButton);
        ip.a((View) seekForwardButton, tou.h(viewGroup.getContext()));
        DrivingPreviousButton drivingPreviousButton3 = (DrivingPreviousButton) this.aF.findViewById(R.id.driving_podcast_previous_button);
        this.ac.a((vdu) drivingPreviousButton3);
        drivingPreviousButton3.setImageDrawable(tou.a(context, tou.a(context, SpotifyIconV2.SKIP_BACK, tou.a(context, (int) R.dimen.driving_default_scalable_icon_size), tou.i(context)), R.dimen.driving_secondary_button_icons_padding_percent));
        ip.a((View) drivingPreviousButton3, tou.h(context));
        DrivingNextButton drivingNextButton3 = (DrivingNextButton) this.aF.findViewById(R.id.driving_podcast_next_button);
        this.ab.a((vdn) drivingNextButton3);
        drivingNextButton3.setImageDrawable(tou.a(context, tou.a(context, SpotifyIconV2.SKIP_FORWARD, tou.a(context, (int) R.dimen.driving_default_scalable_icon_size), tou.i(context)), R.dimen.driving_secondary_button_icons_padding_percent));
        ip.a((View) drivingNextButton3, tou.h(context));
        DrivingPreviousButton drivingPreviousButton4 = (DrivingPreviousButton) this.aF.findViewById(R.id.driving_ads_previous_button);
        this.af.a((vdu) drivingPreviousButton4);
        drivingPreviousButton4.setImageDrawable(tou.c(context));
        ip.a((View) drivingPreviousButton4, tou.h(context));
        DrivingPlayPauseButton drivingPlayPauseButton4 = (DrivingPlayPauseButton) this.aF.findViewById(R.id.driving_ads_playpause_button);
        this.ad.a((vdr) drivingPlayPauseButton4);
        drivingPlayPauseButton4.setImageDrawable(tou.a(context));
        DrivingNextButton drivingNextButton4 = (DrivingNextButton) this.aF.findViewById(R.id.driving_ads_next_button);
        this.ae.a((vdn) drivingNextButton4);
        drivingNextButton4.setImageDrawable(tou.b(context));
        ip.a((View) drivingNextButton4, tou.h(context));
        this.ak.a((tpw) (DrivingPlayerControlsView) this.aF.findViewById(R.id.driving_player_controls));
        DrivingShowVoiceViewButton drivingShowVoiceViewButton = (DrivingShowVoiceViewButton) inflate.findViewById(R.id.driving_show_voice_view_music_button);
        tqc tqc = new tqc(drivingShuffleButton, drivingBanButton);
        toa toa = this.aj;
        toa.b = (tqd) fbp.a(tqc);
        toa.a.a((a<T>) toa);
        View findViewById = inflate.findViewById(R.id.driving_pivot_view);
        DrivingAdNowPlayingBar drivingAdNowPlayingBar = (DrivingAdNowPlayingBar) findViewById.findViewById(R.id.driving_mode_ad_npb);
        this.aG = (PivotContainerView) findViewById.findViewById(R.id.pivot_container);
        tok tok = this.at;
        PivotContainerView pivotContainerView = this.aG;
        tok.e = pivotContainerView;
        tok.f = pivotContainerView;
        tok.e.a(tok);
        tok.g = drivingAdNowPlayingBar;
        tok.g.a((a) tok);
        tnu tnu = this.az;
        tnu.a = drivingAdNowPlayingBar;
        tnu.b.a((a<T>) tnu);
        this.au.a((tla) (TrackProgressBar) drivingAdNowPlayingBar.findViewById(R.id.driving_ads_progress_bar));
        this.aI = (FrameLayout) inflate.findViewById(R.id.open_pivot_touch_area);
        drivingOverlayNpvGradientBackgroundView.a = this.aI;
        this.aJ = (FrameLayout) inflate.findViewById(R.id.close_pivot_touch_area);
        FrameLayout frameLayout = this.aJ;
        drivingOverlayNpvGradientBackgroundView.b = frameLayout;
        frameLayout.setAlpha(0.0f);
        this.aJ.setClickable(false);
        this.aJ.setVisibility(8);
        this.aC = (VerticalSplitLayout) inflate.findViewById(R.id.split_view);
        VerticalSplitLayout verticalSplitLayout = this.aC;
        verticalSplitLayout.a = new $$Lambda$tow$n3_wQ8fQNkl8x_foPkPJR2RY8qQ(this);
        verticalSplitLayout.b = new $$Lambda$tow$PvuK435L1QuoMhcNb69sQ4BcVs(this);
        toc toc = this.aA;
        toc.b = verticalSplitLayout;
        toc.c = this;
        this.aJ.setOnClickListener(new $$Lambda$tow$eW3D6EU9_C0AHivtNHWAOUpu1g(this));
        this.aI.setOnClickListener(new $$Lambda$tow$P6dfdTA8X_U0AI_5Xc8QMQG85mU(this));
        this.aC.setFocusableInTouchMode(true);
        this.aC.requestFocus();
        a((OnKeyListener) this);
        this.ax.a((tov) this);
        ConnectionLabelView connectionLabelView = (ConnectionLabelView) this.aF.findViewById(R.id.connect_label_view);
        this.ao.a((tpg) connectionLabelView);
        WazeSnackBar wazeSnackBar = (WazeSnackBar) inflate.findViewById(R.id.waze_snack_bar);
        wazeSnackBar.a(SnackAnimation.TOP_TO_BOTTOM);
        toe toe = this.an;
        toe.b = (tqu) fbp.a(wazeSnackBar);
        toe.b.a((kfj) toe);
        toe.d();
        $$Lambda$tow$q0KDkyXzNRAkliBxozFcsmWUDK8 r26 = r0;
        DrivingShowVoiceViewButton drivingShowVoiceViewButton2 = drivingShowVoiceViewButton;
        DrivingShuffleButton drivingShuffleButton2 = drivingShuffleButton;
        View view = inflate;
        Context context4 = context;
        $$Lambda$tow$q0KDkyXzNRAkliBxozFcsmWUDK8 r0 = new $$Lambda$tow$q0KDkyXzNRAkliBxozFcsmWUDK8(this, wazeSnackBar, drivingPreviousButton2, drivingPreviousButton3, drivingPlayPauseButton2, drivingPlayPauseButton3, drivingNextButton2, drivingNextButton3, seekBackwardButton2, seekForwardButton, heartButton2, drivingBanButton, drivingShuffleButton2, connectionLabelView, drivingSeekbarView2);
        this.aB = r26;
        DrivingShowVoiceViewButton drivingShowVoiceViewButton3 = drivingShowVoiceViewButton2;
        if (drivingShowVoiceViewButton3 != null) {
            Context context5 = context4;
            drivingShowVoiceViewButton3.setImageDrawable(tou.a(context5, tou.a(context5, SpotifyIconV2.MIC, tou.a(context5, (int) R.dimen.driving_default_scalable_icon_size), (int) R.color.white), R.dimen.driving_secondary_button_icons_padding_percent));
            this.ay.a(drivingShowVoiceViewButton3, this);
            ip.a((View) drivingShowVoiceViewButton3, tou.h(context5));
        }
        View view2 = view;
        DrivingShowVoiceViewButton drivingShowVoiceViewButton4 = (DrivingShowVoiceViewButton) view2.findViewById(R.id.driving_show_voice_view_pivot_button);
        if (drivingShowVoiceViewButton4 != null) {
            this.ay.a(drivingShowVoiceViewButton4, this);
        }
        return view2;
    }

    public final void a(float f, boolean z) {
        if (z) {
            this.aI.setAlpha(f);
            this.aF.setAlpha(f);
            float f2 = 1.0f - f;
            this.aJ.setAlpha(f2);
            this.aG.setAlpha(f2);
            this.aH.setAlpha(f);
        } else {
            float f3 = 1.0f - f;
            this.aI.setAlpha(f3);
            this.aF.setAlpha(f3);
            this.aJ.setAlpha(f);
            this.aG.setAlpha(f);
            if (this.aJ.getVisibility() == 8) {
                this.aJ.setVisibility(0);
            }
        }
        if (f == 1.0f) {
            this.aJ.setClickable(!z);
            this.aI.setClickable(z);
            this.at.b(!z);
            if (!z) {
                this.ar.a();
            }
        }
    }

    public final void a(boolean z) {
        if (z) {
            q().getWindow().addFlags(128);
        } else {
            q().getWindow().clearFlags(128);
        }
    }

    public final uqm ag() {
        return uqo.O;
    }

    public final gkq aj() {
        return PageIdentifiers.NOWPLAYING;
    }

    public final void aw_() {
        super.aw_();
        tns tns = this.ax;
        tns.a.a(false);
        tns.b.bd_();
        tpi tpi = this.aD;
        if (tpi != null) {
            tpi.a();
        }
    }

    public final void c() {
        this.aD = new tpi(x().inflate(R.layout.driving_context_menu, this.aE, false));
        this.aD.setOutsideTouchable(true);
        this.aD.setFocusable(true);
        tnx tnx = this.U;
        tnx.a = (tpk) fbp.a(this.aD);
        tnx.a.a(tnx);
        this.aD.showAtLocation(this.H, 17, 0, 0);
    }

    public final void e() {
        q().i().a().a((String) null).a((int) R.id.fragment_driving_mode, (Fragment) toy.a(fqo.a((Fragment) this))).b();
        a((OnKeyListener) null);
        q().i().a((a) new a() {
            public final void a(kk kkVar, Fragment fragment) {
                super.a(kkVar, fragment);
                if (fragment instanceof toy) {
                    tow.this.at.a();
                    tow tow = tow.this;
                    tow.a((OnKeyListener) tow);
                }
                kkVar.a((a) this);
            }
        }, false);
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (4 == keyEvent.getKeyCode() && keyEvent.getAction() == 1) {
            VerticalSplitLayout verticalSplitLayout = this.aC;
            if (verticalSplitLayout != null && verticalSplitLayout.a()) {
                this.aA.a(true);
                return true;
            }
        }
        return false;
    }
}
