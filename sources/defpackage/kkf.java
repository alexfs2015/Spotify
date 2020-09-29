package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.wrapped2019.stories.templates.othertopartists.OtherTopArtistView;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;
import java.util.List;

/* renamed from: kkf reason: default package */
public class kkf extends kif {
    public Picasso U;
    private AnimatorSet V;
    private String X;

    public static long a(f fVar) {
        int size = fVar.a.b().size();
        if (size == 0) {
            return 0;
        }
        long j = (long) (size - 1);
        return (300 * j) + 900 + 4000 + 600 + (j * 150);
    }

    public static kkf b(f fVar) {
        Bundle a = a((kfp) fVar);
        a.putParcelable("otherTopArtistsData", fVar.a);
        kkf kkf = new kkf();
        kkf.g(a);
        return kkf;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.story_other_top_artists_fragment, viewGroup, false);
    }

    public final void a(View view, Bundle bundle) {
        View view2 = view;
        ImmutableList a = ImmutableList.a(ip.d(view2, (int) R.id.other_top_artist_1), ip.d(view2, (int) R.id.other_top_artist_2), ip.d(view2, (int) R.id.other_top_artist_3), ip.d(view2, (int) R.id.other_top_artist_4), ip.d(view2, (int) R.id.other_top_artist_5));
        TextView textView = (TextView) ip.d(view2, (int) R.id.other_top_artists_title);
        kke kke = (kke) l().getParcelable("otherTopArtistsData");
        char c = 1;
        this.X = ((kkd) kke.b().get(1)).d();
        textView.setText(kke.a());
        List b = kke.b();
        this.V = new AnimatorSet();
        Animator loadAnimator = AnimatorInflater.loadAnimator(o(), R.animator.other_top_artist_text_fade_out_animator);
        loadAnimator.setTarget(textView);
        loadAnimator.setInterpolator(kfr.a);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setStartDelay(4000);
        animatorSet2.play(loadAnimator);
        int i = 0;
        while (i < b.size()) {
            OtherTopArtistView otherTopArtistView = (OtherTopArtistView) a.get(i);
            kkd kkd = (kkd) b.get(i);
            Picasso picasso = this.U;
            otherTopArtistView.c.setText(kkd.c());
            otherTopArtistView.d.setText(kkd.b());
            picasso.a(kkd.a()).a(otherTopArtistView.b);
            ImageView imageView = otherTopArtistView.b;
            TextView textView2 = otherTopArtistView.c;
            TextView textView3 = otherTopArtistView.d;
            Animator loadAnimator2 = AnimatorInflater.loadAnimator(imageView.getContext(), R.animator.other_top_artist_image_in_animator);
            loadAnimator2.setTarget(imageView);
            Animator loadAnimator3 = AnimatorInflater.loadAnimator(textView2.getContext(), R.animator.other_top_artist_text_fade_in_animator);
            loadAnimator3.setTarget(textView2);
            Animator loadAnimator4 = AnimatorInflater.loadAnimator(textView3.getContext(), R.animator.other_top_artist_text_fade_in_animator);
            loadAnimator4.setTarget(textView3);
            AnimatorSet animatorSet3 = new AnimatorSet();
            Animator[] animatorArr = new Animator[3];
            animatorArr[0] = loadAnimator2;
            animatorArr[c] = loadAnimator3;
            animatorArr[2] = loadAnimator4;
            animatorSet3.playTogether(animatorArr);
            animatorSet3.setInterpolator(kfr.a);
            long j = (long) i;
            animatorSet3.setStartDelay(300 * j);
            animatorSet.play(animatorSet3);
            ImageView imageView2 = otherTopArtistView.b;
            TextView textView4 = otherTopArtistView.c;
            TextView textView5 = otherTopArtistView.d;
            Animator loadAnimator5 = AnimatorInflater.loadAnimator(imageView2.getContext(), R.animator.other_top_artist_image_out_animator);
            loadAnimator5.setTarget(imageView2);
            Animator loadAnimator6 = AnimatorInflater.loadAnimator(textView4.getContext(), R.animator.other_top_artist_text_fade_out_animator);
            loadAnimator6.setTarget(textView4);
            Animator loadAnimator7 = AnimatorInflater.loadAnimator(textView5.getContext(), R.animator.other_top_artist_text_fade_out_animator);
            loadAnimator7.setTarget(textView5);
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(new Animator[]{loadAnimator5, loadAnimator6, loadAnimator7});
            animatorSet4.setInterpolator(kfr.a);
            animatorSet4.setStartDelay(j * 150);
            animatorSet2.play(animatorSet4);
            i++;
            c = 1;
        }
        this.V.playSequentially(new Animator[]{animatorSet, animatorSet2});
        for (int size = b.size(); size < a.size(); size++) {
            ((OtherTopArtistView) a.get(size)).setVisibility(8);
        }
    }

    public final void aP_() {
        super.aP_();
        b(this.X);
        b((Animator) this.V);
    }
}
