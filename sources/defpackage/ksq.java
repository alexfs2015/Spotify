package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: ksq reason: default package */
public final class ksq extends ksm {
    public final ViewGroup a;
    public final TextView b;
    public final TextView c;
    private final TextView d;
    private final ImageView e;
    private final ksn f;

    public ksq(View view, ksn ksn) {
        super(ksn);
        this.a = (ViewGroup) view.findViewById(R.id.info_card);
        this.e = (ImageView) view.findViewById(R.id.card_icon);
        this.d = (TextView) view.findViewById(R.id.info_type);
        this.b = (TextView) view.findViewById(R.id.lyrics_text);
        this.c = (TextView) view.findViewById(R.id.insights_text);
        this.f = ksn;
    }

    public final Animator a() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ksn.a(this.d), ksn.a(this.e)});
        return animatorSet;
    }

    public final Animator a(String str) {
        return ksn.a(this.d, b(str), this.d);
    }

    public final c b(String str) {
        return new c(this.d, str);
    }

    public final b a(ksp ksp) {
        return new b(this.e, ksp);
    }

    public final Animator b(ksp ksp) {
        return ksn.a(this.e, a(ksp), this.e);
    }

    public final Animator b() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ksn.b(this.b), ksn.b(this.c), ksn.b(this.e), ksn.b(this.d)});
        return animatorSet;
    }

    public final ViewGroup c() {
        return this.a;
    }
}
