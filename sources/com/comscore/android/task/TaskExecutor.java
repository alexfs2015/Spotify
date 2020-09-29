package com.comscore.android.task;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TaskExecutor {
    private static final long a = 50000;
    private b b;
    private BlockingQueue<a> c;
    private boolean d;
    /* access modifiers changed from: private */
    public TaskExceptionHandler e;

    public TaskExecutor() {
        this(new TaskExceptionHandler() {
            public void exception(Exception exc, TaskExecutor taskExecutor, Runnable runnable) {
                exc.printStackTrace();
            }
        });
    }

    public TaskExecutor(TaskExceptionHandler taskExceptionHandler) {
        this.d = true;
        this.e = taskExceptionHandler;
        this.c = new LinkedBlockingQueue();
        this.b = new b(this, this.e);
        this.b.start();
    }

    /* access modifiers changed from: 0000 */
    public long a() {
        long j = a;
        for (a a2 : this.c) {
            j = Math.min(j, a2.a());
        }
        return j;
    }

    /* access modifiers changed from: 0000 */
    public void a(a aVar) {
        this.c.remove(aVar);
    }

    /* access modifiers changed from: 0000 */
    public a b() {
        for (a aVar : this.c) {
            if (aVar.f() <= System.currentTimeMillis()) {
                return aVar;
            }
        }
        return null;
    }

    public boolean containsTask(Runnable runnable) {
        for (a aVar : this.c) {
            if (aVar.i() == runnable || ((runnable instanceof a) && aVar == runnable)) {
                return true;
            }
        }
        return false;
    }

    public boolean execute(Runnable runnable) {
        return execute(runnable, true);
    }

    public boolean execute(Runnable runnable, long j) {
        return execute(runnable, j, 0);
    }

    public boolean execute(Runnable runnable, long j, long j2) {
        return execute(runnable, j, j2, false);
    }

    public boolean execute(Runnable runnable, long j, long j2, boolean z) {
        if (!this.d) {
            return false;
        }
        for (a aVar : this.c) {
            if (aVar != null && aVar.i() == runnable) {
                return false;
            }
        }
        BlockingQueue<a> blockingQueue = this.c;
        a aVar2 = new a(runnable, j, j2, z);
        blockingQueue.add(aVar2);
        this.b.c();
        return true;
    }

    public boolean execute(Runnable runnable, boolean z) {
        if (z) {
            return execute(runnable, 0);
        }
        if (!this.d) {
            return false;
        }
        try {
            runnable.run();
        } catch (Exception e2) {
            TaskExceptionHandler taskExceptionHandler = this.e;
            if (taskExceptionHandler != null) {
                taskExceptionHandler.exception(e2, this, runnable);
            }
        }
        return true;
    }

    public boolean executeInMainThread(final Runnable runnable) {
        if (!this.d) {
            return false;
        }
        return new Handler(Looper.getMainLooper()).post(new Runnable() {
            public void run() {
                try {
                    runnable.run();
                } catch (Exception e) {
                    if (TaskExecutor.this.e != null) {
                        TaskExecutor.this.e.exception(e, TaskExecutor.this, runnable);
                    }
                }
            }
        });
    }

    public boolean isEnabled() {
        return this.d;
    }

    public void removeAllEnqueuedTasks() {
        ArrayList arrayList = new ArrayList();
        for (a aVar : this.c) {
            if (aVar.k()) {
                arrayList.add(aVar);
            }
        }
        this.c.removeAll(arrayList);
    }

    public boolean removeEnqueuedTask(Runnable runnable) {
        if (runnable == null) {
            return false;
        }
        for (a aVar : this.c) {
            if (aVar.i() == runnable) {
                return this.c.remove(aVar);
            }
        }
        return false;
    }

    public void setEnabled(boolean z) {
        this.d = z;
    }

    public int size() {
        return this.c.size();
    }

    public void waitForLastNonDelayedTaskToFinish() {
        a aVar;
        a[] aVarArr = new a[this.c.size()];
        this.c.toArray(aVarArr);
        int length = aVarArr.length - 1;
        while (true) {
            if (length >= 0) {
                if (aVarArr[length] != null && !aVarArr[length].d()) {
                    aVar = aVarArr[length];
                    break;
                }
                length--;
            } else {
                aVar = null;
                break;
            }
        }
        waitForTaskToFinish(aVar, 0);
    }

    public void waitForTaskToFinish(Runnable runnable, long j) {
        a aVar;
        if (!(runnable instanceof a)) {
            Iterator it = this.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    aVar = null;
                    break;
                }
                aVar = (a) it.next();
                if (aVar.i() == runnable) {
                    break;
                }
            }
        } else {
            aVar = (a) runnable;
        }
        if (aVar != null) {
            long currentTimeMillis = System.currentTimeMillis();
            while (this.c.contains(aVar)) {
                if (j <= 0 || System.currentTimeMillis() < currentTimeMillis + j) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                } else {
                    return;
                }
            }
        }
    }

    public void waitForTasks() {
        while (this.c.size() != 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
    }
}
