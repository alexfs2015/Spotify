package defpackage;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: xi reason: default package */
public final class xi {
    public boolean a = false;
    private final Set<Object> b = new dq();
    private final Map<String, abu> c = new HashMap();
    private final Comparator<ho<String, Float>> d = new Comparator<ho<String, Float>>() {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            ho hoVar = (ho) obj2;
            float floatValue = ((Float) ((ho) obj).b).floatValue();
            float floatValue2 = ((Float) hoVar.b).floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    };

    public final void a(String str, float f) {
        if (this.a) {
            abu abu = (abu) this.c.get(str);
            if (abu == null) {
                abu = new abu();
                this.c.put(str, abu);
            }
            abu.a += f;
            abu.b++;
            if (abu.b == Integer.MAX_VALUE) {
                abu.a /= 2.0f;
                abu.b /= 2;
            }
            if (str.equals("__container")) {
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }
}
