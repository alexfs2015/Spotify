package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.mobile.android.wrapped2019.stories.StoryParagraph;
import java.util.List;

/* renamed from: kis reason: default package */
final class kis extends kiq {
    public static final Creator<kis> CREATOR = new Creator<kis>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new kis((StoryParagraph) parcel.readParcelable(kiu.class.getClassLoader()), parcel.readArrayList(kiu.class.getClassLoader()));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new kis[i];
        }
    };

    kis(StoryParagraph storyParagraph, List<kiy> list) {
        super(storyParagraph, list);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeList(this.b);
    }
}
