package com.spotify.cosmos.session.model;

final class AutoValue_CodeRequired extends CodeRequired {
    private final String canonicalPhoneNumber;
    private final String challengeId;
    private final long codeLength;
    private final long expiresIn;
    private final int method;
    private final int retryNumber;

    AutoValue_CodeRequired(String str, int i, long j, String str2, long j2, int i2) {
        if (str != null) {
            this.challengeId = str;
            this.method = i;
            this.codeLength = j;
            if (str2 != null) {
                this.canonicalPhoneNumber = str2;
                this.expiresIn = j2;
                this.retryNumber = i2;
                return;
            }
            throw new NullPointerException("Null canonicalPhoneNumber");
        }
        throw new NullPointerException("Null challengeId");
    }

    public final String challengeId() {
        return this.challengeId;
    }

    public final int method() {
        return this.method;
    }

    public final long codeLength() {
        return this.codeLength;
    }

    public final String canonicalPhoneNumber() {
        return this.canonicalPhoneNumber;
    }

    public final long expiresIn() {
        return this.expiresIn;
    }

    public final int retryNumber() {
        return this.retryNumber;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CodeRequired{challengeId=");
        sb.append(this.challengeId);
        sb.append(", method=");
        sb.append(this.method);
        sb.append(", codeLength=");
        sb.append(this.codeLength);
        sb.append(", canonicalPhoneNumber=");
        sb.append(this.canonicalPhoneNumber);
        sb.append(", expiresIn=");
        sb.append(this.expiresIn);
        sb.append(", retryNumber=");
        sb.append(this.retryNumber);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CodeRequired) {
            CodeRequired codeRequired = (CodeRequired) obj;
            return this.challengeId.equals(codeRequired.challengeId()) && this.method == codeRequired.method() && this.codeLength == codeRequired.codeLength() && this.canonicalPhoneNumber.equals(codeRequired.canonicalPhoneNumber()) && this.expiresIn == codeRequired.expiresIn() && this.retryNumber == codeRequired.retryNumber();
        }
    }

    public final int hashCode() {
        int hashCode = (((this.challengeId.hashCode() ^ 1000003) * 1000003) ^ this.method) * 1000003;
        long j = this.codeLength;
        int hashCode2 = (((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.canonicalPhoneNumber.hashCode()) * 1000003;
        long j2 = this.expiresIn;
        return ((hashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.retryNumber;
    }
}
