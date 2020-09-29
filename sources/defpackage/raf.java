package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.common.base.Optional;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker.State;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.LoadingState;

/* renamed from: raf reason: default package */
public final class raf implements kjd<MusicPagesModel, qwj> {
    /* access modifiers changed from: private */
    public final ViewLoadingTracker a;

    public raf(View view, Bundle bundle, a aVar, rdh rdh, final a aVar2, rwr rwr) {
        this.a = rwr.a(view, aVar.ae_().toString(), bundle, rdh, false, Optional.e());
        aVar2.a(new c() {
            public final void a(Bundle bundle) {
                raf.this.a.a(bundle);
            }

            public final void aP_() {
                aVar2.b(this);
            }

            public final void a() {
                if (raf.this.a != null) {
                    raf.this.a.e();
                }
            }
        });
    }

    public final kje<MusicPagesModel> connect(kkn<qwj> kkn) {
        return new kje<MusicPagesModel>() {
            public final /* synthetic */ void accept(Object obj) {
                MusicPagesModel musicPagesModel = (MusicPagesModel) obj;
                ViewLoadingTracker a2 = raf.this.a;
                if (!(a2.a == State.DRAW_COMPLETED || a2.a == State.CANCELLED || a2.a == State.FAILED)) {
                    if (!raf.this.a.f() && musicPagesModel.p()) {
                        raf.this.a.a();
                    } else if (raf.this.a.f() && raf.a(musicPagesModel)) {
                        raf.this.a.b();
                    }
                }
            }

            public final void dispose() {
                if (raf.this.a != null) {
                    raf.this.a.e();
                }
            }
        };
    }

    static /* synthetic */ boolean a(MusicPagesModel musicPagesModel) {
        LoadingState n = musicPagesModel.n();
        return n == LoadingState.LOADED || n == LoadingState.LOADED_EMPTY || n == LoadingState.LOADED_EMPTY_WITH_FILTER || n == LoadingState.LOADED_EMPTY_WITH_TEXT_FILTER || n == LoadingState.LOADED_PARTIALLY;
    }
}
