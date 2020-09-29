package defpackage;

import android.content.Context;
import com.spotify.rcs.model.GranularConfiguration;
import com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValue;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: vhl reason: default package */
public final class vhl implements vgw {
    private final Context a;
    private final wmb b;
    private final gdy c;
    private vhm d;

    public vhl(Context context, wmb wmb, gdy gdy) {
        this.a = context;
        this.b = wmb;
        this.c = gdy;
    }

    public vhm a() {
        if (this.d == null) {
            this.d = vhm.a(this.a, this.b, this.c);
        }
        return this.d;
    }

    public final <T extends vhh> T a(vhi<T> vhi) {
        vhm a2 = a();
        if (a2.d == null) {
            vhk a3 = a2.b.a();
            vhk a4 = a2.a.a();
            if (!a3.c() || a4.c()) {
                a2.a(a2.b.a());
            } else {
                a2.a(a2.a.a());
            }
        }
        vhk vhk = a2.d;
        vhk a5 = a2.c.a();
        Map<String, AssignedPropertyValue> map = vhk.b;
        Map<String, AssignedPropertyValue> map2 = a5.b;
        HashMap hashMap = new HashMap(map);
        hashMap.putAll(map2);
        return vhi.create(vfu.a(new HashSet(vhk.a((GranularConfiguration) GranularConfiguration.k().a(hashMap.values()).g()).b.values())));
    }
}
