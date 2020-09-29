package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;
import com.spotify.mobile.android.wrapped2019.stories.endpoint.Podcast;
import com.spotify.mobile.android.wrapped2019.stories.endpoint.TopPodcasts;
import com.spotify.mobile.android.wrapped2019.stories.templates.StoryParagraphDecorator;
import com.spotify.mobile.android.wrapped2019.stories.views.PerspectiveImageStack;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BiConsumerSingleObserver;
import java.util.List;

/* renamed from: klw reason: default package */
public class klw extends kif {
    public Picasso U;
    public kgr V;
    private String X;
    private AnimatorSet Y;
    private final CompositeDisposable Z = new CompositeDisposable();

    public static long a(n nVar) {
        int size = nVar.a.top().podcasts().size();
        if (size == 0) {
            return 0;
        }
        long j = (long) (size - 1);
        long j2 = 200 * j;
        return 2800 + j2 + 8000 + (j * 150) + j2;
    }

    private Animator a(View view, long j) {
        Animator loadAnimator = AnimatorInflater.loadAnimator(o(), R.animator.fade_in_300_animator);
        loadAnimator.setTarget(view);
        loadAnimator.setStartDelay(j);
        loadAnimator.setInterpolator(kfr.a);
        return loadAnimator;
    }

    private Animator b(View view, long j) {
        Animator loadAnimator = AnimatorInflater.loadAnimator(o(), R.animator.fade_out_300_animator);
        loadAnimator.setTarget(view);
        loadAnimator.setStartDelay(j);
        loadAnimator.setInterpolator(kfr.a);
        return loadAnimator;
    }

    public static klw b(n nVar) {
        Bundle a = a((kfp) nVar);
        a.putParcelable("topPodcastsData", nVar.a);
        klw klw = new klw();
        klw.g(a);
        return klw;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c() {
        b((Animator) this.Y);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.story_top_podcasts_fragment, viewGroup, false);
    }

