package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: equ reason: default package */
public final class equ extends esv {
    private static final AtomicReference<String[]> a = new AtomicReference<>();
    private static final AtomicReference<String[]> b = new AtomicReference<>();
    private static final AtomicReference<String[]> c = new AtomicReference<>();

    equ(ery ery) {
        super(ery);
    }

    /* access modifiers changed from: protected */
    public final boolean d() {
        return false;
    }

    private final boolean f() {
        return TextUtils.isEmpty(this.r.a) && this.r.q().a(3);
    }

    /* access modifiers changed from: protected */
    public final String a(String str) {
        if (str == null) {
            return null;
        }
        if (!f()) {
            return str;
        }
        return a(str, esx.b, esx.a, a);
    }

    /* access modifiers changed from: protected */
    public final String b(String str) {
        if (str == null) {
            return null;
        }
        if (!f()) {
            return str;
        }
        return a(str, esy.b, esy.a, b);
    }

    /* access modifiers changed from: protected */
    public final String c(String str) {
        if (str == null) {
            return null;
        }
        if (!f()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return a(str, esz.b, esz.a, c);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("experiment_id");
        sb.append("(");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    private static String a(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        bwx.a(strArr);
        bwx.a(strArr2);
        bwx.a(atomicReference);
        bwx.b(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (evm.c(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i] == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(strArr2[i]);
                        sb.append("(");
                        sb.append(strArr[i]);
                        sb.append(")");
                        strArr3[i] = sb.toString();
                    }
                    str2 = strArr3[i];
                }
                return str2;
            }
        }
        return str;
    }

    /* access modifiers changed from: protected */
    public final String a(eqk eqk) {
        if (eqk == null) {
            return null;
        }
        if (!f()) {
            return eqk.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(eqk.c);
        sb.append(",name=");
        sb.append(a(eqk.a));
        sb.append(",params=");
        sb.append(a(eqk.b));
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final String a(ewh ewh) {
        if (ewh == null) {
            return null;
        }
        if (!f()) {
            return ewh.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Event{appId='");
        sb.append(ewh.a);
        sb.append("', name='");
        sb.append(a(ewh.b));
        sb.append("', params=");
        sb.append(a(ewh.e));
        sb.append("}");
        return sb.toString();
    }

    private final String a(eqh eqh) {
        if (eqh == null) {
            return null;
        }
        if (!f()) {
            return eqh.toString();
        }
        return a(eqh.a());
    }

    /* access modifiers changed from: protected */
    public final String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!f()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        for (String str : bundle.keySet()) {
            if (sb.length() != 0) {
                sb.append(", ");
            } else {
                sb.append("Bundle[{");
            }
            sb.append(b(str));
            sb.append("=");
            sb.append(bundle.get(str));
        }
        sb.append("}]");
        return sb.toString();
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final /* bridge */ /* synthetic */ ewg k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ bzg l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ Context m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ equ n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ evm o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ eru p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ eqw q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ erh r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ evw s() {
        return super.s();
    }
}
