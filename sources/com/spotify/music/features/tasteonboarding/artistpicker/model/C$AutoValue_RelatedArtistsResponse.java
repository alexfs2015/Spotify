package com.spotify.music.features.tasteonboarding.artistpicker.model;

import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import java.util.List;

/* renamed from: com.spotify.music.features.tasteonboarding.artistpicker.model.$AutoValue_RelatedArtistsResponse reason: invalid class name */
abstract class C$AutoValue_RelatedArtistsResponse extends RelatedArtistsResponse {
    private final List<TasteOnboardingItem> relatedArtists;

    C$AutoValue_RelatedArtistsResponse(List<TasteOnboardingItem> list) {
        if (list != null) {
            this.relatedArtists = list;
            return;
        }
        throw new NullPointerException("Null relatedArtists");
    }

    public List<TasteOnboardingItem> relatedArtists() {
        return this.relatedArtists;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RelatedArtistsResponse{relatedArtists=");
        sb.append(this.relatedArtists);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RelatedArtistsResponse)) {
            return false;
        }
        return this.relatedArtists.equals(((RelatedArtistsResponse) obj).relatedArtists());
    }

    public int hashCode() {
        return this.relatedArtists.hashCode() ^ 1000003;
    }
}
