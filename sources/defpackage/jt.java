package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;

/* renamed from: jt reason: default package */
public abstract class jt implements Parcelable {
    public static final Creator<jt> CREATOR = new ClassLoaderCreator<jt>() {
        private static jt a(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return jt.c;
            }
            throw new IllegalStateException("superState must be null");
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return a(parcel, null);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return a(parcel, classLoader);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new jt[i];
        }
    };
    public static final jt c = new jt() {
    };
    public final Parcelable d;

    private jt() {
        this.d = null;
    }

    /* synthetic */ jt(byte b) {
        this();
    }

    protected jt(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        if (readParcelable == null) {
            readParcelable = c;
        }
        this.d = readParcelable;
    }

    protected jt(Parcelable parcelable) {
        if (parcelable != null) {
            if (parcelable == c) {
                parcelable = null;
            }
            this.d = parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.d, i);
    }
}
