package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: nhc reason: default package */
public final class nhc implements c<gzz, gzz> {
    private static final hau b = new hau($$Lambda$nhc$kbyGWGJIJD5WpDnCS8BVoe6K10.INSTANCE);
    private static final hau c = new hau($$Lambda$nhc$obROeJuHW4Zng31neC3KBnOm3M.INSTANCE);
    private static boolean d;
    private static String e;
    private final wud<Boolean> a;

    public final /* synthetic */ Object call(Object obj) {
        return wud.a(this.a, (wud) obj, (wuu<? super T1, ? super T2, ? extends R>) $$Lambda$nhc$JpAJbSKpLIYvSjMoB68BOhMM0z8.INSTANCE);
    }

    nhc(wud<Boolean> wud) {
        this.a = wud;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ gzz a(Boolean bool, gzz gzz) {
        gzz gzz2;
        if (bool.booleanValue()) {
            gzz2 = b.a(gzz);
        } else {
            gzz2 = c.a(gzz);
        }
        return d ? gzz2.toBuilder().a((List<? extends gzt>) ImmutableList.a(fbx.a((Iterable<E>) gzz2.body()).a((faz<? super E>) $$Lambda$nhc$dCR_NOurFgI58jTizJVgQtC9M5o.INSTANCE).a())).a() : gzz2;
    }

    /* access modifiers changed from: private */
    public static gzt a(gzt gzt) {
        if (!c(gzt)) {
            return gzt;
        }
        String[] stringArray = gzt.custom().stringArray("podcastOnboardingShelfCarousel");
        return (stringArray == null || stringArray.length <= 0) ? gzt : gzt.toBuilder().a(a(gzt, stringArray[0])).a();
    }

    /* access modifiers changed from: private */
    public static gzt b(gzt gzt) {
        if (!c(gzt)) {
            return gzt;
        }
        String[] stringArray = gzt.custom().stringArray("podcastOnboardingShelfHeader");
        if (stringArray != null && stringArray.length > 0) {
            e = stringArray[0];
        }
        String[] stringArray2 = gzt.custom().stringArray("podcastOnboardingShelfBanner");
        return (stringArray2 == null || stringArray2.length <= 0) ? gzt : gzt.toBuilder().a(a(gzt, stringArray2[0])).a();
    }

    private static List<? extends gzt> a(gzt gzt, String str) {
        ImmutableList a2 = ImmutableList.a(fbx.a((Iterable<E>) gzt.children()).a((faz<? super E>) new $$Lambda$nhc$UiokcfI7UxuqkMe6BDSO0REOkXU<Object>(str)).a());
        d = a2.isEmpty();
        return a2;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(String str, gzt gzt) {
        return !gzt.id().equals(str);
    }

    private static boolean c(gzt gzt) {
        String[] stringArray = gzt.custom().stringArray("podcastOnboardingShelf");
        if (stringArray == null || stringArray.length <= 0 || stringArray[0] == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean d(gzt gzt) {
        String id = gzt.id();
        return !(id != null && id.equals(e));
    }
}
