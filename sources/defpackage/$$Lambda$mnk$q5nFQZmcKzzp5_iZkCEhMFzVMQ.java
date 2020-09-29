package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.Function;
import java.util.List;

/* renamed from: -$$Lambda$mnk$q5nFQZmcKzzp5_iZkCEh-MFzVMQ reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$mnk$q5nFQZmcKzzp5_iZkCEhMFzVMQ implements Function {
    private final /* synthetic */ mnk f$0;
    private final /* synthetic */ String f$1;
    private final /* synthetic */ Optional f$2;

    public /* synthetic */ $$Lambda$mnk$q5nFQZmcKzzp5_iZkCEhMFzVMQ(mnk mnk, String str, Optional optional) {
        this.f$0 = mnk;
        this.f$1 = str;
        this.f$2 = optional;
    }

    public final Object apply(Object obj) {
        return this.f$0.a(this.f$1, this.f$2, (List) obj);
    }
}
