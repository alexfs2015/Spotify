package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.mobile.android.wrapped2019.stories.StoryParagraph;

/* renamed from: kha reason: default package */
final class kha extends kgw {
    public static final Creator<kha> CREATOR = new Creator<kha>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new kha[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new kha((StoryParagraph) parcel.readParcelable(khc.class.getClassLoader()));
        }
    };

    public final int describeContents() {
        return 0;
    }

    kha(StoryParagraph storyParagraph) {
        super(storyParagraph);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
