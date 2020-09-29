package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.common.collect.ImmutableMap;
import java.util.Map.Entry;

/* renamed from: rcy reason: default package */
final class rcy extends rcn {
    public static final Creator<rcy> CREATOR = new Creator<rcy>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            String readString = parcel.readString();
            way way = (way) parcel.readParcelable(b.class.getClassLoader());
            rcy.e;
            return new rcy(z, readString, way, c.a(parcel));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new rcy[i];
        }
    };
    /* access modifiers changed from: private */
    public static final c e = new c();

    rcy(boolean z, String str, way way, ImmutableMap<String, Boolean> immutableMap) {
        super(z, str, way, immutableMap);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeString(b());
        parcel.writeParcelable(this.b, i);
        ImmutableMap<String, Boolean> immutableMap = this.c;
        parcel.writeInt(immutableMap.size());
        fdz R_ = immutableMap.entrySet().iterator();
        while (R_.hasNext()) {
            Entry entry = (Entry) R_.next();
            parcel.writeString((String) entry.getKey());
            juo.a(parcel, ((Boolean) entry.getValue()).booleanValue());
        }
    }
}
