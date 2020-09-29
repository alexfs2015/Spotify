package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View;

/* renamed from: gwr reason: default package */
public interface gwr {

    /* renamed from: gwr$a */
    public static class a implements Parcelable {
        public static final Creator<a> CREATOR = new Creator<a>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new a(parcel.readParcelable(a.class.getClassLoader()), parcel.readParcelable(a.class.getClassLoader()));
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new a[i];
            }
        };
        public final Parcelable a;
        public final Parcelable b;

        public a(Parcelable parcelable, Parcelable parcelable2) {
            this.a = parcelable;
            this.b = parcelable2;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.a, i);
            parcel.writeParcelable(this.b, i);
        }
    }

    void a(Parcelable parcelable);

    void a(androidx.recyclerview.widget.RecyclerView.a<?> aVar);

    void a(gxb gxb);

    void a(hcs hcs);

    void a(int... iArr);

    boolean a();

    Parcelable b();

    void b(androidx.recyclerview.widget.RecyclerView.a<?> aVar);

    void b(int... iArr);

    View e();
}
