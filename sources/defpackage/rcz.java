package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: rcz reason: default package */
final class rcz extends rco {
    public static final Creator<rcz> CREATOR = new Creator<rcz>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            rcz.j;
            ArrayList a = Lists.a();
            parcel.readTypedList(a, MusicItem.A());
            rcz rcz = new rcz(z, readInt, readInt2, ImmutableList.a((Collection<? extends E>) a), (MusicItem) parcel.readParcelable(rdc.class.getClassLoader()), (rdb) parcel.readParcelable(rdc.class.getClassLoader()), (rdc) parcel.readParcelable(rdc.class.getClassLoader()));
            return rcz;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new rcz[i];
        }
    };
    /* access modifiers changed from: private */
    public static final b j = new b();

    rcz(boolean z, int i, int i2, ImmutableList<MusicItem> immutableList, MusicItem musicItem, rdb rdb, rdc rdc) {
        super(z, i, i2, immutableList, musicItem, rdb, rdc);
    }

    public final int describeContents() {
        return 0;
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
