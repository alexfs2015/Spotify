package defpackage;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;

@Deprecated
/* renamed from: gy reason: default package */
public final class gy {

    /* renamed from: gy$a */
    static class a<T> implements ClassLoaderCreator<T> {
        private final gz<T> a;

        a(gz<T> gzVar) {
            this.a = gzVar;
        }

        public final T createFromParcel(Parcel parcel) {
            return this.a.a(parcel, null);
        }

        public final T createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return this.a.a(parcel, classLoader);
        }

        public final T[] newArray(int i) {
            return this.a.a(i);
        }
    }

    @Deprecated
    public static <T> Creator<T> a(gz<T> gzVar) {
        return new a(gzVar);
    }
}
