package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.DisplayCutout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowInsets;
import android.widget.AbsListView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.R;
import com.spotify.music.lyrics.fullscreen.views.LyricsFullscreenHeaderView;
import com.spotify.music.lyrics.model.TrackLyrics;
import com.spotify.music.lyrics.views.LyricsAppearance;
import com.spotify.music.lyrics.views.LyricsView;
import com.spotify.nowplaying.ui.components.controls.playpause.PlayPauseButton;
import com.spotify.nowplaying.ui.components.controls.seekbar.PersistentSeekbarView;

/* renamed from: sva reason: default package */
public class sva extends jqy implements suz, uqq {
    public svh T;
    public vdy U;
    public vdq V;
    public svg W;
    /* access modifiers changed from: private */
    public LyricsView X;
    private LyricsFullscreenHeaderView Y;
    /* access modifiers changed from: private */
    public PersistentSeekbarView Z;
    /* access modifiers changed from: private */
    public PlayPauseButton aa;
    /* access modifiers changed from: private */
    public View ab;
    private svm ac;
    private PlayerTrack ad;
    private AnimatorSet ae;

    public static sva a(Bundle bundle, fqn fqn) {
        sva sva = new sva();
        sva.g(bundle);
        fqo.a((Fragment) sva, fqn);
        return sva;
    }

