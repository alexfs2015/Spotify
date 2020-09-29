package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: lur reason: default package */
public abstract class lur implements Parcelable {
    public static final Creator<lur> c = new Creator<lur>() {
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            return (lur) luq.CREATOR.createFromParcel(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return (lur[]) luq.CREATOR.newArray(i);
        }
    };

    public static lur a(String str, List<luu> list) {
        return new luq(str, list);
    }

    public abstract String a();

    public abstract List<luu> b();
}
