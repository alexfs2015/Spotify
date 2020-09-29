package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

/* renamed from: fuy reason: default package */
public final class fuy extends BaseSavedState {
    public static final Creator<fuy> CREATOR = gy.a(new gz<fuy>() {
        public final /* bridge */ /* synthetic */ Object[] a(int i) {
            return new fuy[i];
        }

        public final /* synthetic */ Object a(Parcel parcel, ClassLoader classLoader) {
            return new fuy(parcel, 0);
        }
    });
    public float a;
    public boolean b;

    /* synthetic */ fuy(Parcel parcel, byte b2) {
        this(parcel);
    }

    private fuy(Parcel parcel) {
        super(parcel);
        this.a = parcel.readFloat();
        this.b = jse.a(parcel);
    }

    private fuy(Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.a);
        jse.a(parcel, this.b);
    }

    public static fuy a(Parcelable parcelable, int i, float f, boolean z) {
        fuy fuy = new fuy(parcelable);
        fuy.a = uun.a(0.0f, 1.0f, Math.abs(((float) i) / f));
        fuy.b = z;
        return fuy;
    }
}