    /* access modifiers changed from: private */
    public void ae() {
        AnimatorSet af = af();
        suv.a(af, (Bundle) fbp.a(this.i), this.ab, (View) this.X, (View) this.Y);
        af.addListener(new AnimatorListener() {
            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                sva.this.c();
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
                sva.this.aa.setAlpha(0.0f);
                sva.this.Z.setAlpha(0.0f);
            }
        });
        af.start();
        this.ae = af;
    }

    private AnimatorSet af() {
        AnimatorSet animatorSet = this.ae;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.ae.cancel();
        }
        return new AnimatorSet();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        ae();
    }

    static /* synthetic */ void b(sva sva) {
        AnimatorSet af = sva.af();
        suv.a(af, (Bundle) fbp.a(sva.i), sva.ab, sva.X, sva.Y, sva.Z, sva.aa, vfj.b(56.0f, sva.o().getResources()));
        af.addListener(new AnimatorListener() {
            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                LayoutParams layoutParams = sva.this.ab.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = -1;
                sva.this.ab.setLayoutParams(layoutParams);
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }
        });
        af.start();
        sva.ae = af;
    }

    public final void A() {
        super.A();
        AnimatorSet animatorSet = this.ae;
        if (animatorSet != null) {
            animatorSet.end();
        }
    }

    public final Dialog a(Bundle bundle) {
        return new Dialog((Context) fbp.a(p()), aa_()) {
            public final void onBackPressed() {
                sva.this.ae();
            }
        };
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = (ConstraintLayout) layoutInflater.inflate(R.layout.lyrics_full_screen_view, viewGroup, false);
        constraintLayout.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -1));
        this.Y = (LyricsFullscreenHeaderView) constraintLayout.findViewById(R.id.header);
        this.X = (LyricsView) constraintLayout.findViewById(R.id.lyrics_view);
        this.Z = (PersistentSeekbarView) constraintLayout.findViewById(R.id.seek_bar_view);
        this.aa = (PlayPauseButton) constraintLayout.findViewById(R.id.play_pause_button);
        this.ab = constraintLayout.findViewById(R.id.background);
        Bundle bundle2 = (Bundle) fbp.a(this.i);
        this.ac = (svm) fbp.a(bundle2.getParcelable("lyrics_color"));
        int i = this.ac.a;
        ((GradientDrawable) this.ab.getBackground()).setColor(i);
        this.Y.setBackgroundColor(i);
        this.aa.a(i);
        this.T.a((TrackLyrics) fbp.a(bundle2.getParcelable("track_lyrics")));
        LyricsView lyricsView = this.X;
        lyricsView.a.setVerticalFadingEdgeEnabled(true);
        lyricsView.a.setFadingEdgeLength((int) lyricsView.getResources().getDimension(R.dimen.fading_edge_length));
        this.X.setKeepScreenOn(true);
        this.U.a((vdz) this.Z);
        this.V.a((vdr) this.aa);
        this.W.a(this.Y);
        LyricsFullscreenHeaderView lyricsFullscreenHeaderView = this.Y;
        $$Lambda$sva$xxwB3gsVLTdSZ5RqfmpHbx4R0 r6 = new $$Lambda$sva$xxwB3gsVLTdSZ5RqfmpHbx4R0(this);
        lyricsFullscreenHeaderView.e.setOnClickListener(r6);
        lyricsFullscreenHeaderView.d.setOnClickListener(r6);
        constraintLayout.addOnLayoutChangeListener(new OnLayoutChangeListener() {
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                view.removeOnLayoutChangeListener(this);
                sva.this.X.a(((Bundle) fbp.a(sva.this.i)).getInt("player_position"));
                sva.b(sva.this);
            }
        });
        LyricsFullscreenHeaderView lyricsFullscreenHeaderView2 = this.Y;
        if (VERSION.SDK_INT >= 28) {
            WindowInsets rootWindowInsets = ((kf) fbp.a(p())).getWindow().getDecorView().getRootWindowInsets();
            if (rootWindowInsets != null) {
                DisplayCutout displayCutout = rootWindowInsets.getDisplayCutout();
                if (displayCutout != null && displayCutout.getSafeInsetTop() > lyricsFullscreenHeaderView2.getPaddingTop()) {
                    lyricsFullscreenHeaderView2.setPadding(lyricsFullscreenHeaderView2.getPaddingLeft(), displayCutout.getSafeInsetTop(), lyricsFullscreenHeaderView2.getPaddingRight(), lyricsFullscreenHeaderView2.getPaddingBottom());
                }
            }
        }
        return constraintLayout;
    }

    public final PlayerTrack a() {
        return this.ad;
    }

    public final void a(long j) {
        this.X.a((int) j);
    }

    public final void a(Context context) {
        why.a(this);
        super.a(context);
    }

    public final void a(PlayerState playerState) {
        this.ad = playerState.track();
        this.X.a((int) playerState.currentPlaybackPosition());
    }

    public final void a(TrackLyrics trackLyrics) {
        kf p = p();
        if (p != null) {
            LyricsAppearance lyricsAppearance = svn.a(trackLyrics.getLines()) ? LyricsAppearance.LYRICS_CJK : LyricsAppearance.FULLSCREEN;
            LyricsView lyricsView = this.X;
            if (lyricsView.a.getHeaderViewsCount() == 0) {
                lyricsView.b = new svs(lyricsView.getContext(), -7829368, lyricsAppearance);
                lyricsView.b.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
                lyricsView.a.addHeaderView(lyricsView.b, null, false);
            }
            if (lyricsView.a.getFooterViewsCount() == 0) {
                lyricsView.c = new svr(lyricsView.getContext(), -7829368, lyricsAppearance);
                lyricsView.c.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
                lyricsView.a.addFooterView(lyricsView.c, null, false);
            }
            lyricsView.b.b = TrackLyrics.KIND_TEXT.equals(trackLyrics.getKind());
            lyricsView.c.b = trackLyrics;
            lyricsView.requestLayout();
            this.X.a(trackLyrics, p, lyricsAppearance);
            svm svm = this.ac;
            if (svm != null) {
                this.X.a(svm.b, this.ac.c);
            }
        }
    }

    public final void a(svl svl) {
        this.X.e = svl;
    }

    public final void aP_() {
        super.aP_();
        Dialog dialog = this.b;
        if (!(dialog == null || dialog.getWindow() == null)) {
            dialog.getWindow().setLayout(-1, -1);
            dialog.getWindow().getDecorView().setSystemUiVisibility(1796);
            dialog.getWindow().clearFlags(2);
            dialog.getWindow().setWindowAnimations(R.style.DialogNoAnimation);
        }
        this.T.a();
    }

    public final gkq aj() {
        return PageIdentifiers.LYRICS_FULLSCREEN;
    }

    public final void b() {
        ae();
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        a(0, 2132017417);
    }

    public final void h() {
        super.h();
        svh svh = this.T;
        svh.a.a((svl) null);
        svh.b.c();
    }
}
