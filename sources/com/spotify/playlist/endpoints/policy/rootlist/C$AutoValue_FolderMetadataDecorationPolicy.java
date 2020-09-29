package com.spotify.playlist.endpoints.policy.rootlist;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.playlist.endpoints.policy.rootlist.$AutoValue_FolderMetadataDecorationPolicy reason: invalid class name */
abstract class C$AutoValue_FolderMetadataDecorationPolicy extends FolderMetadataDecorationPolicy {
    private final Boolean addTime;
    private final Boolean folders;
    private final Boolean id;
    private final Boolean link;
    private final Boolean name;
    private final Boolean playlists;
    private final Boolean recursiveFolders;
    private final Boolean recursivePlaylists;
    private final Boolean rowId;
    private final Boolean rows;

    /* renamed from: com.spotify.playlist.endpoints.policy.rootlist.$AutoValue_FolderMetadataDecorationPolicy$a */
    static final class a implements com.spotify.playlist.endpoints.policy.rootlist.FolderMetadataDecorationPolicy.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private Boolean e;
        private Boolean f;
        private Boolean g;
        private Boolean h;
        private Boolean i;
        private Boolean j;

        a() {
        }

        private a(FolderMetadataDecorationPolicy folderMetadataDecorationPolicy) {
            this.a = folderMetadataDecorationPolicy.rowId();
            this.b = folderMetadataDecorationPolicy.addTime();
            this.c = folderMetadataDecorationPolicy.id();
            this.d = folderMetadataDecorationPolicy.link();
            this.e = folderMetadataDecorationPolicy.name();
            this.f = folderMetadataDecorationPolicy.folders();
            this.g = folderMetadataDecorationPolicy.playlists();
            this.h = folderMetadataDecorationPolicy.recursiveFolders();
            this.i = folderMetadataDecorationPolicy.recursivePlaylists();
            this.j = folderMetadataDecorationPolicy.rows();
        }

        /* synthetic */ a(FolderMetadataDecorationPolicy folderMetadataDecorationPolicy, byte b2) {
            this(folderMetadataDecorationPolicy);
        }

        public final com.spotify.playlist.endpoints.policy.rootlist.FolderMetadataDecorationPolicy.a a(Boolean bool) {
            this.a = bool;
            return this;
        }

        public final FolderMetadataDecorationPolicy a() {
            AutoValue_FolderMetadataDecorationPolicy autoValue_FolderMetadataDecorationPolicy = new AutoValue_FolderMetadataDecorationPolicy(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
            return autoValue_FolderMetadataDecorationPolicy;
        }

        public final com.spotify.playlist.endpoints.policy.rootlist.FolderMetadataDecorationPolicy.a b(Boolean bool) {
            this.c = bool;
            return this;
        }

        public final com.spotify.playlist.endpoints.policy.rootlist.FolderMetadataDecorationPolicy.a c(Boolean bool) {
            this.d = bool;
            return this;
        }

        public final com.spotify.playlist.endpoints.policy.rootlist.FolderMetadataDecorationPolicy.a d(Boolean bool) {
            this.e = bool;
            return this;
        }

        public final com.spotify.playlist.endpoints.policy.rootlist.FolderMetadataDecorationPolicy.a e(Boolean bool) {
            this.f = bool;
            return this;
        }

        public final com.spotify.playlist.endpoints.policy.rootlist.FolderMetadataDecorationPolicy.a f(Boolean bool) {
            this.g = bool;
            return this;
        }

        public final com.spotify.playlist.endpoints.policy.rootlist.FolderMetadataDecorationPolicy.a g(Boolean bool) {
            this.i = bool;
            return this;
        }
    }

    C$AutoValue_FolderMetadataDecorationPolicy(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10) {
        this.rowId = bool;
        this.addTime = bool2;
        this.id = bool3;
        this.link = bool4;
        this.name = bool5;
        this.folders = bool6;
        this.playlists = bool7;
        this.recursiveFolders = bool8;
        this.recursivePlaylists = bool9;
        this.rows = bool10;
    }

