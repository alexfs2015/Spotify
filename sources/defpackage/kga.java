package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState;
import com.spotify.mobile.android.wrapped2019.stories.templates.StoryParagraphDecorator;
import com.spotify.music.R;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;

/* renamed from: kga reason: default package */
public class kga extends kfs {
    public Observable<StoriesPlaybackState> T;
    private Disposable U = Disposables.b();
    private String V;
    public kfn b;

    /* renamed from: kga$1 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kga.AnonymousClass1.<clinit>():void");
        }
    }

    public static kga a(c cVar) {
        kga kga = new kga();
        Bundle a = a(cVar);
        a.putString("preview", cVar.a);
        a.putString("paragraph1", cVar.b.text());
        a.putStringArray("paragraph1Values", (String[]) cVar.b.values().toArray(new String[0]));
        a.putString("paragraph2", cVar.c.text());
        a.putStringArray("paragraph2Values", (String[]) cVar.c.values().toArray(new String[0]));
        kga.g(a);
        return kga;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.story_decades_fragment, viewGroup, false);
    }

    public final void a(View view, Bundle bundle) {
        TextView textView = (TextView) ip.c(view, (int) R.id.paragraph1);
        TextView textView2 = (TextView) ip.c(view, (int) R.id.paragraph2);
        Bundle l = l();
        int c = fr.c(view.getContext(), R.color.wrapped_citric);
        textView.setText(StoryParagraphDecorator.a((String) fay.a(l.getString("paragraph1")), (String[]) fay.a(l.getStringArray("paragraph1Values")), c));
        textView2.setText(StoryParagraphDecorator.a((String) fay.a(l.getString("paragraph2")), (String[]) fay.a(l.getStringArray("paragraph2Values")), c));
        this.V = l.getString("preview");
    }

    public final void g() {
        super.g();
        String str = this.V;
        if (str != null) {
            this.b.a(str);
        }
        this.U = this.T.a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$kga$tk5WRMQO5bvw5c9f6sJ2dSYvnbM<Object>(this), (Consumer<? super Throwable>) $$Lambda$kga$Rbqq1H0rK4k0Gw_ecRAJW3TGvdU.INSTANCE);
    }

    public final void h() {
        this.U.bf_();
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
