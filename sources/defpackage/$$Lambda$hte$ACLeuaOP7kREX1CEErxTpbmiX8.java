package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$hte$ACLeuaOP7kREX1-CEErxTpbmiX8 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$hte$ACLeuaOP7kREX1CEErxTpbmiX8 implements Consumer {
    public static final /* synthetic */ $$Lambda$hte$ACLeuaOP7kREX1CEErxTpbmiX8 INSTANCE = new $$Lambda$hte$ACLeuaOP7kREX1CEErxTpbmiX8();

    private /* synthetic */ $$Lambda$hte$ACLeuaOP7kREX1CEErxTpbmiX8() {
    }

    public final void accept(Object obj) {
        Logger.b("Error while detecting offline errors: %s", ((Throwable) obj).getMessage());
    }
}
