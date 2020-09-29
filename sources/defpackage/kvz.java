package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: kvz reason: default package */
public final class kvz extends kvv {
    public final ViewGroup a;
    public final TextView b;
    public final TextView c;
    private final TextView d;
    private final ImageView e;
    private final kvw f;

    public kvz(View view, kvw kvw) {
        super(kvw);
        this.a = (ViewGroup) view.findViewById(R.id.info_card);
        this.e = (ImageView) view.findViewById(R.id.card_icon);
        this.d = (TextView) view.findViewById(R.id.info_type);
        this.b = (TextView) view.findViewById(R.id.lyrics_text);
        this.c = (TextView) view.findViewById(R.id.insights_text);
        this.f = kvw;
    }

    public final Animator a() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{kvw.a(this.d), kvw.a(this.e)});
        return animatorSet;
    }

    public final Animator a(String str) {
        return kvw.a(this.d, b(str), this.d);
    }

    public final b a(kvy kvy) {
        return new b(this.e, kvy);
    }

    public final Animator b() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{kvw.b(this.b), kvw.b(this.c), kvw.b(this.e), kvw.b(this.d)});
        return animatorSet;
    }

    public final Animator b(kvy kvy) {
        return kvw.a(this.e, a(kvy), this.e);
    }

    public final c b(String str) {
        return new c(this.d, str);
    }

    public final ViewGroup c() {
        return this.a;
    }
}
