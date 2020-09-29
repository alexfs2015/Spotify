package defpackage;

import com.google.common.base.Function;
import com.spotify.mobile.android.util.LinkType;
import java.util.Collections;

/* renamed from: gyn reason: default package */
public final class gyn {
    public static final faz<String> a = new faz<String>() {
        public final /* synthetic */ boolean apply(Object obj) {
            return jst.a((String) obj, LinkType.TRACK);
        }
    };
    private static final Function<gzt, Iterable<? extends gzt>> b = new Function<gzt, Iterable<? extends gzt>>() {
        public final /* synthetic */ Object apply(Object obj) {
            gzt gzt = (gzt) obj;
            if (gzt == null) {
                return Collections.emptySet();
            }
            if (gzt.children().isEmpty()) {
                return Collections.singleton(gzt);
            }
            return fbx.a((Iterable<? extends T>) Collections.singleton(gzt), gyn.a(gzt.children()));
        }
    };

    static {
        new Function<gzt, String>() {
            public final /* synthetic */ Object apply(Object obj) {
                gzt gzt = (gzt) obj;
                if (gzt == null) {
                    return null;
                }
                gzy target = gzt.target();
                if (target != null) {
                    return target.uri();
                }
                return null;
            }
        };
    }

    public static Iterable<? extends gzt> a(Iterable<? extends gzt> iterable) {
        return fbx.a(iterable).b(b);
    }
}
