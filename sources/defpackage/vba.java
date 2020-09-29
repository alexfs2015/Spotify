package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.lang.reflect.Array;
import java.util.List;

/* renamed from: vba reason: default package */
public abstract class vba<T extends Parcelable> implements Creator<T> {
    private final Creator<? extends T> a;
    private final Class<T[]> b;

    protected vba(Creator<? extends T> creator) {
        this(creator, null);
    }

    private vba(Creator<? extends T> creator, Class<T[]> cls) {
        this.a = creator;
        this.b = null;
    }

    public static void a(List<T> list, Parcel parcel) {
        parcel.writeTypedList(list);
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return (Parcelable) this.a.createFromParcel(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        Class<T[]> cls = this.b;
        if (cls != null) {
            return (Parcelable[]) cls.cast(Array.newInstance(cls.getComponentType(), i));
        }
        throw new UnsupportedOperationException();
    }
}
