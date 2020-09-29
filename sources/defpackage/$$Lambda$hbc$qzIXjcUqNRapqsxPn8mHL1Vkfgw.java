package defpackage;

import com.spotify.metadata.proto.Metadata.Album;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$hbc$qzIXjcUqNRapqsxPn8mHL1Vkfgw reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$hbc$qzIXjcUqNRapqsxPn8mHL1Vkfgw implements Function {
    public static final /* synthetic */ $$Lambda$hbc$qzIXjcUqNRapqsxPn8mHL1Vkfgw INSTANCE = new $$Lambda$hbc$qzIXjcUqNRapqsxPn8mHL1Vkfgw();

    private /* synthetic */ $$Lambda$hbc$qzIXjcUqNRapqsxPn8mHL1Vkfgw() {
    }

    public final Object apply(Object obj) {
        return Observable.a((Iterable<? extends T>) ((Album) obj).f);
    }
}
