package com.spotify.mobile.android.video.exo;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AggregateException extends RuntimeException {
    private static final long serialVersionUID = 2437354144351174134L;
    public final List<Exception> mExceptionList = new ArrayList();

    public final void a(Exception exc) {
        this.mExceptionList.add(exc);
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        Iterator it = this.mExceptionList.iterator();
        while (true) {
            String str = "----------------------------------------";
            if (it.hasNext()) {
                Throwable th = (Throwable) it.next();
                printStream.println(str);
                th.printStackTrace(printStream);
            } else {
                printStream.println(str);
                return;
            }
        }
    }

    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        Iterator it = this.mExceptionList.iterator();
        while (true) {
            String str = "----------------------------------------";
            if (it.hasNext()) {
                Throwable th = (Throwable) it.next();
                printWriter.println(str);
                th.printStackTrace(printWriter);
            } else {
                printWriter.println(str);
                return;
            }
        }
    }
}
