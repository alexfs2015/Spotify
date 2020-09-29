package defpackage;

import com.spotify.metadata.proto.Metadata.Disc;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$hdv$W5gG-mVNy56f62WHBfv-gGYOyzU reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$hdv$W5gGmVNy56f62WHBfvgGYOyzU implements Function {
    public static final /* synthetic */ $$Lambda$hdv$W5gGmVNy56f62WHBfvgGYOyzU INSTANCE = new $$Lambda$hdv$W5gGmVNy56f62WHBfvgGYOyzU();

    private /* synthetic */ $$Lambda$hdv$W5gGmVNy56f62WHBfvgGYOyzU() {
    }

    public final Object apply(Object obj) {
        return Observable.a((Iterable<? extends T>) ((Disc) obj).d);
    }
}
