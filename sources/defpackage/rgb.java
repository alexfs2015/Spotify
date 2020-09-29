package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.b;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.c;

/* renamed from: rgb reason: default package */
public final class rgb extends rfx {
    public static final Creator<rgb> CREATOR = new Creator<rgb>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Boolean bool;
            vli vli;
            b bVar;
            Parcel parcel2 = parcel;
            long readLong = parcel.readLong();
            Type type = (Type) Enum.valueOf(Type.class, parcel.readString());
            boolean z = parcel.readInt() == 1;
            boolean z2 = parcel.readInt() == 1;
            boolean z3 = parcel.readInt() == 1;
            boolean z4 = parcel.readInt() == 1;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            b bVar2 = null;
            if (parcel.readInt() == 0) {
                bool = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                bool = null;
            }
            if (parcel.readInt() == 0) {
                rgb.q;
                vli = vlk.a(parcel);
            } else {
                vli = null;
            }
            if (parcel.readInt() == 0) {
                rgb.r;
                String readString6 = parcel.readString();
                if (fbn.a(readString6, rge.class.getCanonicalName())) {
                    bVar = (b) juo.b(parcel2, rge.CREATOR);
                } else if (fbn.a(readString6, rgd.class.getCanonicalName())) {
                    bVar = (b) juo.b(parcel2, rgd.CREATOR);
                } else if (fbn.a(readString6, rgc.class.getCanonicalName())) {
                    bVar = (b) juo.b(parcel2, rgc.CREATOR);
                } else {
                    throw new IllegalStateException("Bad MusicItem extras");
                }
                bVar2 = bVar;
            }
            rgb rgb = new rgb(readLong, type, z, z2, z3, z4, readString, readString2, readString3, readString4, readString5, readInt, readInt2, bool, vli, bVar2);
            return rgb;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new rgb[i];
        }
    };
    /* access modifiers changed from: private */
    public static final vlk q = new vlk();
    /* access modifiers changed from: private */
    public static final c r = new c();

    public rgb(long j, Type type, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, String str3, String str4, String str5, int i, int i2, Boolean bool, vli vli, b bVar) {
        super(j, type, z, z2, z3, z4, str, str2, str3, str4, str5, i, i2, bool, vli, bVar);
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeToParcel(android.os.Parcel r3, int r4) {
        /*
            r2 = this;
            long r0 = r2.a
            r3.writeLong(r0)
            com.spotify.music.features.yourlibrary.musicpages.item.MusicItem$Type r4 = r2.b
            java.lang.String r4 = r4.name()
            r3.writeString(r4)
            boolean r4 = r2.c
            r3.writeInt(r4)
            boolean r4 = r2.d
            r3.writeInt(r4)
            boolean r4 = r2.e
            r3.writeInt(r4)
            boolean r4 = r2.f
            r3.writeInt(r4)
            java.lang.String r4 = r2.g
            r3.writeString(r4)
            java.lang.String r4 = r2.h
            r3.writeString(r4)
            java.lang.String r4 = r2.j()
            r3.writeString(r4)
            java.lang.String r4 = r2.i
            r3.writeString(r4)
            java.lang.String r4 = r2.j
            r3.writeString(r4)
            int r4 = r2.k
            r3.writeInt(r4)
            int r4 = r2.l
            r3.writeInt(r4)
            java.lang.Boolean r4 = r2.m
            r0 = 1
            r1 = 0
            if (r4 != 0) goto L_0x004f
        L_0x004d:
            r4 = 1
            goto L_0x005c
        L_0x004f:
            r3.writeInt(r1)
            java.lang.Boolean r4 = r2.m
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x005b
            goto L_0x004d
        L_0x005b:
            r4 = 0
        L_0x005c:
            r3.writeInt(r4)
            vli r4 = r2.n
            if (r4 != 0) goto L_0x0067
            r3.writeInt(r0)
            goto L_0x006f
        L_0x0067:
            r3.writeInt(r1)
            vli r4 = r2.n
            defpackage.vlk.a(r4, r3)
        L_0x006f:
            com.spotify.music.features.yourlibrary.musicpages.item.MusicItem$b r4 = r2.o
            if (r4 != 0) goto L_0x0077
            r3.writeInt(r0)
            return
        L_0x0077:
            r3.writeInt(r1)
            com.spotify.music.features.yourlibrary.musicpages.item.MusicItem$b r4 = r2.o
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getCanonicalName()
            r3.writeString(r0)
            defpackage.juo.a(r3, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rgb.writeToParcel(android.os.Parcel, int):void");
    }
}
