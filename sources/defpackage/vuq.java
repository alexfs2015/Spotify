package defpackage;

import android.content.Context;
import com.spotify.rcs.model.GranularConfiguration;
import com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValue;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: vuq reason: default package */
public final class vuq implements vub {
    private final Context a;
    private final xah b;
    private final gfj c;
    private vur d;

    public vuq(Context context, xah xah, gfj gfj) {
        this.a = context;
        this.b = xah;
        this.c = gfj;
    }

    public final <T extends vum> T a(vun<T> vun) {
        vur a2 = a();
        if (a2.d == null) {
            vup a3 = a2.b.a();
            vup a4 = a2.a.a();
            if (!a3.c() || a4.c()) {
                a2.a(a2.b.a());
            } else {
                a2.a(a2.a.a());
            }
        }
        vup vup = a2.d;
        vup a5 = a2.c.a();
        Map<String, AssignedPropertyValue> map = vup.b;
        Map<String, AssignedPropertyValue> map2 = a5.b;
        HashMap hashMap = new HashMap(map);
        hashMap.putAll(map2);
        return vun.create(vsx.a(new HashSet(vup.a((GranularConfiguration) GranularConfiguration.k().a(hashMap.values()).g()).b.values())));
    }

    public vur a() {
        if (this.d == null) {
            this.d = vur.a(this.a, this.b, this.c);
        }
        return this.d;
    }
}
