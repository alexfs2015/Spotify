package com.spotify.playlist.endpoints.policy.rootlist;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.playlist.endpoints.policy.rootlist.$AutoValue_FolderRequestPolicy reason: invalid class name */
abstract class C$AutoValue_FolderRequestPolicy extends FolderRequestPolicy {
    private final FolderMetadataDecorationPolicy folder;
    private final PlaylistMetadataDecorationPolicy playlist;
    private final RootlistRequestDecorationPolicy request;

    /* renamed from: com.spotify.playlist.endpoints.policy.rootlist.$AutoValue_FolderRequestPolicy$a */
    static final class a implements com.spotify.playlist.endpoints.policy.rootlist.FolderRequestPolicy.a {
        PlaylistMetadataDecorationPolicy a;
        private FolderMetadataDecorationPolicy b;
        private RootlistRequestDecorationPolicy c;

        a() {
        }

        private a(FolderRequestPolicy folderRequestPolicy) {
            this.a = folderRequestPolicy.playlist();
            this.b = folderRequestPolicy.folder();
            this.c = folderRequestPolicy.request();
        }

        /* synthetic */ a(FolderRequestPolicy folderRequestPolicy, byte b2) {
            this(folderRequestPolicy);
        }

        public final com.spotify.playlist.endpoints.policy.rootlist.FolderRequestPolicy.a a(FolderMetadataDecorationPolicy folderMetadataDecorationPolicy) {
            this.b = folderMetadataDecorationPolicy;
            return this;
        }

        public final com.spotify.playlist.endpoints.policy.rootlist.FolderRequestPolicy.a a(PlaylistMetadataDecorationPolicy playlistMetadataDecorationPolicy) {
            this.a = playlistMetadataDecorationPolicy;
            return this;
        }

        public final com.spotify.playlist.endpoints.policy.rootlist.FolderRequestPolicy.a a(RootlistRequestDecorationPolicy rootlistRequestDecorationPolicy) {
            this.c = rootlistRequestDecorationPolicy;
            return this;
        }

        public final FolderRequestPolicy a() {
            return new AutoValue_FolderRequestPolicy(this.a, this.b, this.c);
        }
    }

    C$AutoValue_FolderRequestPolicy(PlaylistMetadataDecorationPolicy playlistMetadataDecorationPolicy, FolderMetadataDecorationPolicy folderMetadataDecorationPolicy, RootlistRequestDecorationPolicy rootlistRequestDecorationPolicy) {
        this.playlist = playlistMetadataDecorationPolicy;
        this.folder = folderMetadataDecorationPolicy;
        this.request = rootlistRequestDecorationPolicy;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FolderRequestPolicy) {
            FolderRequestPolicy folderRequestPolicy = (FolderRequestPolicy) obj;
            PlaylistMetadataDecorationPolicy playlistMetadataDecorationPolicy = this.playlist;
            if (playlistMetadataDecorationPolicy != null ? playlistMetadataDecorationPolicy.equals(folderRequestPolicy.playlist()) : folderRequestPolicy.playlist() == null) {
                FolderMetadataDecorationPolicy folderMetadataDecorationPolicy = this.folder;
                if (folderMetadataDecorationPolicy != null ? folderMetadataDecorationPolicy.equals(folderRequestPolicy.folder()) : folderRequestPolicy.folder() == null) {
                    RootlistRequestDecorationPolicy rootlistRequestDecorationPolicy = this.request;
                    return rootlistRequestDecorationPolicy != null ? rootlistRequestDecorationPolicy.equals(folderRequestPolicy.request()) : folderRequestPolicy.request() == null;
                }
            }
        }
    }

    @JsonProperty("folder")
    public FolderMetadataDecorationPolicy folder() {
        return this.folder;
    }

    public int hashCode() {
        PlaylistMetadataDecorationPolicy playlistMetadataDecorationPolicy = this.playlist;
        int i = 0;
        int hashCode = ((playlistMetadataDecorationPolicy == null ? 0 : playlistMetadataDecorationPolicy.hashCode()) ^ 1000003) * 1000003;
        FolderMetadataDecorationPolicy folderMetadataDecorationPolicy = this.folder;
        int hashCode2 = (hashCode ^ (folderMetadataDecorationPolicy == null ? 0 : folderMetadataDecorationPolicy.hashCode())) * 1000003;
        RootlistRequestDecorationPolicy rootlistRequestDecorationPolicy = this.request;
        if (rootlistRequestDecorationPolicy != null) {
            i = rootlistRequestDecorationPolicy.hashCode();
        }
        return hashCode2 ^ i;
    }

    @JsonProperty("playlist")
    public PlaylistMetadataDecorationPolicy playlist() {
        return this.playlist;
    }

    @JsonProperty("request")
    public RootlistRequestDecorationPolicy request() {
        return this.request;
    }

    public com.spotify.playlist.endpoints.policy.rootlist.FolderRequestPolicy.a toBuilder() {
        return new a(this, 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FolderRequestPolicy{playlist=");
        sb.append(this.playlist);
        sb.append(", folder=");
        sb.append(this.folder);
        sb.append(", request=");
        sb.append(this.request);
        sb.append("}");
        return sb.toString();
    }
}
