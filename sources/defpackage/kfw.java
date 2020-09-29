package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState;
import com.spotify.mobile.android.wrapped2019.stories.templates.stack.StackImageView;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;

/* renamed from: kfw reason: default package */
public class kfw extends kfs {
    public kfn T;
    public Observable<StoriesPlaybackState> U;
    private Disposable V = Disposables.b();
    /* access modifiers changed from: private */
    public Group W;
    private TextView Y;
    private TextView Z;
    private TextView aa;
    private StackImageView ab;
    private final AnimatorSet ac = new AnimatorSet();
    public Picasso b;

    /* renamed from: kfw$2 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kfw.AnonymousClass2.<clinit>():void");
        }
    }

    public static kfw a(a aVar) {
        Bundle a = a(aVar);
        a.putParcelable("ARTIST_OF_THE_DECADE_STORY", aVar.a);
        kfw kfw = new kfw();
        kfw.g(a);
        return kfw;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.story_top_artist_of_the_decade, viewGroup, false);
        this.aa = (TextView) ip.c(inflate, (int) R.id.artist_of_the_decade_intro_text);
        this.W = (Group) ip.c(inflate, (int) R.id.artist_of_the_decade_detail_group);
        this.Y = (TextView) ip.c(inflate, (int) R.id.artist_of_the_decade_detail_text);
        this.Z = (TextView) ip.c(inflate, (int) R.id.artist_of_the_decade_detail_title);
        this.ab = (StackImageView) ip.c(inflate, (int) R.id.artist_of_the_decade_stacked_image);
        return inflate;
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        kfv c = c();
        this.aa.setText(c.a());
        this.Z.setText(c.b());
        this.Y.setText(c.c());
        this.b.a(c.d()).a((vsr) this.ab);
        Animator loadAnimator = AnimatorInflater.loadAnimator(o(), R.animator.fade_out_animator);
        loadAnimator.setTarget(this.aa);
        loadAnimator.setStartDelay(3000);
        loadAnimator.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                kfw.this.W.setVisibility(0);
            }
        });
        this.ac.play(loadAnimator);
    }

    public final void g() {
        super.g();
        this.T.a(c().e());
        this.V = this.U.a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$kfw$uMhWljPOrW92qHNijljR2LAlZE<Object>(this), (Consumer<? super Throwable>) $$Lambda$kfw$GyYQ5rhWs45EeNOJUdogyoqsSPc.INSTANCE);
        this.ac.start();
    }

    public final void h() {
        super.h();
        this.V.bf_();
        this.ac.cancel();
    }

    private kfv c() {
        return (kfv) fay.a(l().getParcelable("ARTIST_OF_THE_DECADE_STORY"));
    }

    /* access modifiers changed from: private */
    public void a(StoriesPlaybackState storiesPlaybackState) {
        if (VERSION.SDK_INT < 19) {
            Logger.e("TODO: figure out animation pausing for lower APIs", new Object[0]);
            return;
        }
        int i = AnonymousClass2.a[storiesPlaybackState.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.ac.resume();
                this.T.d();
            }
            return;
        }
        this.ac.pause();
        this.T.c();
    }
}
