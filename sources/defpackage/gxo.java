package defpackage;

import android.util.SparseArray;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;

/* renamed from: gxo reason: default package */
public interface gxo {

    /* renamed from: gxo$a */
    public static final class a implements gwk {
        private final HubsGlueImageDelegate a;
        private final SparseArray<gxo> b;

        private a(HubsGlueImageDelegate hubsGlueImageDelegate, gxo[] gxoArr) {
            this.a = (HubsGlueImageDelegate) fbp.a(hubsGlueImageDelegate);
            this.b = new SparseArray<>(gxoArr.length);
            for (gxo gxo : gxoArr) {
                this.b.append(gxo.a(), gxo);
            }
        }

        @SafeVarargs
        public static <T extends gxo> a a(HubsGlueImageDelegate hubsGlueImageDelegate, T... tArr) {
            return new a(hubsGlueImageDelegate, tArr);
        }

        public final gwi<?> getBinder(int i) {
            gxo gxo = (gxo) this.b.get(i);
            if (gxo != null) {
                return gxo.a(this.a);
            }
            return null;
        }
    }

    int a();

    gxl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate);
}
