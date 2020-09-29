package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.common.io.BaseEncoding;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: ixe reason: default package */
public final class ixe implements Parcelable {
    public static final Creator<ixe> CREATOR = new Creator<ixe>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ixe[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            ixe ixe = new ixe((String) fay.a(parcel.readString()), (ixd) fay.a(jse.b(parcel, iwq.CREATOR)), (ArrayList) fay.a(parcel.createTypedArrayList(iwr.CREATOR)), parcel.readString(), parcel.readString(), 0);
            return ixe;
        }
    };
    public final ixd a;
    public final String b;
    private final List<iwr> c;
    private String d;
    private String e;

    public final int describeContents() {
        return 0;
    }

    /* synthetic */ ixe(String str, ixd ixd, ArrayList arrayList, String str2, String str3, byte b2) {
        this(str, ixd, arrayList, str2, str3);
    }

    protected ixe(ixd ixd) {
        UUID randomUUID = UUID.randomUUID();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        wrap.putLong(randomUUID.getMostSignificantBits());
        wrap.putLong(randomUUID.getLeastSignificantBits());
        this.b = BaseEncoding.d().a().a(wrap.array());
        this.a = (ixd) fay.a(ixd);
        this.c = new ArrayList(ixd.c());
        this.c.add(new iwr(true, "si", this.b));
    }

    private ixe(String str, ixd ixd, ArrayList<iwr> arrayList, String str2, String str3) {
        this.b = (String) fay.a(str);
        this.a = (ixd) fay.a(ixd);
        this.c = (List) fay.a(arrayList);
        this.d = str2;
        this.e = str3;
    }

    public final String a() {
        if (this.e == null) {
            String str = (String) fay.a(this.a.e().j());
            fau a2 = fau.a("&");
            ArrayList arrayList = new ArrayList(this.c.size());
            for (iwr iwr : this.c) {
                String str2 = iwr.c;
                String str3 = iwr.b;
                if (iwr.a && !fax.a(str3) && !fax.a(str2)) {
                    arrayList.add(String.format("%s=%s", new Object[]{Uri.encode(str3), Uri.encode(str2)}));
                }
            }
            if (!arrayList.isEmpty()) {
                str = String.format("%s?%s", new Object[]{str, a2.a((Iterable<?>) arrayList)});
            }
            this.e = str;
        }
        return this.e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        jse.a(parcel, (Parcelable) this.a, i);
        parcel.writeTypedList(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
