package com.facebook;

public class FacebookGraphResponseException extends FacebookException {
    private final aku graphResponse;

    public FacebookGraphResponseException(aku aku, String str) {
        super(str);
        this.graphResponse = aku;
    }

    public final String toString() {
        aku aku = this.graphResponse;
        FacebookRequestError facebookRequestError = aku != null ? aku.b : null;
        StringBuilder sb = new StringBuilder("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(" ");
        }
        if (facebookRequestError != null) {
            sb.append("httpResponseCode: ");
            sb.append(facebookRequestError.a);
            sb.append(", facebookErrorCode: ");
            sb.append(facebookRequestError.b);
            sb.append(", facebookErrorType: ");
            sb.append(facebookRequestError.d);
            sb.append(", message: ");
            sb.append(facebookRequestError.a());
            sb.append("}");
        }
        return sb.toString();
    }
}
