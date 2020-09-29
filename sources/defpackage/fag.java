package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.SparseArray;

/* renamed from: fag reason: default package */
public final class fag extends SparseArray<Parcelable> implements Parcelable {
    public static final Creator<fag> CREATOR = new ClassLoaderCreator<fag>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new fag(parcel, null);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new fag(parcel, classLoader);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new fag[i];
        }
    };

    public fag() {
    }

    public fag(Parcel parcel, ClassLoader classLoader) {
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        for (int i = 0; i < readInt; i++) {
            put(iArr[i], readParcelableArray[i]);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = keyAt(i2);
            parcelableArr[i2] = (Parcelable) valueAt(i2);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
