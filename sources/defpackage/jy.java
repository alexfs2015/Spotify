package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle.State;
import java.util.ArrayList;

/* renamed from: jy reason: default package */
final class jy implements Parcelable {
    public static final Creator<jy> CREATOR = new Creator<jy>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new jy[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new jy(parcel);
        }
    };
    private int[] a;
    private ArrayList<String> b;
    private int[] c;
    private int[] d;
    private int e;
    private int f;
    private String g;
    private int h;
    private int i;
    private CharSequence j;
    private int k;
    private CharSequence l;
    private ArrayList<String> m;
    private ArrayList<String> n;
    private boolean o;

    public final int describeContents() {
        return 0;
    }

    public jy(jx jxVar) {
        int size = jxVar.c.size();
        this.a = new int[(size * 5)];
        if (jxVar.j) {
            this.b = new ArrayList<>(size);
            this.c = new int[size];
            this.d = new int[size];
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                a aVar = (a) jxVar.c.get(i2);
                int i4 = i3 + 1;
                this.a[i3] = aVar.a;
                this.b.add(aVar.b != null ? aVar.b.h : null);
                int i5 = i4 + 1;
                this.a[i4] = aVar.c;
                int i6 = i5 + 1;
                this.a[i5] = aVar.d;
                int i7 = i6 + 1;
                this.a[i6] = aVar.e;
                int i8 = i7 + 1;
                this.a[i7] = aVar.f;
                this.c[i2] = aVar.g.ordinal();
                this.d[i2] = aVar.h.ordinal();
                i2++;
                i3 = i8;
            }
            this.e = jxVar.h;
            this.f = jxVar.i;
            this.g = jxVar.k;
            this.h = jxVar.b;
            this.i = jxVar.l;
            this.j = jxVar.m;
            this.k = jxVar.n;
            this.l = jxVar.o;
            this.m = jxVar.p;
            this.n = jxVar.q;
            this.o = jxVar.r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public jy(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readString();
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        this.j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.k = parcel.readInt();
        this.l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.m = parcel.createStringArrayList();
        this.n = parcel.createStringArrayList();
        this.o = parcel.readInt() != 0;
    }

    public final jx a(kg kgVar) {
        jx jxVar = new jx(kgVar);
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.a.length) {
            a aVar = new a();
            int i4 = i2 + 1;
            aVar.a = this.a[i2];
            boolean z = kg.c;
            String str = (String) this.b.get(i3);
            if (str != null) {
                aVar.b = (Fragment) kgVar.e.get(str);
            } else {
                aVar.b = null;
            }
            aVar.g = State.values()[this.c[i3]];
            aVar.h = State.values()[this.d[i3]];
            int[] iArr = this.a;
            int i5 = i4 + 1;
            aVar.c = iArr[i4];
            int i6 = i5 + 1;
            aVar.d = iArr[i5];
            int i7 = i6 + 1;
            aVar.e = iArr[i6];
            int i8 = i7 + 1;
            aVar.f = iArr[i7];
            jxVar.d = aVar.c;
            jxVar.e = aVar.d;
            jxVar.f = aVar.e;
            jxVar.g = aVar.f;
            jxVar.b(aVar);
            i3++;
            i2 = i8;
        }
        jxVar.h = this.e;
        jxVar.i = this.f;
        jxVar.k = this.g;
        jxVar.b = this.h;
        jxVar.j = true;
        jxVar.l = this.i;
        jxVar.m = this.j;
        jxVar.n = this.k;
        jxVar.o = this.l;
        jxVar.p = this.m;
        jxVar.q = this.n;
        jxVar.r = this.o;
        jxVar.a(1);
        return jxVar;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList(this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        TextUtils.writeToParcel(this.j, parcel, 0);
        parcel.writeInt(this.k);
        TextUtils.writeToParcel(this.l, parcel, 0);
        parcel.writeStringList(this.m);
        parcel.writeStringList(this.n);
        parcel.writeInt(this.o ? 1 : 0);
    }
}
