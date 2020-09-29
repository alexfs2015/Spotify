package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: erl reason: default package */
public final class erl extends etm {
    private static final AtomicReference<String[]> a = new AtomicReference<>();
    private static final AtomicReference<String[]> b = new AtomicReference<>();
    private static final AtomicReference<String[]> c = new AtomicReference<>();

    erl(esp esp) {
        super(esp);
    }

    private final String a(eqy eqy) {
        if (eqy == null) {
            return null;
        }
        return !f() ? eqy.toString() : a(eqy.a());
    }

    private static String a(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        bxo.a(strArr);
        bxo.a(strArr2);
        bxo.a(atomicReference);
        bxo.b(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (ewd.c(str, strArr[i])) {
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

    private final boolean f() {
        return TextUtils.isEmpty(this.r.a) && this.r.q().a(3);
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

    /* access modifiers changed from: protected */
    public final String a(erb erb) {
        if (erb == null) {
            return null;
        }
        if (!f()) {
            return erb.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(erb.c);
        sb.append(",name=");
        sb.append(a(erb.a));
        sb.append(",params=");
        sb.append(a(erb.b));
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final String a(ewy ewy) {
        if (ewy == null) {
            return null;
        }
        if (!f()) {
            return ewy.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Event{appId='");
        sb.append(ewy.a);
        sb.append("', name='");
        sb.append(a(ewy.b));
        sb.append("', params=");
        sb.append(a(ewy.e));
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final String a(String str) {
        if (str == null) {
            return null;
        }
        return !f() ? str : a(str, eto.b, eto.a, a);
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    /* access modifiers changed from: protected */
    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return !f() ? str : a(str, etp.b, etp.a, b);
    }

    public final /* bridge */ /* synthetic */ void b() {
        super.b();
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
            return a(str, etq.b, etq.a, c);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("experiment_id");
        sb.append("(");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    /* access modifiers changed from: protected */
    public final boolean d() {
        return false;
    }

    public final /* bridge */ /* synthetic */ ewx k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ bzx l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ Context m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ erl n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ ewd o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ esl p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ ern q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ ery r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ ewn s() {
        return super.s();
    }
}
