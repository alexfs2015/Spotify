package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.wrapped2019.stories.templates.StoryParagraphDecorator;
import com.spotify.mobile.android.wrapped2019.stories.views.PerspectiveImageStack;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;
import java.util.List;

/* renamed from: kkl reason: default package */
public class kkl extends kif {
    public Picasso U;
    private TextView V;
    private TextView X;
    private TextView Y;
    private TextView Z;
    private TextView aa;
    private TextView ab;
    /* access modifiers changed from: private */
    public List<TextView> ac;
    /* access modifiers changed from: private */
    public TextView ad;
    /* access modifiers changed from: private */
    public TextView ae;
    /* access modifiers changed from: private */
    public TextView af;
    /* access modifiers changed from: private */
    public TextView ag;
    /* access modifiers changed from: private */
    public PerspectiveImageStack ah;
    private Animator ai;
    private String aj;

    private static Animator a(View view, long j) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f});
        ofFloat.setStartDelay(j);
        ofFloat.setDuration(0);
        return ofFloat;
    }

    public static kkl a(h hVar) {
        kkl kkl = new kkl();
        Bundle a = a((kfp) hVar);
        a.putString("preview", hVar.a);
        a.putString("image", hVar.g);
        a.putString("thanks-message", hVar.b);
        a.putString("greetings-message", hVar.c.text());
        a.putStringArray("greetings-year", hVar.c.valuesArray());
        a.putString("title", hVar.d);
        a.putString("paragraph1", hVar.e.text());
        a.putStringArray("paragraph1Values", hVar.e.valuesArray());
        a.putString("paragraph2", hVar.f.text());
        a.putStringArray("paragraph2Values", hVar.f.valuesArray());
        kkl.g(a);
        return kkl;
    }

    private static Animator b(View view, long j) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f});
        ofFloat.setStartDelay(j + 1650);
        ofFloat.setDuration(0);
        return ofFloat;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.story_premium_fragment, viewGroup, false);
    }

    public final void a(View view, Bundle bundle) {
        View view2 = view;
        this.V = (TextView) ip.d(view2, (int) R.id.thanks1);
        this.X = (TextView) ip.d(view2, (int) R.id.thanks2);
        this.Y = (TextView) ip.d(view2, (int) R.id.thanks3);
        this.Z = (TextView) ip.d(view2, (int) R.id.thanks4);
        this.aa = (TextView) ip.d(view2, (int) R.id.thanks5);
        this.ab = (TextView) ip.d(view2, (int) R.id.thanks6);
        this.ac = ImmutableList.a(this.V, this.X, this.Y, this.Z, this.aa, this.ab);
        this.ad = (TextView) ip.d(view2, (int) R.id.premium_since);
        this.ae = (TextView) ip.d(view2, (int) R.id.title);
        this.af = (TextView) ip.d(view2, (int) R.id.body1);
        this.ag = (TextView) ip.d(view2, (int) R.id.body2);
        this.ah = (PerspectiveImageStack) ip.d(view2, (int) R.id.perspective_image_stack);
        Bundle l = l();
        int c = fr.c(this.ad.getContext(), R.color.wrapped_fuchsia);
        String str = (String) fbp.a(l.getString("thanks-message"));
        for (TextView textView : this.ac) {
            textView.setVisibility(8);
            textView.setText(str);
        }
        this.ad.setVisibility(8);
        this.ad.setText(StoryParagraphDecorator.a((String) fbp.a(l.getString("greetings-message")), (String[]) fbp.a(l.getStringArray("greetings-year")), c));
        this.ae.setVisibility(8);
        this.af.setVisibility(8);
        this.ag.setVisibility(8);
        this.ah.setVisibility(8);
        this.ae.setText(l.getString("title"));
        this.af.setText(StoryParagraphDecorator.a((String) fbp.a(l.getString("paragraph1")), (String[]) fbp.a(l.getStringArray("paragraph1Values")), c));
        this.ag.setText(StoryParagraphDecorator.a((String) fbp.a(l.getString("paragraph2")), (String[]) fbp.a(l.getStringArray("paragraph2Values")), c));
        this.U.a(l.getString("image")).a((wgx) new kmh() {
            public final void a(Bitmap bitmap) {
                kkl.this.ah.a(bitmap, 4);
            }
        });
        this.aj = l.getString("preview");
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(new Animator[]{a((View) this.ab, 150), a((View) this.aa, 250), a((View) this.Z, 350), a((View) this.Y, 450), a((View) this.X, 550), a((View) this.V, 650), b(this.ab, 0), b(this.aa, 100), b(this.Z, 200), b(this.Y, 300), b(this.X, 400), b(this.V, 500)});
        animatorSet2.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                for (View visibility : kkl.this.ac) {
                    visibility.setVisibility(8);
                }
            }

            public final void onAnimationStart(Animator animator) {
                for (View view : kkl.this.ac) {
                    view.setAlpha(0.0f);
                    view.setVisibility(0);
                }
            }
        });
        String str2 = "alpha";
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.ad, str2, new float[]{0.0f, 1.0f});
        ofFloat.setDuration(0);
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                kkl.this.ad.setVisibility(0);
                kkl.this.ad.setAlpha(0.0f);
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.ad, str2, new float[]{1.0f, 0.0f});
        ofFloat2.setDuration(300);
        ofFloat2.setStartDelay(2000);
        ofFloat2.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                kkl.this.ad.setVisibility(8);
            }
        });
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(new Animator[]{ofFloat, ofFloat2});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.ae, str2, new float[]{0.0f, 1.0f});
        ofFloat3.setInterpolator(kfr.a);
        ofFloat3.setDuration(600);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.af, str2, new float[]{0.0f, 1.0f});
        ofFloat4.setInterpolator(kfr.a);
        ofFloat4.setDuration(600);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.ag, str2, new float[]{0.0f, 1.0f});
        ofFloat4.setInterpolator(kfr.a);
        ofFloat5.setStartDelay(3700);
        ofFloat4.setDuration(600);
        Animator a = kmj.a(this.ah, true, 4);
        a.setStartDelay(1000);
        a.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                kkl.this.ah.setVisibility(0);
            }
        });
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playTogether(new Animator[]{ofFloat3, ofFloat4, a, ofFloat5});
        animatorSet4.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                kkl.this.ae.setAlpha(0.0f);
                kkl.this.af.setAlpha(0.0f);
                kkl.this.ag.setAlpha(0.0f);
                kkl.this.ae.setVisibility(0);
                kkl.this.af.setVisibility(0);
                kkl.this.ag.setVisibility(0);
            }
        });
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.ae, str2, new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.af, str2, new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.ag, str2, new float[]{1.0f, 0.0f});
        AnimatorSet animatorSet5 = new AnimatorSet();
        animatorSet5.playTogether(new Animator[]{ofFloat6, ofFloat7, ofFloat8});
        animatorSet5.setInterpolator(kfr.a);
        animatorSet5.setStartDelay(600);
        animatorSet5.setDuration(300);
        Animator b = kmj.b(this.ah, true, 4);
        AnimatorSet animatorSet6 = new AnimatorSet();
        animatorSet6.setStartDelay(6000);
        animatorSet6.playTogether(new Animator[]{animatorSet5, b});
        animatorSet.playSequentially(new Animator[]{animatorSet2, animatorSet3, animatorSet4, animatorSet6});
        this.ai = animatorSet;
    }

    public final void aP_() {
        super.aP_();
        b(this.aj);
        b(this.ai);
    }
}
