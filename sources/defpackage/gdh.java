package defpackage;

import com.google.common.base.Optional;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: gdh reason: default package */
final class gdh implements gdf {
    private final gdg a;

    public gdh(gdg gdg) {
        this.a = gdg;
    }

    public final Observable<gdl> a(a aVar) {
        gdg gdg = this.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put("updateThrottling", String.valueOf(aVar.b()));
        linkedHashMap.put("responseFormat", "protobuf");
        ArrayList arrayList = new ArrayList(1);
        Optional a2 = aVar.a();
        if (a2.b()) {
            StringBuilder sb = new StringBuilder();
            sb.append("playable");
            sb.append(' ');
            sb.append("eq");
            sb.append(' ');
            sb.append(a2.c());
            arrayList.add(sb.toString());
        }
        linkedHashMap.put("filter", fbl.a(',').a((Iterable<?>) arrayList));
        return gdg.a(linkedHashMap).c((Function<? super T, ? extends R>) $$Lambda$t7eUakEJgnK8Hl9iFiYwsg6p5Ow.INSTANCE);
    }
}
