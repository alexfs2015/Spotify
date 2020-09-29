package defpackage;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: xw reason: default package */
public final class xw {
    public boolean a = false;
    private final Set<Object> b = new dq();
    private final Map<String, aci> c = new HashMap();
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
            aci aci = (aci) this.c.get(str);
            if (aci == null) {
                aci = new aci();
                this.c.put(str, aci);
            }
            aci.a += f;
            aci.b++;
            if (aci.b == Integer.MAX_VALUE) {
                aci.a /= 2.0f;
                aci.b /= 2;
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
