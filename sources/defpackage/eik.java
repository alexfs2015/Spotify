package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* renamed from: eik reason: default package */
public final class eik extends bog {
    private final bnw d;
    private final eir e;

    public final bod a(String str) {
        bnx bnx = new bnx(this.a, this.b, str, this.d, bnh.b, new eii(), new egn(this.a, this.d, this.e));
        return bnx;
    }

    public final boolean a() {
        return this.d.c;
    }

    public eik(Context context, bnw bnw, eir eir) {
        String str;
        if (Collections.unmodifiableList(bnw.b).isEmpty()) {
            str = bni.a(bnw.a);
        } else {
            String str2 = bnw.a;
            List unmodifiableList = Collections.unmodifiableList(bnw.b);
            if (str2 == null) {
                throw new IllegalArgumentException("applicationId cannot be null");
            } else if (unmodifiableList != null) {
                str = bni.a("com.google.android.gms.cast.CATEGORY_CAST", str2, unmodifiableList);
            } else {
                throw new IllegalArgumentException("namespaces cannot be null");
            }
        }
        super(context, str);
        this.d = bnw;
        this.e = eir;
    }
}
