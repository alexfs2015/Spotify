package defpackage;

import com.spotify.metadata.proto.Metadata.Artist;
import io.reactivex.functions.Function;
import java.util.Set;

/* renamed from: -$$Lambda$lqm$h7Qys_Nct-Pto9ULl9A3NdOZc-k reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$lqm$h7Qys_NctPto9ULl9A3NdOZck implements Function {
    private final /* synthetic */ Set f$0;

    public /* synthetic */ $$Lambda$lqm$h7Qys_NctPto9ULl9A3NdOZck(Set set) {
        this.f$0 = set;
    }

    public final Object apply(Object obj) {
        return lqm.a(this.f$0, (Artist) obj);
    }
}
