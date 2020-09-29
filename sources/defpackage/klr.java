package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import com.spotify.mobile.android.wrapped2019.stories.templates.topgenres.GenreBarView;
import com.spotify.music.R;
import java.util.List;

/* renamed from: klr reason: default package */
final class klr {
    static Animator a(View view) {
        GenreBarView genreBarView = (GenreBarView) ip.d(view, (int) R.id.genre_view_01);
        Animator a = kln.a((View) genreBarView.c(), 450);
        Animator a2 = kln.a(genreBarView.b(), 450);
        Animator a3 = kln.a((View) genreBarView, (int) R.dimen.top_genres_genre_view_1_height, 450);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{a, a2, a3});
        return animatorSet;
    }

    static Animator a(List<klq> list, View view) {
        GenreBarView genreBarView = (GenreBarView) ip.d(view, (int) R.id.genre_view_01);
        genreBarView.a((klq) list.get(0));
        return kln.a(genreBarView, (int) R.dimen.top_genres_genre_view_1_height, 450);
    }

    static Animator b(View view) {
        GenreBarView genreBarView = (GenreBarView) ip.d(view, (int) R.id.genre_view_02);
        Animator a = kln.a((View) genreBarView.c(), 300);
        Animator a2 = kln.a(genreBarView.b(), 300);
        Animator a3 = kln.a((View) genreBarView, (int) R.dimen.top_genres_genre_view_2_height, 300);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{a, a2, a3});
        return animatorSet;
    }

    static Animator b(List<klq> list, View view) {
        GenreBarView genreBarView = (GenreBarView) ip.d(view, (int) R.id.genre_view_02);
        genreBarView.a((klq) list.get(1));
        return kln.a(genreBarView, (int) R.dimen.top_genres_genre_view_2_height, 300);
    }

    static Animator c(View view) {
        GenreBarView genreBarView = (GenreBarView) ip.d(view, (int) R.id.genre_view_03);
        Animator a = kln.a((View) genreBarView.c(), 300);
        Animator a2 = kln.a(genreBarView.b(), 300);
        Animator a3 = kln.a((View) genreBarView, (int) R.dimen.top_genres_genre_view_3_height, 300);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{a, a2, a3});
        return animatorSet;
    }

    static Animator c(List<klq> list, View view) {
        GenreBarView genreBarView = (GenreBarView) ip.d(view, (int) R.id.genre_view_03);
        genreBarView.a((klq) list.get(2));
        return kln.a(genreBarView, (int) R.dimen.top_genres_genre_view_3_height, 300);
    }

    static Animator d(View view) {
        GenreBarView genreBarView = (GenreBarView) ip.d(view, (int) R.id.genre_view_04);
        Animator a = kln.a((View) genreBarView.c(), 300);
        Animator a2 = kln.a(genreBarView.b(), 300);
        Animator a3 = kln.a((View) genreBarView, (int) R.dimen.top_genres_genre_view_4_height, 300);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{a, a2, a3});
        return animatorSet;
    }

    static Animator d(List<klq> list, View view) {
        GenreBarView genreBarView = (GenreBarView) ip.d(view, (int) R.id.genre_view_04);
        genreBarView.a((klq) list.get(3));
        return kln.a(genreBarView, (int) R.dimen.top_genres_genre_view_4_height, 300);
    }
}
