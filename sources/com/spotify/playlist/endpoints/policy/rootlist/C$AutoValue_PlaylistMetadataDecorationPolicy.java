package com.spotify.playlist.endpoints.policy.rootlist;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.playlist.endpoints.policy.rootlist.$AutoValue_PlaylistMetadataDecorationPolicy reason: invalid class name */
abstract class C$AutoValue_PlaylistMetadataDecorationPolicy extends PlaylistMetadataDecorationPolicy {
    private final Boolean addTime;
    private final Boolean browsableOffline;
    private final Boolean canReportAnnotationAbuse;
    private final Boolean collaborative;
    private final Boolean description;
    private final Boolean descriptionFromAnnotate;
    private final Boolean duration;
    private final Boolean followed;
    private final Boolean followers;
    private final Boolean formatListAttributes;
    private final Boolean formatListType;
    private final Boolean isOnDemandInFree;
    private final Boolean lastModification;
    private final Boolean length;
    private final Boolean link;
    private final Boolean loadState;
    private final Boolean loaded;
    private final PlaylistUserDecorationPolicy madeFor;
    private final Boolean name;
    private final Boolean offline;
    private final Boolean ownedBySelf;
    private final PlaylistUserDecorationPolicy owner;
    private final Boolean picture;
    private final Boolean pictureFromAnnotate;
    private final Boolean playable;
    private final Boolean published;
    private final Boolean rowId;
    private final Boolean syncProgress;
    private final Boolean totalLength;

    /* renamed from: com.spotify.playlist.endpoints.policy.rootlist.$AutoValue_PlaylistMetadataDecorationPolicy$a */
    static final class a implements com.spotify.playlist.endpoints.policy.rootlist.PlaylistMetadataDecorationPolicy.a {
        private Boolean A;
        private PlaylistUserDecorationPolicy B;
        private PlaylistUserDecorationPolicy C;
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
        private Boolean k;
        private Boolean l;
        private Boolean m;
        private Boolean n;
        private Boolean o;
        private Boolean p;
        private Boolean q;
        private Boolean r;
        private Boolean s;
        private Boolean t;
        private Boolean u;
        private Boolean v;
        private Boolean w;
        private Boolean x;
        private Boolean y;
        private Boolean z;

        /* synthetic */ a(PlaylistMetadataDecorationPolicy playlistMetadataDecorationPolicy, byte b2) {
            this(playlistMetadataDecorationPolicy);
        }

        a() {
        }

        private a(PlaylistMetadataDecorationPolicy playlistMetadataDecorationPolicy) {
            this.a = playlistMetadataDecorationPolicy.rowId();
            this.b = playlistMetadataDecorationPolicy.addTime();
            this.c = playlistMetadataDecorationPolicy.isOnDemandInFree();
            this.d = playlistMetadataDecorationPolicy.link();
            this.e = playlistMetadataDecorationPolicy.name();
            this.f = playlistMetadataDecorationPolicy.loadState();
            this.g = playlistMetadataDecorationPolicy.loaded();
            this.h = playlistMetadataDecorationPolicy.collaborative();
            this.i = playlistMetadataDecorationPolicy.length();
            this.j = playlistMetadataDecorationPolicy.lastModification();
            this.k = playlistMetadataDecorationPolicy.totalLength();
            this.l = playlistMetadataDecorationPolicy.duration();
            this.m = playlistMetadataDecorationPolicy.description();
            this.n = playlistMetadataDecorationPolicy.picture();
            this.o = playlistMetadataDecorationPolicy.playable();
            this.p = playlistMetadataDecorationPolicy.descriptionFromAnnotate();
            this.q = playlistMetadataDecorationPolicy.pictureFromAnnotate();
            this.r = playlistMetadataDecorationPolicy.canReportAnnotationAbuse();
            this.s = playlistMetadataDecorationPolicy.followed();
            this.t = playlistMetadataDecorationPolicy.followers();
            this.u = playlistMetadataDecorationPolicy.ownedBySelf();
            this.v = playlistMetadataDecorationPolicy.offline();
            this.w = playlistMetadataDecorationPolicy.syncProgress();
            this.x = playlistMetadataDecorationPolicy.published();
            this.y = playlistMetadataDecorationPolicy.browsableOffline();
            this.z = playlistMetadataDecorationPolicy.formatListType();
            this.A = playlistMetadataDecorationPolicy.formatListAttributes();
            this.B = playlistMetadataDecorationPolicy.owner();
            this.C = playlistMetadataDecorationPolicy.madeFor();
        }

