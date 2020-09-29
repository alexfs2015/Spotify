package defpackage;

import android.content.Context;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType;
import com.spotify.mobile.android.service.media.browser.RootListType;
import com.spotify.music.R;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.Locale;

/* renamed from: hqv reason: default package */
public final class hqv implements hqx {
    private final Context b;
    private final kxz c;
    private final hpi d;
    private final hrl e;

    /* renamed from: hqv$a */
    static class a {
        final List<MediaBrowserItem> a;
        final boolean b;

        /* synthetic */ a(boolean z, List list, byte b2) {
            this(z, list);
        }

        private a(boolean z, List<MediaBrowserItem> list) {
            this.a = list;
            this.b = z;
        }
    }

    public hqv(Context context, kxz kxz, hpi hpi, hrl hrl) {
        this.b = context;
        this.c = kxz;
        this.d = hpi;
        this.e = hrl;
    }

    public final Single<List<MediaBrowserItem>> a(hnd hnd, String str) {
        return Observable.a((ObservableSource<? extends T1>) this.c.a(), (ObservableSource<? extends T2>) this.d.a(hnd, str).d(), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$hqv$YYI8wSCAjv00bVQ5cXQj954mfKA.INSTANCE).d((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$hqv$sYoqFMPAuwPWK_jrF6bZIpVo<Object,Object>(this, hnd, str), false).a(0);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ a a(boolean z, List list) {
        return new a(z, list, 0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(hnd hnd, String str, a aVar) {
        if (!aVar.b && !aVar.a.isEmpty()) {
            return Single.b(aVar.a);
        }
        RootListType b2 = hpk.b(hnd.a());
        if (b2 == null) {
            b2 = RootListType.DEFAULT;
        }
        if (b2 == RootListType.NAVIGATION) {
            Context context = this.b;
            hpa hpa = new hpa("com.spotify.waze");
            hpa.b = jsd.a(context.getString(R.string.start_page_title), Locale.getDefault());
            hpa.a = ActionType.BROWSABLE;
            return Single.b(Lists.a((E[]) new MediaBrowserItem[]{hpa.b()}));
        } else if (b2 != RootListType.DEFAULT) {
            return this.e.a(hnd, str);
        } else {
            return Single.b(Lists.a((E[]) new MediaBrowserItem[]{hpy.a(this.b), hqg.a(this.b), hpt.a(this.b)}));
        }
    }
}