    @JsonProperty("addTime")
    public Boolean addTime() {
        return this.addTime;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FolderMetadataDecorationPolicy) {
            FolderMetadataDecorationPolicy folderMetadataDecorationPolicy = (FolderMetadataDecorationPolicy) obj;
            Boolean bool = this.rowId;
            if (bool != null ? bool.equals(folderMetadataDecorationPolicy.rowId()) : folderMetadataDecorationPolicy.rowId() == null) {
                Boolean bool2 = this.addTime;
                if (bool2 != null ? bool2.equals(folderMetadataDecorationPolicy.addTime()) : folderMetadataDecorationPolicy.addTime() == null) {
                    Boolean bool3 = this.id;
                    if (bool3 != null ? bool3.equals(folderMetadataDecorationPolicy.id()) : folderMetadataDecorationPolicy.id() == null) {
                        Boolean bool4 = this.link;
                        if (bool4 != null ? bool4.equals(folderMetadataDecorationPolicy.link()) : folderMetadataDecorationPolicy.link() == null) {
                            Boolean bool5 = this.name;
                            if (bool5 != null ? bool5.equals(folderMetadataDecorationPolicy.name()) : folderMetadataDecorationPolicy.name() == null) {
                                Boolean bool6 = this.folders;
                                if (bool6 != null ? bool6.equals(folderMetadataDecorationPolicy.folders()) : folderMetadataDecorationPolicy.folders() == null) {
                                    Boolean bool7 = this.playlists;
                                    if (bool7 != null ? bool7.equals(folderMetadataDecorationPolicy.playlists()) : folderMetadataDecorationPolicy.playlists() == null) {
                                        Boolean bool8 = this.recursiveFolders;
                                        if (bool8 != null ? bool8.equals(folderMetadataDecorationPolicy.recursiveFolders()) : folderMetadataDecorationPolicy.recursiveFolders() == null) {
                                            Boolean bool9 = this.recursivePlaylists;
                                            if (bool9 != null ? bool9.equals(folderMetadataDecorationPolicy.recursivePlaylists()) : folderMetadataDecorationPolicy.recursivePlaylists() == null) {
                                                Boolean bool10 = this.rows;
                                                return bool10 != null ? bool10.equals(folderMetadataDecorationPolicy.rows()) : folderMetadataDecorationPolicy.rows() == null;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @JsonProperty("folders")
    public Boolean folders() {
        return this.folders;
    }

    public int hashCode() {
        Boolean bool = this.rowId;
        int i = 0;
        int hashCode = ((bool == null ? 0 : bool.hashCode()) ^ 1000003) * 1000003;
        Boolean bool2 = this.addTime;
        int hashCode2 = (hashCode ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
        Boolean bool3 = this.id;
        int hashCode3 = (hashCode2 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
        Boolean bool4 = this.link;
        int hashCode4 = (hashCode3 ^ (bool4 == null ? 0 : bool4.hashCode())) * 1000003;
        Boolean bool5 = this.name;
        int hashCode5 = (hashCode4 ^ (bool5 == null ? 0 : bool5.hashCode())) * 1000003;
        Boolean bool6 = this.folders;
        int hashCode6 = (hashCode5 ^ (bool6 == null ? 0 : bool6.hashCode())) * 1000003;
        Boolean bool7 = this.playlists;
        int hashCode7 = (hashCode6 ^ (bool7 == null ? 0 : bool7.hashCode())) * 1000003;
        Boolean bool8 = this.recursiveFolders;
        int hashCode8 = (hashCode7 ^ (bool8 == null ? 0 : bool8.hashCode())) * 1000003;
        Boolean bool9 = this.recursivePlaylists;
        int hashCode9 = (hashCode8 ^ (bool9 == null ? 0 : bool9.hashCode())) * 1000003;
        Boolean bool10 = this.rows;
        if (bool10 != null) {
            i = bool10.hashCode();
        }
        return hashCode9 ^ i;
    }

    @JsonProperty("id")
    public Boolean id() {
        return this.id;
    }

    @JsonProperty("link")
    public Boolean link() {
        return this.link;
    }

    @JsonProperty("name")
    public Boolean name() {
        return this.name;
    }

    @JsonProperty("playlists")
    public Boolean playlists() {
        return this.playlists;
    }

    @JsonProperty("recursiveFolders")
    public Boolean recursiveFolders() {
        return this.recursiveFolders;
    }

    @JsonProperty("recursivePlaylists")
    public Boolean recursivePlaylists() {
        return this.recursivePlaylists;
    }

    @JsonProperty("rowId")
    public Boolean rowId() {
        return this.rowId;
    }

    @JsonProperty("rows")
    public Boolean rows() {
        return this.rows;
    }

    public com.spotify.playlist.endpoints.policy.rootlist.FolderMetadataDecorationPolicy.a toBuilder() {
        return new a(this, 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FolderMetadataDecorationPolicy{rowId=");
        sb.append(this.rowId);
        sb.append(", addTime=");
        sb.append(this.addTime);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", link=");
        sb.append(this.link);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", folders=");
        sb.append(this.folders);
        sb.append(", playlists=");
        sb.append(this.playlists);
        sb.append(", recursiveFolders=");
        sb.append(this.recursiveFolders);
        sb.append(", recursivePlaylists=");
        sb.append(this.recursivePlaylists);
        sb.append(", rows=");
        sb.append(this.rows);
        sb.append("}");
        return sb.toString();
    }
}
