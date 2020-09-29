package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: vbb reason: default package */
public class vbb<T extends Parcelable> {
    private final Creator<T> a;

    protected vbb(Creator<T> creator) {
        this.a = creator;
    }

    public final List<T> a(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readTypedList(arrayList, this.a);
        return arrayList;
    }
}
