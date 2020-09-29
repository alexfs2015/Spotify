package defpackage;

import android.content.res.Resources;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: ndm reason: default package */
public final class ndm implements ObservableTransformer<hcs, hcs> {
    private static final fbl a = fbl.a(" • ").a();
    private final Resources b;

    /* renamed from: ndm$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[LinkType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.spotify.mobile.android.util.LinkType[] r0 = com.spotify.mobile.android.util.LinkType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.SHOW_PODCAST     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.SHOW_SHOW     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.PODCAST_EPISODE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.SHOW_EPISODE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ndm.AnonymousClass1.<clinit>():void");
        }
    }

    public ndm(Resources resources) {
        this.b = resources;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ hcm a(hcm hcm) {
        String id = hcm.id();
        if (id == null || !id.startsWith("artist-entity-view-podcasts_row") || !HubsComponentCategory.ROW.mId.equals(hcm.componentId().category())) {
            return hcm;
        }
        String subtitle = hcm.text().subtitle();
        int i = AnonymousClass1.a[jva.a(hcm.metadata().string("uri")).b.ordinal()];
        if (i == 1 || i == 2) {
            subtitle = a(this.b.getString(R.string.podcasts_featuring_subtitle_podcast), subtitle);
        } else if (i == 3 || i == 4) {
            subtitle = a(this.b.getString(R.string.podcasts_featuring_subtitle_podcast_episode), subtitle);
        }
        return hcm.toBuilder().a(hcm.text().toBuilder().b(subtitle)).a();
    }

    /* access modifiers changed from: private */
    public hcs a(hcs hcs) {
        return new hdn(new $$Lambda$ndm$L3LWJx3jF9__YDqRxP9UKv7aD1g(this)).a(hcs);
    }

    private static String a(String str, String str2) {
        return a.a(str, fbo.c(str2), new Object[0]);
    }

    public final ObservableSource<hcs> apply(Observable<hcs> observable) {
        return observable.c((Function<? super T, ? extends R>) new $$Lambda$ndm$5xhsrAlo95Qnd8Z3phXV5AGkoqY<Object,Object>(this));
    }
}
