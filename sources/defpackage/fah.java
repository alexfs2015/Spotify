package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;

/* renamed from: fah reason: default package */
public final class fah extends jt {
    public static final Creator<fah> CREATOR = new ClassLoaderCreator<fah>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new fah(parcel, classLoader, 0);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new fah[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new fah(parcel, null, 0);
        }
    };
    public final dv<String, Bundle> a;

    /* synthetic */ fah(Parcel parcel, ClassLoader classLoader, byte b) {
        this(parcel, classLoader);
    }

    public fah(Parcelable parcelable) {
        super(parcelable);
        this.a = new dv<>();
    }

    private fah(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.a = new dv<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.a.put(strArr[i], bundleArr[i]);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.a.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = (String) this.a.b(i2);
            bundleArr[i2] = (Bundle) this.a.c(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExtendableSavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" states=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
