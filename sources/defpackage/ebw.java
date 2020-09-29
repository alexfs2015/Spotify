package defpackage;

import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

@cfp
/* renamed from: ebw reason: default package */
public final class ebw implements eag, ebv {
    private final ebu a;
    private final HashSet<SimpleEntry<String, bhc<? super ebu>>> b = new HashSet<>();

    public ebw(ebu ebu) {
        this.a = ebu;
    }

    public final void a() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            SimpleEntry simpleEntry = (SimpleEntry) it.next();
            String str = "Unregistering eventhandler: ";
            String valueOf = String.valueOf(((bhc) simpleEntry.getValue()).toString());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
            cml.a();
            this.a.b((String) simpleEntry.getKey(), (bhc) simpleEntry.getValue());
        }
        this.b.clear();
    }

    public final void a(String str, bhc<? super ebu> bhc) {
        this.a.a(str, bhc);
        this.b.add(new SimpleEntry(str, bhc));
    }

    public final void a(String str, String str2) {
        eah.a((eag) this, str, str2);
    }

    public final void a(String str, Map map) {
        eah.a((eag) this, str, map);
    }

    public final void a(String str, JSONObject jSONObject) {
        eah.b(this, str, jSONObject);
    }

    public final void b(String str) {
        this.a.b(str);
    }

    public final void b(String str, bhc<? super ebu> bhc) {
        this.a.b(str, bhc);
        this.b.remove(new SimpleEntry(str, bhc));
    }

    public final void b(String str, JSONObject jSONObject) {
        eah.a((eag) this, str, jSONObject);
    }
}
