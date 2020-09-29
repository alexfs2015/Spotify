package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ksl reason: default package */
public final class ksl extends ksm {
    public final ViewGroup a;
    private final ImageView b;
    private final TextView c;
    private final TextView d;
    private final ksn e;

    public ksl(View view, ksn ksn) {
        super(ksn);
        this.a = (ViewGroup) view.findViewById(R.id.verified_artist_annotation_card);
        this.c = (TextView) view.findViewById(R.id.artist_name);
        this.b = (ImageView) view.findViewById(R.id.artist_image);
        this.d = (TextView) view.findViewById(R.id.artist_quote);
        this.e = ksn;
    }

    public final List<Animator> a() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(ksn.a(this.c));
        arrayList.add(ksn.a(this.b));
        arrayList.add(ksn.a(this.d));
        return arrayList;
    }

    public final Animator b() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ksn.b(this.c), ksn.b(this.b), ksn.b(this.d)});
        return animatorSet;
    }

    public final ViewGroup c() {
        return this.a;
    }

    public final Animator a(String str) {
        return ksn.a(this.d, b(str), this.d);
    }

    public final Animator a(String str, ksp ksp, String str2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ksn.a(this.c, c(str), this.c), a(str2), ksn.a(this.b, a(ksp), this.b), ksn.a(this.a)});
        return animatorSet;
    }

    private c b(String str) {
        return new c(this.d, str);
    }

    private b a(ksp ksp) {
        return new b(this.b, ksp);
    }

    private c c(String str) {
        return new c(this.c, str);
    }

    public final d b(String str, ksp ksp, String str2) {
        return new d(c(str), a(ksp), b(str2));
    }
}
