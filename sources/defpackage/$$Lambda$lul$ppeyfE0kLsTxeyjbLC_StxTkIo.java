package defpackage;

import com.spotify.metadata.proto.Metadata.Artist;
import io.reactivex.functions.Function;
import java.util.Set;

/* renamed from: -$$Lambda$lul$ppeyfE0kLsTxey-jbLC_StxTkIo reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$lul$ppeyfE0kLsTxeyjbLC_StxTkIo implements Function {
    private final /* synthetic */ Set f$0;

    public /* synthetic */ $$Lambda$lul$ppeyfE0kLsTxeyjbLC_StxTkIo(Set set) {
        this.f$0 = set;
    }

    public final Object apply(Object obj) {
        return lul.a(this.f$0, (Artist) obj);
    }
}
