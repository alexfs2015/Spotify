package defpackage;

import android.content.Context;
import io.reactivex.Single;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/* renamed from: glz reason: default package */
public final class glz implements glx {
    private static final int a = 2131886087;
    private static final Type b = new fko<List<gmc>>() {
    }.b;
    private final fix c = new fix();
    private final Context d;

    public glz(Context context) {
        this.d = context;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List a(Integer num) {
        return (List) fbp.a(this.c.a(glm.a(this.d, num.intValue()), b));
    }

    public final Single<List<gmc>> a() {
        return Single.b(Integer.valueOf(a)).f(new $$Lambda$glz$vX6WUS7e_peR4xSFrB8COzaoIFo(this));
    }

    public /* synthetic */ Single<List<gmc>> b() {
        return CC.$default$b(this);
    }

    public /* synthetic */ Single<Map<String, gmc>> c() {
        return CC.$default$c(this);
    }
}
