package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareMedia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: apo reason: default package */
public final class apo extends apb<apo, a> {
    public static final Creator<apo> CREATOR = new Creator<apo>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new apo(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new apo[i];
        }
    };
    public final List<apn> a;

    /* renamed from: apo$a */
    public static class a extends defpackage.apb.a<apo, a> {
        final List<apn> f = new ArrayList();

        private a b(List<apn> list) {
            if (list != null) {
                for (apn apn : list) {
                    if (apn != null) {
                        this.f.add(new defpackage.apn.a().a(apn).a());
                    }
                }
            }
            return this;
        }

        public final a a(apo apo) {
            return apo == null ? this : ((a) super.a(apo)).b(apo.a);
        }

        public final a a(List<apn> list) {
            this.f.clear();
            b(list);
            return this;
        }
    }

    apo(Parcel parcel) {
        super(parcel);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(ShareMedia.class.getClassLoader());
        ArrayList<ShareMedia> arrayList = new ArrayList<>(readParcelableArray.length);
        for (Parcelable parcelable : readParcelableArray) {
            arrayList.add((ShareMedia) parcelable);
        }
        ArrayList arrayList2 = new ArrayList();
        for (ShareMedia shareMedia : arrayList) {
            if (shareMedia instanceof apn) {
                arrayList2.add((apn) shareMedia);
            }
        }
        this.a = Collections.unmodifiableList(arrayList2);
    }

    private apo(a aVar) {
        super((defpackage.apb.a) aVar);
        this.a = Collections.unmodifiableList(aVar.f);
    }

    public /* synthetic */ apo(a aVar, byte b) {
        this(aVar);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        List<apn> list = this.a;
        ShareMedia[] shareMediaArr = new ShareMedia[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            shareMediaArr[i2] = (ShareMedia) list.get(i2);
        }
        parcel.writeParcelableArray(shareMediaArr, i);
    }
}
