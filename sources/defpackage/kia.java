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
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.wrapped2019.stories.StoryParagraph;
import com.spotify.mobile.android.wrapped2019.stories.endpoint.TopArtist;
import com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState;
import com.spotify.mobile.android.wrapped2019.stories.templates.StoryParagraphDecorator;
import com.spotify.mobile.android.wrapped2019.stories.templates.stack.StackImageView;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: kia reason: default package */
public class kia extends kfs {
    public Picasso T;
    public Observable<StoriesPlaybackState> U;
    private TextView V;
    private TextView W;
    private StackImageView Y;
    private TextView Z;
    private TextView aa;
    private AnimatorSet ab;
    private String ac;
    private Disposable ad;
    public kfn b;

    /* renamed from: kia$1 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kia.AnonymousClass1.<clinit>():void");
        }
    }

    public static kia a(j jVar) {
        Bundle a = a(jVar);
        a.putParcelable("topStoryData", jVar.a);
        kia kia = new kia();
        kia.g(a);
        return kia;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.story_top_artist_fragment, viewGroup, false);
    }

    public final void a(View view, Bundle bundle) {
        View view2 = view;
        this.V = (TextView) ip.c(view2, (int) R.id.top_artist_title);
        this.Y = (StackImageView) ip.c(view2, (int) R.id.top_artist_image);
        this.W = (TextView) ip.c(view2, (int) R.id.top_artist_name);
        this.Z = (TextView) ip.c(view2, (int) R.id.top_artist_hours_listened);
        this.aa = (TextView) ip.c(view2, (int) R.id.top_artist_favorite_song);
        TopArtist topArtist = (TopArtist) l().getParcelable("topStoryData");
        this.V.setText(topArtist.caption());
        this.W.setText(topArtist.artist().name());
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
        objectAnimator.setTarget(this.W);
        objectAnimator.setStartDelay(1400);
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playTogether(new Animator[]{animatorSet2, animatorSet3, objectAnimator});
        AnimatorSet animatorSet5 = (AnimatorSet) AnimatorInflater.loadAnimator(o(), R.animator.top_artist_fade_out_animator);
        animatorSet5.setTarget(this.W);
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
        this.T.a(imageUrl).a((vsr) this.Y);
    }

    public final void g() {
        super.g();
        this.ad = this.U.a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$kia$eEhWguS14N3csbNsVLvjfxSjHrg<Object>(this), (Consumer<? super Throwable>) $$Lambda$kia$cziiEgs7tXR40Lmar9PfHyoX7so.INSTANCE);
        this.b.a(this.ac);
        y().post(new $$Lambda$kia$RuqvRzGxZxSSCPvSqzKM6hv4JzY(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.ab.start();
    }

    public final void h() {
        super.h();
        Disposable disposable = this.ad;
        if (disposable != null) {
            disposable.bf_();
        }
        AnimatorSet animatorSet = this.ab;
        if (animatorSet != null) {
            animatorSet.cancel();
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
            this.b.c();
            AnimatorSet animatorSet = this.ab;
            if (animatorSet != null) {
                animatorSet.pause();
            }
        } else if (i == 2) {
            this.b.d();
            AnimatorSet animatorSet2 = this.ab;
            if (animatorSet2 != null) {
                animatorSet2.resume();
            }
        }
    }
}
