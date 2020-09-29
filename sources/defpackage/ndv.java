package defpackage;

import android.text.TextUtils;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import java.util.Iterator;
import java.util.List;

/* renamed from: ndv reason: default package */
public final class ndv implements c<gzz, gzz> {
    public final /* synthetic */ Object call(Object obj) {
        return ((wud) obj).f($$Lambda$ndv$TfuFNfn6Nvpr0RovnEZLPdb_sg.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ gzz a(gzz gzz) {
        if (gzz.header() == null) {
            gzq a = a(gzz.body());
            a builder = gzz.toBuilder();
            if (a != null) {
                return builder.b(a).a();
            }
            if (!gzz.body().isEmpty()) {
                gzz = builder.b(HubsImmutableComponentBundle.builder().a("gradient", HubsImmutableComponentBundle.builder().a("style", "default").a()).a()).a();
            }
        }
        return gzz;
    }

    private static gzq a(List<? extends gzt> list) {
        String str;
        gzq a;
        Iterator it = list.iterator();
        do {
            gzq gzq = null;
            if (it.hasNext()) {
                gzt gzt = (gzt) it.next();
                gzw main = gzt.images().main();
                if (main != null) {
                    str = main.uri();
                } else {
                    str = null;
                }
                String str2 = "overlayDarkness";
                String str3 = "diagonal";
                String str4 = "style";
                String str5 = "startColorFromImage";
                String str6 = "gradient";
                if (!TextUtils.isEmpty(str)) {
                    gzq = HubsImmutableComponentBundle.builder().a(str6, HubsImmutableComponentBundle.builder().a(str4, str3).a(str5, str).a(str2, 0.2f).a()).a();
                } else {
                    gzq bundle = gzt.custom().bundle(str6);
                    if (bundle != null) {
                        a builder = HubsImmutableComponentBundle.builder();
                        a a2 = HubsImmutableComponentBundle.builder().a(str4, str3).a(str5, bundle.string(str5));
                        String str7 = "startColor";
                        gzq = builder.a(str6, a2.a(str7, bundle.string(str7)).a(str2, 0.2f).a()).a();
                    }
                }
                if (gzq == null) {
                    a = a(gzt.children());
                }
            }
            return gzq;
        } while (a == null);
        return a;
    }
}
