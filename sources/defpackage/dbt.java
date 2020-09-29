package defpackage;

import java.security.SecureRandom;

/* renamed from: dbt reason: default package */
final class dbt extends ThreadLocal<SecureRandom> {
    dbt() {
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object initialValue() {
        return dbs.a();
    }
}
