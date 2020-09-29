package defpackage;

import io.netty.util.internal.logging.Log4JLogger;
import org.apache.log4j.Logger;

/* renamed from: wyf reason: default package */
public final class wyf extends wyd {
    public static final wyd a = new wyf();

    public final wyc b(String str) {
        return new Log4JLogger(Logger.getLogger(str));
    }
}
