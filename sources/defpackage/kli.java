package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.mobile.android.wrapped2019.stories.StoryParagraph;
import com.spotify.mobile.android.wrapped2019.stories.endpoint.TopArtist;
import com.spotify.mobile.android.wrapped2019.stories.templates.StoryParagraphDecorator;
import com.spotify.mobile.android.wrapped2019.stories.templates.stack.StackImageView;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

/* renamed from: kli reason: default package */
public class kli extends kif {
    public Picasso U;
    private TextView V;
    private TextView X;
    private StackImageView Y;
    private TextView Z;
    private TextView aa;
    private AnimatorSet ab;
    private String ac;

    public static kli a(l lVar) {
        Bundle a = a((kfp) lVar);
        a.putParcelable("topStoryData", lVar.a);
        kli kli = new kli();
        kli.g(a);
        return kli;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c() {
        b((Animator) this.ab);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.story_top_artist_fragment, viewGroup, false);
    }

    public final void a(View view, Bundle bundle) {
        View view2 = view;
        this.V = (TextView) ip.d(view2, (int) R.id.top_artist_title);
        this.Y = (StackImageView) ip.d(view2, (int) R.id.top_artist_image);
        this.X = (TextView) ip.d(view2, (int) R.id.top_artist_name);
        this.Z = (TextView) ip.d(view2, (int) R.id.top_artist_hours_listened);
        this.aa = (TextView) ip.d(view2, (int) R.id.top_artist_favorite_song);
        TopArtist topArtist = (TopArtist) l().getParcelable("topStoryData");
        this.V.setText(topArtist.caption());
        this.X.setText(topArtist.artist().name());
        StoryParagraph amountStreamed = topArtist.amountStreamed();
        this.Z.setText(StoryParagraphDecorator.a(amountStreamed.text(), amountStreamed.valuesArray(), this.Z.getCurrentTextColor()));
        StoryParagraph favoriteSong = topArtist.favoriteSong();
        this.aa.setText(StoryParagraphDecorator.a(favoriteSong.text(), favoriteSong.valuesArray(), this.aa.getCurrentTextColor()));
        String imageUrl = topArtist.artist().imageUrl();
        this.ac = topArtist.previewUrl();
        this.ab = new AnimatorSet();
        AnimatorSet animatorSet = this.ab;
        AnimatorSet animatorSet2 = (AnimatorSet) AnimatorInflater.loadAnimator(o(), R.animator.top_artist_slide_fade_in_animator);
        animatorSet2.setTarget(this.V);
        AnimatorSet animatorSet3 = (AnimatorSet) AnimatorInflater.loadAnimator(o(), R.animator.top_artist_scale_fade_in_animator);
        animatorSet3.setTarget(this.Y);
        animatorSet3.setStartDelay(300);
        ObjectAnimator objectAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(o(), R.animator.top_artist_fade_in_animator);
        objectAnimator.setTarget(this.X);
        objectAnimator.setStartDelay(1400);
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playTogether(new Animator[]{animatorSet2, animatorSet3, objectAnimator});
        AnimatorSet animatorSet5 = (AnimatorSet) AnimatorInflater.loadAnimator(o(), R.animator.top_artist_fade_out_animator);
        animatorSet5.setTarget(this.X);
        AnimatorSet animatorSet6 = (AnimatorSet) AnimatorInflater.loadAnimator(o(), R.animator.top_artist_slide_fade_in_animator);
        animatorSet6.setTarget(this.Z);
        animatorSet6.setStartDelay(300);
        AnimatorSet animatorSet7 = new AnimatorSet();
        animatorSet7.playTogether(new Animator[]{animatorSet5, animatorSet6});
        animatorSet7.setStartDelay(4000);
        AnimatorSet animatorSet8 = (AnimatorSet) AnimatorInflater.loadAnimator(o(), R.animator.top_artist_fade_out_animator);
        animatorSet8.setTarget(this.Z);
        AnimatorSet animatorSet9 = (AnimatorSet) AnimatorInflater.loadAnimator(o(), R.animator.top_artist_slide_fade_in_animator);
        animatorSet9.setTarget(this.aa);
        animatorSet9.setStartDelay(300);
        AnimatorSet animatorSet10 = new AnimatorSet();
        animatorSet10.playTogether(new Animator[]{animatorSet8, animatorSet9});
        animatorSet10.setStartDelay(4000);
        AnimatorSet animatorSet11 = (AnimatorSet) AnimatorInflater.loadAnimator(o(), R.animator.top_artist_fade_out_animator);
        animatorSet11.setTarget(this.V);
        AnimatorSet animatorSet12 = (AnimatorSet) AnimatorInflater.loadAnimator(o(), R.animator.top_artist_fade_out_animator);
        animatorSet12.setTarget(this.aa);
        AnimatorSet animatorSet13 = (AnimatorSet) AnimatorInflater.loadAnimator(o(), R.animator.top_artist_scale_fade_out_animator);
        animatorSet13.setTarget(this.Y);
        animatorSet13.setStartDelay(300);
        AnimatorSet animatorSet14 = new AnimatorSet();
        animatorSet14.playTogether(new Animator[]{animatorSet11, animatorSet12, animatorSet13});
        animatorSet14.setStartDelay(4000);
        animatorSet.playSequentially(new Animator[]{animatorSet4, animatorSet7, animatorSet10, animatorSet14});
        this.U.a(imageUrl).a((wgx) this.Y);
    }

    public final void aP_() {
        super.aP_();
        b(this.ac);
        y().post(new $$Lambda$kli$ff5vxnvnUkOaNQz9E1L6tSaQkM(this));
    }
}
