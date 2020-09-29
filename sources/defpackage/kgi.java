package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState;
import com.spotify.mobile.android.wrapped2019.stories.templates.decadetopsongtopartist.YearView;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: kgi reason: default package */
public class kgi extends kfs {
    public Picasso T;
    public Observable<StoriesPlaybackState> U;
    private Disposable V;
    private TextView W;
    /* access modifiers changed from: private */
    public YearView Y;
    private AnimatorSet Z;
    private kgh aa;
    public kfn b;

    /* renamed from: kgi$2 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kgi.AnonymousClass2.<clinit>():void");
        }
    }

    public static kgi a(b bVar) {
        Bundle a = a(bVar);
        a.putParcelable("decadeTopSongTopArtistData", kgh.a(bVar.a, bVar.b));
        kgi kgi = new kgi();
        kgi.g(a);
        return kgi;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.story_decade_top_artist_top_song, viewGroup, false);
    }

    public final void a(View view, Bundle bundle) {
        this.W = (TextView) ip.c(view, (int) R.id.decade_top_title);
        this.Y = (YearView) ip.c(view, (int) R.id.decade_top_year_view);
        this.aa = (kgh) l().getParcelable("decadeTopSongTopArtistData");
        this.W.setText(this.aa.a());
        this.Y.a(this.T, (kgl) this.aa.b().get(0));
        this.Z = new AnimatorSet();
        this.Z.setStartDelay(2000);
        this.Z.playSequentially(new Animator[]{a((kgl) this.aa.b().get(1)), a((kgl) this.aa.b().get(2)), a((kgl) this.aa.b().get(3)), a((kgl) this.aa.b().get(4))});
    }

    private AnimatorSet a(final kgl kgl) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(2000);
        animatorSet.addListener(new AnimatorListener() {
            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
                kgi.this.Y.a(kgi.this.T, kgl);
                kgi.this.b.a(kgl.h());
            }
        });
        return animatorSet;
    }

    public final void g() {
        super.g();
        this.V = this.U.a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$kgi$iCkQ84ZcOFjSkuk0IJDWzQdJWOY<Object>(this), (Consumer<? super Throwable>) $$Lambda$kgi$HrWlqJm84u8XkMSV9JVsSyBwY18.INSTANCE);
        this.b.a(((kgl) this.aa.b().get(0)).h());
        y().post(new $$Lambda$kgi$egxdw9yV27qBpIn5wakvtkuvDFo(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.Z.start();
    }

    public final void h() {
        super.h();
        AnimatorSet animatorSet = this.Z;
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
        int i = AnonymousClass2.a[storiesPlaybackState.ordinal()];
        if (i == 1) {
            this.b.c();
            AnimatorSet animatorSet = this.Z;
            if (animatorSet != null) {
                animatorSet.pause();
            }
        } else if (i == 2) {
            this.b.d();
            AnimatorSet animatorSet2 = this.Z;
            if (animatorSet2 != null) {
                animatorSet2.resume();
            }
        }
    }
}
