package com.facebook;

public class FacebookDialogException extends FacebookException {
    static final long serialVersionUID = 1;
    private int errorCode;
    private String failingUrl;

    public FacebookDialogException(String str, int i, String str2) {
        super(str);
        this.errorCode = i;
        this.failingUrl = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{FacebookDialogException: ");
        sb.append("errorCode: ");
        sb.append(this.errorCode);
        sb.append(", message: ");
        sb.append(getMessage());
        sb.append(", url: ");
        sb.append(this.failingUrl);
        sb.append("}");
        return sb.toString();
    }
}
