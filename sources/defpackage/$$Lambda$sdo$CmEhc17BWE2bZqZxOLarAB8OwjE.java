package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$sdo$CmEhc17BWE2bZqZxOLarAB8OwjE reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$sdo$CmEhc17BWE2bZqZxOLarAB8OwjE implements Function {
    private final /* synthetic */ sgh f$0;

    public /* synthetic */ $$Lambda$sdo$CmEhc17BWE2bZqZxOLarAB8OwjE(sgh sgh) {
        this.f$0 = sgh;
    }

    public final Object apply(Object obj) {
        return Logger.a("Offline search for query <%s> completed", this.f$0.a.a.b());
    }
}
