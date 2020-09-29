package defpackage;

import com.google.common.collect.ImmutableList;
import io.reactivex.functions.Function;
import java.util.Map;

/* renamed from: -$$Lambda$rds$UIPbhDCCAUjTVxvcbvwnnMG7HKk reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$rds$UIPbhDCCAUjTVxvcbvwnnMG7HKk implements Function {
    private final /* synthetic */ rds f$0;
    private final /* synthetic */ ImmutableList f$1;
    private final /* synthetic */ iri f$2;
    private final /* synthetic */ int f$3;
    private final /* synthetic */ rdb f$4;

    public /* synthetic */ $$Lambda$rds$UIPbhDCCAUjTVxvcbvwnnMG7HKk(rds rds, ImmutableList immutableList, iri iri, int i, rdb rdb) {
        this.f$0 = rds;
        this.f$1 = immutableList;
        this.f$2 = iri;
        this.f$3 = i;
        this.f$4 = rdb;
    }

    public final Object apply(Object obj) {
        return this.f$0.a(this.f$1, this.f$2, this.f$3, this.f$4, (Map) obj);
    }
}
