package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: quk reason: default package */
final class quk extends qtz {
    public static final Creator<quk> CREATOR = new Creator<quk>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new quk[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            quk.j;
            ArrayList a = Lists.a();
            parcel.readTypedList(a, MusicItem.A());
            quk quk = new quk(z, readInt, readInt2, ImmutableList.a((Collection<? extends E>) a), (MusicItem) parcel.readParcelable(qun.class.getClassLoader()), (qum) parcel.readParcelable(qun.class.getClassLoader()), (qun) parcel.readParcelable(qun.class.getClassLoader()));
            return quk;
        }
    };
    /* access modifiers changed from: private */
    public static final b j = new b();

    public final int describeContents() {
        return 0;
    }

    quk(boolean z, int i, int i2, ImmutableList<MusicItem> immutableList, MusicItem musicItem, qum qum, qun qun) {
        super(z, i, i2, immutableList, musicItem, qum, qun);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeTypedList(this.d);
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
        parcel.writeParcelable(this.g, i);
    }
}
