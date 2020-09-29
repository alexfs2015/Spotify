package defpackage;

import com.google.common.collect.Sets;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.Set;

/* renamed from: nie reason: default package */
public final class nie implements Function<gzz, SingleSource<gzz>> {
    private final boolean a;
    private final uzi b;

    public final /* synthetic */ Object apply(Object obj) {
        gzz gzz = (gzz) obj;
        String[] stringArray = gzz.custom().stringArray("ondemand");
        if (stringArray == null || stringArray.length <= 0 || this.a) {
            return Single.b(gzz);
        }
        return this.b.a((Set<String>) Sets.a((E[]) stringArray)).a((SingleSource<T>) Single.b(gzz));
    }

    public nie(boolean z, uzi uzi) {
        this.a = z;
        this.b = uzi;
    }
}
