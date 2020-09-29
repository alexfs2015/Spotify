package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle.State;

/* renamed from: kk reason: default package */
final class kk implements Parcelable {
    public static final Creator<kk> CREATOR = new Creator<kk>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new kk[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new kk(parcel);
        }
    };
    final String a;
    Bundle b;
    Fragment c;
    private String d;
    private boolean e;
    private int f;
    private int g;
    private String h;
    private boolean i;
    private boolean j;
    private boolean k;
    private Bundle l;
    private boolean m;
    private int n;

    public final int describeContents() {
        return 0;
    }

    kk(Fragment fragment) {
        this.d = fragment.getClass().getName();
        this.a = fragment.h;
        this.e = fragment.o;
        this.f = fragment.x;
        this.g = fragment.y;
        this.h = fragment.z;
        this.i = fragment.C;
        this.j = fragment.n;
        this.k = fragment.B;
        this.l = fragment.i;
        this.m = fragment.A;
        this.n = fragment.P.ordinal();
    }

    kk(Parcel parcel) {
        this.d = parcel.readString();
        this.a = parcel.readString();
        boolean z = true;
        this.e = parcel.readInt() != 0;
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readString();
        this.i = parcel.readInt() != 0;
        this.j = parcel.readInt() != 0;
        this.k = parcel.readInt() != 0;
        this.l = parcel.readBundle();
        if (parcel.readInt() == 0) {
            z = false;
        }
        this.m = z;
        this.b = parcel.readBundle();
        this.n = parcel.readInt();
    }

    public final Fragment a(ClassLoader classLoader, kd kdVar) {
        if (this.c == null) {
            Bundle bundle = this.l;
            if (bundle != null) {
                bundle.setClassLoader(classLoader);
            }
            this.c = kdVar.c(classLoader, this.d);
            this.c.g(this.l);
            Bundle bundle2 = this.b;
            if (bundle2 != null) {
                bundle2.setClassLoader(classLoader);
                this.c.e = this.b;
            } else {
                this.c.e = new Bundle();
            }
            Fragment fragment = this.c;
            fragment.h = this.a;
            fragment.o = this.e;
            fragment.q = true;
            fragment.x = this.f;
            fragment.y = this.g;
            fragment.z = this.h;
            fragment.C = this.i;
            fragment.n = this.j;
            fragment.B = this.k;
            fragment.A = this.m;
            fragment.P = State.values()[this.n];
            boolean z = kg.c;
        }
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.d);
        sb.append(" (");
        sb.append(this.a);
        sb.append(")}:");
        if (this.e) {
            sb.append(" fromLayout");
        }
        if (this.g != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.g));
        }
        String str = this.h;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.h);
        }
        if (this.i) {
            sb.append(" retainInstance");
        }
        if (this.j) {
            sb.append(" removing");
        }
        if (this.k) {
            sb.append(" detached");
        }
        if (this.m) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.d);
        parcel.writeString(this.a);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeBundle(this.l);
        parcel.writeInt(this.m ? 1 : 0);
        parcel.writeBundle(this.b);
        parcel.writeInt(this.n);
    }
}
