package defpackage;

import com.google.common.base.Function;
import com.spotify.mobile.android.util.LinkType;
import java.util.Collections;

/* renamed from: hbg reason: default package */
public final class hbg {
    public static final fbq<String> a = new fbq<String>() {
        public final /* synthetic */ boolean apply(Object obj) {
            return jva.a((String) obj, LinkType.TRACK);
        }
    };
    private static final Function<hcm, Iterable<? extends hcm>> b = new Function<hcm, Iterable<? extends hcm>>() {
        public final /* synthetic */ Object apply(Object obj) {
            hcm hcm = (hcm) obj;
            return hcm != null ? hcm.children().isEmpty() ? Collections.singleton(hcm) : fcp.a(Collections.singleton(hcm), hbg.a(hcm.children())) : Collections.emptySet();
        }
    };

    static {
        new Function<hcm, String>() {
            public final /* synthetic */ Object apply(Object obj) {
                hcm hcm = (hcm) obj;
                if (hcm == null) {
                    return null;
                }
                hcr target = hcm.target();
                if (target != null) {
                    return target.uri();
                }
                return null;
            }
        };
    }

    public static Iterable<? extends hcm> a(Iterable<? extends hcm> iterable) {
        return fcp.a(iterable).b(b);
    }
}
