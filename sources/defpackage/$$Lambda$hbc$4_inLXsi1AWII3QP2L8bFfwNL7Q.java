package defpackage;

import com.spotify.metadata.proto.Metadata.Disc;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$hbc$4_inLXsi1AWII3QP2L8bFfwNL7Q reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$hbc$4_inLXsi1AWII3QP2L8bFfwNL7Q implements Function {
    public static final /* synthetic */ $$Lambda$hbc$4_inLXsi1AWII3QP2L8bFfwNL7Q INSTANCE = new $$Lambda$hbc$4_inLXsi1AWII3QP2L8bFfwNL7Q();

    private /* synthetic */ $$Lambda$hbc$4_inLXsi1AWII3QP2L8bFfwNL7Q() {
    }

    public final Object apply(Object obj) {
        return Observable.a((Iterable<? extends T>) ((Disc) obj).d);
    }
}
