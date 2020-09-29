package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* renamed from: sd reason: default package */
public final class sd extends sc {
    private final SparseIntArray d;
    private final Parcel e;
    private final int f;
    private final int g;
    private final String h;
    private int i;
    private int j;
    private int k;

    public sd(Parcel parcel) {
        Parcel parcel2 = parcel;
        this(parcel2, parcel.dataPosition(), parcel.dataSize(), "", new dp(), new dp(), new dp());
    }

    private sd(Parcel parcel, int i2, int i3, String str, dp<String, Method> dpVar, dp<String, Method> dpVar2, dp<String, Class> dpVar3) {
        super(dpVar, dpVar2, dpVar3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.j = 0;
        this.k = -1;
        this.e = parcel;
        this.f = i2;
        this.g = i3;
        this.j = this.f;
        this.h = str;
    }

    public final void a() {
        int i2 = this.i;
        if (i2 >= 0) {
            int i3 = this.d.get(i2);
            int dataPosition = this.e.dataPosition();
            int i4 = dataPosition - i3;
            this.e.setDataPosition(i3);
            this.e.writeInt(i4);
            this.e.setDataPosition(dataPosition);
        }
    }

    public final void a(int i2) {
        this.e.writeInt(i2);
    }

    public final void a(Parcelable parcelable) {
        this.e.writeParcelable(parcelable, 0);
    }

    /* access modifiers changed from: protected */
    public final void a(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.e, 0);
    }

    public final void a(String str) {
        this.e.writeString(str);
    }

    public final void a(boolean z) {
        this.e.writeInt(z ? 1 : 0);
    }

    public final void a(byte[] bArr) {
        if (bArr != null) {
            this.e.writeInt(bArr.length);
            this.e.writeByteArray(bArr);
            return;
        }
        this.e.writeInt(-1);
    }

    /* access modifiers changed from: protected */
    public final sc b() {
        Parcel parcel = this.e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.j;
        if (i2 == this.f) {
            i2 = this.g;
        }
        int i3 = i2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.h);
        sb.append("  ");
        sd sdVar = new sd(parcel, dataPosition, i3, sb.toString(), this.a, this.b, this.c);
        return sdVar;
    }

    public final boolean b(int i2) {
        while (this.j < this.g) {
            int i3 = this.k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            this.e.setDataPosition(this.j);
            int readInt = this.e.readInt();
            this.k = this.e.readInt();
            this.j += readInt;
        }
        return this.k == i2;
    }

    public final int c() {
        return this.e.readInt();
    }

    public final void c(int i2) {
        a();
        this.i = i2;
        this.d.put(i2, this.e.dataPosition());
        a(0);
        a(i2);
    }

    public final String d() {
        return this.e.readString();
    }

    public final byte[] e() {
        int readInt = this.e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.e.readByteArray(bArr);
        return bArr;
    }

    /* access modifiers changed from: protected */
    public final CharSequence f() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.e);
    }

    public final <T extends Parcelable> T g() {
        return this.e.readParcelable(getClass().getClassLoader());
    }

    public final boolean h() {
        return this.e.readInt() != 0;
    }
}
