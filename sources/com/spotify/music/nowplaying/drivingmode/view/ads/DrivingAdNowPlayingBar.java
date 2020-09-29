package com.spotify.music.nowplaying.drivingmode.view.ads;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.R;

public class DrivingAdNowPlayingBar extends ConstraintLayout implements toz {
    private final Interpolator b = new ky();
    private View c;
    /* access modifiers changed from: private */
    public View d;
    /* access modifiers changed from: private */
    public TextView e;
    /* access modifiers changed from: private */
    public TextView f;
    private AnimatorSet g;
    private AnimatorSet h;
    private boolean i;
    private a j;

    public DrivingAdNowPlayingBar(Context context) {
        super(context);
        d();
    }

    public DrivingAdNowPlayingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d();
    }

    public DrivingAdNowPlayingBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        d();
    }

    private static Animator a(View view, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(500).playTogether(new Animator[]{ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{f2, 0.0f})});
        return animatorSet;
    }

    private static Animator b(final View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(500).playTogether(new Animator[]{ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f, 0.0f}), ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{0.0f, ((float) (-view.getHeight())) / 4.0f})});
        animatorSet.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                view.setScaleY(1.0f);
            }
        });
        return animatorSet;
    }

    private void d() {
        inflate(getContext(), R.layout.driving_pivot_ad_info, this);
        this.c = findViewById(R.id.pivot_ads_npb);
        this.d = findViewById(R.id.driving_mode_ad_up_next);
        this.e = (TextView) findViewById(R.id.driving_ad_title);
        vgl.a(getContext(), this.e, 2132017612);
        vgl.a(getContext(), (TextView) findViewById(R.id.driving_ad_up_next_title), 2132017612);
        this.f = (TextView) findViewById(R.id.driving_ad_next_context);
        vgl.a(getContext(), this.f, 2132017611);
        ImageView imageView = (ImageView) findViewById(R.id.driving_up_next_icon);
        Drawable d2 = tou.d(getContext());
        d2.setBounds(0, 0, d2.getMinimumWidth(), d2.getMinimumHeight());
        imageView.setImageDrawable(d2);
        this.g = new AnimatorSet();
        this.h = new AnimatorSet();
    }

    public final void a(final String str) {
        if (this.i) {
            Animator b2 = b((View) this.f);
            TextView textView = this.f;
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(500).playTogether(new Animator[]{ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{0.0f, 1.0f}), ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{(float) textView.getHeight(), 0.0f})});
            b2.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    DrivingAdNowPlayingBar.this.f.setText(str);
                }
            });
            this.g.setInterpolator(this.b);
            this.g.playSequentially(new Animator[]{b2, animatorSet});
            this.g.start();
            return;
        }
        Animator b3 = b((View) this.e);
        View view = this.d;
        Animator a = a(view, (float) view.getHeight());
        b3.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                DrivingAdNowPlayingBar.this.f.setText(str);
                DrivingAdNowPlayingBar.this.e.setVisibility(4);
            }
        });
        a.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                DrivingAdNowPlayingBar.this.d.setVisibility(0);
                DrivingAdNowPlayingBar.this.f.setText(str);
            }
        });
        this.h.setInterpolator(this.b);
        this.h.playTogether(new Animator[]{b3, a});
        this.h.start();
        this.i = true;
    }

    public final void a(a aVar) {
        this.j = aVar;
    }

    public final void b() {
        this.e.setTranslationY(0.0f);
        this.e.setVisibility(0);
        this.e.setAlpha(1.0f);
        this.d.setVisibility(4);
        Animator a = a(this, (float) this.c.getHeight());
        a.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                DrivingAdNowPlayingBar.this.setVisibility(8);
            }
        });
        a.setInterpolator(this.b);
        a.start();
        a aVar = this.j;
        if (aVar != null) {
            aVar.a(true);
        }
    }

    public final void c() {
        float height = (float) this.c.getHeight();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(500).playTogether(new Animator[]{ObjectAnimator.ofFloat(this, View.TRANSLATION_Y, new float[]{0.0f, height})});
        animatorSet.setInterpolator(this.b);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                DrivingAdNowPlayingBar.this.setVisibility(8);
            }
        });
        animatorSet.start();
        this.i = false;
        a aVar = this.j;
        if (aVar != null) {
            aVar.a(false);
        }
    }
}
