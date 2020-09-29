package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.Button;
import android.widget.TextView;
import com.google.common.collect.Lists;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState;
import com.spotify.mobile.android.wrapped2019.stories.templates.stack.StackImageView;
import com.spotify.mobile.android.wrapped2019.stories.views.IsometricImageStack;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: kis reason: default package */
public class kis extends kfs {
    public Picasso T;
    public Observable<StoriesPlaybackState> U;
    public kep V;
    public kip W;
    /* access modifiers changed from: private */
    public IsometricImageStack Y;
    /* access modifiers changed from: private */
    public TextView Z;
    /* access modifiers changed from: private */
    public TextView aa;
    /* access modifiers changed from: private */
    public StackImageView ab;
    /* access modifiers changed from: private */
    public Button ac;
    private TextView ad;
    private kiz ae;
    private CompositeDisposable af = new CompositeDisposable();
    /* access modifiers changed from: private */
    public List<kja> ag = Collections.emptyList();
    private Animator ah;
    private Animator ai;
    public kfn b;

    /* renamed from: kis$4 reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kis.AnonymousClass4.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean c(Animator animator) {
        return animator != null;
    }

    public static kis a(m mVar) {
        kis kis = new kis();
        Bundle a = a(mVar);
        a.putString("title", mVar.a);
        a.putParcelableArrayList("tracks", new ArrayList(mVar.b));
        a.putParcelable("playlist", mVar.c);
        kis.g(a);
        return kis;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.story_top_songs_fragment, viewGroup, false);
    }

    public final void a(View view, Bundle bundle) {
        this.ad = (TextView) ip.c(view, (int) R.id.title);
        this.Z = (TextView) ip.c(view, (int) R.id.track);
        this.aa = (TextView) ip.c(view, (int) R.id.artist);
        this.Y = (IsometricImageStack) ip.c(view, (int) R.id.image_stack);
        this.ac = (Button) ip.c(view, (int) R.id.button);
        this.ab = (StackImageView) ip.c(view, (int) R.id.playlist);
        Bundle l = l();
        this.ag = (List) fay.a(l.getParcelableArrayList("tracks"));
        this.ae = (kiz) l.getParcelable("playlist");
        this.ad.setText(l.getString("title", ""));
        this.T.a(this.ae.b()).a((vsr) this.ab);
        this.ac.setText(this.ae.d());
        this.ab.setVisibility(8);
        this.ac.setVisibility(8);
        this.ac.setOnClickListener(new $$Lambda$kis$TYiRZTjR4VuS36RTKrha2GW32vs(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.ac.setEnabled(false);
        this.af.a(this.W.a(this.ae.c()).a((Action) $$Lambda$kis$dyLGTzA2G3GVU8hPf6Qnjfm8.INSTANCE, (Consumer<? super Throwable>) new $$Lambda$kis$tQQgqRH5j65avpkFM0DYMFi0lxU<Object>(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(Throwable th) {
        Logger.e(th, "Error adding playlist to library", new Object[0]);
        this.ac.setEnabled(true);
    }

    public final void g() {
        super.g();
        this.af = new CompositeDisposable();
        this.af.a(this.V.a("TopSongsStory", Lists.a(this.ag, $$Lambda$25gCXFbtTRPnDCee5ZZp0SAPpe4.INSTANCE)).a((Consumer<? super T>) new $$Lambda$kis$EPE4FanJfGsa4B_JkPYPUJ2en1I<Object>(this), (Consumer<? super Throwable>) $$Lambda$kis$SOvH2VTG15CiUswF6FMMSgamg54.INSTANCE));
        this.af.a(this.U.a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$kis$4kSdQrghACCDmESF85pvz3avX6U<Object>(this), (Consumer<? super Throwable>) $$Lambda$kis$MWPvyUUPsDIbRhIugdbrd4IY_0.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(List list) {
        this.Y.a(list);
        d(0);
    }

    /* access modifiers changed from: private */
    public void d(final int i) {
        if (i >= 0 && i < this.ag.size()) {
            kja kja = (kja) this.ag.get(i);
            this.Z.setText(kja.c());
            this.aa.setText(kja.d());
            this.b.a(kja.a());
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.Y, "selectionProgress", new float[]{0.0f, 1.0f});
            ofFloat.setDuration(500);
            ofFloat.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationStart(Animator animator) {
                    IsometricImageStack c = kis.this.Y;
                    int i = i;
                    c.a = c.b;
                    c.b = i;
                    c.invalidate();
                }
            });
            b(this.ah);
            this.ah = ofFloat;
            ofFloat.start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat2.setDuration(TimeUnit.SECONDS.toMillis(5));
            ofFloat2.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    int i = i + 1;
                    if (i >= kis.this.ag.size()) {
                        kis.g(kis.this);
                    } else {
                        kis.this.d(i);
                    }
                }
            });
            b(this.ai);
            this.ai = ofFloat2;
            ofFloat2.start();
        }
    }

    private static void b(Animator animator) {
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void h() {
        this.af.bf_();
        super.h();
    }

    /* access modifiers changed from: private */
    public void a(StoriesPlaybackState storiesPlaybackState) {
        int i = AnonymousClass4.a[storiesPlaybackState.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.b.d();
                if (VERSION.SDK_INT >= 19) {
                    Iterator it = c().iterator();
                    while (it.hasNext()) {
                        ((Animator) it.next()).resume();
                    }
                }
            }
            return;
        }
        this.b.c();
        if (VERSION.SDK_INT >= 19) {
            Iterator it2 = c().iterator();
            while (it2.hasNext()) {
                ((Animator) it2.next()).pause();
            }
        }
    }

    private fbx<Animator> c() {
        return fbx.a(this.ai, (E[]) new Animator[]{this.ah}).a((faz<? super E>) $$Lambda$kis$kykIXl8pKA535e6oGARH5wC0jnc.INSTANCE);
    }

    static /* synthetic */ void g(kis kis) {
        Iterator it = kis.c().iterator();
        while (it.hasNext()) {
            ((Animator) it.next()).cancel();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(kis, "showPlaylistProgress", new float[]{0.0f, 1.0f});
        ofFloat.setDuration(500);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                kis.this.ab.setAlpha(0.0f);
                kis.this.ac.setAlpha(0.0f);
                kis.this.ab.setVisibility(0);
                kis.this.ac.setVisibility(0);
            }

            public final void onAnimationEnd(Animator animator) {
                kis.this.Y.setVisibility(8);
                kis.this.Z.setVisibility(8);
                kis.this.aa.setVisibility(8);
            }
        });
        ofFloat.start();
    }
}
