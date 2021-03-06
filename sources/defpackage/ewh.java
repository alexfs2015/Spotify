package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* renamed from: ewh reason: default package */
public final class ewh {
    final String a;
    final String b;
    final long c;
    final long d;
    final eqh e;
    private final String f;

    private ewh(ery ery, String str, String str2, String str3, long j, long j2, eqh eqh) {
        bwx.a(str2);
        bwx.a(str3);
        bwx.a(eqh);
        this.a = str2;
        this.b = str3;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f = str;
        this.c = j;
        this.d = j2;
        long j3 = this.d;
        if (j3 != 0 && j3 > this.c) {
            ery.q().f.a("Event created with reverse previous/current timestamps. appId, name", eqw.a(str2), eqw.a(str3));
        }
        this.e = eqh;
    }

    ewh(ery ery, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        eqh eqh;
        bwx.a(str2);
        bwx.a(str3);
        this.a = str2;
        this.b = str3;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f = str;
        this.c = j;
        this.d = j2;
        long j3 = this.d;
        if (j3 != 0 && j3 > this.c) {
            ery.q().f.a("Event created with reverse previous/current timestamps. appId", eqw.a(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            eqh = new eqh(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (str4 == null) {
                    ery.q().c.a("Param name can't be null");
                    it.remove();
                } else {
                    ery.e();
                    Object a2 = evm.a(str4, bundle2.get(str4));
                    if (a2 == null) {
                        ery.q().f.a("Param value can't be null", ery.f().b(str4));
                        it.remove();
                    } else {
                        ery.e().a(bundle2, str4, a2);
                    }
                }
            }
            eqh = new eqh(bundle2);
        }
        this.e = eqh;
    }

    /* access modifiers changed from: 0000 */
    public final ewh a(ery ery, long j) {
        ewh ewh = new ewh(ery, this.f, this.a, this.b, this.c, j, this.e);
        return ewh;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.e);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}
