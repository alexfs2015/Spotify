package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: lae reason: default package */
final class lae extends lad {
    public static final Creator<lae> CREATOR = new Creator<lae>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Boolean bool;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            boolean z = false;
            boolean z2 = parcel.readInt() == 1;
            boolean z3 = parcel.readInt() == 1;
            boolean z4 = parcel.readInt() == 1;
            if (parcel.readInt() == 0) {
                if (parcel.readInt() == 1) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
            } else {
                bool = null;
            }
            lae lae = new lae(readString, readString2, readString3, z2, z3, z4, bool, parcel.readString(), parcel.readString(), parcel.readArrayList(a.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null);
            return lae;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new lae[i];
        }
    };

    lae(String str, String str2, String str3, boolean z, boolean z2, boolean z3, Boolean bool, String str4, String str5, List<String> list, String str6, String str7) {
        super(str, str2, str3, z, z2, z3, bool, str4, str5, list, str6, str7);
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeToParcel(android.os.Parcel r3, int r4) {
        /*
            r2 = this;
            java.lang.String r4 = r2.a
            r3.writeString(r4)
            java.lang.String r4 = r2.b
            r3.writeString(r4)
            java.lang.String r4 = r2.c
            r3.writeString(r4)
            boolean r4 = r2.d
            r3.writeInt(r4)
            boolean r4 = r2.e
            r3.writeInt(r4)
            boolean r4 = r2.f
            r3.writeInt(r4)
            java.lang.Boolean r4 = r2.g
            r0 = 1
            r1 = 0
            if (r4 != 0) goto L_0x0026
        L_0x0024:
            r4 = 1
            goto L_0x0033
        L_0x0026:
            r3.writeInt(r1)
            java.lang.Boolean r4 = r2.g
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0032
            goto L_0x0024
        L_0x0032:
            r4 = 0
        L_0x0033:
            r3.writeInt(r4)
            java.lang.String r4 = r2.h
            r3.writeString(r4)
            java.lang.String r4 = r2.i
            r3.writeString(r4)
            java.util.List<java.lang.String> r4 = r2.j
            r3.writeList(r4)
            java.lang.String r4 = r2.k
            r3.writeString(r4)
            java.lang.String r4 = r2.l
            if (r4 != 0) goto L_0x0052
            r3.writeInt(r0)
            return
        L_0x0052:
            r3.writeInt(r1)
            java.lang.String r4 = r2.l
            r3.writeString(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lae.writeToParcel(android.os.Parcel, int):void");
    }
}
