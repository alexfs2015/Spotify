package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: uwq reason: default package */
public final class uwq {

    /* renamed from: uwq$a */
    public static class a implements Parcelable {
        public static final Creator<a> CREATOR = new Creator<a>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new a[i];
            }
        };
        public static final a a;
        public final jva b;
        public final String c;
        private final String d;
        private final String e;

        static {
            String str = "";
            a = new a(null, null, str, str);
        }

        protected a(Parcel parcel) {
            this.b = jva.a(parcel.readString());
            this.d = parcel.readString();
            this.c = parcel.readString();
            this.e = parcel.readString();
        }

        public a(jva jva, String str, String str2, String str3) {
            String str4 = "";
            if (jva == null) {
                jva = jva.a(str4);
            }
            this.b = jva;
            this.d = str;
            if (str2 == null) {
                str2 = str4;
            }
            this.c = str2;
            if (str3 == null) {
                str3 = str4;
            }
            this.e = str3;
        }

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ResolvedNLUResult{mSpotifyLink=");
            sb.append(this.b);
            sb.append(", mImageUrl='");
            sb.append(this.d);
            sb.append('\'');
            sb.append(", mTitle='");
            sb.append(this.c);
            sb.append('\'');
            sb.append(", mDescription='");
            sb.append(this.e);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            jva jva = this.b;
            parcel.writeString(jva != null ? jva.h() : "");
            parcel.writeString(this.d);
            parcel.writeString(this.c);
            parcel.writeString(this.e);
        }
    }
}
