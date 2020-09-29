package defpackage;

import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

@cey
/* renamed from: ebf reason: default package */
public final class ebf implements dzp, ebe {
    private final ebd a;
    private final HashSet<SimpleEntry<String, bgl<? super ebd>>> b = new HashSet<>();

    public ebf(ebd ebd) {
        this.a = ebd;
    }

    public final void a(String str, bgl<? super ebd> bgl) {
        this.a.a(str, bgl);
        this.b.add(new SimpleEntry(str, bgl));
    }

    public final void a(String str, String str2) {
        dzq.a((dzp) this, str, str2);
    }

    public final void a(String str, Map map) {
        dzq.a((dzp) this, str, map);
    }

    public final void a(String str, JSONObject jSONObject) {
        dzq.b(this, str, jSONObject);
    }

    public final void b(String str) {
        this.a.b(str);
    }

    public final void b(String str, bgl<? super ebd> bgl) {
        this.a.b(str, bgl);
        this.b.remove(new SimpleEntry(str, bgl));
    }

    public final void b(String str, JSONObject jSONObject) {
        dzq.a((dzp) this, str, jSONObject);
    }

    public final void a() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            SimpleEntry simpleEntry = (SimpleEntry) it.next();
            String str = "Unregistering eventhandler: ";
            String valueOf = String.valueOf(((bgl) simpleEntry.getValue()).toString());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
            clu.a();
            this.a.b((String) simpleEntry.getKey(), (bgl) simpleEntry.getValue());
        }
        this.b.clear();
    }
}
