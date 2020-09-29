package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;

/* renamed from: fay reason: default package */
public final class fay extends jt {
    public static final Creator<fay> CREATOR = new ClassLoaderCreator<fay>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new fay(parcel, null, 0);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new fay(parcel, classLoader, 0);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new fay[i];
        }
    };
    public final dv<String, Bundle> a;

    private fay(Parcel parcel, ClassLoader classLoader) {
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

    /* synthetic */ fay(Parcel parcel, ClassLoader classLoader, byte b) {
        this(parcel, classLoader);
    }

    public fay(Parcelable parcelable) {
        super(parcelable);
        this.a = new dv<>();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExtendableSavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" states=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
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
}
