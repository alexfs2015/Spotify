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

/* renamed from: izp reason: default package */
public final class izp implements Parcelable {
    public static final Creator<izp> CREATOR = new Creator<izp>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            izp izp = new izp((String) fbp.a(parcel.readString()), (izo) fbp.a(juo.b(parcel, izb.CREATOR)), (ArrayList) fbp.a(parcel.createTypedArrayList(izc.CREATOR)), parcel.readString(), parcel.readString(), 0);
            return izp;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new izp[i];
        }
    };
    public final izo a;
    public final String b;
    private final List<izc> c;
    private String d;
    private String e;

    protected izp(izo izo) {
        UUID randomUUID = UUID.randomUUID();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        wrap.putLong(randomUUID.getMostSignificantBits());
        wrap.putLong(randomUUID.getLeastSignificantBits());
        this.b = BaseEncoding.d().a().a(wrap.array());
        this.a = (izo) fbp.a(izo);
        this.c = new ArrayList(izo.c());
        this.c.add(new izc(true, "si", this.b));
    }

    private izp(String str, izo izo, ArrayList<izc> arrayList, String str2, String str3) {
        this.b = (String) fbp.a(str);
        this.a = (izo) fbp.a(izo);
        this.c = (List) fbp.a(arrayList);
        this.d = str2;
        this.e = str3;
    }

    /* synthetic */ izp(String str, izo izo, ArrayList arrayList, String str2, String str3, byte b2) {
        this(str, izo, arrayList, str2, str3);
    }

    public final String a() {
        if (this.e == null) {
            String str = (String) fbp.a(this.a.e().j());
            fbl a2 = fbl.a("&");
            ArrayList arrayList = new ArrayList(this.c.size());
            for (izc izc : this.c) {
                String str2 = izc.c;
                String str3 = izc.b;
                if (izc.a && !fbo.a(str3) && !fbo.a(str2)) {
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

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        juo.a(parcel, (Parcelable) this.a, i);
        parcel.writeTypedList(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
