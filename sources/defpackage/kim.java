package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.common.collect.ImmutableList;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.wrapped2019.stories.endpoint.Podcast;
import com.spotify.mobile.android.wrapped2019.stories.endpoint.TopPodcasts;
import com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState;
import com.spotify.mobile.android.wrapped2019.stories.templates.StoryParagraphDecorator;
import com.spotify.mobile.android.wrapped2019.stories.templates.stack.StackImageView;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.List;

/* renamed from: kim reason: default package */
public class kim extends kfs {
    public Picasso T;
    public Observable<StoriesPlaybackState> U;
    private Disposable V;
    private String W;
    private AnimatorSet Y;
    public kfn b;

    /* renamed from: kim$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[StoriesPlaybackState.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState[] r0 = com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState r1 = com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState.PAUSED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState r1 = com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState.RESUMED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kim.AnonymousClass1.<clinit>():void");
        }
    }

    public static kim a(l lVar) {
        Bundle a = a(lVar);
        a.putParcelable("topPodcastsData", lVar.a);
        kim kim = new kim();
        kim.g(a);
        return kim;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.story_top_podcasts_fragment, viewGroup, false);
    }

    public final void a(View view, Bundle bundle) {
        View view2 = view;
        TextView textView = (TextView) ip.c(view2, (int) R.id.top_podcasts_title);
        TextView textView2 = (TextView) ip.c(view2, (int) R.id.top_podcasts_subtitle);
        TextView textView3 = (TextView) ip.c(view2, (int) R.id.top_podcast_rank_1);
        TextView textView4 = (TextView) ip.c(view2, (int) R.id.top_podcast_1);
        TextView textView5 = (TextView) ip.c(view2, (int) R.id.top_podcast_rank_2);
        TextView textView6 = (TextView) ip.c(view2, (int) R.id.top_podcast_2);
        TextView textView7 = (TextView) ip.c(view2, (int) R.id.top_podcast_rank_3);
        TextView textView8 = (TextView) ip.c(view2, (int) R.id.top_podcast_3);
        TextView textView9 = (TextView) ip.c(view2, (int) R.id.top_podcast_rank_4);
        TextView textView10 = (TextView) ip.c(view2, (int) R.id.top_podcast_4);
        TextView textView11 = (TextView) ip.c(view2, (int) R.id.top_podcast_rank_5);
        TextView textView12 = (TextView) ip.c(view2, (int) R.id.top_podcast_5);
        StackImageView stackImageView = (StackImageView) ip.c(view2, (int) R.id.top_podcast_images);
        TextView textView13 = (TextView) ip.c(view2, (int) R.id.top_podcast_paragraph_1);
        TextView textView14 = (TextView) ip.c(view2, (int) R.id.top_podcast_paragraph_2);
        StackImageView stackImageView2 = (StackImageView) ip.c(view2, (int) R.id.top_podcast_repeating_image);
        View c = ip.c(view2, (int) R.id.top_podcast_ranks);
        TopPodcasts topPodcasts = (TopPodcasts) l().getParcelable("topPodcastsData");
        this.W = topPodcasts.previewUrl();
        textView.setText(topPodcasts.caption());
        textView2.setText(topPodcasts.top().caption());
        List podcasts = topPodcasts.top().podcasts();
        ImmutableList a = ImmutableList.a(textView3, textView5, textView7, textView9, textView11);
        ImmutableList a2 = ImmutableList.a(textView4, textView6, textView8, textView10, textView12);
        stackImageView.b(podcasts.size());
        int i = 0;
        while (i < podcasts.size()) {
            Podcast podcast = (Podcast) podcasts.get(i);
            TextView textView15 = (TextView) a.get(i);
            ImmutableList immutableList = a;
            TextView textView16 = (TextView) a2.get(i);
            ImmutableList immutableList2 = a2;
            textView15.setVisibility(0);
            List list = podcasts;
            textView15.setText(podcast.rank());
            textView16.setVisibility(0);
            textView16.setText(podcast.name());
            this.T.a(podcast.imageUrl()).a(stackImageView.c(i));
            i++;
            a2 = immutableList2;
            a = immutableList;
            podcasts = list;
        }
        int c2 = fr.c(o(), R.color.wrapped_citric);
        TextView textView17 = textView13;
        textView17.setText(StoryParagraphDecorator.a((String) fay.a(topPodcasts.stats().paragraph1().text()), (String[]) fay.a(topPodcasts.stats().paragraph1().valuesArray()), c2));
        TextView textView18 = textView14;
        textView18.setText(StoryParagraphDecorator.a((String) fay.a(topPodcasts.stats().paragraph2().text()), (String[]) fay.a(topPodcasts.stats().paragraph2().valuesArray()), c2));
        AnimatorSet animatorSet = new AnimatorSet();
        View view3 = c;
        animatorSet.playTogether(new Animator[]{b(textView), b(textView2), b(stackImageView), b(view3), b(textView4), b(textView6), b(textView8), b(textView10), b(textView12)});
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(new Animator[]{c(textView2), c(stackImageView), c(view3), c(textView4), c(textView6), c(textView8), c(textView10), c(textView12)});
        AnimatorSet animatorSet3 = new AnimatorSet();
        StackImageView stackImageView3 = stackImageView2;
        animatorSet3.playTogether(new Animator[]{b(textView17), b(textView18), b(stackImageView3)});
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.setStartDelay(5000);
        animatorSet4.playSequentially(new Animator[]{animatorSet2, animatorSet3});
        this.Y = new AnimatorSet();
        this.Y.playSequentially(new Animator[]{animatorSet, animatorSet4});
        this.T.a(topPodcasts.stats().imageUrl()).a((vsr) stackImageView3);
    }

    private ObjectAnimator b(View view) {
        ObjectAnimator objectAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(o(), R.animator.top_artist_fade_in_animator);
        objectAnimator.setTarget(view);
        return objectAnimator;
    }

    private ObjectAnimator c(View view) {
        ObjectAnimator objectAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(o(), R.animator.fade_out_animator);
        objectAnimator.setTarget(view);
        return objectAnimator;
    }

    public final void g() {
        super.g();
        this.V = this.U.a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$kim$xYcXFnwe8AiroN1gH9cDaixc1gk<Object>(this), (Consumer<? super Throwable>) $$Lambda$kim$Xg8p5OJbnb3ZD6GzuXqDBuZPmx4.INSTANCE);
        this.b.a(this.W);
        y().post(new $$Lambda$kim$VKBPmmZZWBqBGcntN3gPZjGgYaw(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.Y.start();
    }

    public final void h() {
        super.h();
        AnimatorSet animatorSet = this.Y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        Disposable disposable = this.V;
        if (disposable != null) {
            disposable.bf_();
        }
    }

    /* access modifiers changed from: private */
    public void a(StoriesPlaybackState storiesPlaybackState) {
        if (VERSION.SDK_INT < 19) {
            Logger.e("TODO: figure out animation pausing for lower APIs", new Object[0]);
            return;
        }
        int i = AnonymousClass1.a[storiesPlaybackState.ordinal()];
        if (i == 1) {
            kfn kfn = this.b;
            if (kfn != null) {
                kfn.c();
            }
            AnimatorSet animatorSet = this.Y;
            if (animatorSet != null) {
                animatorSet.pause();
            }
        } else if (i == 2) {
            kfn kfn2 = this.b;
            if (kfn2 != null) {
                kfn2.d();
            }
            AnimatorSet animatorSet2 = this.Y;
            if (animatorSet2 != null) {
                animatorSet2.resume();
            }
        }
    }
}
