package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.music.features.fullscreen.story.mobius.view.FullscreenStoryViewState;
import com.spotify.stories.v1.view.proto.Story;

/* renamed from: ngb reason: default package */
final class ngb extends nfz {
    public static final Creator<ngb> CREATOR = new Creator<ngb>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            FullscreenStoryViewState fullscreenStoryViewState = (FullscreenStoryViewState) Enum.valueOf(FullscreenStoryViewState.class, parcel.readString());
            int readInt = parcel.readInt();
            ngb.j;
            Optional a = c.a(parcel);
            ngb.k;
            ngb ngb = new ngb(fullscreenStoryViewState, readInt, a, (ImmutableList) parcel.readSerializable(), parcel.readLong(), parcel.readLong(), (Optional) parcel.readSerializable(), parcel.readInt() == 1);
            return ngb;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ngb[i];
        }
    };
    /* access modifiers changed from: private */
    public static final c j = new c();
    /* access modifiers changed from: private */
    public static final b k = new b();

    ngb(FullscreenStoryViewState fullscreenStoryViewState, int i, Optional<Story> optional, ImmutableList<Boolean> immutableList, long j2, long j3, Optional<Boolean> optional2, boolean z) {
        super(fullscreenStoryViewState, i, optional, immutableList, j2, j3, optional2, z);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
        parcel.writeInt(this.b);
        Optional<Story> optional = this.c;
        parcel.writeByteArray(optional.b() ? ((Story) optional.c()).b() : null);
        parcel.writeSerializable(this.d);
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
        parcel.writeSerializable(this.g);
        parcel.writeInt(this.h ? 1 : 0);
    }
}
