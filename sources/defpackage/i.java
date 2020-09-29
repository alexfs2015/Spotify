package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;

/* renamed from: i reason: default package */
public class i implements Parcelable {
    public static final Creator<i> CREATOR = new Creator<i>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new i[i];
        }
    };
    final Handler a = null;
    private boolean b = false;
    private h c;

    /* renamed from: i$a */
    class a extends defpackage.h.a {
        a() {
        }

        public final void a(int i, Bundle bundle) {
            i.this.a(i, bundle);
        }
    }

    i(Parcel parcel) {
        this.c = defpackage.h.a.a(parcel.readStrongBinder());
    }

    /* access modifiers changed from: protected */
    public void a(int i, Bundle bundle) {
    }

    public final void b(int i, Bundle bundle) {
        h hVar = this.c;
        if (hVar != null) {
            try {
                hVar.a(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.c == null) {
                this.c = new a();
            }
            parcel.writeStrongBinder(this.c.asBinder());
        }
    }
}
