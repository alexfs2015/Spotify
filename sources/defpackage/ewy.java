package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* renamed from: ewy reason: default package */
public final class ewy {
    final String a;
    final String b;
    final long c;
    final long d;
    final eqy e;
    private final String f;

    ewy(esp esp, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        eqy eqy;
        bxo.a(str2);
        bxo.a(str3);
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
            esp.q().f.a("Event created with reverse previous/current timestamps. appId", ern.a(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            eqy = new eqy(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (str4 == null) {
                    esp.q().c.a("Param name can't be null");
                    it.remove();
                } else {
                    esp.e();
                    Object a2 = ewd.a(str4, bundle2.get(str4));
                    if (a2 == null) {
                        esp.q().f.a("Param value can't be null", esp.f().b(str4));
                        it.remove();
                    } else {
                        esp.e().a(bundle2, str4, a2);
                    }
                }
            }
            eqy = new eqy(bundle2);
        }
        this.e = eqy;
    }

    private ewy(esp esp, String str, String str2, String str3, long j, long j2, eqy eqy) {
        bxo.a(str2);
        bxo.a(str3);
        bxo.a(eqy);
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
            esp.q().f.a("Event created with reverse previous/current timestamps. appId, name", ern.a(str2), ern.a(str3));
        }
        this.e = eqy;
    }

    /* access modifiers changed from: 0000 */
    public final ewy a(esp esp, long j) {
        ewy ewy = new ewy(esp, this.f, this.a, this.b, this.c, j, this.e);
        return ewy;
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
