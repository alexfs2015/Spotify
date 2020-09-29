package defpackage;

import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* renamed from: -$$Lambda$TIyibCTuQoPElYCiPAUvSlyoOs8 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$TIyibCTuQoPElYCiPAUvSlyoOs8 implements Function {
    private final /* synthetic */ Predicate f$0;

    public /* synthetic */ $$Lambda$TIyibCTuQoPElYCiPAUvSlyoOs8(Predicate predicate) {
        this.f$0 = predicate;
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(this.f$0.test((rdb) obj));
    }
}
