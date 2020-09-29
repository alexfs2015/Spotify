package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import java.util.Arrays;

/* renamed from: bxe reason: default package */
public abstract class bxe {
    private static final Object a = new Object();
    private static bxe b;

    /* renamed from: bxe$a */
    public static final class a {
        final String a;
        final int b;
        private final String c;
        private final ComponentName d = null;

        public a(String str, String str2, int i) {
            this.c = bxo.a(str);
            this.a = bxo.a(str2);
            this.b = i;
        }

        public final Intent a() {
            String str = this.c;
            return str != null ? new Intent(str).setPackage(this.a) : new Intent().setComponent(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return bxm.a(this.c, aVar.c) && bxm.a(this.a, aVar.a) && bxm.a(null, null) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.c, this.a, null, Integer.valueOf(this.b)});
        }

        public final String toString() {
            String str = this.c;
            if (str != null) {
                return str;
            }
            ComponentName componentName = null;
            return componentName.flattenToString();
        }
    }

    public static bxe a(Context context) {
        synchronized (a) {
            if (b == null) {
                b = new bzd(context.getApplicationContext());
            }
        }
        return b;
    }

    public final void a(String str, String str2, int i, ServiceConnection serviceConnection, String str3) {
        b(new a(str, str2, i), serviceConnection, str3);
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(a aVar, ServiceConnection serviceConnection, String str);

    /* access modifiers changed from: protected */
    public abstract void b(a aVar, ServiceConnection serviceConnection, String str);
}
