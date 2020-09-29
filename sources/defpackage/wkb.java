package defpackage;

import io.netty.util.internal.logging.Slf4JLogger;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

/* renamed from: wkb reason: default package */
public class wkb extends wjx {
    private static /* synthetic */ boolean a = (!wkb.class.desiredAssertionStatus());

    static {
        new wkb();
    }

    @Deprecated
    public wkb() {
    }

    wkb(boolean z) {
        final StringBuffer stringBuffer = new StringBuffer();
        PrintStream printStream = System.err;
        try {
            System.setErr(new PrintStream(new OutputStream() {
                public final void write(int i) {
                    stringBuffer.append((char) i);
                }
            }, true, "US-ASCII"));
            try {
                if (!(wrk.a() instanceof wro)) {
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

    public final wjw b(String str) {
        return new Slf4JLogger(wrk.a(str));
    }
}