        public final com.spotify.playlist.endpoints.policy.rootlist.PlaylistMetadataDecorationPolicy.a a(Boolean bool) {
            this.a = bool;
            return this;
        }

        public final com.spotify.playlist.endpoints.policy.rootlist.PlaylistMetadataDecorationPolicy.a b(Boolean bool) {
            this.b = bool;
            return this;
        }

        public final com.spotify.playlist.endpoints.policy.rootlist.PlaylistMetadataDecorationPolicy.a c(Boolean bool) {
            this.c = bool;
            return this;
        }

        public final com.spotify.playlist.endpoints.policy.rootlist.PlaylistMetadataDecorationPolicy.a d(Boolean bool) {
            this.d = bool;
            return this;
        }

        public final com.spotify.playlist.endpoints.policy.rootlist.PlaylistMetadataDecorationPolicy.a e(Boolean bool) {
            this.e = bool;
            return this;
        }

        public final com.spotify.playlist.endpoints.policy.rootlist.PlaylistMetadataDecorationPolicy.a f(Boolean bool) {
            this.k = bool;
            return this;
        }

        public final com.spotify.playlist.endpoints.policy.rootlist.PlaylistMetadataDecorationPolicy.a g(Boolean bool) {
            this.n = bool;
            return this;
        }

        public final com.spotify.playlist.endpoints.policy.rootlist.PlaylistMetadataDecorationPolicy.a h(Boolean bool) {
            this.u = bool;
            return this;
        }

        public final com.spotify.playlist.endpoints.policy.rootlist.PlaylistMetadataDecorationPolicy.a i(Boolean bool) {
            this.v = bool;
            return this;
        }

        public final com.spotify.playlist.endpoints.policy.rootlist.PlaylistMetadataDecorationPolicy.a j(Boolean bool) {
            this.w = bool;
            return this;
        }

        public final com.spotify.playlist.endpoints.policy.rootlist.PlaylistMetadataDecorationPolicy.a k(Boolean bool) {
            this.y = bool;
            return this;
        }

        public final com.spotify.playlist.endpoints.policy.rootlist.PlaylistMetadataDecorationPolicy.a l(Boolean bool) {
            this.z = bool;
            return this;
        }

        public final com.spotify.playlist.endpoints.policy.rootlist.PlaylistMetadataDecorationPolicy.a a(PlaylistUserDecorationPolicy playlistUserDecorationPolicy) {
            this.B = playlistUserDecorationPolicy;
            return this;
        }

        public final com.spotify.playlist.endpoints.policy.rootlist.PlaylistMetadataDecorationPolicy.a b(PlaylistUserDecorationPolicy playlistUserDecorationPolicy) {
            this.C = playlistUserDecorationPolicy;
            return this;
        }

        public final PlaylistMetadataDecorationPolicy a() {
            AutoValue_PlaylistMetadataDecorationPolicy autoValue_PlaylistMetadataDecorationPolicy = new AutoValue_PlaylistMetadataDecorationPolicy(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C);
            return autoValue_PlaylistMetadataDecorationPolicy;
        }
    }

    C$AutoValue_PlaylistMetadataDecorationPolicy(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, Boolean bool25, Boolean bool26, Boolean bool27, PlaylistUserDecorationPolicy playlistUserDecorationPolicy, PlaylistUserDecorationPolicy playlistUserDecorationPolicy2) {
        this.rowId = bool;
        this.addTime = bool2;
        this.isOnDemandInFree = bool3;
        this.link = bool4;
        this.name = bool5;
        this.loadState = bool6;
        this.loaded = bool7;
        this.collaborative = bool8;
        this.length = bool9;
        this.lastModification = bool10;
        this.totalLength = bool11;
        this.duration = bool12;
        this.description = bool13;
        this.picture = bool14;
        this.playable = bool15;
        this.descriptionFromAnnotate = bool16;
        this.pictureFromAnnotate = bool17;
        this.canReportAnnotationAbuse = bool18;
        this.followed = bool19;
        this.followers = bool20;
        this.ownedBySelf = bool21;
        this.offline = bool22;
        this.syncProgress = bool23;
        this.published = bool24;
        this.browsableOffline = bool25;
        this.formatListType = bool26;
        this.formatListAttributes = bool27;
        this.owner = playlistUserDecorationPolicy;
        this.madeFor = playlistUserDecorationPolicy2;
    }

