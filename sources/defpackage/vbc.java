package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.lang.reflect.Array;
import java.util.List;

/* renamed from: vbc reason: default package */
public class vbc<T extends Parcelable> implements Creator<T> {
    private final gch<Creator<? extends T>> a;
    private final Class<T[]> b;

    protected vbc(a<Creator<? extends T>> aVar) {
        this(aVar, null);
    }

    private vbc(a<Creator<? extends T>> aVar, Class<T[]> cls) {
        this.a = gch.a(aVar);
        this.b = null;
    }

    public static void a(List<T> list, Parcel parcel) {
        parcel.writeTypedList(list);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return (Parcelable) ((Creator) this.a.a()).createFromParcel(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        Class<T[]> cls = this.b;
        if (cls != null) {
            return (Parcelable[]) cls.cast(Array.newInstance(cls.getComponentType(), i));
        }
        throw new UnsupportedOperationException();
    }
}
