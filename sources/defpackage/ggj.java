package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ggj reason: default package */
public final class ggj {
    private final List<ggi> a;

    /* renamed from: ggj$a */
    public static class a {
        public final Map<String, ggi> a = new HashMap();

        public a(Context context, gft gft, gfu gfu, gex gex, ggl ggl) {
            Context applicationContext = context.getApplicationContext();
            a((ggi) new ggt());
            a((ggi) new ggm(new ggo(), new ggn(gft, VERSION.SDK_INT < 24 ? new ggq(gft, new ggg(gfu)) : new ggp(gft, new gge(applicationContext, gfu)))));
            a((ggi) new ggh(gex));
            a((ggi) new ggr());
            a((ggi) new ggd(applicationContext, gfu));
            a((ggi) new ggk(ggl));
        }

        private a a(ggi ggi) {
            this.a.put(ggi.a(), ggi);
            return this;
        }

        public final a a(List<ggi> list) {
            HashMap hashMap = new HashMap();
            for (ggi ggi : list) {
                hashMap.put(ggi.a(), ggi);
            }
            this.a.putAll(hashMap);
            return this;
        }
    }

    private ggj(List<ggi> list) {
        this.a = list;
    }

    public /* synthetic */ ggj(List list, byte b) {
        this(list);
    }

    public final List<ggi> a() {
        return new ArrayList(this.a);
    }
}
