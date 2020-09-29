package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.spotify.music.features.profile.model.LoadingState;
import com.spotify.music.features.profile.model.ProfileListItem;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: pre reason: default package */
final class pre extends prc {
    public static final Creator<pre> CREATOR = new Creator<pre>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            LoadingState loadingState = (LoadingState) Enum.valueOf(LoadingState.class, parcel.readString());
            pre.d;
            ArrayList a = Lists.a();
            parcel.readTypedList(a, ProfileListItem.g());
            return new pre(loadingState, ImmutableList.a((Collection<? extends E>) a));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new pre[i];
        }
    };
    /* access modifiers changed from: private */
    public static final b d = new b();

    pre(LoadingState loadingState, ImmutableList<ProfileListItem> immutableList) {
        super(loadingState, immutableList);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
        parcel.writeTypedList(this.b);
    }
}
