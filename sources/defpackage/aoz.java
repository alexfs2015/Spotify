package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMedia.Type;

/* renamed from: aoz reason: default package */
public final class aoz extends ShareMedia {
    public static final Creator<aoz> CREATOR = new Creator<aoz>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new aoz[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new aoz(parcel);
        }
    };
    public final Bitmap b;
    public final Uri c;
    public final boolean d;
    final String e;

    /* renamed from: aoz$a */
    public static final class a extends com.facebook.share.model.ShareMedia.a<aoz, a> {
        public Bitmap b;
        public Uri c;
        boolean d;
        String e;

        public final aoz a() {
            return new aoz(this, 0);
        }

        public final a a(aoz aoz) {
            if (aoz == null) {
                return this;
            }
            a aVar = (a) super.a(aoz);
            aVar.b = aoz.b;
            aVar.c = aoz.c;
            aVar.d = aoz.d;
            aVar.e = aoz.e;
            return aVar;
        }

        /* access modifiers changed from: 0000 */
        public final a a(Parcel parcel) {
            return a((aoz) parcel.readParcelable(aoz.class.getClassLoader()));
        }
    }

    public final int describeContents() {
        return 0;
    }

    /* synthetic */ aoz(a aVar, byte b2) {
        this(aVar);
    }

    private aoz(a aVar) {
        super((com.facebook.share.model.ShareMedia.a) aVar);
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
    }

    aoz(Parcel parcel) {
        super(parcel);
        this.b = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.d = parcel.readByte() != 0;
        this.e = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeByte(this.d ? (byte) 1 : 0);
        parcel.writeString(this.e);
    }

    public final Type a() {
        return Type.PHOTO;
    }
}
