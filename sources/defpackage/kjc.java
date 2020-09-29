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

/* renamed from: kjc reason: default package */
public final class kjc {
    public static Animator a(final View view, View view2, final ConstraintLayout constraintLayout, final et etVar, int i) {
        float y = view2.getY() - view.getY();
        int i2 = view.getLayoutParams().width;
        int i3 = i - i2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(1500);
        ofFloat.addUpdateListener(new $$Lambda$kjc$qjwQx12EmpCVqLClHF35jckMWGQ(view, y, i2, i3));
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                etVar.b(constraintLayout);
                view.setTranslationY(0.0f);
            }
        });
        return ofFloat;
    }

    public static Animator a(Picasso picasso, gcp<String> gcp, TextView textView, TextView textView2, List<kjk> list, List<ImageView> list2) {
        AnimatorSet animatorSet = new AnimatorSet();
        fcp a = fcp.a((Iterable<E>) list);
        $$Lambda$kjc$_eijpNAOnjhpHXOQEyo7pvSdS30 r1 = new $$Lambda$kjc$_eijpNAOnjhpHXOQEyo7pvSdS30(gcp, textView, textView2, list2, picasso);
        animatorSet.playSequentially(ImmutableList.a(a.a((Function<? super E, T>) r1).a()));
        return animatorSet;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Animator a(gcp gcp, TextView textView, TextView textView2, List list, Picasso picasso, kjk kjk) {
        fbp.a(kjk);
        Animator duration = ValueAnimator.ofInt(new int[]{0, 1}).setDuration(6000);
        final gcp gcp2 = gcp;
        final kjk kjk2 = kjk;
        final TextView textView3 = textView;
        final TextView textView4 = textView2;
        final List list2 = list;
        final Picasso picasso2 = picasso;
        AnonymousClass2 r1 = new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                gcp2.accept(kjk2.d());
                TextView textView = textView3;
                kjk kjk = kjk2;
                TextView textView2 = textView4;
                List<ImageView> list = list2;
                Picasso picasso = picasso2;
                textView.setText(((kjk) fbp.a(kjk)).c());
                textView2.setText(kjk.a());
                String b2 = kjk.b();
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
