package defpackage;

import java.security.SecureRandom;

/* renamed from: dbc reason: default package */
final class dbc extends ThreadLocal<SecureRandom> {
    dbc() {
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object initialValue() {
        return dbb.a();
    }
}
