package com.spotify.playlist.endpoints.policy.rootlist;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_FolderRequestPolicy extends C$AutoValue_FolderRequestPolicy {
    public static final Creator<AutoValue_FolderRequestPolicy> CREATOR = new Creator<AutoValue_FolderRequestPolicy>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_FolderRequestPolicy[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_FolderRequestPolicy((PlaylistMetadataDecorationPolicy) parcel.readParcelable(FolderRequestPolicy.class.getClassLoader()), (FolderMetadataDecorationPolicy) parcel.readParcelable(FolderRequestPolicy.class.getClassLoader()), (RootlistRequestDecorationPolicy) parcel.readParcelable(FolderRequestPolicy.class.getClassLoader()));
        }
    };

    public final int describeContents() {
        return 0;
    }

    AutoValue_FolderRequestPolicy(PlaylistMetadataDecorationPolicy playlistMetadataDecorationPolicy, FolderMetadataDecorationPolicy folderMetadataDecorationPolicy, RootlistRequestDecorationPolicy rootlistRequestDecorationPolicy) {
        super(playlistMetadataDecorationPolicy, folderMetadataDecorationPolicy, rootlistRequestDecorationPolicy);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(playlist(), i);
        parcel.writeParcelable(folder(), i);
        parcel.writeParcelable(request(), i);
    }
}
