package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState;
import com.spotify.mobile.android.wrapped2019.stories.templates.topgenres.GenreBarView;
import com.spotify.mobile.android.wrapped2019.stories.templates.topgenres.TopGenresView;
import com.spotify.music.R;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import java.util.List;

/* renamed from: kij reason: default package */
public class kij extends kfs {
    public Observable<StoriesPlaybackState> T;
    private TopGenresView U;
    private TextView V;
    private TextView W;
    private Disposable Y = Disposables.b();
    public kfn b;

    /* renamed from: kij$1 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kij.AnonymousClass1.<clinit>():void");
        }
    }

    public static kij a(k kVar) {
        Bundle a = a(kVar);
        a.putParcelable("GENRES", kii.e().a(kVar.d).b(kVar.b).a(kVar.a).c(kVar.c).a());
        kij kij = new kij();
        kij.g(a);
        return kij;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.story_top_genres_fragment, viewGroup, false);
        this.U = (TopGenresView) ip.c(inflate, (int) R.id.top_genres_view);
        this.V = (TextView) ip.c(inflate, (int) R.id.top_genres_title);
        this.W = (TextView) ip.c(inflate, (int) R.id.top_genres_sub_title);
        return inflate;
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        kii kii = (kii) fay.a((kii) l().getParcelable("GENRES"), (Object) "Can't find top genres in args.");
        this.b.a(kii.c());
        TopGenresView topGenresView = this.U;
        List d = kii.d();
        int size = d.size();
        if (size == 1) {
            TopGenresView.inflate(topGenresView.getContext(), R.layout.top_genres_view_1_item, topGenresView);
            topGenresView.a(d);
        } else if (size == 2) {
            TopGenresView.inflate(topGenresView.getContext(), R.layout.top_genres_view_2_items, topGenresView);
            topGenresView.b(d);
        } else if (size == 3) {
            TopGenresView.inflate(topGenresView.getContext(), R.layout.top_genres_view_3_items, topGenresView);
            topGenresView.c(d);
        } else if (size == 4) {
            TopGenresView.inflate(topGenresView.getContext(), R.layout.top_genres_view_4_items, topGenresView);
            topGenresView.d(d);
        } else if (size == 5) {
            TopGenresView.inflate(topGenresView.getContext(), R.layout.top_genres_view_5_items, topGenresView);
            topGenresView.d(d);
            ((GenreBarView) ip.c((View) topGenresView, (int) R.id.genre_view_05)).b((kih) d.get(4));
        } else {
            StringBuilder sb = new StringBuilder("Unexpected genre count : ");
            sb.append(d.size());
            throw new IllegalStateException(sb.toString());
        }
        kii kii2 = (kii) fay.a(kii);
        this.V.setText(kii2.a());
        this.W.setText(kii2.b());
    }

    public final void g() {
        super.g();
        this.Y = this.T.a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$kij$YCvz4MNhdf3X_z9dpiLoGYXvTS0<Object>(this), (Consumer<? super Throwable>) $$Lambda$kij$Q2PoxZjXdIg4OMv_XmNwanmrqR0.INSTANCE);
    }

    public final void h() {
        this.Y.bf_();
        super.h();
    }

    /* access modifiers changed from: private */
    public void a(StoriesPlaybackState storiesPlaybackState) {
        int i = AnonymousClass1.a[storiesPlaybackState.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.b.d();
            }
            return;
        }
        this.b.c();
    }
}
