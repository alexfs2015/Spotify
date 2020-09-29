package defpackage;

import defpackage.ikk;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import rx.internal.operators.OnSubscribeFromIterable;
import rx.internal.util.UtilityFunctions.Identity;

/* renamed from: ikf reason: default package */
public final class ikf<T extends ikk> implements xiy<List<iki<T>>, xii<iki<T>>> {
    private final xil a;

    public ikf(xil xil) {
        this.a = xil;
    }

    public final /* synthetic */ Object call(Object obj) {
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        iki iki = (iki) list.get(0);
        arrayList.add(xim.a((xim<T>) xly.a(list.get(0))));
        long j = iki.c - iki.b;
        for (int i = 1; i < list.size(); i++) {
            xly a2 = xly.a(list.get(i));
            xkv xkv = new xkv(a2.a, j, TimeUnit.MILLISECONDS, this.a);
            arrayList.add(xim.a(xim.a((a<T>) xkv)));
            j = ((iki) list.get(i)).c;
        }
        return xii.b((a<T>) new OnSubscribeFromIterable<T>(arrayList)).a((xiy<? super T, ? extends xii<? extends R>>) Identity.INSTANCE);
    }
}
