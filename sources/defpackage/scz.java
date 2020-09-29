package defpackage;

import com.moat.analytics.mobile.MoatAdEvent;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import java.util.Map;

/* renamed from: scz reason: default package */
public final class scz {
    private final kxz a;
    private final hed b;
    private final String c;

    public scz(kxz kxz, hed hed, String str) {
        this.a = kxz;
        this.b = hed;
        this.c = str;
    }

    public final kjm<sbs> a() {
        return kla.a(this.a.a.a(1).a().c((Function<? super T, ? extends R>) $$Lambda$uvyu2L_Rj0IOfHn3SKiSckOew4U.INSTANCE).a(Functions.a()), this.b.a.c((Function<? super T, ? extends R>) new $$Lambda$scz$xCAW6D0TbUAavYg97eFQHYR6wxM<Object,Object>(this)).c((Function<? super T, ? extends R>) $$Lambda$6C1nNlQL6cZLlqU5TYdmCj6Cto.INSTANCE).a(Functions.a()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ sbz a(Map map) {
        return new sbp(this.c, (String) map.get(MoatAdEvent.EVENT_TYPE), (String) map.get("country_code"));
    }
}
