package defpackage;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.LinkType;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Maybe;
import io.reactivex.Single;
import io.reactivex.functions.Action;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.maybe.MaybeFlatMapCompletable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Arrays;

/* renamed from: nmc reason: default package */
public final class nmc implements nme {
    private final String a;
    private final Single<Boolean> b;
    private final lav c;
    private final lar d;
    private final vjj e;
    private final vjv f;

    /* renamed from: nmc$1 reason: invalid class name */
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
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.PLAYLIST_V2     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.ALBUM     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.SHOW_EPISODE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.PODCAST_EPISODE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.nmc.AnonymousClass1.<clinit>():void");
        }
    }

    public nmc(String str, Single<Boolean> single, lav lav, lar lar, vjj vjj, vjv vjv) {
        this.a = str;
        this.b = single;
        this.c = lav;
        this.d = lar;
        this.e = vjj;
        this.f = vjv;
    }

    /* access modifiers changed from: private */
    public Completable a(String str) {
        jva a2 = jva.a(str);
        int i = AnonymousClass1.a[a2.b.ordinal()];
        if (i == 1) {
            return this.f.a(str).a((CompletableSource) this.e.a(str, Optional.e(), true)).a(Functions.c());
        }
        if (i == 2) {
            return Completable.a((Action) new $$Lambda$nmc$LRp7IlKHItreL_QJTbNMyh2G2U(this, a2, str)).a(Functions.c());
        }
        if (i == 3 || i == 4) {
            return Completable.a((Action) new $$Lambda$nmc$0iAXmXXSy0AQj422x5sRRAO71FQ(this, str)).a(Functions.c());
        }
        Logger.d("Unsupported link type for auto downloading : %s", a2.b.toString());
        return Completable.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource a(String[] strArr, Boolean bool) {
        return Completable.b((Iterable<? extends CompletableSource>) ImmutableList.a(fcp.a((Iterable<E>) Arrays.asList(strArr)).a((Function<? super E, T>) new $$Lambda$nmc$xvwOf1hwciAm4hxZXY7HNgEFuao<Object,T>(this)).a()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(jva jva, String str) {
        String i = jva.i(this.a);
        if (!fbo.a(i)) {
            this.d.a(str, str, false);
            this.c.a(i);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        if (!fbo.a(str)) {
            this.d.a(str, str, false);
            this.c.a(str);
        }
    }

    public final Completable a(hcs hcs) {
        String[] stringArray = hcs.custom().stringArray("autoDownloadEligible");
        if (stringArray == null || stringArray.length <= 0) {
            return Completable.a();
        }
        Maybe a2 = this.b.a((Predicate<? super T>) $$Lambda$5rSgNjXAtgz3Ke0FNmbFJ3qRmtE.INSTANCE);
        $$Lambda$nmc$OA5zdmav75qBCEMikeS9vhgkCRY r1 = new $$Lambda$nmc$OA5zdmav75qBCEMikeS9vhgkCRY(this, stringArray);
        ObjectHelper.a(r1, "mapper is null");
        return RxJavaPlugins.a((Completable) new MaybeFlatMapCompletable(a2, r1)).a(Functions.c());
    }
}
