package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* renamed from: bqe reason: default package */
public final class bqe implements Creator<bpe> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = SafeParcelReader.a(parcel);
        List list = null;
        int[] iArr = null;
        String str = null;
        IBinder iBinder = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    list = SafeParcelReader.n(parcel2, readInt);
                    break;
                case 3:
                    int a2 = SafeParcelReader.a(parcel2, readInt);
                    int dataPosition = parcel.dataPosition();
                    if (a2 != 0) {
                        int[] createIntArray = parcel.createIntArray();
                        parcel2.setDataPosition(dataPosition + a2);
                        iArr = createIntArray;
                        break;
                    } else {
                        iArr = null;
                        break;
                    }
                case 4:
                    j = SafeParcelReader.e(parcel2, readInt);
                    break;
                case 5:
                    str = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 6:
                    i = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 7:
                    i2 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 8:
                    i3 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 9:
                    i4 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 10:
                    i5 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 11:
                    i6 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 12:
                    i7 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 13:
                    i8 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 14:
                    i9 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 15:
                    i10 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 16:
                    i11 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 17:
                    i12 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 18:
                    i13 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 19:
                    i14 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 20:
                    i15 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 21:
                    i16 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 22:
                    i17 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 23:
                    i18 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 24:
                    i19 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 25:
                    i20 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 26:
                    i21 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 27:
                    i22 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 28:
                    i23 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 29:
                    i24 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 30:
                    i25 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 31:
                    i26 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 32:
                    i27 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 33:
                    iBinder = SafeParcelReader.i(parcel2, readInt);
                    break;
                default:
                    SafeParcelReader.b(parcel2, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel2, a);
        bpe bpe = new bpe(list, iArr, j, str, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, iBinder);
        return bpe;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new bpe[i];
    }
}
