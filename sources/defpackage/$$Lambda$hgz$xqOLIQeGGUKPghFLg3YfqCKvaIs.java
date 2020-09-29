package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.Function;
import java.util.Map;

/* renamed from: -$$Lambda$hgz$xqOLIQeGGUKPghFLg3YfqCKvaIs reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$hgz$xqOLIQeGGUKPghFLg3YfqCKvaIs implements Function {
    private final /* synthetic */ String f$0;

    public /* synthetic */ $$Lambda$hgz$xqOLIQeGGUKPghFLg3YfqCKvaIs(String str) {
        this.f$0 = str;
    }

    public final Object apply(Object obj) {
        return Optional.c(((Map) obj).get(this.f$0));
    }
}
