package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$WnSX8RXMvUDZDVUsFqG4upPB07o reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$WnSX8RXMvUDZDVUsFqG4upPB07o implements Function {
    private final /* synthetic */ RxResolver f$0;

    public /* synthetic */ $$Lambda$WnSX8RXMvUDZDVUsFqG4upPB07o(RxResolver rxResolver) {
        this.f$0 = rxResolver;
    }

    public final Object apply(Object obj) {
        return this.f$0.resolve((Request) obj);
    }
}
