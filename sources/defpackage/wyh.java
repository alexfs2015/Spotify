package defpackage;

import io.netty.util.internal.logging.Slf4JLogger;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

/* renamed from: wyh reason: default package */
public class wyh extends wyd {
    private static /* synthetic */ boolean a = (!wyh.class.desiredAssertionStatus());

    static {
        new wyh();
    }

    @Deprecated
    public wyh() {
    }

    wyh(boolean z) {
        final StringBuffer stringBuffer = new StringBuffer();
        PrintStream printStream = System.err;
        try {
            System.setErr(new PrintStream(new OutputStream() {
                public final void write(int i) {
                    stringBuffer.append((char) i);
                }
            }, true, "US-ASCII"));
            try {
                if (!(xfp.a() instanceof xft)) {
                    printStream.print(stringBuffer);
                    printStream.flush();
                    return;
                }
                throw new NoClassDefFoundError(stringBuffer.toString());
            } finally {
                System.setErr(printStream);
            }
        } catch (UnsupportedEncodingException e) {
            throw new Error(e);
        }
    }

    public final wyc b(String str) {
        return new Slf4JLogger(xfp.a(str));
    }
}
