package defpackage;

import io.netty.util.internal.logging.Log4JLogger;
import org.apache.log4j.Logger;

/* renamed from: wjz reason: default package */
public final class wjz extends wjx {
    public static final wjx a = new wjz();

    public final wjw b(String str) {
        return new Log4JLogger(Logger.getLogger(str));
    }
}
