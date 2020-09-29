package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.squareup.picasso.Picasso;
import java.util.List;

/* renamed from: kgp reason: default package */
public final class kgp {
    public static Animator a(final View view, View view2, final ConstraintLayout constraintLayout, final et etVar, int i) {
        float y = view2.getY() - view.getY();
        int i2 = view.getLayoutParams().width;
        int i3 = i - i2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(1500);
        ofFloat.addUpdateListener(new $$Lambda$kgp$I1pY2wn94jymWmj5YsZ8oYc85yc(view, y, i2, i3));
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                etVar.b(constraintLayout);
                view.setTranslationY(0.0f);
            }
        });
        return ofFloat;
    }

    public static Animator a(Picasso picasso, kfn kfn, TextView textView, TextView textView2, List<kgx> list, List<ImageView> list2) {
        AnimatorSet animatorSet = new AnimatorSet();
        fbx a = fbx.a((Iterable<E>) list);
        $$Lambda$kgp$92Y0afn9IWvFfadgGQGG4BhoCMY r1 = new $$Lambda$kgp$92Y0afn9IWvFfadgGQGG4BhoCMY(kfn, textView, textView2, list2, picasso);
        animatorSet.playSequentially(ImmutableList.a(a.a((Function<? super E, T>) r1).a()));
        return animatorSet;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Animator a(kfn kfn, TextView textView, TextView textView2, List list, Picasso picasso, kgx kgx) {
        fay.a(kgx);
        Animator duration = ValueAnimator.ofInt(new int[]{0, 1}).setDuration(6000);
        final kfn kfn2 = kfn;
        final kgx kgx2 = kgx;
        final TextView textView3 = textView;
        final TextView textView4 = textView2;
        final List list2 = list;
        final Picasso picasso2 = picasso;
        AnonymousClass2 r1 = new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                kfn2.a(kgx2.d());
                TextView textView = textView3;
                kgx kgx = kgx2;
                TextView textView2 = textView4;
                List<ImageView> list = list2;
                Picasso picasso = picasso2;
                textView.setText(((kgx) fay.a(kgx)).c());
                textView2.setText(kgx.a());
                String b2 = kgx.b();
                for (ImageView a2 : list) {
                    picasso.a(b2).a(a2);
                }
            }
        };
        duration.addListener(r1);
        return duration;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(View view, float f, int i, int i2, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        view.setTranslationY(f * floatValue);
        float f2 = ((float) i) + (((float) i2) * floatValue);
        LayoutParams layoutParams = view.getLayoutParams();
        int i3 = (int) f2;
        layoutParams.width = i3;
        layoutParams.height = i3;
        view.setLayoutParams(layoutParams);
    }
}
