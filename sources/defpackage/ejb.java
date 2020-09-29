package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* renamed from: ejb reason: default package */
public final class ejb extends box {
    private final bon d;
    private final eji e;

    public ejb(Context context, bon bon, eji eji) {
        String str;
        if (Collections.unmodifiableList(bon.b).isEmpty()) {
            str = bnz.a(bon.a);
        } else {
            String str2 = bon.a;
            List unmodifiableList = Collections.unmodifiableList(bon.b);
            if (str2 == null) {
                throw new IllegalArgumentException("applicationId cannot be null");
            } else if (unmodifiableList != null) {
                str = bnz.a("com.google.android.gms.cast.CATEGORY_CAST", str2, unmodifiableList);
            } else {
                throw new IllegalArgumentException("namespaces cannot be null");
            }
        }
        super(context, str);
        this.d = bon;
        this.e = eji;
    }

    public final bou a(String str) {
        boo boo = new boo(this.a, this.b, str, this.d, bny.b, new eiz(), new ehe(this.a, this.d, this.e));
        return boo;
    }

    public final boolean a() {
        return this.d.c;
    }
}
