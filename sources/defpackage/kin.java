package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.mobile.android.wrapped2019.stories.templates.StoryParagraphDecorator;
import com.spotify.music.R;

/* renamed from: kin reason: default package */
public class kin extends kif {
    private static final Long U = Long.valueOf(300);
    private static final Long V = Long.valueOf(3000);
    private String X;
    private TextView Y;
    private TextView Z;

    public static kin a(c cVar) {
        kin kin = new kin();
        Bundle a = a((kfp) cVar);
        a.putString("preview", cVar.a);
        a.putString("paragraph1", cVar.b.text());
        a.putStringArray("paragraph1Values", (String[]) cVar.b.values().toArray(new String[0]));
        a.putString("paragraph2", cVar.c.text());
        a.putStringArray("paragraph2Values", (String[]) cVar.c.values().toArray(new String[0]));
        kin.g(a);
        return kin;
    }

    private static Animator b(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f, 0.0f}));
        return animatorSet;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.story_decades_fragment, viewGroup, false);
    }

    public final void a(View view, Bundle bundle) {
        this.Y = (TextView) ip.d(view, (int) R.id.paragraph1);
        this.Z = (TextView) ip.d(view, (int) R.id.paragraph2);
        Bundle l = l();
        int c = fr.c(view.getContext(), R.color.wrapped_citric);
        this.Y.setText(StoryParagraphDecorator.a((String) fbp.a(l.getString("paragraph1")), (String[]) fbp.a(l.getStringArray("paragraph1Values")), c));
        this.Z.setText(StoryParagraphDecorator.a((String) fbp.a(l.getString("paragraph2")), (String[]) fbp.a(l.getStringArray("paragraph2Values")), c));
        this.X = (String) fbp.a(l.getString("preview"));
    }

    public final void aP_() {
        super.aP_();
        b(this.X);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(kfr.a);
        animatorSet.setStartDelay(V.longValue());
        animatorSet.setDuration(U.longValue());
        animatorSet.playTogether(new Animator[]{b(this.Y), b(this.Z)});
        b((Animator) animatorSet);
    }
}
