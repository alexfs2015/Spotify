package defpackage;

import android.os.Parcel;

/* renamed from: jxw reason: default package */
final class jxw implements jxs<String> {
    jxw() {
    }

    public final /* synthetic */ void a(Object obj, Parcel parcel, int i) {
        String str = (String) obj;
        fbp.a(str);
        parcel.writeString(str);
    }
}
