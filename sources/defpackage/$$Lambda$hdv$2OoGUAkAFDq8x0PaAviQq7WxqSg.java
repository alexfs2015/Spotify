package defpackage;

import com.spotify.metadata.proto.Metadata.Album;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$hdv$2OoGUAkAFDq8x0PaAviQq7WxqSg reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$hdv$2OoGUAkAFDq8x0PaAviQq7WxqSg implements Function {
    public static final /* synthetic */ $$Lambda$hdv$2OoGUAkAFDq8x0PaAviQq7WxqSg INSTANCE = new $$Lambda$hdv$2OoGUAkAFDq8x0PaAviQq7WxqSg();

    private /* synthetic */ $$Lambda$hdv$2OoGUAkAFDq8x0PaAviQq7WxqSg() {
    }

    public final Object apply(Object obj) {
        return Observable.a((Iterable<? extends T>) ((Album) obj).f);
    }
}
