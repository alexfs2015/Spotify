package defpackage;

import com.google.common.collect.Lists;
import io.reactivex.functions.Function;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: -$$Lambda$lrn$1$duLxIPEpYYK1AcQeZlh3vxk1lco reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$lrn$1$duLxIPEpYYK1AcQeZlh3vxk1lco implements Function {
    private final /* synthetic */ Set f$0;

    public /* synthetic */ $$Lambda$lrn$1$duLxIPEpYYK1AcQeZlh3vxk1lco(Set set) {
        this.f$0 = set;
    }

    public final Object apply(Object obj) {
        return Collections.singletonMap(lrn.d(), new lrf(lqv.a((List<uzc>) Lists.a((E[]) ((iov) obj).getItems()))).a(this.f$0));
    }
}
