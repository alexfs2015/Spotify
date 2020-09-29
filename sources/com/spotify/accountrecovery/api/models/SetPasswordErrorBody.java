package com.spotify.accountrecovery.api.models;

import com.google.gson.JsonSyntaxException;
import java.lang.reflect.Type;

public class SetPasswordErrorBody {
    @fiq(a = "recoverable")
    private Boolean mIsRecoverable;
    @fiq(a = "message")
    private String mMessage;

    public boolean isRecoverable() {
        return this.mIsRecoverable.booleanValue();
    }

    public String getMessage() {
        return this.mMessage;
    }

    public static SetPasswordErrorBody fromJson(String str) {
        try {
            Class<SetPasswordErrorBody> cls = SetPasswordErrorBody.class;
            return (SetPasswordErrorBody) fiz.a(cls).cast(new fid().a(str, (Type) cls));
        } catch (JsonSyntaxException unused) {
            return null;
        }
    }
}
