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
import android.widget.Button;
import android.widget.TextView;
import com.spotify.mobile.android.wrapped2019.stories.views.PerspectiveImageStack;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/* renamed from: klf reason: default package */
public class klf extends kif {
    public Picasso U;
    public kle V;
    /* access modifiers changed from: private */
    public TextView X;
    /* access modifiers changed from: private */
    public PerspectiveImageStack Y;
    /* access modifiers changed from: private */
    public Button Z;
    private CompositeDisposable aa = new CompositeDisposable();

    public static klf a(k kVar) {
        klf klf = new klf();
        Bundle a = a((kfp) kVar);
        a.putString("title", kVar.b);
        a.putString("preview", kVar.a);
        a.putString("image", kVar.c);
        a.putString("uri", kVar.d);
        a.putString("button_text", kVar.e);
        a.putString("button_text_done", kVar.f);
        klf.g(a);
        return klf;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        c();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        CompositeDisposable compositeDisposable = this.aa;
        this.Z.setBackgroundResource(R.drawable.wrapped_button_primary_citric);
        this.Z.setEnabled(false);
        this.Z.setText(l().getString("button_text"));
        compositeDisposable.a(this.V.a(l().getString("uri")).a(AndroidSchedulers.a()).a((Action) new $$Lambda$klf$89G5_AiaoXdbDPzgwIvgLcXpc(this), (Consumer<? super Throwable>) new $$Lambda$klf$2Erlk4tRaGmYzFNRGNvleahCf5I<Object>(this)));
    }

    private void c() {
        this.Z.setBackgroundResource(R.drawable.wrapped_button_primary_citric);
        this.Z.setEnabled(true);
        this.Z.setText(l().getString("button_text"));
    }

    /* access modifiers changed from: private */
    public void e() {
        this.Z.setBackgroundResource(R.color.wrapped_black);
        this.Z.setEnabled(false);
        this.Z.setText(l().getString("button_text_done"));
        this.Z.setTextColor(gb.b(o().getResources(), R.color.wrapped_citric, this.Z.getContext().getTheme()));
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.story_top_100_playlist_fragment, viewGroup, false);
    }

    public final void a(View view, Bundle bundle) {
        this.X = (TextView) ip.d(view, (int) R.id.title);
        this.Y = (PerspectiveImageStack) ip.d(view, (int) R.id.image_stack);
        this.Z = (Button) ip.d(view, (int) R.id.button);
        Bundle l = l();
        this.X.setText(l.getString("title", ""));
        c();
        this.Z.setOnClickListener(new $$Lambda$klf$idY4cYT0J3qqp8Heae2dxPzVOX8(this));
        this.U.a(l.getString("image")).a((wgx) new kmh() {
            public final void a(Bitmap bitmap) {
                klf.this.Y.a(bitmap, 3);
            }
        });
        this.X.setVisibility(8);
        this.Y.setVisibility(8);
        this.Z.setVisibility(8);
    }

    public final void aP_() {
        super.aP_();
        this.aa = new CompositeDisposable();
        b((String) fbp.a(l().getString("preview")));
        AnimatorSet animatorSet = new AnimatorSet();
        Animator a = kmj.a(this.Y, false, 3);
        String str = "alpha";
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.Z, str, new float[]{0.0f, 1.0f});
        ofFloat.setInterpolator(kfr.a);
        ofFloat.setStartDelay(1300);
        ofFloat.setDuration(600);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(new Animator[]{a, ofFloat});
        animatorSet2.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                klf.this.X.setVisibility(0);
                klf.this.Y.setVisibility(0);
                klf.this.Z.setVisibility(0);
                klf.this.X.setAlpha(1.0f);
                klf.this.Z.setAlpha(0.0f);
            }
        });
        Animator b = kmj.b(this.Y, true, 3);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.Z, str, new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.X, str, new float[]{1.0f, 0.0f});
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(new Animator[]{ofFloat2, ofFloat3});
        animatorSet3.setInterpolator(kfr.a);
        animatorSet3.setStartDelay(300);
        animatorSet3.setDuration(300);
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playTogether(new Animator[]{b, animatorSet3});
        animatorSet4.setStartDelay(8000);
        animatorSet.playSequentially(new Animator[]{animatorSet2, animatorSet4});
        b((Animator) animatorSet);
    }

    public final void h() {
        this.aa.bd_();
        super.h();
    }
}
