package defpackage;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: vbf reason: default package */
public final class vbf {
    public static List<String> a(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        return Collections.unmodifiableList(arrayList);
    }
}
