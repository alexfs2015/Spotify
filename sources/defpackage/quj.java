package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.common.collect.ImmutableMap;
import java.util.Map.Entry;

/* renamed from: quj reason: default package */
final class quj extends qty {
    public static final Creator<quj> CREATOR = new Creator<quj>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new quj[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            String readString = parcel.readString();
            vns vns = (vns) parcel.readParcelable(b.class.getClassLoader());
            quj.e;
            return new quj(z, readString, vns, c.a(parcel));
        }
    };
    /* access modifiers changed from: private */
    public static final c e = new c();

    public final int describeContents() {
        return 0;
    }

    quj(boolean z, String str, vns vns, ImmutableMap<String, Boolean> immutableMap) {
        super(z, str, vns, immutableMap);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeString(b());
        parcel.writeParcelable(this.b, i);
        ImmutableMap<String, Boolean> immutableMap = this.c;
        parcel.writeInt(immutableMap.size());
        fdh R_ = immutableMap.entrySet().iterator();
        while (R_.hasNext()) {
            Entry entry = (Entry) R_.next();
            parcel.writeString((String) entry.getKey());
            jse.a(parcel, ((Boolean) entry.getValue()).booleanValue());
        }
    }
}
