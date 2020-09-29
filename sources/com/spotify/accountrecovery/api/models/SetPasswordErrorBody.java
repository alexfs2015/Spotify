package com.spotify.accountrecovery.api.models;

import com.google.gson.JsonSyntaxException;
import java.lang.reflect.Type;

public class SetPasswordErrorBody {
    @fjk(a = "recoverable")
    private Boolean mIsRecoverable;
    @fjk(a = "message")
    private String mMessage;

    public static SetPasswordErrorBody fromJson(String str) {
        try {
            Class<SetPasswordErrorBody> cls = SetPasswordErrorBody.class;
            return (SetPasswordErrorBody) fjt.a(cls).cast(new fix().a(str, (Type) cls));
        } catch (JsonSyntaxException unused) {
            return null;
        }
    }

    public String getMessage() {
        return this.mMessage;
    }

    public boolean isRecoverable() {
        return this.mIsRecoverable.booleanValue();
    }
}