    public final void a(View view, Bundle bundle) {
        View view2 = view;
        TextView textView = (TextView) ip.d(view2, (int) R.id.top_podcasts_title);
        TextView textView2 = (TextView) ip.d(view2, (int) R.id.top_podcasts_subtitle);
        final PerspectiveImageStack perspectiveImageStack = (PerspectiveImageStack) ip.d(view2, (int) R.id.top_podcast_images);
        TextView textView3 = (TextView) ip.d(view2, (int) R.id.top_podcast_paragraph_1);
        TextView textView4 = (TextView) ip.d(view2, (int) R.id.top_podcast_paragraph_2);
        final PerspectiveImageStack perspectiveImageStack2 = (PerspectiveImageStack) ip.d(view2, (int) R.id.top_podcast_repeating_image);
        ImmutableList a = ImmutableList.a(ip.d(view2, (int) R.id.top_podcast_rank_1), ip.d(view2, (int) R.id.top_podcast_rank_2), ip.d(view2, (int) R.id.top_podcast_rank_3), ip.d(view2, (int) R.id.top_podcast_rank_4), ip.d(view2, (int) R.id.top_podcast_rank_5));
        ImmutableList a2 = ImmutableList.a(ip.d(view2, (int) R.id.top_podcast_1), ip.d(view2, (int) R.id.top_podcast_2), ip.d(view2, (int) R.id.top_podcast_3), ip.d(view2, (int) R.id.top_podcast_4), ip.d(view2, (int) R.id.top_podcast_5));
        TopPodcasts topPodcasts = (TopPodcasts) l().getParcelable("topPodcastsData");
        this.X = topPodcasts.previewUrl();
        textView.setText(topPodcasts.caption());
        textView2.setText(topPodcasts.top().caption());
        List podcasts = topPodcasts.top().podcasts();
        a g = ImmutableList.g();
        int i = 0;
        while (i < podcasts.size()) {
            Podcast podcast = (Podcast) podcasts.get(i);
            TextView textView5 = (TextView) a.get(i);
            TextView textView6 = textView;
            TextView textView7 = (TextView) a2.get(i);
            textView5.setVisibility(0);
            TextView textView8 = textView2;
            textView5.setText(podcast.rank());
            textView7.setVisibility(0);
            textView7.setText(podcast.name());
            g.c(podcast.imageUrl());
            i++;
            textView = textView6;
            textView2 = textView8;
        }
        TextView textView9 = textView;
        TextView textView10 = textView2;
        CompositeDisposable compositeDisposable = this.Z;
        Single a3 = this.V.a("topPodcastStoryRequest", (List<String>) g.a());
        $$Lambda$klw$rFZdohKQ_5FaHyxEBUUEzG1esg r11 = new $$Lambda$klw$rFZdohKQ_5FaHyxEBUUEzG1esg(perspectiveImageStack);
        ObjectHelper.a(r11, "onCallback is null");
        BiConsumerSingleObserver biConsumerSingleObserver = new BiConsumerSingleObserver(r11);
        a3.b((SingleObserver<? super T>) biConsumerSingleObserver);
        compositeDisposable.a((Disposable) biConsumerSingleObserver);
        this.U.a(topPodcasts.stats().imageUrl()).a((wgx) new kmh() {
            public final void a(Bitmap bitmap) {
                perspectiveImageStack2.a(bitmap, 5);
            }
        });
        int c = fr.c(o(), R.color.wrapped_citric);
        textView3.setText(StoryParagraphDecorator.a((String) fbp.a(topPodcasts.stats().paragraph1().text()), (String[]) fbp.a(topPodcasts.stats().paragraph1().valuesArray()), c));
        textView4.setText(StoryParagraphDecorator.a((String) fbp.a(topPodcasts.stats().paragraph2().text()), (String[]) fbp.a(topPodcasts.stats().paragraph2().valuesArray()), c));
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setStartDelay(4000);
        Animator a4 = kmj.a(perspectiveImageStack, true);
        a4.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                perspectiveImageStack.setVisibility(0);
            }
        });
        animatorSet.play(a4);
        animatorSet2.play(kmj.b(perspectiveImageStack, true));
        int size = podcasts.size() - 1;
        int i2 = size;
        while (i2 >= 0) {
            TextView textView11 = (TextView) a.get(i2);
            TextView textView12 = (TextView) a2.get(i2);
            long j = (long) (size - i2);
            int i3 = i2;
            long j2 = j * 200;
            animatorSet.play(a((View) textView11, j2));
            animatorSet.play(a((View) textView12, j2));
            long j3 = j * 150;
            animatorSet2.play(b(textView11, j3));
            animatorSet2.play(b(textView12, j3));
            TextView textView13 = textView10;
            if (i3 == 0) {
                animatorSet2.play(b(textView13, j3));
            }
            i2 = i3 - 1;
            textView10 = textView13;
        }
        Animator a5 = kmj.a(perspectiveImageStack2, true);
        a5.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                perspectiveImageStack2.setVisibility(0);
            }
        });
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.play(a((View) textView3, 0));
        animatorSet3.play(a((View) textView4, 0));
        animatorSet3.play(a5);
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.setStartDelay(4000);
        animatorSet4.play(b(textView3, 0));
        animatorSet4.play(b(textView4, 0));
        animatorSet4.play(b(textView9, 0));
        animatorSet4.play(kmj.b(perspectiveImageStack2, true));
        this.Y = new AnimatorSet();
        this.Y.playSequentially(new Animator[]{animatorSet, animatorSet2, animatorSet3, animatorSet4});
    }

    public final void aP_() {
        super.aP_();
        b(this.X);
        y().post(new $$Lambda$klw$RK5zzNX8ygUcSDpaEdm3vRbCWo(this));
    }

    public final void h() {
        super.h();
        this.Z.bd_();
    }
}
