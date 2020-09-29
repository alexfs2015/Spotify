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
import android.view.WindowInsets;
import android.widget.AbsListView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
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

/* renamed from: skt reason: default package */
public class skt extends jom implements sks, udv {
    public sla T;
    public ust U;
    public usl V;
    public skz W;
    /* access modifiers changed from: private */
    public LyricsView X;
    private LyricsFullscreenHeaderView Y;
    /* access modifiers changed from: private */
    public PersistentSeekbarView Z;
    /* access modifiers changed from: private */
    public PlayPauseButton aa;
    /* access modifiers changed from: private */
    public View ab;
    private slf ac;
    private PlayerTrack ad;
    private AnimatorSet ae;

    public static skt a(Bundle bundle, fpt fpt) {
        skt skt = new skt();
        skt.g(bundle);
        fpu.a((Fragment) skt, fpt);
        return skt;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = (ConstraintLayout) layoutInflater.inflate(R.layout.lyrics_full_screen_view, viewGroup, false);
        constraintLayout.setLayoutParams(new LayoutParams(-1, -1));
        this.Y = (LyricsFullscreenHeaderView) constraintLayout.findViewById(R.id.header);
        this.X = (LyricsView) constraintLayout.findViewById(R.id.lyrics_view);
        this.Z = (PersistentSeekbarView) constraintLayout.findViewById(R.id.seek_bar_view);
        this.aa = (PlayPauseButton) constraintLayout.findViewById(R.id.play_pause_button);
        this.ab = constraintLayout.findViewById(R.id.background);
        Bundle bundle2 = (Bundle) fay.a(this.i);
        this.ac = (slf) fay.a(bundle2.getParcelable("lyrics_color"));
        int i = this.ac.a;
        ((GradientDrawable) this.ab.getBackground()).setColor(i);
        this.Y.setBackgroundColor(i);
        this.aa.a(i);
        this.T.a((TrackLyrics) fay.a(bundle2.getParcelable("track_lyrics")));
        LyricsView lyricsView = this.X;
        lyricsView.a.setVerticalFadingEdgeEnabled(true);
        lyricsView.a.setFadingEdgeLength((int) lyricsView.getResources().getDimension(R.dimen.fading_edge_length));
        this.X.setKeepScreenOn(true);
        this.U.a((usu) this.Z);
        this.V.a((usm) this.aa);
        this.W.a(this.Y);
        LyricsFullscreenHeaderView lyricsFullscreenHeaderView = this.Y;
        $$Lambda$skt$2t1P66ju6KS1xI1XjkYhVgT3hSI r6 = new $$Lambda$skt$2t1P66ju6KS1xI1XjkYhVgT3hSI(this);
        lyricsFullscreenHeaderView.e.setOnClickListener(r6);
        lyricsFullscreenHeaderView.d.setOnClickListener(r6);
        constraintLayout.addOnLayoutChangeListener(new OnLayoutChangeListener() {
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                view.removeOnLayoutChangeListener(this);
                skt.this.X.a(((Bundle) fay.a(skt.this.i)).getInt("player_position"));
                skt.b(skt.this);
            }
        });
        LyricsFullscreenHeaderView lyricsFullscreenHeaderView2 = this.Y;
        if (VERSION.SDK_INT >= 28) {
            WindowInsets rootWindowInsets = ((ka) fay.a(p())).getWindow().getDecorView().getRootWindowInsets();
            if (rootWindowInsets != null) {
                DisplayCutout displayCutout = rootWindowInsets.getDisplayCutout();
                if (displayCutout != null && displayCutout.getSafeInsetTop() > lyricsFullscreenHeaderView2.getPaddingTop()) {
                    lyricsFullscreenHeaderView2.setPadding(lyricsFullscreenHeaderView2.getPaddingLeft(), displayCutout.getSafeInsetTop(), lyricsFullscreenHeaderView2.getPaddingRight(), lyricsFullscreenHeaderView2.getPaddingBottom());
                }
            }
        }
        return constraintLayout;
    }

    public final void a(sle sle) {
        this.X.e = sle;
    }

    public final Dialog a(Bundle bundle) {
        return new Dialog((Context) fay.a(p()), aa_()) {
            public final void onBackPressed() {
                skt.this.ae();
            }
        };
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        a(0, 2132017415);
    }

    public final void a(Context context) {
        vts.a(this);
        super.a(context);
    }

    public final void g() {
        super.g();
        Dialog dialog = this.b;
        if (!(dialog == null || dialog.getWindow() == null)) {
            dialog.getWindow().setLayout(-1, -1);
            dialog.getWindow().getDecorView().setSystemUiVisibility(1796);
            dialog.getWindow().clearFlags(2);
            dialog.getWindow().setWindowAnimations(R.style.DialogNoAnimation);
        }
        this.T.a();
    }

    public final void A() {
        super.A();
        AnimatorSet animatorSet = this.ae;
        if (animatorSet != null) {
            animatorSet.end();
        }
    }

    public final void h() {
        super.h();
        sla sla = this.T;
        sla.a.a((sle) null);
        sla.b.c();
    }

    public final gjf aj() {
        return PageIdentifiers.LYRICS_FULLSCREEN;
    }

    public final PlayerTrack a() {
        return this.ad;
    }

    public final void a(PlayerState playerState) {
        this.ad = playerState.track();
        this.X.a((int) playerState.currentPlaybackPosition());
    }

    public final void a(TrackLyrics trackLyrics) {
        ka p = p();
        if (p != null) {
            LyricsAppearance lyricsAppearance = slg.a(trackLyrics.getLines()) ? LyricsAppearance.LYRICS_CJK : LyricsAppearance.FULLSCREEN;
            LyricsView lyricsView = this.X;
            if (lyricsView.a.getHeaderViewsCount() == 0) {
                lyricsView.b = new sll(lyricsView.getContext(), -7829368, lyricsAppearance);
                lyricsView.b.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
                lyricsView.a.addHeaderView(lyricsView.b, null, false);
            }
            if (lyricsView.a.getFooterViewsCount() == 0) {
                lyricsView.c = new slk(lyricsView.getContext(), -7829368, lyricsAppearance);
                lyricsView.c.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
                lyricsView.a.addFooterView(lyricsView.c, null, false);
            }
            lyricsView.b.b = TrackLyrics.KIND_TEXT.equals(trackLyrics.getKind());
            lyricsView.c.b = trackLyrics;
            lyricsView.requestLayout();
            this.X.a(trackLyrics, p, lyricsAppearance);
            slf slf = this.ac;
            if (slf != null) {
                this.X.a(slf.b, this.ac.c);
            }
        }
    }

    public final void a(long j) {
        this.X.a((int) j);
    }

    public final void b() {
        ae();
    }

    /* access modifiers changed from: private */
    public void ae() {
        AnimatorSet af = af();
        sko.a(af, (Bundle) fay.a(this.i), this.ab, (View) this.X, (View) this.Y);
        af.addListener(new AnimatorListener() {
            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
                skt.this.aa.setAlpha(0.0f);
                skt.this.Z.setAlpha(0.0f);
            }

            public final void onAnimationEnd(Animator animator) {
                skt.this.c();
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

    static /* synthetic */ void b(skt skt) {
        AnimatorSet af = skt.af();
        sko.a(af, (Bundle) fay.a(skt.i), skt.ab, skt.X, skt.Y, skt.Z, skt.aa, uts.b(56.0f, skt.o().getResources()));
        af.addListener(new AnimatorListener() {
            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                ViewGroup.LayoutParams layoutParams = skt.this.ab.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = -1;
                skt.this.ab.setLayoutParams(layoutParams);
            }
        });
        af.start();
        skt.ae = af;
    }
}
