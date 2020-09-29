package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState;
import com.spotify.mobile.android.wrapped2019.stories.templates.minuteslistened.ArcView;
import com.spotify.mobile.android.wrapped2019.stories.templates.minuteslistened.MinutesListened;
import com.spotify.music.R;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: khi reason: default package */
public class khi extends kfs {
    public Observable<StoriesPlaybackState> T;
    private final List<Integer> U = new ArrayList();
    private final ImmutableList<Integer> V = ImmutableList.a(Integer.valueOf(R.id.year_textview1), Integer.valueOf(R.id.year_textview2), Integer.valueOf(R.id.year_textview3), Integer.valueOf(R.id.year_textview4), Integer.valueOf(R.id.year_textview5));
    private final ImmutableList<Integer> W = ImmutableList.a(Integer.valueOf(R.id.minute_textview1), Integer.valueOf(R.id.minute_textview2), Integer.valueOf(R.id.minute_textview3), Integer.valueOf(R.id.minute_textview4), Integer.valueOf(R.id.minute_textview5));
    private Disposable Y = Disposables.b();
    public kfn b;

    /* renamed from: khi$1 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.khi.AnonymousClass1.<clinit>():void");
        }
    }

    public static khi a(e eVar) {
        khi khi = new khi();
        Bundle a = a(eVar);
        a.putString("preview", eVar.c);
        a.putString("caption", eVar.a);
        a.putSerializable("minutes_listened_list", eVar.b);
        khi.g(a);
        return khi;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.story_minutes_listened, viewGroup, false);
    }

    public final void a(View view, Bundle bundle) {
        ArcView arcView = (ArcView) ip.c(view, (int) R.id.arcview);
        TextView textView = (TextView) ip.c(view, (int) R.id.minutes_listened_caption);
        Bundle l = l();
        textView.setText(l.getString("caption"));
        String string = l.getString("preview");
        if (string != null) {
            this.b.a(string);
        }
        ImmutableList immutableList = (ImmutableList) l.getSerializable("minutes_listened_list");
        for (int i = 0; i < immutableList.size(); i++) {
            ((TextView) ip.c(view, ((Integer) this.V.get(i)).intValue())).setText(String.valueOf(((MinutesListened) immutableList.get(i)).c()));
            ((TextView) ip.c(view, ((Integer) this.W.get(i)).intValue())).setText(((MinutesListened) immutableList.get(i)).b());
            this.U.add(Integer.valueOf(((MinutesListened) immutableList.get(i)).a()));
        }
        int a = ((MinutesListened) Collections.max(immutableList, $$Lambda$khi$CkkOhbvEcW_i87oGKvKAU3WNT0A.INSTANCE)).a();
        ImmutableList<Integer> a2 = ImmutableList.a((Collection<? extends E>) this.U);
        arcView.a = (float) a;
        arcView.b = a2;
        arcView.invalidate();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int a(MinutesListened minutesListened, MinutesListened minutesListened2) {
        return minutesListened.a() - minutesListened2.a();
    }

    public final void g() {
        super.g();
        this.Y = this.T.a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$khi$SULcQR0ePRawqXitlk69ukxo7x0<Object>(this), (Consumer<? super Throwable>) $$Lambda$khi$ZSoj282u7JcaxwPDbuHKDUaFXe4.INSTANCE);
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
