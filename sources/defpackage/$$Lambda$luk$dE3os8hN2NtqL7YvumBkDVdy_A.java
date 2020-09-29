package defpackage;

import com.spotify.metadata.proto.Metadata.Album;
import io.reactivex.functions.Function;
import java.util.Set;

/* renamed from: -$$Lambda$luk$dE3os-8hN2NtqL7YvumBkDVdy_A reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$luk$dE3os8hN2NtqL7YvumBkDVdy_A implements Function {
    private final /* synthetic */ Set f$0;

    public /* synthetic */ $$Lambda$luk$dE3os8hN2NtqL7YvumBkDVdy_A(Set set) {
        this.f$0 = set;
    }

    public final Object apply(Object obj) {
        return luk.a(this.f$0, (Album) obj);
    }
}