    @JsonProperty("rowId")
    public Boolean rowId() {
        return this.rowId;
    }

    @JsonProperty("addTime")
    public Boolean addTime() {
        return this.addTime;
    }

    @JsonProperty("isOnDemandInFree")
    public Boolean isOnDemandInFree() {
        return this.isOnDemandInFree;
    }

    @JsonProperty("link")
    public Boolean link() {
        return this.link;
    }

    @JsonProperty("name")
    public Boolean name() {
        return this.name;
    }

    @JsonProperty("loadState")
    public Boolean loadState() {
        return this.loadState;
    }

    @JsonProperty("loaded")
    public Boolean loaded() {
        return this.loaded;
    }

    @JsonProperty("collaborative")
    public Boolean collaborative() {
        return this.collaborative;
    }

    @JsonProperty("length")
    public Boolean length() {
        return this.length;
    }

    @JsonProperty("lastModification")
    public Boolean lastModification() {
        return this.lastModification;
    }

    @JsonProperty("totalLength")
    public Boolean totalLength() {
        return this.totalLength;
    }

    @JsonProperty("duration")
    public Boolean duration() {
        return this.duration;
    }

    @JsonProperty("description")
    public Boolean description() {
        return this.description;
    }

    @JsonProperty("picture")
    public Boolean picture() {
        return this.picture;
    }

    @JsonProperty("playable")
    public Boolean playable() {
        return this.playable;
    }

    @JsonProperty("descriptionFromAnnotate")
    public Boolean descriptionFromAnnotate() {
        return this.descriptionFromAnnotate;
    }

    @JsonProperty("pictureFromAnnotate")
    public Boolean pictureFromAnnotate() {
        return this.pictureFromAnnotate;
    }

    @JsonProperty("canReportAnnotationAbuse")
    public Boolean canReportAnnotationAbuse() {
        return this.canReportAnnotationAbuse;
    }

    @JsonProperty("followed")
    public Boolean followed() {
        return this.followed;
    }

    @JsonProperty("followers")
    public Boolean followers() {
        return this.followers;
    }

    @JsonProperty("ownedBySelf")
    public Boolean ownedBySelf() {
        return this.ownedBySelf;
    }

    @JsonProperty("offline")
    public Boolean offline() {
        return this.offline;
    }

    @JsonProperty("syncProgress")
    public Boolean syncProgress() {
        return this.syncProgress;
    }

    @JsonProperty("published")
    public Boolean published() {
        return this.published;
    }

    @JsonProperty("browsableOffline")
    public Boolean browsableOffline() {
        return this.browsableOffline;
    }

    @JsonProperty("formatListType")
    public Boolean formatListType() {
        return this.formatListType;
    }

    @JsonProperty("formatListAttributes")
    public Boolean formatListAttributes() {
        return this.formatListAttributes;
    }

    @JsonProperty("owner")
    public PlaylistUserDecorationPolicy owner() {
        return this.owner;
    }

