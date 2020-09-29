package defpackage;

import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
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
import com.spotify.music.nowplaying.drivingmode.view.VerticalSplitLayout;
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
import com.spotify.music.nowplaying.drivingmode.view.waze.WazeSnackBar;
import com.spotify.nowplaying.ui.components.controls.seekbackward.SeekBackwardButton;
import com.spotify.nowplaying.ui.components.controls.seekforward.SeekForwardButton;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: tem reason: default package */
public class tem extends sxh implements tel, tez, tgb, a, udv {
    public szp T;
    public tdo U;
    public usr V;
    public utb W;
    public usl X;
    public ush Y;
    public uso Z;
    public sym a;
    private wlc<ten> aA;
    private VerticalSplitLayout aB;
    private tey aC;
    private ViewGroup aD;
    public usl aa;
    public ush ab;
    public uso ac;
    public usl ad;
    public ush ae;
    public uso af;
    public tdp ag;
    public utl ah;
    public tdm ai;
    public tdr aj;
    public tdq ak;
    public teq al;
    public tds am;
    public tdu an;
    public tdk ao;
    public tcx ap;
    public tco aq;
    public tdw ar;
    public tea at;
    public tas au;
    public ter av;
    public taq aw;
    public tdj ax;
    public teg ay;
    public tdl az;
    public tdn b;

    public final void af() {
    }

