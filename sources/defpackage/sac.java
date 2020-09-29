package defpackage;

import com.spotify.searchview.proto.Entity;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: sac reason: default package */
final class sac implements Function<rzz, List<gzt>> {
    private final saa a;
    private final rzq b;

    public sac(saa saa, rzq rzq) {
        this.a = saa;
        this.b = rzq;
    }

    /* renamed from: a */
    public final List<gzt> apply(rzz rzz) {
        List a2 = rzp.a((List<Entity>) rzz.c().k().d);
        if (a2.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(a2.size());
        for (int i = 0; i < a2.size(); i++) {
            arrayList.add(a(rzz.a(), (Entity) a2.get(i), i));
        }
        return arrayList;
    }

    private gzt a(String str, Entity entity, int i) {
        rzx rzx = new rzx(this.a, this.b, entity, i, str, "top-recs-content-results");
        return rzx.a();
    }
}
