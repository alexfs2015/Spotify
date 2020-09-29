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

/* renamed from: kvu reason: default package */
public final class kvu extends kvv {
    public final ViewGroup a;
    private final ImageView b;
    private final TextView c;
    private final TextView d;
    private final kvw e;

    public kvu(View view, kvw kvw) {
        super(kvw);
        this.a = (ViewGroup) view.findViewById(R.id.verified_artist_annotation_card);
        this.c = (TextView) view.findViewById(R.id.artist_name);
        this.b = (ImageView) view.findViewById(R.id.artist_image);
        this.d = (TextView) view.findViewById(R.id.artist_quote);
        this.e = kvw;
    }

    private b a(kvy kvy) {
        return new b(this.b, kvy);
    }

    private c b(String str) {
        return new c(this.d, str);
    }

    private c c(String str) {
        return new c(this.c, str);
    }

    public final Animator a(String str) {
        return kvw.a(this.d, b(str), this.d);
    }

    public final Animator a(String str, kvy kvy, String str2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{kvw.a(this.c, c(str), this.c), a(str2), kvw.a(this.b, a(kvy), this.b), kvw.a(this.a)});
        return animatorSet;
    }

    public final List<Animator> a() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(kvw.a(this.c));
        arrayList.add(kvw.a(this.b));
        arrayList.add(kvw.a(this.d));
        return arrayList;
    }

    public final Animator b() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{kvw.b(this.c), kvw.b(this.b), kvw.b(this.d)});
        return animatorSet;
    }

    public final d b(String str, kvy kvy, String str2) {
        return new d(c(str), a(kvy), b(str2));
    }

    public final ViewGroup c() {
        return this.a;
    }
}
