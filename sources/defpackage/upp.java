package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: upp reason: default package */
public final class upp implements Parcelable {
    public static final Creator<upp> CREATOR = new Creator<upp>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new upp[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new upp(parcel);
        }
    };
    public boolean a;
    public final int b;
    public int c;
    private a d;

    /* renamed from: upp$a */
    public interface a {
        void a(upp upp);
    }

    public final int describeContents() {
        return 0;
    }

    public upp(a aVar, int i) {
        this(aVar, i, false);
    }

    private upp(a aVar, int i, boolean z) {
        this.d = aVar;
        this.b = i;
        this.a = false;
    }

    public final void a(Context context) {
        this.a = !this.a;
        b(context);
    }

    private void b(Context context) {
        this.d.a(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        jse.a(parcel, this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }

    protected upp(Parcel parcel) {
        this.a = jse.a(parcel);
        this.b = parcel.readInt();
        this.c = parcel.readInt();
    }
}
