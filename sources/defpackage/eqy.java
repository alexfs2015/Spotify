package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Iterator;

/* renamed from: eqy reason: default package */
public final class eqy extends bxw implements Iterable<String> {
    public static final Creator<eqy> CREATOR = new era();
    /* access modifiers changed from: 0000 */
    public final Bundle a;

    eqy(Bundle bundle) {
        this.a = bundle;
    }

    public final Bundle a() {
        return new Bundle(this.a);
    }

    /* access modifiers changed from: 0000 */
    public final Object a(String str) {
        return this.a.get(str);
    }

    /* access modifiers changed from: 0000 */
    public final Long b(String str) {
        return Long.valueOf(this.a.getLong(str));
    }

    /* access modifiers changed from: 0000 */
    public final Double c(String str) {
        return Double.valueOf(this.a.getDouble(str));
    }

    /* access modifiers changed from: 0000 */
    public final String d(String str) {
        return this.a.getString(str);
    }

    public final Iterator<String> iterator() {
        return new eqz(this);
    }

    public final String toString() {
        return this.a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 2, a(), false);
        bxx.b(parcel, a2);
    }
}
