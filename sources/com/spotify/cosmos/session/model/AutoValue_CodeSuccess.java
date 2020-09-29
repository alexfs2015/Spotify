package com.spotify.cosmos.session.model;

final class AutoValue_CodeSuccess extends CodeSuccess {
    private final String identifierToken;

    AutoValue_CodeSuccess(String str) {
        this.identifierToken = str;
    }

    public final String identifierToken() {
        return this.identifierToken;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CodeSuccess{identifierToken=");
        sb.append(this.identifierToken);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CodeSuccess)) {
            return false;
        }
        CodeSuccess codeSuccess = (CodeSuccess) obj;
        String str = this.identifierToken;
        String identifierToken2 = codeSuccess.identifierToken();
        if (str == null) {
            return identifierToken2 == null;
        }
        return str.equals(identifierToken2);
    }

    public final int hashCode() {
        String str = this.identifierToken;
        return (str == null ? 0 : str.hashCode()) ^ 1000003;
    }
}
