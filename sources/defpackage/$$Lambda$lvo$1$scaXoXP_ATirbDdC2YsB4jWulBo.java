package defpackage;

import io.reactivex.functions.Function;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: -$$Lambda$lvo$1$scaXoXP_ATirbDdC2YsB4jWulBo reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$lvo$1$scaXoXP_ATirbDdC2YsB4jWulBo implements Function {
    private final /* synthetic */ Set f$0;

    public /* synthetic */ $$Lambda$lvo$1$scaXoXP_ATirbDdC2YsB4jWulBo(Set set) {
        this.f$0 = set;
    }

    public final Object apply(Object obj) {
        return Collections.singletonMap("recently_played", new lve((List) obj).a(this.f$0));
    }
}
