package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: ulm reason: default package */
public final class ulm {

    /* renamed from: ulm$a */
    public static class a implements Parcelable {
        public static final Creator<a> CREATOR = new Creator<a>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new a[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new a(parcel);
            }
        };
        public static final a a;
        public final jst b;
        public final String c;
        private final String d;
        private final String e;

        public final int describeContents() {
            return 0;
        }

        static {
            String str = "";
            a = new a(null, null, str, str);
        }

        public a(jst jst, String str, String str2, String str3) {
            String str4 = "";
            if (jst == null) {
                jst = jst.a(str4);
            }
            this.b = jst;
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

        protected a(Parcel parcel) {
            this.b = jst.a(parcel.readString());
            this.d = parcel.readString();
            this.c = parcel.readString();
            this.e = parcel.readString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            jst jst = this.b;
            parcel.writeString(jst != null ? jst.h() : "");
            parcel.writeString(this.d);
            parcel.writeString(this.c);
            parcel.writeString(this.e);
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
    }
}
