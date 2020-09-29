package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View;

/* renamed from: gur reason: default package */
public interface gur {

    /* renamed from: gur$a */
    public static class a implements Parcelable {
        public static final Creator<a> CREATOR = new Creator<a>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new a[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new a(parcel.readParcelable(a.class.getClassLoader()), parcel.readParcelable(a.class.getClassLoader()));
            }
        };
        public final Parcelable a;
        public final Parcelable b;

        public int describeContents() {
            return 0;
        }

        public a(Parcelable parcelable, Parcelable parcelable2) {
            this.a = parcelable;
            this.b = parcelable2;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.a, i);
            parcel.writeParcelable(this.b, i);
        }
    }

    void a(Parcelable parcelable);

    void a(androidx.recyclerview.widget.RecyclerView.a<?> aVar);

    void a(gvb gvb);

    void a(gzz gzz);

    void a(int... iArr);

    boolean a();

    Parcelable b();

    void b(androidx.recyclerview.widget.RecyclerView.a<?> aVar);

    void b(int... iArr);

    View e();
}
