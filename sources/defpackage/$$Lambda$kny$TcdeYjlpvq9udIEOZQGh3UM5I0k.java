package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$kny$TcdeYjlpvq9udIEOZQGh3UM5I0k reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$kny$TcdeYjlpvq9udIEOZQGh3UM5I0k implements Function {
    private final /* synthetic */ vos f$0;
    private final /* synthetic */ Flowable f$1;
    private final /* synthetic */ ObjectMapper f$2;

    public /* synthetic */ $$Lambda$kny$TcdeYjlpvq9udIEOZQGh3UM5I0k(vos vos, Flowable flowable, ObjectMapper objectMapper) {
        this.f$0 = vos;
        this.f$1 = flowable;
        this.f$2 = objectMapper;
    }

    public final Object apply(Object obj) {
        return kny.a(this.f$0, this.f$1, this.f$2, (h) obj);
    }
}
