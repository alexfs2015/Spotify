package com.spotify.music.features.tasteonboarding.artistsearch.model;

import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import java.util.List;

/* renamed from: com.spotify.music.features.tasteonboarding.artistsearch.model.$AutoValue_ArtistSearchResponse reason: invalid class name */
abstract class C$AutoValue_ArtistSearchResponse extends ArtistSearchResponse {
    private final String nextPage;
    private final List<TasteOnboardingItem> results;

    C$AutoValue_ArtistSearchResponse(List<TasteOnboardingItem> list, String str) {
        if (list != null) {
            this.results = list;
            this.nextPage = str;
            return;
        }
        throw new NullPointerException("Null results");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ArtistSearchResponse) {
            ArtistSearchResponse artistSearchResponse = (ArtistSearchResponse) obj;
            if (this.results.equals(artistSearchResponse.results())) {
                String str = this.nextPage;
                return str != null ? str.equals(artistSearchResponse.nextPage()) : artistSearchResponse.nextPage() == null;
            }
        }
    }

    public int hashCode() {
        int hashCode = (this.results.hashCode() ^ 1000003) * 1000003;
        String str = this.nextPage;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String nextPage() {
        return this.nextPage;
    }

    public List<TasteOnboardingItem> results() {
        return this.results;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ArtistSearchResponse{results=");
        sb.append(this.results);
        sb.append(", nextPage=");
        sb.append(this.nextPage);
        sb.append("}");
        return sb.toString();
    }
}
