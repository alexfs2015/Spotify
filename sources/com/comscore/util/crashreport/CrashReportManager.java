package com.comscore.util.crashreport;

import com.comscore.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CrashReportManager {
    public static final int MAX_REPORTS_TO_SEND = 1;
    public static final String REPORT_URL = (BuildConfig.DEBUG ? "http://=" : "http://=");
    public static final int TIME_WINDOW = 5000;
    /* access modifiers changed from: private */
    public final List<CrashReport> a;
    /* access modifiers changed from: private */
    public final Object b = new Object();
    private final Object c = new Object();
    /* access modifiers changed from: private */
    public CrashReportFlusher d;
    private ExecutorService e;
    /* access modifiers changed from: private */
    public boolean f;
    /* access modifiers changed from: private */
    public CrashReportParser g;
    /* access modifiers changed from: private */
    public CrashReportDecorator h;
    private Runnable i = null;

    public CrashReportManager(CrashReportDecorator crashReportDecorator) {
        this.h = crashReportDecorator;
        this.a = Collections.synchronizedList(new ArrayList());
        this.f = false;
        this.g = new HttpGetCrashReportParser();
        this.d = createCrashReportFlusher();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 150, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        this.e = threadPoolExecutor;
    }

    public void addReport(CrashReport crashReport) {
        if (crashReport != null) {
            synchronized (this.b) {
                if (this.a.size() <= 0) {
                    this.a.add(crashReport);
                }
            }
            flushReportsErrors();
        }
    }

    /* access modifiers changed from: protected */
    public CrashReportFlusher createCrashReportFlusher() {
        return new CrashReportHttpFlusher();
    }

    /* access modifiers changed from: protected */
    public void flushReportsErrors() {
        synchronized (this.c) {
            if (this.f) {
                this.e.execute(new Runnable() {
                    public void run() {
                        ArrayList<CrashReport> arrayList;
                        try {
                            synchronized (CrashReportManager.this.b) {
                                arrayList = new ArrayList<>(CrashReportManager.this.a);
                            }
                            if (arrayList.size() != 0) {
                                LinkedList linkedList = new LinkedList();
                                for (CrashReport crashReport : arrayList) {
                                    CrashReportManager.this.h.fillCrashReport(crashReport);
                                    if (CrashReportManager.this.d.flush(CrashReportManager.REPORT_URL, CrashReportManager.this.g, crashReport)) {
                                        linkedList.add(crashReport);
                                    }
                                }
                                if (linkedList.size() > 0) {
                                    synchronized (CrashReportManager.this.b) {
                                        CrashReportManager.this.a.removeAll(linkedList);
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            if (!BuildConfig.DEBUG) {
                                th.printStackTrace();
                            } else {
                                throw th;
                            }
                        }
                    }
                });
            }
        }
    }

    /* access modifiers changed from: protected */
    public List<CrashReport> getReports() {
        return this.a;
    }

    public void start() {
        synchronized (this.c) {
            if (this.i == null) {
                this.i = new Runnable() {
                    public void run() {
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException unused) {
                        }
                        CrashReportManager.this.f = true;
                        CrashReportManager.this.flushReportsErrors();
                    }
                };
                this.e.execute(this.i);
            }
        }
    }
}
