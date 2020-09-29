package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$krh$sdNhq0XKcalHKUgiRY0_l_lNKIA reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$krh$sdNhq0XKcalHKUgiRY0_l_lNKIA implements Function {
    private final /* synthetic */ wca f$0;
    private final /* synthetic */ Flowable f$1;
    private final /* synthetic */ ObjectMapper f$2;

    public /* synthetic */ $$Lambda$krh$sdNhq0XKcalHKUgiRY0_l_lNKIA(wca wca, Flowable flowable, ObjectMapper objectMapper) {
        this.f$0 = wca;
        this.f$1 = flowable;
        this.f$2 = objectMapper;
    }

    public final Object apply(Object obj) {
        return krh.a(this.f$0, this.f$1, this.f$2, (h) obj);
    }
}
