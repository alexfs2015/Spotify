package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.firebase.iid.zzal;

/* renamed from: fgy reason: default package */
abstract class fgy<T> {
    final int a;
    final eya<T> b = new eya<>();
    final int c;
    final Bundle d;

    fgy(int i, int i2, Bundle bundle) {
        this.a = i;
        this.c = i2;
        this.d = bundle;
    }

    /* access modifiers changed from: 0000 */
    public abstract void a(Bundle bundle);

    /* access modifiers changed from: 0000 */
    public final void a(zzal zzal) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(zzal);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14 + String.valueOf(valueOf2).length());
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
        }
        this.b.a((Exception) zzal);
    }

    /* access modifiers changed from: 0000 */
    public final void a(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16 + String.valueOf(valueOf2).length());
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
        }
        this.b.a(t);
    }

    /* access modifiers changed from: 0000 */
    public abstract boolean a();

    public String toString() {
        int i = this.c;
        int i2 = this.a;
        boolean a2 = a();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(a2);
        sb.append("}");
        return sb.toString();
    }
}
