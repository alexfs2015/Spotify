package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import defpackage.aoy;
import defpackage.aoy.a;

/* renamed from: aoy reason: default package */
public abstract class aoy<P extends aoy, E extends a> implements aou {
    public final Bundle a;

    /* renamed from: aoy$a */
    public static abstract class a<P extends aoy, E extends a> {
        /* access modifiers changed from: 0000 */
        public Bundle a = new Bundle();

        public E a(P p) {
            if (p != null) {
                this.a.putAll((Bundle) p.a.clone());
            }
            return this;
        }
    }

    public int describeContents() {
        return 0;
    }

    protected aoy(a<P, E> aVar) {
        this.a = (Bundle) aVar.a.clone();
    }

    aoy(Parcel parcel) {
        this.a = parcel.readBundle(a.class.getClassLoader());
    }

    public final Object a(String str) {
        return this.a.get(str);
    }

    public final String b(String str) {
        return this.a.getString(str);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }
}
