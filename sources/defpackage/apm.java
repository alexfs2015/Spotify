package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import defpackage.apm;
import defpackage.apm.a;

/* renamed from: apm reason: default package */
public abstract class apm<P extends apm, E extends a> implements api {
    public final Bundle a;

    /* renamed from: apm$a */
    public static abstract class a<P extends apm, E extends a> {
        /* access modifiers changed from: 0000 */
        public Bundle a = new Bundle();

        public E a(P p) {
            if (p != null) {
                this.a.putAll((Bundle) p.a.clone());
            }
            return this;
        }
    }

    apm(Parcel parcel) {
        this.a = parcel.readBundle(a.class.getClassLoader());
    }

    protected apm(a<P, E> aVar) {
        this.a = (Bundle) aVar.a.clone();
    }

    public final Object a(String str) {
        return this.a.get(str);
    }

    public final String b(String str) {
        return this.a.getString(str);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }
}
