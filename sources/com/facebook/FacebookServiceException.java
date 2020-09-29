package com.facebook;

public class FacebookServiceException extends FacebookException {
    private static final long serialVersionUID = 1;
    public final FacebookRequestError error;

    public FacebookServiceException(FacebookRequestError facebookRequestError, String str) {
        super(str);
        this.error = facebookRequestError;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{FacebookServiceException: ");
        sb.append("httpResponseCode: ");
        sb.append(this.error.a);
        sb.append(", facebookErrorCode: ");
        sb.append(this.error.b);
        sb.append(", facebookErrorType: ");
        sb.append(this.error.d);
        sb.append(", message: ");
        sb.append(this.error.a());
        sb.append("}");
        return sb.toString();
    }
}
