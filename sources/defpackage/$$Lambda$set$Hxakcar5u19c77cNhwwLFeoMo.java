package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$set$Hxakcar-5-u19c77cNhwwLFeoMo reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$set$Hxakcar5u19c77cNhwwLFeoMo implements Function {
    private final /* synthetic */ sgh f$0;

    public /* synthetic */ $$Lambda$set$Hxakcar5u19c77cNhwwLFeoMo(sgh sgh) {
        this.f$0 = sgh;
    }

    public final Object apply(Object obj) {
        return Logger.d((Throwable) obj, "Search online request failed for query = %s", this.f$0.b());
    }
}
