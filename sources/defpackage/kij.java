package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.mobile.android.wrapped2019.stories.views.PerspectiveImageStack;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

/* renamed from: kij reason: default package */
public class kij extends kif {
    public Picasso U;
    /* access modifiers changed from: private */
    public TextView V;
    /* access modifiers changed from: private */
    public TextView X;
    /* access modifiers changed from: private */
    public TextView Y;
    /* access modifiers changed from: private */
    public TextView Z;
    /* access modifiers changed from: private */
    public PerspectiveImageStack aa;
    /* access modifiers changed from: private */
    public PerspectiveImageStack ab;
    /* access modifiers changed from: private */
    public PerspectiveImageStack ac;

    public static kij a(a aVar) {
        Bundle a = a((kfp) aVar);
        a.putParcelable("ARTIST_OF_THE_DECADE_STORY", aVar.a);
        kij kij = new kij();
        kij.g(a);
        return kij;
    }

    private kii c() {
        return (kii) fbp.a(l().getParcelable("ARTIST_OF_THE_DECADE_STORY"));
    }

    /* access modifiers changed from: private */
    public void e() {
        this.V.setVisibility(0);
        this.V.setAlpha(1.0f);
        this.X.setVisibility(8);
        this.Y.setVisibility(8);
        this.Z.setVisibility(8);
        this.aa.setVisibility(8);
        this.ab.setVisibility(8);
        this.ac.setVisibility(8);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.story_top_artist_of_the_decade, viewGroup, false);
    }

    public final void a(View view, Bundle bundle) {
        this.V = (TextView) ip.d(view, (int) R.id.intro);
        this.X = (TextView) ip.d(view, (int) R.id.title);
        this.Y = (TextView) ip.d(view, (int) R.id.name);
        this.Z = (TextView) ip.d(view, (int) R.id.subtitle);
        this.aa = (PerspectiveImageStack) ip.d(view, (int) R.id.stack_top);
        this.ab = (PerspectiveImageStack) ip.d(view, (int) R.id.stack_center);
        this.ac = (PerspectiveImageStack) ip.d(view, (int) R.id.stack_bottom);
        kii c = c();
        this.V.setText(c.a());
        this.X.setText(c.b());
        this.Y.setText(c.d());
        this.Z.setText(c.c());
        this.U.a(c.e()).a((wgx) new kmh() {
            public final void a(Bitmap bitmap) {
                kij.this.aa.a(bitmap, 4);
                kij.this.ab.a(bitmap, 4);
                kij.this.ac.a(bitmap, 4);
            }
        });
        e();
    }

    public final void aP_() {
        super.aP_();
        b(c().f());
        AnimatorSet animatorSet = new AnimatorSet();
        Animator[] animatorArr = new Animator[4];
        AnimatorSet animatorSet2 = new AnimatorSet();
        Animator a = kmj.a(this.aa, true, 4);
        a.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                kij.this.aa.setVisibility(0);
            }
        });
        Animator a2 = kmj.a(this.ac, true, 4);
        a2.setStartDelay(1000);
        a2.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                kij.this.ac.setVisibility(0);
            }
        });
        Animator a3 = kmj.a(this.ab, true, 4);
        a3.setStartDelay(2200);
        a3.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                kij.this.ab.setVisibility(0);
            }
        });
        animatorSet2.playTogether(new Animator[]{a, a3, a2});
        animatorSet2.setStartDelay(1000);
        animatorSet2.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                kij.this.V.setVisibility(8);
            }

            public final void onAnimationStart(Animator animator) {
                kij.this.e();
            }
        });
        animatorArr[0] = animatorSet2;
        AnimatorSet animatorSet3 = new AnimatorSet();
        Animator b = kmj.b(this.ac, true, 4);
        b.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                kij.this.ac.setVisibility(8);
            }
        });
        Animator b2 = kmj.b(this.aa, true, 4);
        b2.setStartDelay(600);
        b2.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                kij.this.aa.setVisibility(8);
            }
        });
        String str = "alpha";
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.X, str, new float[]{0.0f, 1.0f});
        ofFloat.setInterpolator(kfr.a);
        ofFloat.setStartDelay(300);
        ofFloat.setDuration(300);
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                kij.this.X.setVisibility(0);
                kij.this.X.setAlpha(0.0f);
            }
        });
        animatorSet3.playTogether(new Animator[]{b2, b, ofFloat});
        animatorSet3.setStartDelay(2000);
        animatorArr[1] = animatorSet3;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.Y, str, new float[]{0.0f, 1.0f});
        ofFloat2.setDuration(600);
        ofFloat2.setInterpolator(kfr.a);
        ofFloat2.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                kij.this.Y.setVisibility(0);
                kij.this.Y.setAlpha(0.0f);
            }
        });
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.Z, str, new float[]{0.0f, 1.0f});
        ofFloat3.setStartDelay(1000);
        ofFloat3.setDuration(600);
        ofFloat3.setInterpolator(kfr.a);
        ofFloat3.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                kij.this.Z.setVisibility(0);
                kij.this.Z.setAlpha(0.0f);
            }
        });
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.setStartDelay(1000);
        Resources resources = o().getResources();
        float dimension = resources.getDimension(R.dimen.artist_decade_center_stack_image_start_x);
        float dimension2 = resources.getDimension(R.dimen.artist_decade_center_stack_image_start_y);
        float dimension3 = resources.getDimension(R.dimen.artist_decade_center_stack_image_end_x);
        float dimension4 = resources.getDimension(R.dimen.artist_decade_center_stack_image_end_y);
        float dimension5 = resources.getDimension(R.dimen.artist_decade_center_stack_vanishing_point_start_x);
        float dimension6 = resources.getDimension(R.dimen.artist_decade_center_stack_vanishing_point_start_y);
        float dimension7 = resources.getDimension(R.dimen.artist_decade_center_stack_vanishing_point_end_x);
        float dimension8 = resources.getDimension(R.dimen.artist_decade_center_stack_vanishing_point_end_y);
        AnimatorSet animatorSet5 = new AnimatorSet();
        AnimatorSet animatorSet6 = animatorSet;
        Animator[] animatorArr2 = animatorArr;
        String str2 = str;
        animatorSet5.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.ab, "topImageCenterX", new float[]{dimension, dimension3}), ObjectAnimator.ofFloat(this.ab, "topImageCenterY", new float[]{dimension2, dimension4}), ObjectAnimator.ofFloat(this.ab, "vanishingPointX", new float[]{dimension5, dimension7}), ObjectAnimator.ofFloat(this.ab, "vanishingPointY", new float[]{dimension6, dimension8})});
        animatorSet5.setDuration(8000);
        animatorSet4.playTogether(new Animator[]{ofFloat2, ofFloat3, animatorSet5});
        animatorArr2[2] = animatorSet4;
        String str3 = str2;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.X, str3, new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.Y, str3, new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.Z, str3, new float[]{1.0f, 0.0f});
        Animator b3 = kmj.b(this.ab, true, 4);
        AnimatorSet animatorSet7 = new AnimatorSet();
        animatorSet7.playTogether(new Animator[]{ofFloat4, ofFloat5, ofFloat6});
        animatorSet7.setStartDelay(450);
        animatorSet7.setDuration(300);
        AnimatorSet animatorSet8 = new AnimatorSet();
        animatorSet8.playTogether(new Animator[]{b3, animatorSet7});
        animatorArr2[3] = animatorSet8;
        AnimatorSet animatorSet9 = animatorSet6;
        animatorSet9.playSequentially(animatorArr2);
        b((Animator) animatorSet9);
    }
}
