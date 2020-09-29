package defpackage;

import defpackage.ihx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import rx.internal.operators.OnSubscribeFromIterable;
import rx.internal.util.UtilityFunctions.Identity;

/* renamed from: ihs reason: default package */
public final class ihs<T extends ihx> implements wut<List<ihv<T>>, wud<ihv<T>>> {
    private final wug a;

    public final /* synthetic */ Object call(Object obj) {
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        ihv ihv = (ihv) list.get(0);
        arrayList.add(wuh.a((wuh<T>) wxt.a(list.get(0))));
        long j = ihv.c - ihv.b;
        for (int i = 1; i < list.size(); i++) {
            wxt a2 = wxt.a(list.get(i));
            wwq wwq = new wwq(a2.a, j, TimeUnit.MILLISECONDS, this.a);
            arrayList.add(wuh.a(wuh.a((a<T>) wwq)));
            j = ((ihv) list.get(i)).c;
        }
        return wud.b((a<T>) new OnSubscribeFromIterable<T>(arrayList)).a((wut<? super T, ? extends wud<? extends R>>) Identity.INSTANCE);
    }

    public ihs(wug wug) {
        this.a = wug;
    }
}
