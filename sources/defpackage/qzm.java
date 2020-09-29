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

/* renamed from: qzm reason: default package */
public final class qzm implements kjd<MusicPagesModel, qwj> {
    private final LoadingView a;
    private final qxx b;
    private final Map<LoadingState, View> c = new EnumMap(LoadingState.class);
    private final Map<LoadingState, ViewPropertyAnimator> d;

    public qzm(LoadingView loadingView, qxx qxx, qyf qyf, qxz qxz) {
        this.a = loadingView;
        this.b = qxx;
        this.c.put(LoadingState.LOADED_EMPTY, this.b.a);
        this.c.put(LoadingState.LOADED_EMPTY_WITH_TEXT_FILTER, qyf.a);
        this.c.put(LoadingState.LOADED_EMPTY_WITH_FILTER, qxz.a);
        this.d = new EnumMap(LoadingState.class);
    }

    public final kje<MusicPagesModel> connect(kkn<qwj> kkn) {
        this.b.b = new $$Lambda$qzm$WqD14JhPJzWpbRd2hY3_CIab3Y(kkn);
        final PublishSubject a2 = PublishSubject.a();
        final Disposable a3 = a2.a((Function<? super T, K>) $$Lambda$qzm$zyXDVuZvOwEfNYYxuNShB0eJnV4.INSTANCE).a((Consumer<? super T>) new $$Lambda$qzm$sVacu_4XAbW0pxyEafEs4mYC9c<Object>(this), (Consumer<? super Throwable>) $$Lambda$qzm$Wh970iVWkSfIx7OcB1NAwhvtnK4.INSTANCE);
        Observable a4 = a2.c((Function<? super T, ? extends R>) $$Lambda$y4SIvK8HttJyPOVnCQcDyzEzlwk.INSTANCE).a(Functions.a());
        qxx qxx = this.b;
        qxx.getClass();
        final Disposable a5 = a4.a((Consumer<? super T>) new $$Lambda$rOh0l9gAoVjIgGw6ROTCcUTCRZA<Object>(qxx), (Consumer<? super Throwable>) $$Lambda$qzm$vl_VFaXbg3fRY9hg3YEqN9VQKyM.INSTANCE);
        return new kje<MusicPagesModel>() {
            public final /* synthetic */ void accept(Object obj) {
                a2.onNext((MusicPagesModel) obj);
            }

            public final void dispose() {
                a3.bf_();
                a5.bf_();
            }
        };
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ho b(MusicPagesModel musicPagesModel) {
        return new ho(musicPagesModel.n(), Boolean.valueOf(musicPagesModel.p()));
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
}
