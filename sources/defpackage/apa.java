package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareMedia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: apa reason: default package */
public final class apa extends aon<apa, a> {
    public static final Creator<apa> CREATOR = new Creator<apa>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new apa[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new apa(parcel);
        }
    };
    public final List<aoz> a;

    /* renamed from: apa$a */
    public static class a extends defpackage.aon.a<apa, a> {
        final List<aoz> f = new ArrayList();

        private a b(List<aoz> list) {
            if (list != null) {
                for (aoz aoz : list) {
                    if (aoz != null) {
                        this.f.add(new defpackage.aoz.a().a(aoz).a());
                    }
                }
            }
            return this;
        }

        public final a a(apa apa) {
            if (apa == null) {
                return this;
            }
            return ((a) super.a(apa)).b(apa.a);
        }

        public final a a(List<aoz> list) {
            this.f.clear();
            b(list);
            return this;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ apa(a aVar, byte b) {
        this(aVar);
    }

    private apa(a aVar) {
        super((defpackage.aon.a) aVar);
        this.a = Collections.unmodifiableList(aVar.f);
    }

    apa(Parcel parcel) {
        super(parcel);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(ShareMedia.class.getClassLoader());
        ArrayList<ShareMedia> arrayList = new ArrayList<>(readParcelableArray.length);
        for (Parcelable parcelable : readParcelableArray) {
            arrayList.add((ShareMedia) parcelable);
        }
        ArrayList arrayList2 = new ArrayList();
        for (ShareMedia shareMedia : arrayList) {
            if (shareMedia instanceof aoz) {
                arrayList2.add((aoz) shareMedia);
            }
        }
        this.a = Collections.unmodifiableList(arrayList2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        List<aoz> list = this.a;
        ShareMedia[] shareMediaArr = new ShareMedia[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            shareMediaArr[i2] = (ShareMedia) list.get(i2);
        }
        parcel.writeParcelableArray(shareMediaArr, i);
    }
}
