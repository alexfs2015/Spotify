package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.Function;
import java.util.Map;

/* renamed from: -$$Lambda$hed$j6pLcJrSO6F5_Qh2aIpa6SiQP84 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$hed$j6pLcJrSO6F5_Qh2aIpa6SiQP84 implements Function {
    private final /* synthetic */ String f$0;

    public /* synthetic */ $$Lambda$hed$j6pLcJrSO6F5_Qh2aIpa6SiQP84(String str) {
        this.f$0 = str;
    }

    public final Object apply(Object obj) {
        return Optional.c(((Map) obj).get(this.f$0));
    }
}
