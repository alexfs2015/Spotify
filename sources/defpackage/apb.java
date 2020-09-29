package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareMedia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: apb reason: default package */
public final class apb extends aon<apb, Object> {
    public static final Creator<apb> CREATOR = new Creator<apb>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new apb[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new apb(parcel);
        }
    };
    public final ShareMedia a;
    public final aoz b;
    public final List<String> c;
    public final String d;

    public final int describeContents() {
        return 0;
    }

    apb(Parcel parcel) {
        super(parcel);
        this.a = (ShareMedia) parcel.readParcelable(ShareMedia.class.getClassLoader());
        this.b = (aoz) parcel.readParcelable(aoz.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.c = arrayList.isEmpty() ? null : Collections.unmodifiableList(arrayList);
        this.d = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.a, 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeStringList(this.c);
        parcel.writeString(this.d);
    }
}
