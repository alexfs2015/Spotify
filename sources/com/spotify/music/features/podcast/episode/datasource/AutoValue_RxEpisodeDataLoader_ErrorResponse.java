package com.spotify.music.features.podcast.episode.datasource;

final class AutoValue_RxEpisodeDataLoader_ErrorResponse extends ErrorResponse {
    private final String error;

    AutoValue_RxEpisodeDataLoader_ErrorResponse(String str) {
        this.error = str;
    }

    /* access modifiers changed from: 0000 */
    public final String getError() {
        return this.error;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ErrorResponse{error=");
        sb.append(this.error);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ErrorResponse)) {
            return false;
        }
        ErrorResponse errorResponse = (ErrorResponse) obj;
        String str = this.error;
        String error2 = errorResponse.getError();
        if (str == null) {
            return error2 == null;
        }
        return str.equals(error2);
    }

    public final int hashCode() {
        String str = this.error;
        return (str == null ? 0 : str.hashCode()) ^ 1000003;
    }
}
