package com.spotify.music.nowplaying.drivingmode.view.seekbar;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.comscore.util.crashreport.CrashReportManager;
import com.spotify.mobile.android.ui.view.SuppressLayoutTextView;
import com.spotify.music.R;
import com.spotify.music.nowplaying.common.view.overlay.OverlayHidingFrameLayout;

public class DrivingSeekbarView extends OverlayHidingFrameLayout implements tqe {
    public SuppressLayoutTextView c;
    public int d;
    public veb e;
    public final TextView f;
    public View g;
    public View h;
    /* access modifiers changed from: private */
    public final View i;
    private final SeekBar j;
    private final veb k;
    /* access modifiers changed from: private */
    public a l;
    private AnimatorSet m;

    public DrivingSeekbarView(Context context) {
        this(context, null);
    }

    public DrivingSeekbarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrivingSeekbarView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        inflate(getContext(), R.layout.driving_seekbar_time_components, this);
        this.j = (SeekBar) findViewById(R.id.seek_bar);
        this.j.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                if (z && DrivingSeekbarView.this.l != null) {
                    DrivingSeekbarView.this.l.a(i, true);
                }
            }

            public final void onStartTrackingTouch(SeekBar seekBar) {
                DrivingSeekbarView.c(DrivingSeekbarView.this);
            }

            public final void onStopTrackingTouch(SeekBar seekBar) {
                if (DrivingSeekbarView.this.l != null) {
                    DrivingSeekbarView.d(DrivingSeekbarView.this);
                    DrivingSeekbarView.this.l.a(seekBar.getProgress(), false);
                }
            }
        });
        this.i = findViewById(R.id.timestamps);
        SuppressLayoutTextView suppressLayoutTextView = (SuppressLayoutTextView) findViewById(R.id.position);
        this.f = (TextView) findViewById(R.id.duration);
        this.k = new veb(suppressLayoutTextView, this.f);
        this.a = 300;
        this.b = CrashReportManager.TIME_WINDOW;
        if (getResources().getConfiguration().orientation == 1) {
            double d2 = (double) Resources.getSystem().getDisplayMetrics().widthPixels;
            Double.isNaN(d2);
            final int i3 = (int) (d2 * 0.08d);
            this.j.setPadding(i3, 0, i3, 0);
            getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
                public final boolean onPreDraw() {
                    double d = (double) Resources.getSystem().getDisplayMetrics().heightPixels;
                    Double.isNaN(d);
                    int height = ((int) (d * 0.05d)) - DrivingSeekbarView.this.i.getHeight();
                    View a2 = DrivingSeekbarView.this.i;
                    int i = i3;
                    a2.setPadding(i, height, i, 0);
                    DrivingSeekbarView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                    return false;
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    static /* synthetic */ void c(DrivingSeekbarView drivingSeekbarView) {
        AnimatorSet animatorSet = drivingSeekbarView.m;
        if (animatorSet != null && animatorSet.isStarted()) {
            drivingSeekbarView.m.cancel();
        }
        SuppressLayoutTextView suppressLayoutTextView = drivingSeekbarView.c;
        if (drivingSeekbarView.getResources().getConfiguration().orientation == 1 && drivingSeekbarView.f.length() >= 5) {
            int i2 = drivingSeekbarView.d;
            if (drivingSeekbarView.f.length() == 5) {
                i2 -= 10;
            } else if (drivingSeekbarView.f.length() > 5) {
                i2 -= 20;
            }
            suppressLayoutTextView.setTextSize(2, (float) i2);
        }
        drivingSeekbarView.g.setAlpha(0.9f);
        drivingSeekbarView.g.bringToFront();
        drivingSeekbarView.c.setAlpha(1.0f);
        drivingSeekbarView.c.bringToFront();
        drivingSeekbarView.h.findViewById(R.id.seekbar_view).bringToFront();
        drivingSeekbarView.i.setAlpha(0.0f);
    }

    static /* synthetic */ void d(DrivingSeekbarView drivingSeekbarView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(drivingSeekbarView.g, View.ALPHA, new float[]{0.9f, 0.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(drivingSeekbarView.c, View.ALPHA, new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(drivingSeekbarView.i, View.ALPHA, new float[]{0.0f, 1.0f});
        AnimatorSet animatorSet = new AnimatorSet();
        drivingSeekbarView.m = animatorSet;
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
        animatorSet.setDuration(500);
        animatorSet.addListener(new AnimatorListener() {
            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                DrivingSeekbarView.this.h.findViewById(R.id.driving_player_controls).bringToFront();
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }
        });
        animatorSet.start();
    }

    public final void a(int i2) {
        this.j.setProgress(i2);
    }

    public final void a(a aVar) {
        this.l = aVar;
    }

    public final void c(int i2) {
        this.k.a(i2);
        this.e.a(i2);
    }

    public final void d(int i2) {
        int i3 = i2 / 1000;
        this.k.b(i3);
        this.e.b(i3);
        this.j.setMax(i2);
    }

    public final void e(boolean z) {
        if (!z) {
            this.j.setOnTouchListener($$Lambda$DrivingSeekbarView$WVx8zLh7Fw_CXIzSN_YI_BnU.INSTANCE);
            this.j.getThumb().mutate().setAlpha(0);
            return;
        }
        this.j.setOnTouchListener(null);
        this.j.getThumb().mutate().setAlpha(255);
    }
}
