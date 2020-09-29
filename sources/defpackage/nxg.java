package defpackage;

import android.net.Uri;
import com.google.common.base.Optional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: nxg reason: default package */
public abstract class nxg {

    /* renamed from: nxg$a */
    public interface a {
        a a(Optional<way> optional);

        a a(String str);

        a a(List<String> list);

        a a(boolean z);

        nxg a();

        a b(List<String> list);

        a c(List<String> list);
    }

    public static a h() {
        return new a().a(Optional.e()).a(Collections.emptyList()).b(Collections.emptyList()).c(Collections.emptyList()).a(false);
    }

    public abstract Optional<way> a();

    public abstract String b();

    public abstract List<String> c();

    public abstract List<String> d();

    public abstract List<String> e();

    public abstract boolean f();

    public abstract a g();

    public final Map<String, String> i() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(10);
        Optional a2 = a();
        linkedHashMap.put("sort", a2.b() ? waz.a((way) a2.c()) : "");
        String b = b();
        ArrayList arrayList = new ArrayList(c());
        if (!fbo.a(b)) {
            StringBuilder sb = new StringBuilder("text contains ");
            sb.append(Uri.encode(b));
            arrayList.add(sb.toString());
        }
        linkedHashMap.put("filter", fbl.a(',').a((Iterable<?>) arrayList));
        linkedHashMap.put("tracksFilter", fbl.a(',').a((Iterable<?>) d()));
        if (f()) {
            linkedHashMap.put("waitForScanner", "true");
        }
        List e = e();
        if (!e.isEmpty()) {
            StringBuilder sb2 = new StringBuilder(10);
            for (int i = 0; i < e.size(); i++) {
                if (i > 0) {
                    sb2.append(',');
                }
                sb2.append(Uri.encode((String) e.get(i)));
            }
            linkedHashMap.put("excludedPaths", sb2.toString());
        }
        return linkedHashMap;
    }
}
