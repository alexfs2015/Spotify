package com.spotify.music.spotlets.voice.suggestion;

final class AutoValue_Suggestion extends Suggestion {
    private final String suggestion;

    AutoValue_Suggestion(String str) {
        if (str != null) {
            this.suggestion = str;
            return;
        }
        throw new NullPointerException("Null suggestion");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Suggestion)) {
            return false;
        }
        return this.suggestion.equals(((Suggestion) obj).suggestion());
    }

    public final int hashCode() {
        return this.suggestion.hashCode() ^ 1000003;
    }

    public final String suggestion() {
        return this.suggestion;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Suggestion{suggestion=");
        sb.append(this.suggestion);
        sb.append("}");
        return sb.toString();
    }
}
