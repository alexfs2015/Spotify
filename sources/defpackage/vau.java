package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: vau reason: default package */
public final class vau implements Parcelable {
    public static final Creator<vau> CREATOR = new Creator<vau>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new vau(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new vau[i];
        }
    };
    public boolean a;
    public final int b;
    public int c;
    private a d;

    /* renamed from: vau$a */
    public interface a {
        void a(vau vau);
    }

    protected vau(Parcel parcel) {
        this.a = juo.a(parcel);
        this.b = parcel.readInt();
        this.c = parcel.readInt();
    }

    public vau(a aVar, int i) {
        this(aVar, i, false);
    }

    private vau(a aVar, int i, boolean z) {
        this.d = aVar;
        this.b = i;
        this.a = false;
    }

    private void b(Context context) {
        this.d.a(this);
    }

    public final void a(Context context) {
        this.a = !this.a;
        b(context);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        juo.a(parcel, this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }
}