    @JsonProperty("madeFor")
    public PlaylistUserDecorationPolicy madeFor() {
        return this.madeFor;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlaylistMetadataDecorationPolicy{rowId=");
        sb.append(this.rowId);
        sb.append(", addTime=");
        sb.append(this.addTime);
        sb.append(", isOnDemandInFree=");
        sb.append(this.isOnDemandInFree);
        sb.append(", link=");
        sb.append(this.link);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", loadState=");
        sb.append(this.loadState);
        sb.append(", loaded=");
        sb.append(this.loaded);
        sb.append(", collaborative=");
        sb.append(this.collaborative);
        sb.append(", length=");
        sb.append(this.length);
        sb.append(", lastModification=");
        sb.append(this.lastModification);
        sb.append(", totalLength=");
        sb.append(this.totalLength);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", picture=");
        sb.append(this.picture);
        sb.append(", playable=");
        sb.append(this.playable);
        sb.append(", descriptionFromAnnotate=");
        sb.append(this.descriptionFromAnnotate);
        sb.append(", pictureFromAnnotate=");
        sb.append(this.pictureFromAnnotate);
        sb.append(", canReportAnnotationAbuse=");
        sb.append(this.canReportAnnotationAbuse);
        sb.append(", followed=");
        sb.append(this.followed);
        sb.append(", followers=");
        sb.append(this.followers);
        sb.append(", ownedBySelf=");
        sb.append(this.ownedBySelf);
        sb.append(", offline=");
        sb.append(this.offline);
        sb.append(", syncProgress=");
        sb.append(this.syncProgress);
        sb.append(", published=");
        sb.append(this.published);
        sb.append(", browsableOffline=");
        sb.append(this.browsableOffline);
        sb.append(", formatListType=");
        sb.append(this.formatListType);
        sb.append(", formatListAttributes=");
        sb.append(this.formatListAttributes);
        sb.append(", owner=");
        sb.append(this.owner);
        sb.append(", madeFor=");
        sb.append(this.madeFor);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlaylistMetadataDecorationPolicy) {
            PlaylistMetadataDecorationPolicy playlistMetadataDecorationPolicy = (PlaylistMetadataDecorationPolicy) obj;
            Boolean bool = this.rowId;
            if (bool != null ? bool.equals(playlistMetadataDecorationPolicy.rowId()) : playlistMetadataDecorationPolicy.rowId() == null) {
                Boolean bool2 = this.addTime;
                if (bool2 != null ? bool2.equals(playlistMetadataDecorationPolicy.addTime()) : playlistMetadataDecorationPolicy.addTime() == null) {
                    Boolean bool3 = this.isOnDemandInFree;
                    if (bool3 != null ? bool3.equals(playlistMetadataDecorationPolicy.isOnDemandInFree()) : playlistMetadataDecorationPolicy.isOnDemandInFree() == null) {
                        Boolean bool4 = this.link;
                        if (bool4 != null ? bool4.equals(playlistMetadataDecorationPolicy.link()) : playlistMetadataDecorationPolicy.link() == null) {
                            Boolean bool5 = this.name;
                            if (bool5 != null ? bool5.equals(playlistMetadataDecorationPolicy.name()) : playlistMetadataDecorationPolicy.name() == null) {
                                Boolean bool6 = this.loadState;
                                if (bool6 != null ? bool6.equals(playlistMetadataDecorationPolicy.loadState()) : playlistMetadataDecorationPolicy.loadState() == null) {
                                    Boolean bool7 = this.loaded;
                                    if (bool7 != null ? bool7.equals(playlistMetadataDecorationPolicy.loaded()) : playlistMetadataDecorationPolicy.loaded() == null) {
                                        Boolean bool8 = this.collaborative;
                                        if (bool8 != null ? bool8.equals(playlistMetadataDecorationPolicy.collaborative()) : playlistMetadataDecorationPolicy.collaborative() == null) {
                                            Boolean bool9 = this.length;
                                            if (bool9 != null ? bool9.equals(playlistMetadataDecorationPolicy.length()) : playlistMetadataDecorationPolicy.length() == null) {
                                                Boolean bool10 = this.lastModification;
                                                if (bool10 != null ? bool10.equals(playlistMetadataDecorationPolicy.lastModification()) : playlistMetadataDecorationPolicy.lastModification() == null) {
                                                    Boolean bool11 = this.totalLength;
                                                    if (bool11 != null ? bool11.equals(playlistMetadataDecorationPolicy.totalLength()) : playlistMetadataDecorationPolicy.totalLength() == null) {
                                                        Boolean bool12 = this.duration;
                                                        if (bool12 != null ? bool12.equals(playlistMetadataDecorationPolicy.duration()) : playlistMetadataDecorationPolicy.duration() == null) {
                                                            Boolean bool13 = this.description;
                                                            if (bool13 != null ? bool13.equals(playlistMetadataDecorationPolicy.description()) : playlistMetadataDecorationPolicy.description() == null) {
                                                                Boolean bool14 = this.picture;
                                                                if (bool14 != null ? bool14.equals(playlistMetadataDecorationPolicy.picture()) : playlistMetadataDecorationPolicy.picture() == null) {
                                                                    Boolean bool15 = this.playable;
                                                                    if (bool15 != null ? bool15.equals(playlistMetadataDecorationPolicy.playable()) : playlistMetadataDecorationPolicy.playable() == null) {
                                                                        Boolean bool16 = this.descriptionFromAnnotate;
                                                                        if (bool16 != null ? bool16.equals(playlistMetadataDecorationPolicy.descriptionFromAnnotate()) : playlistMetadataDecorationPolicy.descriptionFromAnnotate() == null) {
                                                                            Boolean bool17 = this.pictureFromAnnotate;
                                                                            if (bool17 != null ? bool17.equals(playlistMetadataDecorationPolicy.pictureFromAnnotate()) : playlistMetadataDecorationPolicy.pictureFromAnnotate() == null) {
                                                                                Boolean bool18 = this.canReportAnnotationAbuse;
                                                                                if (bool18 != null ? bool18.equals(playlistMetadataDecorationPolicy.canReportAnnotationAbuse()) : playlistMetadataDecorationPolicy.canReportAnnotationAbuse() == null) {
                                                                                    Boolean bool19 = this.followed;
                                                                                    if (bool19 != null ? bool19.equals(playlistMetadataDecorationPolicy.followed()) : playlistMetadataDecorationPolicy.followed() == null) {
                                                                                        Boolean bool20 = this.followers;
                                                                                        if (bool20 != null ? bool20.equals(playlistMetadataDecorationPolicy.followers()) : playlistMetadataDecorationPolicy.followers() == null) {
                                                                                            Boolean bool21 = this.ownedBySelf;
                                                                                            if (bool21 != null ? bool21.equals(playlistMetadataDecorationPolicy.ownedBySelf()) : playlistMetadataDecorationPolicy.ownedBySelf() == null) {
                                                                                                Boolean bool22 = this.offline;
                                                                                                if (bool22 != null ? bool22.equals(playlistMetadataDecorationPolicy.offline()) : playlistMetadataDecorationPolicy.offline() == null) {
                                                                                                    Boolean bool23 = this.syncProgress;
                                                                                                    if (bool23 != null ? bool23.equals(playlistMetadataDecorationPolicy.syncProgress()) : playlistMetadataDecorationPolicy.syncProgress() == null) {
                                                                                                        Boolean bool24 = this.published;
                                                                                                        if (bool24 != null ? bool24.equals(playlistMetadataDecorationPolicy.published()) : playlistMetadataDecorationPolicy.published() == null) {
                                                                                                            Boolean bool25 = this.browsableOffline;
                                                                                                            if (bool25 != null ? bool25.equals(playlistMetadataDecorationPolicy.browsableOffline()) : playlistMetadataDecorationPolicy.browsableOffline() == null) {
                                                                                                                Boolean bool26 = this.formatListType;
                                                                                                                if (bool26 != null ? bool26.equals(playlistMetadataDecorationPolicy.formatListType()) : playlistMetadataDecorationPolicy.formatListType() == null) {
                                                                                                                    Boolean bool27 = this.formatListAttributes;
                                                                                                                    if (bool27 != null ? bool27.equals(playlistMetadataDecorationPolicy.formatListAttributes()) : playlistMetadataDecorationPolicy.formatListAttributes() == null) {
                                                                                                                        PlaylistUserDecorationPolicy playlistUserDecorationPolicy = this.owner;
                                                                                                                        if (playlistUserDecorationPolicy != null ? playlistUserDecorationPolicy.equals(playlistMetadataDecorationPolicy.owner()) : playlistMetadataDecorationPolicy.owner() == null) {
                                                                                                                            PlaylistUserDecorationPolicy playlistUserDecorationPolicy2 = this.madeFor;
                                                                                                                            return playlistUserDecorationPolicy2 != null ? playlistUserDecorationPolicy2.equals(playlistMetadataDecorationPolicy.madeFor()) : playlistMetadataDecorationPolicy.madeFor() == null;
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
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public int hashCode() {
        Boolean bool = this.rowId;
        int i = 0;
        int hashCode = ((bool == null ? 0 : bool.hashCode()) ^ 1000003) * 1000003;
        Boolean bool2 = this.addTime;
        int hashCode2 = (hashCode ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
        Boolean bool3 = this.isOnDemandInFree;
        int hashCode3 = (hashCode2 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
        Boolean bool4 = this.link;
        int hashCode4 = (hashCode3 ^ (bool4 == null ? 0 : bool4.hashCode())) * 1000003;
        Boolean bool5 = this.name;
        int hashCode5 = (hashCode4 ^ (bool5 == null ? 0 : bool5.hashCode())) * 1000003;
        Boolean bool6 = this.loadState;
        int hashCode6 = (hashCode5 ^ (bool6 == null ? 0 : bool6.hashCode())) * 1000003;
        Boolean bool7 = this.loaded;
        int hashCode7 = (hashCode6 ^ (bool7 == null ? 0 : bool7.hashCode())) * 1000003;
        Boolean bool8 = this.collaborative;
        int hashCode8 = (hashCode7 ^ (bool8 == null ? 0 : bool8.hashCode())) * 1000003;
        Boolean bool9 = this.length;
        int hashCode9 = (hashCode8 ^ (bool9 == null ? 0 : bool9.hashCode())) * 1000003;
        Boolean bool10 = this.lastModification;
        int hashCode10 = (hashCode9 ^ (bool10 == null ? 0 : bool10.hashCode())) * 1000003;
        Boolean bool11 = this.totalLength;
        int hashCode11 = (hashCode10 ^ (bool11 == null ? 0 : bool11.hashCode())) * 1000003;
        Boolean bool12 = this.duration;
        int hashCode12 = (hashCode11 ^ (bool12 == null ? 0 : bool12.hashCode())) * 1000003;
        Boolean bool13 = this.description;
        int hashCode13 = (hashCode12 ^ (bool13 == null ? 0 : bool13.hashCode())) * 1000003;
        Boolean bool14 = this.picture;
        int hashCode14 = (hashCode13 ^ (bool14 == null ? 0 : bool14.hashCode())) * 1000003;
        Boolean bool15 = this.playable;
        int hashCode15 = (hashCode14 ^ (bool15 == null ? 0 : bool15.hashCode())) * 1000003;
        Boolean bool16 = this.descriptionFromAnnotate;
        int hashCode16 = (hashCode15 ^ (bool16 == null ? 0 : bool16.hashCode())) * 1000003;
        Boolean bool17 = this.pictureFromAnnotate;
        int hashCode17 = (hashCode16 ^ (bool17 == null ? 0 : bool17.hashCode())) * 1000003;
        Boolean bool18 = this.canReportAnnotationAbuse;
        int hashCode18 = (hashCode17 ^ (bool18 == null ? 0 : bool18.hashCode())) * 1000003;
        Boolean bool19 = this.followed;
        int hashCode19 = (hashCode18 ^ (bool19 == null ? 0 : bool19.hashCode())) * 1000003;
        Boolean bool20 = this.followers;
        int hashCode20 = (hashCode19 ^ (bool20 == null ? 0 : bool20.hashCode())) * 1000003;
        Boolean bool21 = this.ownedBySelf;
        int hashCode21 = (hashCode20 ^ (bool21 == null ? 0 : bool21.hashCode())) * 1000003;
        Boolean bool22 = this.offline;
        int hashCode22 = (hashCode21 ^ (bool22 == null ? 0 : bool22.hashCode())) * 1000003;
        Boolean bool23 = this.syncProgress;
        int hashCode23 = (hashCode22 ^ (bool23 == null ? 0 : bool23.hashCode())) * 1000003;
        Boolean bool24 = this.published;
        int hashCode24 = (hashCode23 ^ (bool24 == null ? 0 : bool24.hashCode())) * 1000003;
        Boolean bool25 = this.browsableOffline;
        int hashCode25 = (hashCode24 ^ (bool25 == null ? 0 : bool25.hashCode())) * 1000003;
        Boolean bool26 = this.formatListType;
        int hashCode26 = (hashCode25 ^ (bool26 == null ? 0 : bool26.hashCode())) * 1000003;
        Boolean bool27 = this.formatListAttributes;
        int hashCode27 = (hashCode26 ^ (bool27 == null ? 0 : bool27.hashCode())) * 1000003;
        PlaylistUserDecorationPolicy playlistUserDecorationPolicy = this.owner;
        int hashCode28 = (hashCode27 ^ (playlistUserDecorationPolicy == null ? 0 : playlistUserDecorationPolicy.hashCode())) * 1000003;
        PlaylistUserDecorationPolicy playlistUserDecorationPolicy2 = this.madeFor;
        if (playlistUserDecorationPolicy2 != null) {
            i = playlistUserDecorationPolicy2.hashCode();
        }
        return hashCode28 ^ i;
    }

    public com.spotify.playlist.endpoints.policy.rootlist.PlaylistMetadataDecorationPolicy.a toBuilder() {
        return new a(this, 0);
    }
}
