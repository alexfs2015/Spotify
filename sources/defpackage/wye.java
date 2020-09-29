package defpackage;

import io.netty.util.internal.logging.JdkLogger;
import java.util.logging.Logger;

/* renamed from: wye reason: default package */
public final class wye extends wyd {
    public static final wyd a = new wye();

    public final wyc b(String str) {
        return new JdkLogger(Logger.getLogger(str));
    }
}
