package defpackage;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: shj reason: default package */
public final class shj implements Parcelable {
    public static final Creator<shj> CREATOR = new Creator<shj>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new shj[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new shj(parcel);
        }
    };
    public final a a;
    private a b;

    /* renamed from: shj$a */
    public static class a implements Parcelable {
        public static final Creator<a> CREATOR = new Creator<a>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new a[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new a(parcel);
            }
        };
        public final Rect a;
        public final String b;
        public final String c;

        public final int describeContents() {
            return 0;
        }

        public a(Rect rect, String str, String str2) {
            this.a = (Rect) fay.a(rect);
            this.b = (String) fay.a(str);
            this.c = (String) fay.a(str2);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            this.a.writeToParcel(parcel, i);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
        }

        protected a(Parcel parcel) {
            this.a = (Rect) Rect.CREATOR.createFromParcel(parcel);
            this.b = parcel.readString();
            this.c = parcel.readString();
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
    }

    public final int describeContents() {
        return 0;
    }

    public shj(Rect rect, String str, String str2) {
        this.a = new a(rect, str, str2);
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
        jse.a(parcel, (Parcelable) this.b, i);
    }

    protected shj(Parcel parcel) {
        this.a = (a) a.CREATOR.createFromParcel(parcel);
        this.b = (a) jse.b(parcel, a.CREATOR);
    }
}
