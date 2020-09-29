package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: upw reason: default package */
public class upw<T extends Parcelable> {
    private final Creator<T> a;

    protected upw(Creator<T> creator) {
        this.a = creator;
    }

    public final List<T> a(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readTypedList(arrayList, this.a);
        return arrayList;
    }
}
