package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.lang.reflect.Array;
import java.util.List;

/* renamed from: upx reason: default package */
public class upx<T extends Parcelable> implements Creator<T> {
    private final gbj<Creator<? extends T>> a;
    private final Class<T[]> b;

    protected upx(a<Creator<? extends T>> aVar) {
        this(aVar, null);
    }

    private upx(a<Creator<? extends T>> aVar, Class<T[]> cls) {
        this.a = gbj.a(aVar);
        this.b = null;
    }

    public static void a(List<T> list, Parcel parcel) {
        parcel.writeTypedList(list);
    }

    public /* synthetic */ Object[] newArray(int i) {
        Class<T[]> cls = this.b;
        if (cls != null) {
            return (Parcelable[]) cls.cast(Array.newInstance(cls.getComponentType(), i));
        }
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return (Parcelable) ((Creator) this.a.a()).createFromParcel(parcel);
    }
}
