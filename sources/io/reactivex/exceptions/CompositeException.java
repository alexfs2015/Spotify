package io.reactivex.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public final class CompositeException extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;
    private Throwable cause;
    private final List<Throwable> exceptions;
    private final String message;

    static final class CompositeExceptionCausalChain extends RuntimeException {
        private static final long serialVersionUID = 3875212506787802066L;

        CompositeExceptionCausalChain() {
        }

        public final String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    static abstract class PrintStreamOrWriter {
        PrintStreamOrWriter() {
        }

        /* access modifiers changed from: 0000 */
        public abstract void a(Object obj);
    }

    static final class WrappedPrintStream extends PrintStreamOrWriter {
        private final PrintStream a;

        WrappedPrintStream(PrintStream printStream) {
            this.a = printStream;
        }

        /* access modifiers changed from: 0000 */
        public final void a(Object obj) {
            this.a.println(obj);
        }
    }

    static final class WrappedPrintWriter extends PrintStreamOrWriter {
        private final PrintWriter a;

        WrappedPrintWriter(PrintWriter printWriter) {
            this.a = printWriter;
        }

        /* access modifiers changed from: 0000 */
        public final void a(Object obj) {
            this.a.println(obj);
        }
    }

    public CompositeException(Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Throwable th : iterable) {
                if (th instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th).exceptions);
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            this.exceptions = Collections.unmodifiableList(arrayList);
            StringBuilder sb = new StringBuilder();
            sb.append(this.exceptions.size());
            sb.append(" exceptions occurred. ");
            this.message = sb.toString();
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    public CompositeException(Throwable... thArr) {
        this((Iterable<? extends Throwable>) Arrays.asList(thArr));
    }

    private static List<Throwable> a(Throwable th) {
        ArrayList arrayList = new ArrayList();
        Throwable cause2 = th.getCause();
        if (cause2 != null && cause2 != th) {
            while (true) {
                arrayList.add(cause2);
                Throwable cause3 = cause2.getCause();
                if (cause3 == null || cause3 == cause2) {
                    break;
                }
                cause2 = cause3;
            }
        }
        return arrayList;
    }

    private void a(PrintStreamOrWriter printStreamOrWriter) {
        StackTraceElement[] stackTrace;
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append(10);
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append(10);
        }
        int i = 1;
        for (Throwable th : this.exceptions) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            a(sb, th, "\t");
            i++;
        }
        printStreamOrWriter.a(sb.toString());
    }

    private void a(StringBuilder sb, Throwable th, String str) {
        StackTraceElement[] stackTrace;
        while (true) {
            sb.append(str);
            sb.append(th);
            sb.append(10);
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                sb.append("\t\tat ");
                sb.append(stackTraceElement);
                sb.append(10);
            }
            if (th.getCause() != null) {
                sb.append("\tCaused by: ");
                th = th.getCause();
                str = "";
            } else {
                return;
            }
        }
    }

    private static Throwable b(Throwable th) {
        Throwable cause2 = th.getCause();
        if (cause2 == null || th == cause2) {
            return th;
        }
        while (true) {
            Throwable cause3 = cause2.getCause();
            if (cause3 == null || cause3 == cause2) {
                return cause2;
            }
            cause2 = cause3;
        }
        return cause2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:9|(4:12|(2:14|32)(2:15|33)|31|10)|16|17|18|19|30) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0054 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.Throwable getCause() {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.Throwable r0 = r8.cause     // Catch:{ all -> 0x005f }
            if (r0 != 0) goto L_0x005b
            io.reactivex.exceptions.CompositeException$CompositeExceptionCausalChain r0 = new io.reactivex.exceptions.CompositeException$CompositeExceptionCausalChain     // Catch:{ all -> 0x005f }
            r0.<init>()     // Catch:{ all -> 0x005f }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x005f }
            r1.<init>()     // Catch:{ all -> 0x005f }
            java.util.List<java.lang.Throwable> r2 = r8.exceptions     // Catch:{ all -> 0x005f }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x005f }
            r3 = r0
        L_0x0016:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x005f }
            if (r4 == 0) goto L_0x0059
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x005f }
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ all -> 0x005f }
            boolean r5 = r1.contains(r4)     // Catch:{ all -> 0x005f }
            if (r5 != 0) goto L_0x0016
            r1.add(r4)     // Catch:{ all -> 0x005f }
            java.util.List r5 = a(r4)     // Catch:{ all -> 0x005f }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x005f }
        L_0x0033:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x005f }
            if (r6 == 0) goto L_0x0051
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x005f }
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x005f }
            boolean r7 = r1.contains(r6)     // Catch:{ all -> 0x005f }
            if (r7 == 0) goto L_0x004d
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ all -> 0x005f }
            java.lang.String r6 = "Duplicate found in causal chain so cropping to prevent loop ..."
            r4.<init>(r6)     // Catch:{ all -> 0x005f }
            goto L_0x0033
        L_0x004d:
            r1.add(r6)     // Catch:{ all -> 0x005f }
            goto L_0x0033
        L_0x0051:
            r3.initCause(r4)     // Catch:{ all -> 0x0054 }
        L_0x0054:
            java.lang.Throwable r3 = b(r3)     // Catch:{ all -> 0x005f }
            goto L_0x0016
        L_0x0059:
            r8.cause = r0     // Catch:{ all -> 0x005f }
        L_0x005b:
            java.lang.Throwable r0 = r8.cause     // Catch:{ all -> 0x005f }
            monitor-exit(r8)
            return r0
        L_0x005f:
            r0 = move-exception
            monitor-exit(r8)
            goto L_0x0063
        L_0x0062:
            throw r0
        L_0x0063:
            goto L_0x0062
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.exceptions.CompositeException.getCause():java.lang.Throwable");
    }

    public final String getMessage() {
        return this.message;
    }

    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    public final void printStackTrace(PrintStream printStream) {
        a((PrintStreamOrWriter) new WrappedPrintStream(printStream));
    }

    public final void printStackTrace(PrintWriter printWriter) {
        a((PrintStreamOrWriter) new WrappedPrintWriter(printWriter));
    }
}
