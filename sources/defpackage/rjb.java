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

/* renamed from: rjb reason: default package */
public final class rjb implements kmm<MusicPagesModel, rey> {
    /* access modifiers changed from: private */
    public final ViewLoadingTracker a;

    public rjb(View view, Bundle bundle, a aVar, rmf rmf, final a aVar2, sgb sgb) {
        this.a = sgb.a(view, aVar.ae_().toString(), bundle, rmf, false, Optional.e());
        aVar2.a(new c() {
            public final void a() {
                if (rjb.this.a != null) {
                    rjb.this.a.e();
                }
            }

            public final void a(Bundle bundle) {
                rjb.this.a.a(bundle);
            }

            public final void aN_() {
                aVar2.b(this);
            }
        });
    }

    static /* synthetic */ boolean a(MusicPagesModel musicPagesModel) {
        LoadingState n = musicPagesModel.n();
        return n == LoadingState.LOADED || n == LoadingState.LOADED_EMPTY || n == LoadingState.LOADED_EMPTY_WITH_FILTER || n == LoadingState.LOADED_EMPTY_WITH_TEXT_FILTER || n == LoadingState.LOADED_PARTIALLY;
    }

    public final kmn<MusicPagesModel> connect(knw<rey> knw) {
        return new kmn<MusicPagesModel>() {
            public final /* synthetic */ void accept(Object obj) {
                MusicPagesModel musicPagesModel = (MusicPagesModel) obj;
                ViewLoadingTracker a2 = rjb.this.a;
                if (!(a2.a == State.DRAW_COMPLETED || a2.a == State.CANCELLED || a2.a == State.FAILED)) {
                    if (!rjb.this.a.f() && musicPagesModel.p()) {
                        rjb.this.a.a();
                    } else if (rjb.this.a.f() && rjb.a(musicPagesModel)) {
                        rjb.this.a.b();
                    }
                }
            }

            public final void dispose() {
                if (rjb.this.a != null) {
                    rjb.this.a.e();
                }
            }
        };
    }
}
