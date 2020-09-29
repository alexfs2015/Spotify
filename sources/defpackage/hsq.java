package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.playlist.models.Show;
import com.spotify.playlist.models.Show.MediaType;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: hsq reason: default package */
public final class hsq implements hpd {
    private boolean a;
    private final iol<Show, uzy, Policy> b;
    private final hpb c;

    public hsq(RxResolver rxResolver, String str, hpb hpb) {
        this(new iom(rxResolver, str), hpb);
    }

    private hsq(iom iom, hpb hpb) {
        this.b = iom;
        this.c = hpb;
        SortOption sortOption = new SortOption("latestPublishedEpisodeDate", true);
        sortOption.a(true);
        this.b.a(sortOption);
        this.b.a(MediaType.VIDEO);
    }

    public final void a() {
        if (!this.a) {
            this.a = true;
            this.b.d();
        }
    }

    public final void a(String str, hpe hpe) {
        if (!a(str)) {
            hpe.a((Throwable) new IllegalArgumentException());
        } else if (this.a) {
            hpe.a((Throwable) new IllegalStateException("stopped"));
        } else {
            vun.a((ObservableSource<T>) this.b.a(), BackpressureStrategy.BUFFER).c((wut<? super T, Boolean>) $$Lambda$hsq$6ZL_ebdYHovjB9ZCP7GZUM6bdY.INSTANCE).c().a((wun<? super T>) new $$Lambda$hsq$rvs8Hw9JKjwtrG5VtnWqk2Kll1Y<Object>(this, hpe), (wun<Throwable>) new $$Lambda$hsq$aiJMDOm2vb1RMDoH20egME09rc8<Throwable>(hpe));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(hpe hpe, uzy uzy) {
        List list;
        Show[] showArr = (Show[]) uzy.getItems();
        if (showArr == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList = new ArrayList(showArr.length);
            for (Show show : showArr) {
                hpb hpb = this.c;
                hpa hpa = new hpa(show.getUri());
                hpa.a = ActionType.BROWSABLE;
                hpa.d = hpb.a.a(show.getImageUri());
                hpa a2 = hpa.a(new gox().b(1).a);
                a2.e = (!TextUtils.isEmpty(show.getImageUri()) ? Uri.parse(show.getImageUri()) : Uri.EMPTY).toString();
                a2.b = show.getTitle();
                arrayList.add(a2.b());
            }
            list = arrayList;
        }
        hpe.a(list);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(hpe hpe, Throwable th) {
        Logger.e("Failed to load podcasts", new Object[0]);
        hpe.a(th);
    }

    public final boolean a(String str) {
        return jst.a(str).b == LinkType.COLLECTION_PODCASTS;
    }
}
