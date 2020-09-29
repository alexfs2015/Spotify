package defpackage;

import com.spotify.cosmos.router.Response;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$uiu$77bwgUwgg2RRvYEGrIPPKowJCHU reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$uiu$77bwgUwgg2RRvYEGrIPPKowJCHU implements Function {
    private final /* synthetic */ uiu f$0;
    private final /* synthetic */ String f$1;
    private final /* synthetic */ Class f$2;

    public /* synthetic */ $$Lambda$uiu$77bwgUwgg2RRvYEGrIPPKowJCHU(uiu uiu, String str, Class cls) {
        this.f$0 = uiu;
        this.f$1 = str;
        this.f$2 = cls;
    }

    public final Object apply(Object obj) {
        return this.f$0.a(this.f$1, this.f$2, (Response) obj);
    }
}
