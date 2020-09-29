package defpackage;

import android.util.SparseArray;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;

/* renamed from: gvo reason: default package */
public interface gvo {

    /* renamed from: gvo$a */
    public static final class a implements guk {
        private final HubsGlueImageDelegate a;
        private final SparseArray<gvo> b;

        private a(HubsGlueImageDelegate hubsGlueImageDelegate, gvo[] gvoArr) {
            this.a = (HubsGlueImageDelegate) fay.a(hubsGlueImageDelegate);
            this.b = new SparseArray<>(gvoArr.length);
            for (gvo gvo : gvoArr) {
                this.b.append(gvo.a(), gvo);
            }
        }

        public final gui<?> getBinder(int i) {
            gvo gvo = (gvo) this.b.get(i);
            if (gvo != null) {
                return gvo.a(this.a);
            }
            return null;
        }

        @SafeVarargs
        public static <T extends gvo> a a(HubsGlueImageDelegate hubsGlueImageDelegate, T... tArr) {
            return new a(hubsGlueImageDelegate, tArr);
        }
    }

    int a();

    gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate);
}
