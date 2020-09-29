package defpackage;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.SearchQuery;
import io.reactivex.functions.Function;
import java.util.List;

/* renamed from: -$$Lambda$iii$MrswttJ2VvCGEArgWohgWk6ieT0 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$iii$MrswttJ2VvCGEArgWohgWk6ieT0 implements Function {
    private final /* synthetic */ SearchQuery f$0;

    public /* synthetic */ $$Lambda$iii$MrswttJ2VvCGEArgWohgWk6ieT0(SearchQuery searchQuery) {
        this.f$0 = searchQuery;
    }

    public final Object apply(Object obj) {
        return iii.a((List) obj, this.f$0.offset, this.f$0.limit);
    }
}
