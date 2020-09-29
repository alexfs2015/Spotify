package defpackage;

import com.spotify.metadata.proto.Metadata.Album;
import io.reactivex.functions.Function;
import java.util.Set;

/* renamed from: -$$Lambda$lql$c4iOBklN09L0tJfY8LHk9nvRuZg reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$lql$c4iOBklN09L0tJfY8LHk9nvRuZg implements Function {
    private final /* synthetic */ Set f$0;

    public /* synthetic */ $$Lambda$lql$c4iOBklN09L0tJfY8LHk9nvRuZg(Set set) {
        this.f$0 = set;
    }

    public final Object apply(Object obj) {
        return lql.a(this.f$0, (Album) obj);
    }
}
