package com.spotify.voice.api.model;

final class AutoValue_AsrResponse extends AsrResponse {
    private final boolean isEndOfSpeech;
    private final boolean isFinal;
    private final float score;
    private final String transcript;

    AutoValue_AsrResponse(String str, boolean z, boolean z2, float f) {
        if (str != null) {
            this.transcript = str;
            this.isFinal = z;
            this.isEndOfSpeech = z2;
            this.score = f;
            return;
        }
        throw new NullPointerException("Null transcript");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AsrResponse) {
            AsrResponse asrResponse = (AsrResponse) obj;
            return this.transcript.equals(asrResponse.transcript()) && this.isFinal == asrResponse.isFinal() && this.isEndOfSpeech == asrResponse.isEndOfSpeech() && Float.floatToIntBits(this.score) == Float.floatToIntBits(asrResponse.score());
        }
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = (((this.transcript.hashCode() ^ 1000003) * 1000003) ^ (this.isFinal ? 1231 : 1237)) * 1000003;
        if (!this.isEndOfSpeech) {
            i = 1237;
        }
        return ((hashCode ^ i) * 1000003) ^ Float.floatToIntBits(this.score);
    }

    public final boolean isEndOfSpeech() {
        return this.isEndOfSpeech;
    }

    public final boolean isFinal() {
        return this.isFinal;
    }

    public final float score() {
        return this.score;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AsrResponse{transcript=");
        sb.append(this.transcript);
        sb.append(", isFinal=");
        sb.append(this.isFinal);
        sb.append(", isEndOfSpeech=");
        sb.append(this.isEndOfSpeech);
        sb.append(", score=");
        sb.append(this.score);
        sb.append("}");
        return sb.toString();
    }

    public final String transcript() {
        return this.transcript;
    }
}
