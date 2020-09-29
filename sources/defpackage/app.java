package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareMedia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: app reason: default package */
public final class app extends apb<app, Object> {
    public static final Creator<app> CREATOR = new Creator<app>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new app(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new app[i];
        }
    };
    public final ShareMedia a;
    public final apn b;
    public final List<String> c;
    public final String d;

    app(Parcel parcel) {
        super(parcel);
        this.a = (ShareMedia) parcel.readParcelable(ShareMedia.class.getClassLoader());
        this.b = (apn) parcel.readParcelable(apn.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.c = arrayList.isEmpty() ? null : Collections.unmodifiableList(arrayList);
        this.d = parcel.readString();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.a, 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeStringList(this.c);
        parcel.writeString(this.d);
    }
}
