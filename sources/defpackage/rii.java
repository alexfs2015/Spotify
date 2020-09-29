package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.LoadingState;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.subjects.PublishSubject;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: rii reason: default package */
public final class rii implements kmm<MusicPagesModel, rey> {
    private final LoadingView a;
    private final rgm b;
    private final Map<LoadingState, View> c = new EnumMap(LoadingState.class);
    private final Map<LoadingState, ViewPropertyAnimator> d;

    public rii(LoadingView loadingView, rgm rgm, rgu rgu, rgo rgo) {
        this.a = loadingView;
        this.b = rgm;
        this.c.put(LoadingState.LOADED_EMPTY, this.b.a);
        this.c.put(LoadingState.LOADED_EMPTY_WITH_TEXT_FILTER, rgu.a);
        this.c.put(LoadingState.LOADED_EMPTY_WITH_FILTER, rgo.a);
        this.d = new EnumMap(LoadingState.class);
    }

    /* access modifiers changed from: private */
    public void a(MusicPagesModel musicPagesModel) {
        LoadingState n = musicPagesModel.n();
        boolean p = musicPagesModel.p();
        if (n != LoadingState.LOADING) {
            this.a.b();
        } else if (p) {
            this.a.a(0);
        }
        for (LoadingState loadingState : this.c.keySet()) {
            final View view = (View) this.c.get(loadingState);
            ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.d.get(loadingState);
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
            ViewPropertyAnimator viewPropertyAnimator2 = null;
            if (n == loadingState) {
                if (!(view == null || view.getVisibility() == 0)) {
                    view.setAlpha(0.0f);
                    view.setVisibility(0);
                    viewPropertyAnimator2 = view.animate().alpha(1.0f).setDuration(100).setListener(null);
                }
            } else if (!(view == null || view.getVisibility() == 8)) {
                viewPropertyAnimator2 = view.animate().alpha(0.0f).setDuration(100).setListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        view.setVisibility(8);
                        super.onAnimationEnd(animator);
                    }
                });
            }
            this.d.put(loadingState, viewPropertyAnimator2);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ho b(MusicPagesModel musicPagesModel) {
        return new ho(musicPagesModel.n(), Boolean.valueOf(musicPagesModel.p()));
    }

    public final kmn<MusicPagesModel> connect(knw<rey> knw) {
        this.b.b = new $$Lambda$rii$qSYGajQBZxjoPYtTYtDKrAdxNAE(knw);
        final PublishSubject a2 = PublishSubject.a();
        final Disposable a3 = a2.a((Function<? super T, K>) $$Lambda$rii$gH4Pihtd5NfgVrVZk2zgOZ98t64.INSTANCE).a((Consumer<? super T>) new $$Lambda$rii$S2uGdUrKSvSimpFDhQZeB64CHuo<Object>(this), (Consumer<? super Throwable>) $$Lambda$rii$a4VHRJXzT4OzkGWn9HMuvVFBaaM.INSTANCE);
        Observable a4 = a2.c((Function<? super T, ? extends R>) $$Lambda$bAdsXTI5aaiSGxVxFvZviZHO3Tc.INSTANCE).a(Functions.a());
        rgm rgm = this.b;
        rgm.getClass();
        final Disposable a5 = a4.a((Consumer<? super T>) new $$Lambda$oGyBBqlOoZr8IB8Td3HRbv1nVZ0<Object>(rgm), (Consumer<? super Throwable>) $$Lambda$rii$vss15ylU55XsSpnCNolob8eIUXQ.INSTANCE);
        return new kmn<MusicPagesModel>() {
            public final /* synthetic */ void accept(Object obj) {
                a2.onNext((MusicPagesModel) obj);
            }

            public final void dispose() {
                a3.bd_();
                a5.bd_();
            }
        };
    }
}
