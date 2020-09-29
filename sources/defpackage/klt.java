package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.mobile.android.wrapped2019.stories.templates.topgenres.GenreBarView;
import com.spotify.mobile.android.wrapped2019.stories.templates.topgenres.TopGenresView;
import com.spotify.music.R;
import java.util.List;

/* renamed from: klt reason: default package */
public class klt extends kif {
    private TopGenresView U;
    private TextView V;
    private TextView X;
    private Animator Y;

    public static klt a(m mVar) {
        Bundle a = a((kfp) mVar);
        a.putParcelable("GENRES", mVar.a);
        klt klt = new klt();
        klt.g(a);
        return klt;
    }

    private kls c() {
        return (kls) fbp.a((kls) l().getParcelable("GENRES"), (Object) "Can't find top genres in args.");
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.story_top_genres_fragment, viewGroup, false);
        this.U = (TopGenresView) ip.d(inflate, (int) R.id.top_genres_view);
        this.V = (TextView) ip.d(inflate, (int) R.id.top_genres_title);
        this.X = (TextView) ip.d(inflate, (int) R.id.top_genres_sub_title);
        return inflate;
    }

    public final void a(View view, Bundle bundle) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        super.a(view, bundle);
        kls c = c();
        TopGenresView topGenresView = this.U;
        List d = c.d();
        int size = d.size();
        if (size != 1) {
            if (size == 2) {
                TopGenresView.inflate(topGenresView.getContext(), R.layout.top_genres_view_2_items, topGenresView);
                Animator a = klr.a(d, topGenresView);
                a.setStartDelay(150);
                Animator b = klr.b(d, topGenresView);
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(new Animator[]{a, b});
                Animator a2 = klr.a(topGenresView);
                Animator b2 = klr.b(topGenresView);
                b2.setStartDelay(150);
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(new Animator[]{a2, b2});
                animatorSet4.setStartDelay(6000);
                animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(new Animator[]{animatorSet3, animatorSet4});
            } else if (size == 3) {
                TopGenresView.inflate(topGenresView.getContext(), R.layout.top_genres_view_3_items, topGenresView);
                Animator a3 = klr.a(d, topGenresView);
                a3.setStartDelay(300);
                Animator b3 = klr.b(d, topGenresView);
                a3.setStartDelay(150);
                Animator c2 = klr.c(d, topGenresView);
                AnimatorSet animatorSet5 = new AnimatorSet();
                animatorSet5.playTogether(new Animator[]{a3, b3, c2});
                Animator a4 = klr.a(topGenresView);
                Animator b4 = klr.b(topGenresView);
                b4.setStartDelay(150);
                Animator c3 = klr.c(topGenresView);
                c3.setStartDelay(300);
                AnimatorSet animatorSet6 = new AnimatorSet();
                animatorSet6.playTogether(new Animator[]{a4, b4, c3});
                animatorSet6.setStartDelay(6000);
                animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(new Animator[]{animatorSet5, animatorSet6});
            } else if (size == 4) {
                TopGenresView.inflate(topGenresView.getContext(), R.layout.top_genres_view_4_items, topGenresView);
                Animator a5 = klr.a(d, topGenresView);
                a5.setStartDelay(450);
                Animator b5 = klr.b(d, topGenresView);
                a5.setStartDelay(300);
                Animator c4 = klr.c(d, topGenresView);
                a5.setStartDelay(150);
                Animator d2 = klr.d(d, topGenresView);
                AnimatorSet animatorSet7 = new AnimatorSet();
                animatorSet7.playTogether(new Animator[]{a5, b5, c4, d2});
                Animator a6 = klr.a(topGenresView);
                Animator b6 = klr.b(topGenresView);
                b6.setStartDelay(150);
                Animator c5 = klr.c(topGenresView);
                c5.setStartDelay(300);
                Animator d3 = klr.d(topGenresView);
                d3.setStartDelay(450);
                AnimatorSet animatorSet8 = new AnimatorSet();
                animatorSet8.playTogether(new Animator[]{a6, b6, c5, d3});
                animatorSet8.setStartDelay(6000);
                animatorSet = new AnimatorSet();
                animatorSet.playTogether(new Animator[]{animatorSet7, animatorSet8});
            } else if (size == 5) {
                TopGenresView.inflate(topGenresView.getContext(), R.layout.top_genres_view_5_items, topGenresView);
                Animator a7 = klr.a(d, topGenresView);
                a7.setStartDelay(600);
                Animator b7 = klr.b(d, topGenresView);
                a7.setStartDelay(450);
                Animator c6 = klr.c(d, topGenresView);
                a7.setStartDelay(300);
                Animator d4 = klr.d(d, topGenresView);
                a7.setStartDelay(150);
                GenreBarView genreBarView = (GenreBarView) ip.d((View) topGenresView, (int) R.id.genre_view_05);
                genreBarView.a((klq) d.get(4));
                Animator a8 = kln.a(genreBarView, (int) R.dimen.top_genres_genre_view_5_height, 300);
                AnimatorSet animatorSet9 = new AnimatorSet();
                animatorSet9.playTogether(new Animator[]{a7, b7, c6, d4, a8});
                Animator a9 = klr.a(topGenresView);
                Animator b8 = klr.b(topGenresView);
                b8.setStartDelay(150);
                Animator c7 = klr.c(topGenresView);
                c7.setStartDelay(300);
                Animator d5 = klr.d(topGenresView);
                d5.setStartDelay(450);
                GenreBarView genreBarView2 = (GenreBarView) ip.d((View) topGenresView, (int) R.id.genre_view_05);
                Animator a10 = kln.a((View) genreBarView2.c(), 300);
                Animator a11 = kln.a(genreBarView2.b(), 300);
                Animator a12 = kln.a((View) genreBarView2, (int) R.dimen.top_genres_genre_view_5_height, 300);
                AnimatorSet animatorSet10 = new AnimatorSet();
                animatorSet10.playTogether(new Animator[]{a10, a11, a12});
                animatorSet10.setStartDelay(600);
                AnimatorSet animatorSet11 = new AnimatorSet();
                animatorSet11.playTogether(new Animator[]{a9, b8, c7, d5, animatorSet10});
                animatorSet11.setStartDelay(6000);
                animatorSet = new AnimatorSet();
                animatorSet.playTogether(new Animator[]{animatorSet9, animatorSet11});
            } else {
                StringBuilder sb = new StringBuilder("Unexpected genre count : ");
                sb.append(d.size());
                throw new IllegalStateException(sb.toString());
            }
            animatorSet = animatorSet2;
        } else {
            TopGenresView.inflate(topGenresView.getContext(), R.layout.top_genres_view_1_item, topGenresView);
            Animator a13 = klr.a(d, topGenresView);
            Animator a14 = klr.a(topGenresView);
            a14.setStartDelay(6000);
            animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{a13, a14});
        }
        this.Y = animatorSet;
        kls kls = (kls) fbp.a(c);
        this.V.setText(kls.a());
        this.X.setText(kls.b());
    }

    public final void aP_() {
        super.aP_();
        b(c().c());
        b(this.Y);
    }
}
