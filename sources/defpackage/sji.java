package defpackage;

import com.spotify.searchview.proto.Entity;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: sji reason: default package */
final class sji implements Function<sjh, List<hcm>> {
    private final sjv a;

    public sji(sjv sjv) {
        this.a = sjv;
    }

    private hcm a(String str, Entity entity, int i) {
        return this.a.a(entity, i, str, "top-recs-content-results").a();
    }

    /* renamed from: a */
    public final List<hcm> apply(sjh sjh) {
        List a2 = sjd.a((List<Entity>) sjh.c().k().d);
        if (a2.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(a2.size());
        for (int i = 0; i < a2.size(); i++) {
            arrayList.add(a(sjh.a(), (Entity) a2.get(i), i));
        }
        return arrayList;
    }
}
