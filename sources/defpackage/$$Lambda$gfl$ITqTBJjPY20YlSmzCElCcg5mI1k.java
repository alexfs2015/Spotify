package defpackage;

import com.google.common.base.Function;
import java.util.List;

/* renamed from: -$$Lambda$gfl$ITqTBJjPY20YlSmzCElCcg5mI1k reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$gfl$ITqTBJjPY20YlSmzCElCcg5mI1k implements Function {
    private final /* synthetic */ List f$0;

    public /* synthetic */ $$Lambda$gfl$ITqTBJjPY20YlSmzCElCcg5mI1k(List list) {
        this.f$0 = list;
    }

    public final Object apply(Object obj) {
        return Long.valueOf(((gff) this.f$0.get(((Integer) obj).intValue())).a());
    }
}