    public static tem a(fpt fpt) {
        tem tem = new tem();
        fpu.a((Fragment) tem, fpt);
        return tem;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = viewGroup;
        super.a(layoutInflater, viewGroup, bundle);
        this.aD = viewGroup2;
        Context context = viewGroup.getContext();
        View inflate = layoutInflater.inflate(R.layout.fragment_driving_mode, viewGroup2, false);
        View findViewById = inflate.findViewById(R.id.driving_npv);
        DrivingOverlayNpvGradientBackgroundView drivingOverlayNpvGradientBackgroundView = (DrivingOverlayNpvGradientBackgroundView) inflate.findViewById(R.id.npv_gradient_view);
        this.al.a((urx) drivingOverlayNpvGradientBackgroundView);
        this.ap.d.run();
        this.aq.a();
        DrivingCoachMarkView drivingCoachMarkView = (DrivingCoachMarkView) inflate.findViewById(R.id.driving_coach_mark);
        tdw tdw = this.ar;
        tdw.b = (teu) fay.a(drivingCoachMarkView);
        tdw.b.a(tdw);
        if (!tdw.a) {
            tdw.b.a();
        }
        ContextMenuButton contextMenuButton = (ContextMenuButton) findViewById.findViewById(R.id.context_menu_button);
        int a2 = tek.a(context, (int) R.dimen.driving_default_scalable_icon_size);
        SpotifyIconDrawable a3 = tek.a(context, SpotifyIconV2.DEVICE_CAR, a2, (int) R.color.cat_white);
        SpotifyIconDrawable a4 = tek.a(context, SpotifyIconV2.DEVICE_CAR, a2, (int) R.color.cat_white_40);
        SpotifyIconDrawable a5 = tek.a(context, SpotifyIconV2.DEVICE_CAR, a2, (int) R.color.cat_white_40);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842910}, a5);
        stateListDrawable.addState(new int[]{16842919}, a4);
        stateListDrawable.addState(new int[0], a3);
        contextMenuButton.setImageDrawable(tek.a(context, stateListDrawable, R.dimen.driving_top_bar_icons_padding_percent));
        tdn tdn = this.b;
        tdn.a = this;
        contextMenuButton.a((a) tdn);
        contextMenuButton.setScaleType(ScaleType.FIT_CENTER);
        ip.a((View) contextMenuButton, tek.g(context));
        CloseButton closeButton = (CloseButton) findViewById.findViewById(R.id.close_button);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIcon.CHEVRON_DOWN_24, (float) tek.a(context, (int) R.dimen.driving_default_scalable_icon_size));
        spotifyIconDrawable.a(fr.c(context, R.color.btn_now_playing_white));
        closeButton.setImageDrawable(tek.a(context, spotifyIconDrawable, R.dimen.driving_top_bar_icons_padding_percent));
        this.a.a(closeButton);
        closeButton.setScaleType(ScaleType.FIT_CENTER);
        ip.a((View) closeButton, tek.g(context));
        this.T.a((ContextTitle) findViewById.findViewById(R.id.context_title));
        TrackCarouselView trackCarouselView = (TrackCarouselView) findViewById.findViewById(R.id.driving_track_carousel);
        trackCarouselView.a((sxz<iqu<PlayerTrack>>) this.av);
        this.aw.a(trackCarouselView);
        DrivingSeekbarView drivingSeekbarView = (DrivingSeekbarView) inflate.findViewById(R.id.seekbar_view);
        SuppressLayoutTextView suppressLayoutTextView = (SuppressLayoutTextView) inflate.findViewById(R.id.seekbar_overlay_timestamp);
        drivingSeekbarView.g = inflate.findViewById(R.id.seekbar_overlay_view);
        drivingSeekbarView.c = suppressLayoutTextView;
        drivingSeekbarView.e = new usw(drivingSeekbarView.c, drivingSeekbarView.f);
        drivingSeekbarView.d = (int) (suppressLayoutTextView.getTextSize() / drivingSeekbarView.getResources().getDisplayMetrics().scaledDensity);
        drivingSeekbarView.h = inflate;
        this.am.a((tfp) drivingSeekbarView);
        DrivingPreviousButton drivingPreviousButton = (DrivingPreviousButton) findViewById.findViewById(R.id.driving_music_previous_button);
        this.Z.a((usp) drivingPreviousButton);
        drivingPreviousButton.setImageDrawable(tek.c(context));
        ip.a((View) drivingPreviousButton, tek.g(context));
        DrivingPlayPauseButton drivingPlayPauseButton = (DrivingPlayPauseButton) findViewById.findViewById(R.id.driving_music_playpause_button);
        this.X.a((usm) drivingPlayPauseButton);
        drivingPlayPauseButton.setImageDrawable(tek.a(context));
        DrivingNextButton drivingNextButton = (DrivingNextButton) findViewById.findViewById(R.id.driving_music_next_button);
        this.Y.a((usi) drivingNextButton);
        drivingNextButton.setImageDrawable(tek.b(context));
        ip.a((View) drivingNextButton, tek.g(context));
        HeartButton heartButton = (HeartButton) findViewById.findViewById(R.id.heart_button);
        tdp tdp = this.ag;
        if (tdp.b.a(tdp.a)) {
            tdp.d.a(heartButton);
        } else {
            tdp.c.a(heartButton);
        }
        heartButton.setScaleType(ScaleType.FIT_CENTER);
        int a6 = tek.a(context, (int) R.dimen.driving_default_scalable_icon_size);
        SpotifyIconDrawable a7 = tek.a(context, SpotifyIconV2.HEART_ACTIVE, a6, (int) R.color.green);
        SpotifyIconDrawable a8 = tek.a(context, SpotifyIconV2.HEART_ACTIVE, a6, (int) R.color.green_light);
        DrivingSeekbarView drivingSeekbarView2 = drivingSeekbarView;
        SpotifyIconDrawable a9 = tek.a(context, SpotifyIconV2.HEART, a6, (int) R.color.white);
        SpotifyIconDrawable a10 = tek.a(context, SpotifyIconV2.HEART, a6, (int) R.color.white_70);
        DrivingNextButton drivingNextButton2 = drivingNextButton;
        SpotifyIconDrawable a11 = tek.a(context, SpotifyIconV2.HEART, a6, (int) R.color.white_10);
        a7.a(fr.c(context, R.color.green));
        a8.a(fr.c(context, R.color.green));
        a10.a(fr.c(context, R.color.cat_white));
        a9.a(fr.c(context, R.color.cat_white_70));
        a11.a(fr.c(context, R.color.cat_white_40));
        StateListDrawable stateListDrawable2 = new StateListDrawable();
        DrivingPlayPauseButton drivingPlayPauseButton2 = drivingPlayPauseButton;
        stateListDrawable2.addState(new int[]{16843518, 16842910}, a7);
        stateListDrawable2.addState(new int[]{16843518, 16842919, 16842910}, a8);
        stateListDrawable2.addState(new int[]{16843518}, a7);
        stateListDrawable2.addState(new int[]{16842919, 16842910}, a10);
        stateListDrawable2.addState(new int[]{-16842910}, a11);
        stateListDrawable2.addState(new int[0], a9);
        heartButton.setImageDrawable(tek.a(context, stateListDrawable2, R.dimen.driving_secondary_button_icons_padding_percent));
        ip.a((View) heartButton, tek.g(context));
        DrivingShuffleButton drivingShuffleButton = (DrivingShuffleButton) findViewById.findViewById(R.id.shuffle_button);
        this.ah.a((utm) drivingShuffleButton);
        int a12 = tek.a(context, (int) R.dimen.driving_default_scalable_icon_size);
        SpotifyIconDrawable a13 = tek.a(context, SpotifyIconV2.SHUFFLE, a12, (int) R.color.green);
        SpotifyIconDrawable a14 = tek.a(context, SpotifyIconV2.SHUFFLE, a12, (int) R.color.green_light);
        SpotifyIconDrawable a15 = tek.a(context, SpotifyIconV2.SHUFFLE, a12, (int) R.color.white);
        SpotifyIconDrawable a16 = tek.a(context, SpotifyIconV2.SHUFFLE, a12, (int) R.color.white_70);
        SpotifyIconDrawable a17 = tek.a(context, SpotifyIconV2.SHUFFLE, a12, (int) R.color.white_10);
        StateListDrawable stateListDrawable3 = new StateListDrawable();
        DrivingPreviousButton drivingPreviousButton2 = drivingPreviousButton;
        stateListDrawable3.addState(new int[]{16843518, 16842910}, a13);
        stateListDrawable3.addState(new int[]{16843518, 16842919, 16842910}, a14);
        stateListDrawable3.addState(new int[]{16843518}, a13);
        stateListDrawable3.addState(new int[]{16842919, 16842910}, a16);
        stateListDrawable3.addState(new int[]{-16842910}, a17);
        stateListDrawable3.addState(new int[0], a15);
        drivingShuffleButton.setImageDrawable(tek.a(context, stateListDrawable3, R.dimen.driving_secondary_button_icons_padding_percent));
        ip.a((View) drivingShuffleButton, tek.g(context));
        DrivingBanButton drivingBanButton = (DrivingBanButton) findViewById.findViewById(R.id.ban_button);
        tdm tdm = this.ai;
        if (tdm.b.a(tdm.a)) {
            tdm.d.a(drivingBanButton);
        } else {
            tdm.c.a(drivingBanButton);
        }
        float a18 = (float) tek.a(context, (int) R.dimen.driving_default_scalable_icon_size);
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
        HeartButton heartButton2 = heartButton;
        stateListDrawable4.addState(new int[]{16843518, 16842910}, spotifyIconDrawable2);
        stateListDrawable4.addState(new int[]{16842919, 16842910}, spotifyIconDrawable3);
        stateListDrawable4.addState(new int[]{16843518}, spotifyIconDrawable2);
        stateListDrawable4.addState(new int[]{16842919}, spotifyIconDrawable4);
        stateListDrawable4.addState(new int[]{-16842910}, spotifyIconDrawable6);
        stateListDrawable4.addState(new int[0], spotifyIconDrawable5);
        drivingBanButton.setImageDrawable(tek.a(context, stateListDrawable4, R.dimen.driving_secondary_button_icons_padding_percent));
        ip.a((View) drivingBanButton, tek.g(context));
        SeekBackwardButton seekBackwardButton = (SeekBackwardButton) findViewById.findViewById(R.id.driving_podcast_seek_backward_button);
        SeekBackwardButton seekBackwardButton2 = seekBackwardButton;
        seekBackwardButton.setScaleType(ScaleType.FIT_CENTER);
        Context context2 = viewGroup.getContext();
        int a19 = tek.a(context2, (int) R.dimen.driving_default_scalable_icon_size);
        SpotifyIconDrawable a20 = tek.a(context2, SpotifyIconV2.SKIPBACK15, a19, (int) R.color.green);
        SpotifyIconDrawable a21 = tek.a(context2, SpotifyIconV2.SKIPBACK15, a19, (int) R.color.green_light);
        SpotifyIconDrawable a22 = tek.a(context2, SpotifyIconV2.SKIPBACK15, a19, (int) R.color.white);
        SpotifyIconDrawable a23 = tek.a(context2, SpotifyIconV2.SKIPBACK15, a19, (int) R.color.white_70);
        DrivingCoachMarkView drivingCoachMarkView2 = drivingCoachMarkView;
        SpotifyIconDrawable a24 = tek.a(context2, SpotifyIconV2.SKIPBACK15, a19, (int) R.color.white_10);
        StateListDrawable stateListDrawable5 = new StateListDrawable();
        DrivingOverlayNpvGradientBackgroundView drivingOverlayNpvGradientBackgroundView2 = drivingOverlayNpvGradientBackgroundView;
        stateListDrawable5.addState(new int[]{16842912, 16842919, 16842910}, a21);
        stateListDrawable5.addState(new int[]{16842912, 16842910}, a20);
        stateListDrawable5.addState(new int[]{16842919, 16842910}, a23);
        stateListDrawable5.addState(new int[]{16842910}, a22);
        stateListDrawable5.addState(new int[]{16842912}, a20);
        stateListDrawable5.addState(new int[0], a24);
        seekBackwardButton.setImageDrawable(tek.a(context2, stateListDrawable5, R.dimen.driving_primary_button_icons_padding_percent));
        this.V.a((uss) seekBackwardButton);
        ip.a((View) seekBackwardButton, tek.g(viewGroup.getContext()));
        DrivingPlayPauseButton drivingPlayPauseButton3 = (DrivingPlayPauseButton) findViewById.findViewById(R.id.driving_podcast_playpause_button);
        DrivingPlayPauseButton drivingPlayPauseButton4 = drivingPlayPauseButton3;
        this.aa.a((usm) drivingPlayPauseButton3);
        drivingPlayPauseButton3.setImageDrawable(tek.a(context));
        SeekForwardButton seekForwardButton = (SeekForwardButton) findViewById.findViewById(R.id.driving_podcast_seek_forward_button);
        SeekForwardButton seekForwardButton2 = seekForwardButton;
        seekForwardButton.setScaleType(ScaleType.FIT_CENTER);
        Context context3 = viewGroup.getContext();
        int a25 = tek.a(context3, (int) R.dimen.driving_default_scalable_icon_size);
        SpotifyIconDrawable a26 = tek.a(context3, SpotifyIconV2.SKIPFORWARD15, a25, (int) R.color.green);
        SpotifyIconDrawable a27 = tek.a(context3, SpotifyIconV2.SKIPFORWARD15, a25, (int) R.color.green_light);
        SpotifyIconDrawable a28 = tek.a(context3, SpotifyIconV2.SKIPFORWARD15, a25, (int) R.color.white);
        SpotifyIconDrawable a29 = tek.a(context3, SpotifyIconV2.SKIPFORWARD15, a25, (int) R.color.white_70);
        SpotifyIconDrawable a30 = tek.a(context3, SpotifyIconV2.SKIPFORWARD15, a25, (int) R.color.white_10);
        StateListDrawable stateListDrawable6 = new StateListDrawable();
        stateListDrawable6.addState(new int[]{16842912, 16842919, 16842910}, a27);
        stateListDrawable6.addState(new int[]{16842912, 16842910}, a26);
        stateListDrawable6.addState(new int[]{16842919, 16842910}, a29);
        stateListDrawable6.addState(new int[]{16842910}, a28);
        stateListDrawable6.addState(new int[]{16842912}, a26);
        stateListDrawable6.addState(new int[0], a30);
        seekForwardButton.setImageDrawable(tek.a(context3, stateListDrawable6, R.dimen.driving_primary_button_icons_padding_percent));
        this.W.a((utc) seekForwardButton);
        ip.a((View) seekForwardButton, tek.g(viewGroup.getContext()));
        DrivingPreviousButton drivingPreviousButton3 = (DrivingPreviousButton) findViewById.findViewById(R.id.driving_podcast_previous_button);
        DrivingPreviousButton drivingPreviousButton4 = drivingPreviousButton3;
        this.ac.a((usp) drivingPreviousButton3);
        drivingPreviousButton3.setImageDrawable(tek.a(context, tek.a(context, SpotifyIconV2.SKIP_BACK, tek.a(context, (int) R.dimen.driving_default_scalable_icon_size), tek.h(context)), R.dimen.driving_secondary_button_icons_padding_percent));
        ip.a((View) drivingPreviousButton3, tek.g(context));
        DrivingNextButton drivingNextButton3 = (DrivingNextButton) findViewById.findViewById(R.id.driving_podcast_next_button);
        HeartButton heartButton3 = heartButton2;
        DrivingNextButton drivingNextButton4 = drivingNextButton3;
        this.ab.a((usi) drivingNextButton3);
        drivingNextButton3.setImageDrawable(tek.a(context, tek.a(context, SpotifyIconV2.SKIP_FORWARD, tek.a(context, (int) R.dimen.driving_default_scalable_icon_size), tek.h(context)), R.dimen.driving_secondary_button_icons_padding_percent));
        ip.a((View) drivingNextButton3, tek.g(context));
        DrivingPreviousButton drivingPreviousButton5 = (DrivingPreviousButton) findViewById.findViewById(R.id.driving_ads_previous_button);
        this.af.a((usp) drivingPreviousButton5);
        drivingPreviousButton5.setImageDrawable(tek.c(context));
        ip.a((View) drivingPreviousButton5, tek.g(context));
        DrivingPlayPauseButton drivingPlayPauseButton5 = (DrivingPlayPauseButton) findViewById.findViewById(R.id.driving_ads_playpause_button);
        this.ad.a((usm) drivingPlayPauseButton5);
        drivingPlayPauseButton5.setImageDrawable(tek.a(context));
        DrivingNextButton drivingNextButton5 = (DrivingNextButton) findViewById.findViewById(R.id.driving_ads_next_button);
        this.ae.a((usi) drivingNextButton5);
        drivingNextButton5.setImageDrawable(tek.b(context));
        ip.a((View) drivingNextButton5, tek.g(context));
        this.ak.a((tfm) (DrivingPlayerControlsView) findViewById.findViewById(R.id.driving_player_controls));
        DrivingShowVoiceViewButton drivingShowVoiceViewButton = (DrivingShowVoiceViewButton) inflate.findViewById(R.id.driving_show_voice_view_music_button);
        tfn tfn = new tfn(drivingShuffleButton, drivingBanButton);
        tdr tdr = this.aj;
        tdr.b = (tfo) fay.a(tfn);
        tdr.a.a((a<T>) tdr);
        View findViewById2 = inflate.findViewById(R.id.driving_pivot_view);
        DrivingAdNowPlayingBar drivingAdNowPlayingBar = (DrivingAdNowPlayingBar) findViewById2.findViewById(R.id.driving_mode_ad_npb);
        PivotContainerView pivotContainerView = (PivotContainerView) findViewById2.findViewById(R.id.pivot_container);
        PivotContainerView pivotContainerView2 = pivotContainerView;
        tea tea = this.at;
        tea.e = pivotContainerView;
        tea.f = pivotContainerView;
        tea.e.a(tea);
        tea.g = drivingAdNowPlayingBar;
        tea.g.a((a) tea);
        tdl tdl = this.az;
        tdl.a = drivingAdNowPlayingBar;
        tdl.b.a((a<T>) tdl);
        this.au.a((tat) (TrackProgressBar) drivingAdNowPlayingBar.findViewById(R.id.driving_ads_progress_bar));
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.open_pivot_touch_area);
        DrivingOverlayNpvGradientBackgroundView drivingOverlayNpvGradientBackgroundView3 = drivingOverlayNpvGradientBackgroundView2;
        drivingOverlayNpvGradientBackgroundView3.a = frameLayout;
        FrameLayout frameLayout2 = (FrameLayout) inflate.findViewById(R.id.close_pivot_touch_area);
        drivingOverlayNpvGradientBackgroundView3.b = frameLayout2;
        frameLayout2.setAlpha(0.0f);
        frameLayout2.setClickable(false);
        frameLayout2.setVisibility(8);
        this.aB = (VerticalSplitLayout) inflate.findViewById(R.id.split_view);
        DrivingShuffleButton drivingShuffleButton2 = drivingShuffleButton;
        FrameLayout frameLayout3 = frameLayout2;
        DrivingBanButton drivingBanButton2 = drivingBanButton;
        VerticalSplitLayout verticalSplitLayout = this.aB;
        DrivingShowVoiceViewButton drivingShowVoiceViewButton2 = drivingShowVoiceViewButton;
        View view = findViewById;
        PivotContainerView pivotContainerView3 = pivotContainerView;
        DrivingCoachMarkView drivingCoachMarkView3 = drivingCoachMarkView2;
        DrivingPlayPauseButton drivingPlayPauseButton6 = drivingPlayPauseButton2;
        FrameLayout frameLayout4 = frameLayout;
        DrivingPreviousButton drivingPreviousButton6 = drivingPreviousButton2;
        Context context4 = context;
        $$Lambda$tem$vksAqm5u4J5izXLFRurzEuM2MkU r0 = new $$Lambda$tem$vksAqm5u4J5izXLFRurzEuM2MkU(this, view, drivingCoachMarkView3, pivotContainerView3, frameLayout4, frameLayout3);
        verticalSplitLayout.d = r0;
        $$Lambda$tem$fDSy7khh4upJAgYwLXPed2TH7w r02 = new $$Lambda$tem$fDSy7khh4upJAgYwLXPed2TH7w(this, view, pivotContainerView3, frameLayout4, frameLayout3);
        verticalSplitLayout.e = r02;
        frameLayout3.setOnClickListener(new $$Lambda$tem$BliEjw5AKixAY5iEQiwILNh7s(this));
        frameLayout4.setOnClickListener(new $$Lambda$tem$T3u9Wu8OsjAhcqEJfbjoocbSeR4(this));
        this.aB.setFocusableInTouchMode(true);
        this.aB.requestFocus();
        this.aB.setOnKeyListener(new $$Lambda$tem$dp6Qqu_W4QuM6ge0tyYCrsyFNzQ(this));
        this.ax.a((tel) this);
        ConnectionLabelView connectionLabelView = (ConnectionLabelView) findViewById.findViewById(R.id.connect_label_view);
        ConnectionLabelView connectionLabelView2 = connectionLabelView;
        this.ao.a((tew) connectionLabelView);
        WazeSnackBar wazeSnackBar = (WazeSnackBar) inflate.findViewById(R.id.waze_snack_bar);
        DrivingShuffleButton drivingShuffleButton3 = drivingShuffleButton2;
        WazeSnackBar wazeSnackBar2 = wazeSnackBar;
        wazeSnackBar.a(SnackAnimation.TOP_TO_BOTTOM);
        tdu tdu = this.an;
        tdu.b = (tgc) fay.a(wazeSnackBar);
        tdu.b.a((kdi) tdu);
        tdu.d();
        View view2 = inflate;
        Context context5 = context4;
        $$Lambda$tem$dj82OvxslEyQrNTKJ5FgWW_dSg r7 = new $$Lambda$tem$dj82OvxslEyQrNTKJ5FgWW_dSg(this, wazeSnackBar2, drivingPreviousButton6, drivingPreviousButton4, drivingPlayPauseButton6, drivingPlayPauseButton4, drivingNextButton2, drivingNextButton4, seekBackwardButton2, seekForwardButton2, heartButton3, drivingBanButton2, drivingShuffleButton3, connectionLabelView2, pivotContainerView2, drivingSeekbarView2);
        this.aA = r7;
        DrivingShowVoiceViewButton drivingShowVoiceViewButton3 = drivingShowVoiceViewButton2;
        if (drivingShowVoiceViewButton3 != null) {
            drivingShowVoiceViewButton3.setImageDrawable(tek.a(context5, tek.a(context5, SpotifyIconV2.MIC, tek.a(context5, (int) R.dimen.driving_default_scalable_icon_size), (int) R.color.white), R.dimen.driving_secondary_button_icons_padding_percent));
            this.ay.a(drivingShowVoiceViewButton3, this);
            ip.a((View) drivingShowVoiceViewButton3, tek.g(context5));
        }
        DrivingShowVoiceViewButton drivingShowVoiceViewButton4 = (DrivingShowVoiceViewButton) view2.findViewById(R.id.driving_show_voice_view_pivot_button);
        if (drivingShowVoiceViewButton4 != null) {
            drivingShowVoiceViewButton4.setImageDrawable(tek.a(context5, tek.a(context5, (int) R.dimen.driving_circled_voice_icon_size), tek.b(context5, R.dimen.driving_voice_icon_scale), false));
            this.ay.a(drivingShowVoiceViewButton4, this);
        }
        return view2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.aB.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        VerticalSplitLayout verticalSplitLayout = this.aB;
        verticalSplitLayout.f = false;
        verticalSplitLayout.b.a(verticalSplitLayout.a, 0, verticalSplitLayout.c);
        ip.d(verticalSplitLayout);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean a(View view, int i, KeyEvent keyEvent) {
        if (4 == i) {
            VerticalSplitLayout verticalSplitLayout = this.aB;
            if (verticalSplitLayout != null && verticalSplitLayout.a()) {
                this.aB.b();
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ten a(WazeSnackBar wazeSnackBar, DrivingPreviousButton drivingPreviousButton, DrivingPreviousButton drivingPreviousButton2, DrivingPlayPauseButton drivingPlayPauseButton, DrivingPlayPauseButton drivingPlayPauseButton2, DrivingNextButton drivingNextButton, DrivingNextButton drivingNextButton2, SeekBackwardButton seekBackwardButton, SeekForwardButton seekForwardButton, HeartButton heartButton, DrivingBanButton drivingBanButton, DrivingShuffleButton drivingShuffleButton, ConnectionLabelView connectionLabelView, PivotContainerView pivotContainerView, DrivingSeekbarView drivingSeekbarView) {
        WazeSnackBar wazeSnackBar2 = wazeSnackBar;
        WazeSnackBar wazeSnackBar3 = wazeSnackBar2;
        ten ten = new ten(wazeSnackBar3, this, this.b, drivingPreviousButton, drivingPreviousButton2, drivingPlayPauseButton, drivingPlayPauseButton2, drivingNextButton, drivingNextButton2, seekBackwardButton, seekForwardButton, heartButton, drivingBanButton, drivingShuffleButton, connectionLabelView, this.aB, pivotContainerView, drivingSeekbarView, this.aw);
        return ten;
    }

    public final void c() {
        this.aC = new tey(x().inflate(R.layout.driving_context_menu, this.aD, false));
        this.aC.setOutsideTouchable(true);
        this.aC.setFocusable(true);
        tdo tdo = this.U;
        tdo.a = (tfa) fay.a(this.aC);
        tdo.a.a(tdo);
        this.aC.showAtLocation(this.H, 17, 0, 0);
    }

    public final udr ag() {
        return udt.O;
    }

    public final gjf aj() {
        return PageIdentifiers.NOWPLAYING;
    }

    public final void ax_() {
        super.ax_();
        tdj tdj = this.ax;
        tdj.a.a(false);
        tdj.b.bf_();
        tey tey = this.aC;
        if (tey != null) {
            tey.dismiss();
        }
    }

    public final void a(boolean z) {
        if (z) {
            q().getWindow().addFlags(128);
        } else {
            q().getWindow().clearFlags(128);
        }
    }

    public final void e() {
        q().i().a().a((String) null).a((int) R.id.fragment_driving_mode, (Fragment) teo.a(fpu.a((Fragment) this))).b();
        q().i().a((a) new a() {
            public final void a(kf kfVar, Fragment fragment) {
                super.a(kfVar, fragment);
                tem.this.at.a();
                kfVar.a((a) this);
            }
        }, false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view, PivotContainerView pivotContainerView, FrameLayout frameLayout, FrameLayout frameLayout2, float f, boolean z) {
        float f2 = 1.0f - f;
        frameLayout.setAlpha(f2);
        view.setAlpha(f2);
        frameLayout2.setAlpha(f);
        pivotContainerView.setAlpha(f);
        if (frameLayout2.getVisibility() == 8) {
            frameLayout2.setVisibility(0);
        }
        if (f == 1.0f) {
            frameLayout2.setClickable(true);
            frameLayout.setClickable(false);
            this.ar.a();
            this.at.b(true);
            if (z) {
                this.at.b();
                return;
            }
            this.at.c();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view, DrivingCoachMarkView drivingCoachMarkView, PivotContainerView pivotContainerView, FrameLayout frameLayout, FrameLayout frameLayout2, float f, boolean z) {
        float f2 = 1.0f - f;
        frameLayout2.setAlpha(f2);
        frameLayout.setAlpha(f);
        view.setAlpha(f);
        pivotContainerView.setAlpha(f2);
        drivingCoachMarkView.setAlpha(f);
        if (f == 1.0f) {
            frameLayout2.setClickable(false);
            frameLayout.setClickable(true);
            this.at.b(false);
            if (z) {
                this.at.d();
                return;
            }
            this.at.e();
        }
    }
}
