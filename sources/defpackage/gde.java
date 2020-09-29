package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.common.base.Optional;

/* renamed from: gde reason: default package */
final class gde extends gdd {
    public static final Creator<gde> CREATOR = new Creator<gde>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Optional optional;
            gde.c;
            int readInt = parcel.readInt();
            if (readInt == -1) {
                optional = Optional.e();
            } else {
                boolean z = true;
                if (readInt != 1) {
                    z = false;
                }
                optional = Optional.b(Boolean.valueOf(z));
            }
            return new gde(optional, parcel.readInt());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new gde[i];
        }
    };
    /* access modifiers changed from: private */
    public static final gdo c = new gdo();

    gde(Optional<Boolean> optional, int i) {
        super(optional, i);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Optional<Boolean> optional = this.a;
        int i2 = optional.b() ? ((Boolean) optional.c()).booleanValue() ? 1 : 0 : -1;
        parcel.writeInt(i2);
        parcel.writeInt(this.b);
    }
}
