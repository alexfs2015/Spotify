package defpackage;

import android.os.Parcel;

/* renamed from: jvo reason: default package */
final class jvo implements jvk<String> {
    jvo() {
    }

    public final /* synthetic */ void a(Object obj, Parcel parcel, int i) {
        String str = (String) obj;
        fay.a(str);
        parcel.writeString(str);
    }
}
