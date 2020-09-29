package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Iterator;

/* renamed from: eqh reason: default package */
public final class eqh extends bxf implements Iterable<String> {
    public static final Creator<eqh> CREATOR = new eqj();
    /* access modifiers changed from: 0000 */
    public final Bundle a;

    eqh(Bundle bundle) {
        this.a = bundle;
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

    public final String toString() {
        return this.a.toString();
    }

    public final Bundle a() {
        return new Bundle(this.a);
    }

    public final Iterator<String> iterator() {
        return new eqi(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 2, a(), false);
        bxg.b(parcel, a2);
    }
}
