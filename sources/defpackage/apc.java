package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMedia.Type;

/* renamed from: apc reason: default package */
public final class apc extends ShareMedia {
    public static final Creator<apc> CREATOR = new Creator<apc>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new apc[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new apc(parcel);
        }
    };
    public final Uri b;

    /* renamed from: apc$a */
    public static final class a extends com.facebook.share.model.ShareMedia.a<apc, a> {
        Uri b;

        /* access modifiers changed from: private */
        public a a(apc apc) {
            if (apc == null) {
                return this;
            }
            a aVar = (a) super.a(apc);
            aVar.b = apc.b;
            return aVar;
        }

        /* access modifiers changed from: 0000 */
        public final a a(Parcel parcel) {
            return a((apc) parcel.readParcelable(apc.class.getClassLoader()));
        }
    }

    public final int describeContents() {
        return 0;
    }

    /* synthetic */ apc(a aVar, byte b2) {
        this(aVar);
    }

    private apc(a aVar) {
        super((com.facebook.share.model.ShareMedia.a) aVar);
        this.b = aVar.b;
    }

    apc(Parcel parcel) {
        super(parcel);
        this.b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.b, 0);
    }

    public final Type a() {
        return Type.VIDEO;
    }
}
