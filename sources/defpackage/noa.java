package defpackage;

import com.google.common.collect.Sets;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.Set;

/* renamed from: noa reason: default package */
public final class noa implements Function<hcs, SingleSource<hcs>> {
    private final boolean a;
    private final vll b;

    public noa(boolean z, vll vll) {
        this.a = z;
        this.b = vll;
    }

    public final /* synthetic */ Object apply(Object obj) {
        hcs hcs = (hcs) obj;
        String[] stringArray = hcs.custom().stringArray("ondemand");
        return (stringArray == null || stringArray.length <= 0 || this.a) ? Single.b(hcs) : this.b.a((Set<String>) Sets.a((E[]) stringArray)).a((SingleSource<T>) Single.b(hcs));
    }
}
