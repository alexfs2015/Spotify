package defpackage;

import com.google.common.base.Optional;
import com.spotify.searchview.proto.DrillDownViewResponse;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$spv$JILw13O8-lFhbwoDKesKs4e2BZQ reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$spv$JILw13O8lFhbwoDKesKs4e2BZQ implements Function {
    private final /* synthetic */ sqo f$0;
    private final /* synthetic */ String f$1;
    private final /* synthetic */ Optional f$2;

    public /* synthetic */ $$Lambda$spv$JILw13O8lFhbwoDKesKs4e2BZQ(sqo sqo, String str, Optional optional) {
        this.f$0 = sqo;
        this.f$1 = str;
        this.f$2 = optional;
    }

    public final Object apply(Object obj) {
        return spv.a(this.f$0, this.f$1, this.f$2, (DrillDownViewResponse) obj);
    }
}
