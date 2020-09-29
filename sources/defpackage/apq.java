package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMedia.Type;

/* renamed from: apq reason: default package */
public final class apq extends ShareMedia {
    public static final Creator<apq> CREATOR = new Creator<apq>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new apq(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new apq[i];
        }
    };
    public final Uri b;

    /* renamed from: apq$a */
    public static final class a extends com.facebook.share.model.ShareMedia.a<apq, a> {
        Uri b;

        /* access modifiers changed from: private */
        public a a(apq apq) {
            if (apq == null) {
                return this;
            }
            a aVar = (a) super.a(apq);
            aVar.b = apq.b;
            return aVar;
        }

        /* access modifiers changed from: 0000 */
        public final a a(Parcel parcel) {
            return a((apq) parcel.readParcelable(apq.class.getClassLoader()));
        }
    }

    apq(Parcel parcel) {
        super(parcel);
        this.b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }

    private apq(a aVar) {
        super((com.facebook.share.model.ShareMedia.a) aVar);
        this.b = aVar.b;
    }

    /* synthetic */ apq(a aVar, byte b2) {
        this(aVar);
    }

    public final Type a() {
        return Type.VIDEO;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.b, 0);
    }
}
