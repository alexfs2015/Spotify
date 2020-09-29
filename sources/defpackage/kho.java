package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.TrackData;
import com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;

/* renamed from: kho reason: default package */
public class kho extends kfs {
    public Picasso T;
    public Observable<StoriesPlaybackState> U;
    private Disposable V = Disposables.b();
    public kfn b;

    /* renamed from: kho$1 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kho.AnonymousClass1.<clinit>():void");
        }
    }

    public static kho a(g gVar) {
        kho kho = new kho();
        Bundle a = a(gVar);
        a.putInt("color", gVar.e);
        a.putString("preview", gVar.a);
        a.putString("image", gVar.b);
        a.putString(TrackData.TYPE_TRACK, gVar.c);
        a.putString("artist", gVar.d);
        kho.g(a);
        return kho;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.story_placeholder_fragment, viewGroup, false);
    }

    public final void g() {
        super.g();
        this.V = this.U.a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$kho$OpwtD09GC0SsfcesdTCQsaYMiQ<Object>(this), (Consumer<? super Throwable>) $$Lambda$kho$fRjlNgezlLdnSOfKUSEOHL9gYo.INSTANCE);
    }

    public final void h() {
        this.V.bf_();
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

    public final void a(View view, Bundle bundle) {
        Bundle bundle2 = this.i;
        if (bundle2 != null) {
            CardView cardView = (CardView) ip.c(view, (int) R.id.card);
            ImageView imageView = (ImageView) ip.c(view, (int) R.id.image);
            TextView textView = (TextView) ip.c(view, (int) R.id.track);
            TextView textView2 = (TextView) ip.c(view, (int) R.id.artist);
            cardView.a(bundle2.getInt("color", -16777216));
            textView.setText(bundle2.getString(TrackData.TYPE_TRACK));
            textView2.setText(bundle2.getString("artist"));
            this.T.a(bundle2.getString("image")).a(imageView);
            String string = bundle2.getString("preview");
            if (string != null) {
                this.b.a(string);
            }
        }
    }
}
