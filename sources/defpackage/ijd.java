package defpackage;

import com.spotify.music.builtinauth.model.FieldValidator;

/* renamed from: ijd reason: default package */
public final class ijd extends FieldValidator {
    public final void a(int i, String str) {
        a(0, Integer.MAX_VALUE, i, "request id");
        a(str, "uri");
    }
}
