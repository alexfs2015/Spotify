package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

/* renamed from: fvs reason: default package */
public final class fvs extends BaseSavedState {
    public static final Creator<fvs> CREATOR = gy.a(new gz<fvs>() {
        public final /* synthetic */ Object a(Parcel parcel, ClassLoader classLoader) {
            return new fvs(parcel, 0);
        }

        public final /* bridge */ /* synthetic */ Object[] a(int i) {
            return new fvs[i];
        }
    });
    public float a;
    public boolean b;

    private fvs(Parcel parcel) {
        super(parcel);
        this.a = parcel.readFloat();
        this.b = juo.a(parcel);
    }

    /* synthetic */ fvs(Parcel parcel, byte b2) {
        this(parcel);
    }

    private fvs(Parcelable parcelable) {
        super(parcelable);
    }

    public static fvs a(Parcelable parcelable, int i, float f, boolean z) {
        fvs fvs = new fvs(parcelable);
        fvs.a = vge.a(0.0f, 1.0f, Math.abs(((float) i) / f));
        fvs.b = z;
        return fvs;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.a);
        juo.a(parcel, this.b);
    }
}
