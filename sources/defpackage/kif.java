package defpackage;

import android.animation.Animator;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: kif reason: default package */
public abstract class kif extends wib {
    public Observable<StoriesPlaybackState> T;
    private Disposable U = Disposables.b();
    private final ArrayList<Animator> V = new ArrayList<>(5);
    public kju a;
    public khp b;

    /* renamed from: kif$1 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kif.AnonymousClass1.<clinit>():void");
        }
    }

    public static Bundle a(kfp kfp) {
        Bundle bundle = new Bundle();
        bundle.putString("story_id", kfq.a(kfp));
        return bundle;
    }

    /* access modifiers changed from: private */
    public void a(StoriesPlaybackState storiesPlaybackState) {
        if (VERSION.SDK_INT < 19) {
            Logger.e("TODO: figure out animation pausing for lower APIs", new Object[0]);
            return;
        }
        int i = AnonymousClass1.a[storiesPlaybackState.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.b.d();
                Iterator it = this.V.iterator();
                while (it.hasNext()) {
                    ((Animator) it.next()).resume();
                }
            }
            return;
        }
        this.b.c();
        Iterator it2 = this.V.iterator();
        while (it2.hasNext()) {
            ((Animator) it2.next()).pause();
        }
    }

    private String c() {
        return (String) fbp.a(l().getString("story_id"));
    }

    public void aP_() {
        super.aP_();
        this.a.a((kjt) new a(c()));
        this.U = this.T.a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$kif$_aGjNLhW2ULVJas4lG4j8l8dKVU<Object>(this), (Consumer<? super Throwable>) $$Lambda$kif$uCIWOCCYJZzztyAkJF70WcR7CCs.INSTANCE);
    }

    /* access modifiers changed from: protected */
    public final void b(Animator animator) {
        this.V.add(animator);
        animator.start();
    }

    public void b(String str) {
        this.b.a(str);
    }

    public void h() {
        this.a.a((kjt) new d(c()));
        this.U.bd_();
        Iterator it = this.V.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            animator.removeAllListeners();
            animator.cancel();
        }
        this.V.clear();
        super.h();
    }
}
