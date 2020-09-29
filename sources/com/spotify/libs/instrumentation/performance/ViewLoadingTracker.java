package com.spotify.libs.instrumentation.performance;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.spotify.libs.instrumentation.performance.ViewLoadSequence.Step;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.UUID;

public final class ViewLoadingTracker {
    public volatile State a;
    final LinkedHashSet<String> b = new LinkedHashSet<>();
    final LinkedHashSet<String> c = new LinkedHashSet<>();
    boolean d = true;
    private final String e;
    private final String f;
    private final View g;
    private final Handler h;
    private String i;
    private String j;
    private final glv k;
    private final glo l;
    private final Context m;
    private final LinkedHashMap<String, Long> n = new LinkedHashMap<>();
    private final LinkedHashMap<String, String> o = new LinkedHashMap<>();
    private BroadcastReceiver p = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            String stringExtra = intent.getStringExtra("event");
            String stringExtra2 = intent.getStringExtra("uri");
            if (stringExtra != null && stringExtra2 != null) {
                char c = 65535;
                int hashCode = stringExtra.hashCode();
                if (hashCode != -1670636944) {
                    if (hashCode != -1060732754) {
                        if (hashCode == 1617603406 && stringExtra.equals("uri_succeeded")) {
                            c = 1;
                        }
                    } else if (stringExtra.equals("uri_started")) {
                        c = 0;
                    }
                } else if (stringExtra.equals("uri_failed")) {
                    c = 2;
                }
                if (c == 0) {
                    ViewLoadingTracker viewLoadingTracker = ViewLoadingTracker.this;
                    if (viewLoadingTracker.c.isEmpty()) {
                        viewLoadingTracker.a(Step.IMAGE_LOADING_STARTED);
                    }
                    if (viewLoadingTracker.d) {
                        viewLoadingTracker.b.add(stringExtra2);
                        viewLoadingTracker.c.add(stringExtra2);
                    }
                } else if (c == 1 || c == 2) {
                    ViewLoadingTracker.a(ViewLoadingTracker.this, stringExtra2);
                }
            }
        }
    };

    /* renamed from: com.spotify.libs.instrumentation.performance.ViewLoadingTracker$5 reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] a = new int[State.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.libs.instrumentation.performance.ViewLoadingTracker$State[] r0 = com.spotify.libs.instrumentation.performance.ViewLoadingTracker.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.libs.instrumentation.performance.ViewLoadingTracker$State r1 = com.spotify.libs.instrumentation.performance.ViewLoadingTracker.State.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.libs.instrumentation.performance.ViewLoadingTracker$State r1 = com.spotify.libs.instrumentation.performance.ViewLoadingTracker.State.STARTED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.libs.instrumentation.performance.ViewLoadingTracker$State r1 = com.spotify.libs.instrumentation.performance.ViewLoadingTracker.State.DATA_LOADED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.libs.instrumentation.performance.ViewLoadingTracker.AnonymousClass5.<clinit>():void");
        }
    }

    public enum DataSource {
        CACHE("cache"),
        REMOTE("remote"),
        UNKNOWN("unknown");
        
        private final String mSource;

        private DataSource(String str) {
            this.mSource = str;
        }

        public final String toString() {
            return this.mSource;
        }
    }

    public enum MetadataKey {
        DATASOURCE("data-source"),
        REASON("reason"),
        RESTORED_SEQUENCE_ID("restored_sequence_id"),
        IMAGES_ABOVE_THE_FOLD("images-above-the-fold"),
        ACTUAL_USABLE_STATE("actual_usable_state");
        
        private final String mKey;

        private MetadataKey(String str) {
            this.mKey = str;
        }

        public final String toString() {
            return this.mKey;
        }
    }

    public enum Reason {
        LOAD("load"),
        RELOAD("reload"),
        UNKNOWN("unknown");
        
        private final String mReason;

        private Reason(String str) {
            this.mReason = str;
        }

        public final String toString() {
            return this.mReason;
        }
    }

    public enum State {
        INITIALIZED,
        STARTED,
        DATA_LOADED,
        DRAW_COMPLETED,
        CANCELLED,
        FAILED
    }

    public ViewLoadingTracker(View view, glv glv, glo glo, String str, Bundle bundle, Handler handler, Context context) {
        this.g = view;
        this.k = glv;
        this.l = glo;
        this.h = handler;
        this.m = context;
        this.f = str;
        this.e = UUID.randomUUID().toString();
        if (bundle != null) {
            this.i = bundle.getString("ViewLoadingTracker.PAGE_ID");
            a(MetadataKey.RESTORED_SEQUENCE_ID, bundle.getString("ViewLoadingTracker.SEQUENCE_ID"));
            a(Step.RESTORED);
            String string = bundle.getString("ViewLoadingTracker.STATE");
            if (string == null) {
                this.a = State.DRAW_COMPLETED;
            } else {
                try {
                    int i2 = AnonymousClass5.a[State.valueOf(string).ordinal()];
                    if (i2 == 1) {
                        this.a = State.INITIALIZED;
                    } else if (i2 == 2) {
                        this.a = State.INITIALIZED;
                        a();
                    } else if (i2 != 3) {
                        this.a = State.DRAW_COMPLETED;
                    } else {
                        this.a = State.STARTED;
                        b();
                    }
                } catch (IllegalArgumentException unused) {
                    this.a = State.DRAW_COMPLETED;
                }
            }
        } else {
            this.a = State.INITIALIZED;
        }
    }

    public final void a(Bundle bundle) {
        if (this.a == State.INITIALIZED || this.a == State.STARTED || this.a == State.DATA_LOADED) {
            a(Step.CANCELLED);
            b(Step.CANCELLED);
        }
        bundle.putString("ViewLoadingTracker.PAGE_ID", this.i);
        bundle.putString("ViewLoadingTracker.SEQUENCE_ID", this.e);
        bundle.putString("ViewLoadingTracker.STATE", this.a.toString());
    }

    public final synchronized void a(Reason reason) {
        if (this.a == State.INITIALIZED) {
            this.a = State.STARTED;
            a(Step.STARTED);
            if (reason != Reason.UNKNOWN) {
                a(MetadataKey.REASON, reason.toString());
            }
            this.j = jtl.a(this.m).a();
            mc.a(this.m).a(this.p, new IntentFilter("image-load-event"));
        }
    }

    public final synchronized void a() {
        a(Reason.UNKNOWN);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(com.spotify.libs.instrumentation.performance.ViewLoadingTracker.DataSource r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.spotify.libs.instrumentation.performance.ViewLoadingTracker$State r0 = r2.a     // Catch:{ all -> 0x004b }
            com.spotify.libs.instrumentation.performance.ViewLoadingTracker$State r1 = com.spotify.libs.instrumentation.performance.ViewLoadingTracker.State.STARTED     // Catch:{ all -> 0x004b }
            if (r0 != r1) goto L_0x0049
            com.spotify.libs.instrumentation.performance.ViewLoadSequence$Step r0 = com.spotify.libs.instrumentation.performance.ViewLoadSequence.Step.DATA_LOADED     // Catch:{ all -> 0x004b }
            r2.a(r0)     // Catch:{ all -> 0x004b }
            com.spotify.libs.instrumentation.performance.ViewLoadingTracker$DataSource r0 = com.spotify.libs.instrumentation.performance.ViewLoadingTracker.DataSource.UNKNOWN     // Catch:{ all -> 0x004b }
            if (r3 == r0) goto L_0x0019
            com.spotify.libs.instrumentation.performance.ViewLoadingTracker$MetadataKey r0 = com.spotify.libs.instrumentation.performance.ViewLoadingTracker.MetadataKey.DATASOURCE     // Catch:{ all -> 0x004b }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x004b }
            r2.a(r0, r3)     // Catch:{ all -> 0x004b }
        L_0x0019:
            android.view.View r3 = r2.g     // Catch:{ all -> 0x004b }
            if (r3 != 0) goto L_0x0028
            com.spotify.libs.instrumentation.performance.ViewLoadSequence$Step r3 = com.spotify.libs.instrumentation.performance.ViewLoadSequence.Step.DATA_LOADED     // Catch:{ all -> 0x004b }
            r2.b(r3)     // Catch:{ all -> 0x004b }
            com.spotify.libs.instrumentation.performance.ViewLoadingTracker$State r3 = com.spotify.libs.instrumentation.performance.ViewLoadingTracker.State.DRAW_COMPLETED     // Catch:{ all -> 0x004b }
            r2.a = r3     // Catch:{ all -> 0x004b }
            monitor-exit(r2)
            return
        L_0x0028:
            com.spotify.libs.instrumentation.performance.ViewLoadingTracker$State r3 = com.spotify.libs.instrumentation.performance.ViewLoadingTracker.State.DATA_LOADED     // Catch:{ all -> 0x004b }
            r2.a = r3     // Catch:{ all -> 0x004b }
            android.os.Handler r3 = r2.h     // Catch:{ all -> 0x004b }
            android.os.Looper r3 = r3.getLooper()     // Catch:{ all -> 0x004b }
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch:{ all -> 0x004b }
            if (r3 != r0) goto L_0x003f
            android.view.View r3 = r2.g     // Catch:{ all -> 0x004b }
            r2.a(r3)     // Catch:{ all -> 0x004b }
            monitor-exit(r2)
            return
        L_0x003f:
            android.os.Handler r3 = r2.h     // Catch:{ all -> 0x004b }
            com.spotify.libs.instrumentation.performance.-$$Lambda$ViewLoadingTracker$0zfEDe6DQDN6XLa8jHvaDfrbwws r0 = new com.spotify.libs.instrumentation.performance.-$$Lambda$ViewLoadingTracker$0zfEDe6DQDN6XLa8jHvaDfrbwws     // Catch:{ all -> 0x004b }
            r0.<init>()     // Catch:{ all -> 0x004b }
            r3.post(r0)     // Catch:{ all -> 0x004b }
        L_0x0049:
            monitor-exit(r2)
            return
        L_0x004b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.libs.instrumentation.performance.ViewLoadingTracker.a(com.spotify.libs.instrumentation.performance.ViewLoadingTracker$DataSource):void");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void k() {
        a(this.g);
    }

    public final synchronized void b() {
        a(DataSource.UNKNOWN);
    }

    public final synchronized void c() {
        a(Step.FINISHED);
        Step step = Step.FINISHED;
        String a2 = jtl.a(this.m).a();
        glv glv = this.k;
        ViewLoadSequence viewLoadSequence = new ViewLoadSequence(this.e, this.i, this.f, step.toString(), this.j, a2, this.n, this.o);
        for (glu c2 : glv.a) {
            c2.c(viewLoadSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void h() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.spotify.libs.instrumentation.performance.ViewLoadingTracker$State r0 = r3.a     // Catch:{ all -> 0x0031 }
            com.spotify.libs.instrumentation.performance.ViewLoadingTracker$State r1 = com.spotify.libs.instrumentation.performance.ViewLoadingTracker.State.DATA_LOADED     // Catch:{ all -> 0x0031 }
            if (r0 != r1) goto L_0x002f
            com.spotify.libs.instrumentation.performance.ViewLoadingTracker$State r0 = com.spotify.libs.instrumentation.performance.ViewLoadingTracker.State.DRAW_COMPLETED     // Catch:{ all -> 0x0031 }
            r3.a = r0     // Catch:{ all -> 0x0031 }
            com.spotify.libs.instrumentation.performance.ViewLoadingTracker$MetadataKey r0 = com.spotify.libs.instrumentation.performance.ViewLoadingTracker.MetadataKey.ACTUAL_USABLE_STATE     // Catch:{ all -> 0x0031 }
            glo r1 = r3.l     // Catch:{ all -> 0x0031 }
            long r1 = r1.currentTimeMillisMonotonic()     // Catch:{ all -> 0x0031 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0031 }
            r3.a(r0, r1)     // Catch:{ all -> 0x0031 }
            java.util.LinkedHashSet<java.lang.String> r0 = r3.b     // Catch:{ all -> 0x0031 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x002c
            r3.i()     // Catch:{ all -> 0x0031 }
            com.spotify.libs.instrumentation.performance.ViewLoadSequence$Step r0 = com.spotify.libs.instrumentation.performance.ViewLoadSequence.Step.FINISHED     // Catch:{ all -> 0x0031 }
            r3.b(r0)     // Catch:{ all -> 0x0031 }
            monitor-exit(r3)
            return
        L_0x002c:
            r0 = 0
            r3.d = r0     // Catch:{ all -> 0x0031 }
        L_0x002f:
            monitor-exit(r3)
            return
        L_0x0031:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.libs.instrumentation.performance.ViewLoadingTracker.h():void");
    }

    public final synchronized void d() {
        if (this.a == State.STARTED) {
            this.a = State.FAILED;
            a(Step.FAILED);
            b(Step.FAILED);
        }
    }

    public final synchronized void e() {
        if (this.a == State.STARTED) {
            this.a = State.CANCELLED;
            a(Step.CANCELLED);
            b(Step.CANCELLED);
        }
    }

    private void i() {
        mc.a(this.m).a(this.p);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(long j2) {
        h();
    }

    /* access modifiers changed from: private */
    public void j() {
        Choreographer.getInstance().postFrameCallback(new FrameCallback() {
            public final void doFrame(long j) {
                ViewLoadingTracker.this.a(j);
            }
        });
    }

    public final synchronized void a(String str) {
        this.i = str;
    }

    /* access modifiers changed from: 0000 */
    public void a(Step step) {
        this.n.put(step.toString(), Long.valueOf(this.l.currentTimeMillisMonotonic()));
    }

    private void a(MetadataKey metadataKey, String str) {
        this.o.put(metadataKey.toString(), str);
    }

    private void b(Step step) {
        String a2 = jtl.a(this.m).a();
        glv glv = this.k;
        ViewLoadSequence viewLoadSequence = new ViewLoadSequence(this.e, this.i, this.f, step.toString(), this.j, a2, this.n, this.o);
        glv.a(viewLoadSequence);
    }

    public final boolean f() {
        return this.a == State.STARTED;
    }

    public final boolean g() {
        return this.a == State.DATA_LOADED;
    }

    private synchronized void a(final View view) {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            j();
        } else {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
                public final void onGlobalLayout() {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    ViewLoadingTracker.a(ViewLoadingTracker.this, view);
                }
            });
        }
        view.addOnLayoutChangeListener(new OnLayoutChangeListener() {
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                view.removeOnLayoutChangeListener(this);
                Choreographer.getInstance().postFrameCallback(new FrameCallback() {
                    public final void doFrame(long j) {
                        AnonymousClass3.this.a(j);
                    }
                });
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(long j) {
                ViewLoadingTracker.this.c();
            }
        });
    }

    static /* synthetic */ void a(ViewLoadingTracker viewLoadingTracker, String str) {
        viewLoadingTracker.b.remove(str);
        if (viewLoadingTracker.b.isEmpty()) {
            viewLoadingTracker.i();
            viewLoadingTracker.a(MetadataKey.IMAGES_ABOVE_THE_FOLD, String.valueOf(viewLoadingTracker.c.size()));
            viewLoadingTracker.a(Step.IMAGE_LOADING_FINISHED);
            if (!viewLoadingTracker.n.containsKey(Step.FINISHED.toString())) {
                viewLoadingTracker.a(Step.FINISHED);
            }
            if (viewLoadingTracker.o.containsKey(MetadataKey.ACTUAL_USABLE_STATE.toString())) {
                viewLoadingTracker.b(Step.FINISHED);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        if ((r1 instanceof android.view.ViewGroup) == false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        r0 = r0 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        r0 = r4.getChildCount() - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (r0 < 0) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        r1 = r4.getChildAt(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void a(com.spotify.libs.instrumentation.performance.ViewLoadingTracker r3, android.view.View r4) {
        /*
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0045
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
        L_0x0006:
            int r0 = r4.getChildCount()
            int r0 = r0 + -1
        L_0x000c:
            if (r0 < 0) goto L_0x001a
            android.view.View r1 = r4.getChildAt(r0)
            boolean r2 = r1 instanceof androidx.recyclerview.widget.RecyclerView
            if (r2 == 0) goto L_0x0017
            goto L_0x0032
        L_0x0017:
            int r0 = r0 + -1
            goto L_0x000c
        L_0x001a:
            int r0 = r4.getChildCount()
            int r0 = r0 + -1
        L_0x0020:
            if (r0 < 0) goto L_0x0031
            android.view.View r1 = r4.getChildAt(r0)
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x002e
            r4 = r1
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            goto L_0x0006
        L_0x002e:
            int r0 = r0 + -1
            goto L_0x0020
        L_0x0031:
            r1 = 0
        L_0x0032:
            if (r1 != 0) goto L_0x0038
            r3.j()
            goto L_0x0048
        L_0x0038:
            android.view.ViewTreeObserver r4 = r1.getViewTreeObserver()
            com.spotify.libs.instrumentation.performance.ViewLoadingTracker$4 r0 = new com.spotify.libs.instrumentation.performance.ViewLoadingTracker$4
            r0.<init>(r1)
            r4.addOnGlobalLayoutListener(r0)
            return
        L_0x0045:
            r3.j()
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.libs.instrumentation.performance.ViewLoadingTracker.a(com.spotify.libs.instrumentation.performance.ViewLoadingTracker, android.view.View):void");
    }
}
