package defpackage;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: srq reason: default package */
public final class srq implements Parcelable {
    public static final Creator<srq> CREATOR = new Creator<srq>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new srq(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new srq[i];
        }
    };
    public final a a;
    private a b;

    /* renamed from: srq$a */
    public static class a implements Parcelable {
        public static final Creator<a> CREATOR = new Creator<a>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new a[i];
            }
        };
        public final Rect a;
        public final String b;
        public final String c;

        public a(Rect rect, String str, String str2) {
            this.a = (Rect) fbp.a(rect);
            this.b = (String) fbp.a(str);
            this.c = (String) fbp.a(str2);
        }

        protected a(Parcel parcel) {
            this.a = (Rect) Rect.CREATOR.createFromParcel(parcel);
            this.b = parcel.readString();
            this.c = parcel.readString();
        }

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnimatedViewInfo{mViewBounds=");
            sb.append(this.a);
            sb.append(", mButtonText='");
            sb.append(this.b);
            sb.append('\'');
            sb.append(", mButtonAccessibilityText='");
            sb.append(this.c);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            this.a.writeToParcel(parcel, i);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
        }
    }

    public srq(Rect rect, String str, String str2) {
        this.a = new a(rect, str, str2);
    }

    protected srq(Parcel parcel) {
        this.a = (a) a.CREATOR.createFromParcel(parcel);
        this.b = (a) juo.b(parcel, a.CREATOR);
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchLaunchTransitionParameters{mMainViewInfo=");
        sb.append(this.a);
        sb.append(", mSearchTitleAnimatedViewInfo=");
        sb.append(this.b);
        sb.append('}');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        juo.a(parcel, (Parcelable) this.b, i);
    }
}
