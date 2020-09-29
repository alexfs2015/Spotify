package com.github.anrwatchdog;

import android.os.Looper;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class ANRError extends Error {
    private static final long serialVersionUID = 1;

    private ANRError(_Thread _thread) {
        super("Application Not Responding", _thread);
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public static ANRError a(String str, boolean z) {
        final Thread thread = Looper.getMainLooper().getThread();
        TreeMap treeMap = new TreeMap(new Comparator<Thread>() {
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                Thread thread = (Thread) obj;
                Thread thread2 = (Thread) obj2;
                if (thread == thread2) {
                    return 0;
                }
                Thread thread3 = thread;
                if (thread == thread3) {
                    return 1;
                }
                if (thread2 == thread3) {
                    return -1;
                }
                return thread2.getName().compareTo(thread.getName());
            }
        });
        for (Entry entry : Thread.getAllStackTraces().entrySet()) {
            if (entry.getKey() == thread || (((Thread) entry.getKey()).getName().startsWith(str) && (z || ((StackTraceElement[]) entry.getValue()).length > 0))) {
                treeMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (!treeMap.containsKey(thread)) {
            treeMap.put(thread, thread.getStackTrace());
        }
        _Thread _thread = null;
        for (Entry entry2 : treeMap.entrySet()) {
            ANRError$$ aNRError$$ = new ANRError$$(a((Thread) entry2.getKey()), (StackTraceElement[]) entry2.getValue(), 0);
            aNRError$$.getClass();
            _thread = new _Thread(aNRError$$, _thread, 0);
        }
        return new ANRError(_thread);
    }

    public static ANRError a() {
        Thread thread = Looper.getMainLooper().getThread();
        ANRError$$ aNRError$$ = new ANRError$$(a(thread), thread.getStackTrace(), 0);
        aNRError$$.getClass();
        return new ANRError(new _Thread(aNRError$$, null, 0));
    }

    private static String a(Thread thread) {
        StringBuilder sb = new StringBuilder();
        sb.append(thread.getName());
        sb.append(" (state = ");
        sb.append(thread.getState());
        sb.append(")");
        return sb.toString();
    }
}
