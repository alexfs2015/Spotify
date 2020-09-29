package defpackage;

import io.reactivex.functions.Function;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: -$$Lambda$lrt$1$j1l4hx98j2yLC6vI5HdyHsxDWRM reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$lrt$1$j1l4hx98j2yLC6vI5HdyHsxDWRM implements Function {
    private final /* synthetic */ Set f$0;

    public /* synthetic */ $$Lambda$lrt$1$j1l4hx98j2yLC6vI5HdyHsxDWRM(Set set) {
        this.f$0 = set;
    }

    public final Object apply(Object obj) {
        return Collections.singletonMap("suggested_songs", new lrf((List) obj).a(this.f$0));
    }
}
