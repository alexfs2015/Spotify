package defpackage;

import io.reactivex.functions.Function;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: -$$Lambda$lrp$1$WhxOS_s52TLUJ46igLjf27aRXSY reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$lrp$1$WhxOS_s52TLUJ46igLjf27aRXSY implements Function {
    private final /* synthetic */ Set f$0;

    public /* synthetic */ $$Lambda$lrp$1$WhxOS_s52TLUJ46igLjf27aRXSY(Set set) {
        this.f$0 = set;
    }

    public final Object apply(Object obj) {
        return Collections.singletonMap("recently_played", new lrf((List) obj).a(this.f$0));
    }
}
