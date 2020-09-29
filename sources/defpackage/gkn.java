package defpackage;

import android.content.Context;
import io.reactivex.Single;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/* renamed from: gkn reason: default package */
public final class gkn implements gkl {
    private static final int a = 2131886087;
    private static final Type b = new fju<List<gkq>>() {
    }.b;
    private final fid c = new fid();
    private final Context d;

    public /* synthetic */ Single<List<gkq>> b() {
        return CC.$default$b(this);
    }

    public /* synthetic */ Single<Map<String, gkq>> c() {
        return CC.$default$c(this);
    }

    public gkn(Context context) {
        this.d = context;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List a(Integer num) {
        return (List) fay.a(this.c.a(gkb.a(this.d, num.intValue()), b));
    }

    public final Single<List<gkq>> a() {
        return Single.b(Integer.valueOf(a)).f(new $$Lambda$gkn$0Ggi6OyLDDUPWM18vpwD_6wYSkY(this));
    }
}
