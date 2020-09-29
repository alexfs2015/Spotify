package com.spotify.playlist.endpoints.policy.rootlist;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.playlist.endpoints.policy.rootlist.$AutoValue_RootlistRequestPayload reason: invalid class name */
abstract class C$AutoValue_RootlistRequestPayload extends RootlistRequestPayload {
    private final FolderRequestPolicy policy;

    /* renamed from: com.spotify.playlist.endpoints.policy.rootlist.$AutoValue_RootlistRequestPayload$a */
    static final class a implements com.spotify.playlist.endpoints.policy.rootlist.RootlistRequestPayload.a {
        private FolderRequestPolicy a;

        a() {
        }

        private a(RootlistRequestPayload rootlistRequestPayload) {
            this.a = rootlistRequestPayload.policy();
        }

        /* synthetic */ a(RootlistRequestPayload rootlistRequestPayload, byte b) {
            this(rootlistRequestPayload);
        }

        public final com.spotify.playlist.endpoints.policy.rootlist.RootlistRequestPayload.a a(FolderRequestPolicy folderRequestPolicy) {
            this.a = folderRequestPolicy;
            return this;
        }

        public final RootlistRequestPayload a() {
            return new AutoValue_RootlistRequestPayload(this.a);
        }
    }

    C$AutoValue_RootlistRequestPayload(FolderRequestPolicy folderRequestPolicy) {
        this.policy = folderRequestPolicy;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RootlistRequestPayload)) {
            return false;
        }
        RootlistRequestPayload rootlistRequestPayload = (RootlistRequestPayload) obj;
        FolderRequestPolicy folderRequestPolicy = this.policy;
        FolderRequestPolicy policy2 = rootlistRequestPayload.policy();
        return folderRequestPolicy == null ? policy2 == null : folderRequestPolicy.equals(policy2);
    }

    public int hashCode() {
        FolderRequestPolicy folderRequestPolicy = this.policy;
        return (folderRequestPolicy == null ? 0 : folderRequestPolicy.hashCode()) ^ 1000003;
    }

    @JsonProperty("policy")
    public FolderRequestPolicy policy() {
        return this.policy;
    }

    public com.spotify.playlist.endpoints.policy.rootlist.RootlistRequestPayload.a toBuilder() {
        return new a(this, 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RootlistRequestPayload{policy=");
        sb.append(this.policy);
        sb.append("}");
        return sb.toString();
    }
}
