package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMedia.Type;

/* renamed from: apn reason: default package */
public final class apn extends ShareMedia {
    public static final Creator<apn> CREATOR = new Creator<apn>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new apn(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new apn[i];
        }
    };
    public final Bitmap b;
    public final Uri c;
    public final boolean d;
    final String e;

    /* renamed from: apn$a */
    public static final class a extends com.facebook.share.model.ShareMedia.a<apn, a> {
        public Bitmap b;
        public Uri c;
        boolean d;
        String e;

        /* access modifiers changed from: 0000 */
        public final a a(Parcel parcel) {
            return a((apn) parcel.readParcelable(apn.class.getClassLoader()));
        }

        public final a a(apn apn) {
            if (apn == null) {
                return this;
            }
            a aVar = (a) super.a(apn);
            aVar.b = apn.b;
            aVar.c = apn.c;
            aVar.d = apn.d;
            aVar.e = apn.e;
            return aVar;
        }

        public final apn a() {
            return new apn(this, 0);
        }
    }

    apn(Parcel parcel) {
        super(parcel);
        this.b = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.d = parcel.readByte() != 0;
        this.e = parcel.readString();
    }

    private apn(a aVar) {
        super((com.facebook.share.model.ShareMedia.a) aVar);
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
    }

    /* synthetic */ apn(a aVar, byte b2) {
        this(aVar);
    }

    public final Type a() {
        return Type.PHOTO;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeByte(this.d ? (byte) 1 : 0);
        parcel.writeString(this.e);
    }
}
