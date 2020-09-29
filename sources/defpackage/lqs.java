package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: lqs reason: default package */
public abstract class lqs implements Parcelable {
    public static final Creator<lqs> c = new Creator<lqs>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return (lqs[]) lqr.CREATOR.newArray(i);
        }

        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            return (lqs) lqr.CREATOR.createFromParcel(parcel);
        }
    };

    public abstract String a();

    public abstract List<lqv> b();

    public static lqs a(String str, List<lqv> list) {
        return new lqr(str, list);
    }
}
