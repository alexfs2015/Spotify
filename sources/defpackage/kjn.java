package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.mobile.android.wrapped2019.stories.StoryParagraph;

/* renamed from: kjn reason: default package */
final class kjn extends kjj {
    public static final Creator<kjn> CREATOR = new Creator<kjn>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new kjn((StoryParagraph) parcel.readParcelable(kjp.class.getClassLoader()));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new kjn[i];
        }
    };

    kjn(StoryParagraph storyParagraph) {
        super(storyParagraph);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
