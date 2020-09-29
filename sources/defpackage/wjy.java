package defpackage;

import io.netty.util.internal.logging.JdkLogger;
import java.util.logging.Logger;

/* renamed from: wjy reason: default package */
public final class wjy extends wjx {
    public static final wjx a = new wjy();

    public final wjw b(String str) {
        return new JdkLogger(Logger.getLogger(str));
    }
}
