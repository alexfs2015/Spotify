package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import com.google.common.collect.ImmutableList;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState;
import com.spotify.mobile.android.wrapped2019.stories.templates.othertopartists.OtherTopArtist;
import com.spotify.mobile.android.wrapped2019.stories.templates.stack.StackImageView;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;

/* renamed from: khl reason: default package */
public class khl extends kfs {
    private static final long V = TimeUnit.SECONDS.toMillis(3);
    public Picasso T;
    public Observable<StoriesPlaybackState> U;
    private Disposable W;
    private StackImageView Y;
    private StackImageView Z;
    private StackImageView aa;
    private StackImageView ab;
    private HorizontalScrollView ac;
    private View ad;
    private TextView ae;
    private TextView af;
    private TextView ag;
    private AnimatorSet ah;
    private int ai;
    private ImmutableList<OtherTopArtist> aj;
    public kfn b;

    /* renamed from: khl$2 reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.khl.AnonymousClass2.<clinit>():void");
        }
    }

    static /* synthetic */ int a(khl khl) {
        int i = khl.ai + 1;
        khl.ai = i;
        return i;
    }

    public static khl a(f fVar) {
        Bundle a = a(fVar);
        a.putString("otherTopArtistsTitle", fVar.a);
        a.putSerializable("otherTopArtistList", fVar.b);
        khl khl = new khl();
        khl.g(a);
        return khl;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.story_other_top_artists_fragment, viewGroup, false);
    }

    public final void a(View view, Bundle bundle) {
        this.ac = (HorizontalScrollView) ip.c(view, (int) R.id.other_top_artist_scroll_view);
        this.ad = ip.c(view, (int) R.id.other_top_artist_image_layout);
        this.Y = (StackImageView) ip.c(view, (int) R.id.other_top_artist_image_1);
        this.Z = (StackImageView) ip.c(view, (int) R.id.other_top_artist_image_2);
        this.aa = (StackImageView) ip.c(view, (int) R.id.other_top_artist_image_3);
        this.ab = (StackImageView) ip.c(view, (int) R.id.other_top_artist_image_4);
        this.ae = (TextView) ip.c(view, (int) R.id.other_top_artist_rank);
        this.af = (TextView) ip.c(view, (int) R.id.other_top_artist_name);
        this.ag = (TextView) ip.c(view, (int) R.id.other_top_artists_title);
        Bundle bundle2 = this.i;
        this.ag.setText(bundle2.getString("otherTopArtistsTitle"));
        this.aj = (ImmutableList) bundle2.getSerializable("otherTopArtistList");
        this.T.a(((OtherTopArtist) this.aj.get(0)).a()).a((vsr) this.Y);
        this.T.a(((OtherTopArtist) this.aj.get(1)).a()).a((vsr) this.Z);
        this.T.a(((OtherTopArtist) this.aj.get(2)).a()).a((vsr) this.aa);
        this.T.a(((OtherTopArtist) this.aj.get(3)).a()).a((vsr) this.ab);
    }

    private AnimatorSet d(int i) {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.ac, "scrollX", new int[]{i});
        ofInt.setDuration(900);
        ofInt.setInterpolator(new DecelerateInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                khl khl = khl.this;
                khl.e(khl.a(khl));
            }
        });
        animatorSet.playTogether(new Animator[]{c(this.ae), c(this.af)});
        AnimatorSet animatorSet2 = (AnimatorSet) AnimatorInflater.loadAnimator(o(), R.animator.top_artist_slide_fade_in_animator);
        animatorSet2.setTarget(this.ae);
        AnimatorSet animatorSet3 = (AnimatorSet) AnimatorInflater.loadAnimator(o(), R.animator.top_artist_slide_fade_in_animator);
        animatorSet3.setTarget(this.af);
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playTogether(new Animator[]{animatorSet2, animatorSet3});
        AnimatorSet animatorSet5 = new AnimatorSet();
        animatorSet5.playSequentially(new Animator[]{animatorSet, animatorSet4});
        AnimatorSet animatorSet6 = new AnimatorSet();
        animatorSet6.playTogether(new Animator[]{ofInt, animatorSet5});
        animatorSet6.setStartDelay(V);
        return animatorSet6;
    }

    /* access modifiers changed from: private */
    public void e(int i) {
        OtherTopArtist otherTopArtist = (OtherTopArtist) this.aj.get(i);
        this.ae.setText(otherTopArtist.c());
        this.af.setText(otherTopArtist.b());
        this.b.a(otherTopArtist.d());
    }

    private AnimatorSet b(View view) {
        AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(o(), R.animator.top_artist_slide_fade_in_animator);
        animatorSet.setTarget(view);
        return animatorSet;
    }

    private ObjectAnimator c(View view) {
        ObjectAnimator objectAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(o(), R.animator.fade_out_animator);
        objectAnimator.setTarget(view);
        return objectAnimator;
    }

    public final void g() {
        super.g();
        this.W = this.U.a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$khl$SCpNGbo7Rss8tuCfDIBVYXZ_Mw<Object>(this), (Consumer<? super Throwable>) $$Lambda$khl$hI7wjAKKiFye4gYRtciErGd39wQ.INSTANCE);
        e(this.ai);
        this.ac.post(new $$Lambda$khl$Y0z9ms274idtTVfd0_xbIKfrgvc(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c() {
        int width = ((this.Y.getWidth() / 2) + this.ad.getPaddingLeft()) - (y().getWidth() / 2);
        int left = (this.Z.getLeft() + width) - this.Y.getLeft();
        int left2 = (this.aa.getLeft() + left) - this.Z.getLeft();
        int left3 = (this.ab.getLeft() + left2) - this.aa.getLeft();
        int paddingRight = this.ad.getPaddingRight() + left3;
        int[] iArr = {width};
        String str = "scrollX";
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.ac, str, iArr);
        ofInt.setDuration(600);
        ObjectAnimator objectAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(o(), R.animator.top_artist_fade_in_animator);
        objectAnimator.setTarget(this.ac);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{objectAnimator, ofInt, b(this.ag), b(this.ae), b(this.af)});
        ObjectAnimator ofInt2 = ObjectAnimator.ofInt(this.ac, str, new int[]{paddingRight});
        ofInt2.setDuration(300);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(new Animator[]{ofInt2, c(this.ac), c(this.ag), c(this.ae), c(this.af)});
        animatorSet2.setStartDelay(V);
        this.ah = new AnimatorSet();
        this.ah.playSequentially(new Animator[]{animatorSet, d(left), d(left2), d(left3), animatorSet2});
        this.ah.start();
    }

    public final void h() {
        super.h();
        this.W.bf_();
        AnimatorSet animatorSet = this.ah;
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
        int i = AnonymousClass2.a[storiesPlaybackState.ordinal()];
        if (i == 1) {
            this.b.c();
            AnimatorSet animatorSet = this.ah;
            if (animatorSet != null) {
                animatorSet.pause();
            }
        } else if (i == 2) {
            this.b.d();
            AnimatorSet animatorSet2 = this.ah;
            if (animatorSet2 != null) {
                animatorSet2.resume();
            }
        }
    }
}
