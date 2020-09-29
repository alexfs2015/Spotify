package defpackage;

import android.text.TextUtils;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import java.util.Iterator;
import java.util.List;

/* renamed from: njk reason: default package */
public final class njk implements c<hcs, hcs> {
    private static hcj a(List<? extends hcm> list) {
        String str;
        hcj a;
        Iterator it = list.iterator();
        do {
            hcj hcj = null;
            if (it.hasNext()) {
                hcm hcm = (hcm) it.next();
                hcp background = hcm.images().background();
                if (background != null) {
                    str = background.uri();
                } else {
                    hcp main = hcm.images().main();
                    str = (main == null || main.uri() == null) ? null : main.uri();
                }
                String str2 = "overlayDarkness";
                String str3 = "diagonal";
                String str4 = "style";
                String str5 = "startColorFromImage";
                String str6 = "gradient";
                if (!TextUtils.isEmpty(str)) {
                    hcj = HubsImmutableComponentBundle.builder().a(str6, HubsImmutableComponentBundle.builder().a(str4, str3).a(str5, str).a(str2, 0.2f).a()).a();
                } else {
                    hcj bundle = hcm.custom().bundle(str6);
                    if (bundle != null) {
                        a builder = HubsImmutableComponentBundle.builder();
                        a a2 = HubsImmutableComponentBundle.builder().a(str4, str3).a(str5, bundle.string(str5));
                        String str7 = "startColor";
                        hcj = builder.a(str6, a2.a(str7, bundle.string(str7)).a(str2, 0.2f).a()).a();
                    }
                }
                if (hcj == null) {
                    a = a(hcm.children());
                }
            }
            return hcj;
        } while (a == null);
        return a;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ hcs a(hcs hcs) {
        if (hcs.header() == null) {
            hcj a = a(hcs.body());
            a builder = hcs.toBuilder();
            if (a != null) {
                return builder.b(a).a();
            }
            if (!hcs.body().isEmpty()) {
                hcs = builder.b(HubsImmutableComponentBundle.builder().a("gradient", HubsImmutableComponentBundle.builder().a("style", "default").a()).a()).a();
            }
        }
        return hcs;
    }

    public final /* synthetic */ Object call(Object obj) {
        return ((xii) obj).e((xiy<? super T, ? extends R>) $$Lambda$njk$pfWZ1tfNSLsfukKUYvN7cZqhs8.INSTANCE);
    }
}
