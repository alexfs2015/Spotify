package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.common.collect.ImmutableMap;
import java.util.Map.Entry;

/* renamed from: rcx reason: default package */
final class rcx extends rcm {
    public static final Creator<rcx> CREATOR = new Creator<rcx>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Boolean bool;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            b bVar = (b) parcel.readParcelable(rdb.class.getClassLoader());
            rcx.g;
            ImmutableMap a = d.a(parcel);
            if (parcel.readInt() == 0) {
                bool = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                bool = null;
            }
            rcx rcx = new rcx(readInt, readInt2, bVar, a, bool, parcel.readInt() == 1, parcel.readInt() == 1);
            return rcx;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new rcx[i];
        }
    };
    /* access modifiers changed from: private */
    public static final d g = new d();

    rcx(int i, int i2, b bVar, ImmutableMap<String, String> immutableMap, Boolean bool, boolean z, boolean z2) {
        super(i, i2, bVar, immutableMap, bool, z, z2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeParcelable(c(), i);
        ImmutableMap d = d();
        parcel.writeInt(d.size());
        fdz R_ = d.entrySet().iterator();
        while (R_.hasNext()) {
            Entry entry = (Entry) R_.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        int i2 = 1;
        if (this.c != null) {
            parcel.writeInt(0);
            if (!this.c.booleanValue()) {
                i2 = 0;
            }
        }
        parcel.writeInt(i2);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
