package com.facebook;

public class FacebookGraphResponseException extends FacebookException {
    private final akg graphResponse;

    public FacebookGraphResponseException(akg akg, String str) {
        super(str);
        this.graphResponse = akg;
    }

    public final String toString() {
        FacebookRequestError facebookRequestError;
        akg akg = this.graphResponse;
        if (akg != null) {
            facebookRequestError = akg.b;
        } else {
            facebookRequestError = null;
        }
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
