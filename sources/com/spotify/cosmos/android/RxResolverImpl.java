package com.spotify.cosmos.android;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Lifetime;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import hu.akarnokd.rxjava.interop.FlowableV2ToObservableV1.SourceSubscriber;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.FlowableOperator;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableLift;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class RxResolverImpl implements RxResolver {
    private final Scheduler mIoScheduler;
    private final Observable<RemoteNativeRouter> mRouter;
    private final Set<hek> mSubscriptions = new HashSet();

    class PerformRequestOperator implements b<Response, RemoteNativeRouter> {
        private final StackTraceElement[] mObservableStackTrace = vid.a();
        /* access modifiers changed from: private */
        public final Request mRequest;
        private final String mTag;

        public PerformRequestOperator(Request request) {
            this.mRequest = request;
            StringBuilder sb = new StringBuilder();
            sb.append(request.getAction());
            sb.append(": ");
            sb.append(request.getUri());
            this.mTag = sb.toString();
        }

        /* access modifiers changed from: private */
        public boolean isSubscribeAction() {
            return Request.SUB.equals(this.mRequest.getAction());
        }

        public wuj<? super RemoteNativeRouter> call(final wuj<? super Response> wuj) {
            hek hek = new hek(wuj, vie.a(this.mTag, this.mObservableStackTrace));
            RxResolverImpl.this.add(hek);
            AnonymousClass1 r0 = new wuj<RemoteNativeRouter>(wuj) {
                public void onCompleted() {
                }

                public void onError(Throwable th) {
                    if (!wuj.isUnsubscribed()) {
                        wuj.onError(th);
                    }
                }

                public void onNext(RemoteNativeRouter remoteNativeRouter) {
                    Lifetime resolve = remoteNativeRouter.resolve(PerformRequestOperator.this.mRequest.getAction(), PerformRequestOperator.this.mRequest.getUri(), PerformRequestOperator.this.mRequest.getHeaders(), PerformRequestOperator.this.mRequest.getBody(), new ResolverCallbackReceiver(null) {
                        /* access modifiers changed from: protected */
                        public void onResolved(Response response) {
                            if (!wuj.isUnsubscribed()) {
                                wuj.onNext(response);
                                if (!PerformRequestOperator.this.isSubscribeAction()) {
                                    wuj.onCompleted();
                                }
                            }
                        }

                        /* access modifiers changed from: protected */
                        public void onError(Throwable th) {
                            if (!wuj.isUnsubscribed()) {
                                wuj.onError(th);
                            }
                        }
                    });
                    resolve.getClass();
                    add(xaj.a((wum) new wum(resolve) {
                        private final /* synthetic */ Lifetime f$0;

                        public final 
/*
Method generation error in method: com.spotify.cosmos.android.-$$Lambda$ITq8z2bd4vZFnmP-0ZeXBelH-As.call():null, dex: classes.dex
                        java.lang.NullPointerException
                        	at jadx.core.codegen.ClassGen.useType(ClassGen.java:442)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:109)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:311)
                        	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:262)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:225)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:661)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:595)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:353)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:223)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:105)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:773)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:713)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:357)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:223)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:105)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:773)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:713)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:357)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:239)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:213)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:210)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:203)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:316)
                        	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:262)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:225)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:661)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:595)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:353)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:239)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:213)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:210)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:203)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:316)
                        	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:262)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:225)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:110)
                        	at jadx.core.codegen.ClassGen.addInnerClasses(ClassGen.java:237)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:224)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:110)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:76)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:32)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:20)
                        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
                        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
                        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
                        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
                        
*/
                    }));
                }
            };
            r0.add(xaj.a((wum) new wum(hek) {
                private final /* synthetic */ hek f$1;

                {
                    this.f$1 = r2;
                }

                public final void call() {
                    PerformRequestOperator.this.lambda$call$0$RxResolverImpl$PerformRequestOperator(this.f$1);
                }
            }));
            return r0;
        }

        public /* synthetic */ void lambda$call$0$RxResolverImpl$PerformRequestOperator(hek hek) {
            RxResolverImpl.this.remove(hek);
        }
    }

    public RxResolverImpl(Observable<RemoteNativeRouter> observable, Scheduler scheduler) {
        this.mRouter = observable;
        this.mIoScheduler = scheduler;
    }

    public Observable<Response> resolve(Request request, Scheduler scheduler) {
        Flowable a = this.mRouter.a(0).a(scheduler).d().a(BackpressureStrategy.BUFFER);
        PerformRequestOperator performRequestOperator = new PerformRequestOperator(request);
        ObjectHelper.a(performRequestOperator, "operator is null");
        AnonymousClass3 r4 = new FlowableOperator<R, T>(performRequestOperator) {
            private /* synthetic */ b a;

            {
                this.a = r1;
            }

            public final wrg<? super T> a(wrg<? super R> wrg) {
                wuj wuj;
                a aVar = new a(wrg);
                wrg.a(new b(aVar));
                try {
                    wuj = (wuj) ObjectHelper.a(this.a.call(aVar), "The operator returned a null rx.Subscriber");
                } catch (Throwable th) {
                    Exceptions.b(th);
                    wul.b(th);
                    wrg.onError(th);
                    wuj = wzp.a(wzk.a());
                    wuj.unsubscribe();
                }
                SourceSubscriber sourceSubscriber = new SourceSubscriber(wuj);
                wuj.add(sourceSubscriber);
                wuj.setProducer(sourceSubscriber);
                return sourceSubscriber;
            }
        };
        ObjectHelper.a(r4, "lifter is null");
        return RxJavaPlugins.a((Flowable<T>) new FlowableLift<T>(a, r4)).j();
    }

    public Observable<Response> resolve(Request request) {
        return resolve(request, this.mIoScheduler);
    }

    public Completable resolveCompletable(Request request, Scheduler scheduler) {
        return resolve(request, scheduler).h().e(new Function() {
            public final Object apply(Object obj) {
                return RxResolverImpl.lambda$resolveCompletable$0(Request.this, (Response) obj);
            }
        });
    }

    static /* synthetic */ CompletableSource lambda$resolveCompletable$0(Request request, Response response) {
        if (response.getStatus() < 400) {
            return Completable.a();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(request.getAction());
        sb.append(' ');
        sb.append(request.getUri());
        sb.append(": failed with ");
        sb.append(response.getStatus());
        sb.append(" status code.");
        return Completable.a((Throwable) new CosmosException(sb.toString()));
    }

    public Completable resolveCompletable(Request request) {
        return resolveCompletable(request, this.mIoScheduler);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x002b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.List<defpackage.vie> unsubscribeAndReturnLeaks() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0056 }
            java.util.Set<hek> r1 = r6.mSubscriptions     // Catch:{ all -> 0x0056 }
            r0.<init>(r1)     // Catch:{ all -> 0x0056 }
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x0056 }
            if (r1 == 0) goto L_0x0014
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0056 }
            monitor-exit(r6)
            return r0
        L_0x0014:
            java.lang.String r1 = "Found active subscribers:\n%s"
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x0056 }
            java.lang.String r4 = r6.describeActiveSubscriptions()     // Catch:{ all -> 0x0056 }
            r5 = 0
            r3[r5] = r4     // Catch:{ all -> 0x0056 }
            com.spotify.base.java.logging.Logger.e(r1, r3)     // Catch:{ all -> 0x0056 }
            java.util.ArrayList r1 = com.google.common.collect.Lists.a()     // Catch:{ all -> 0x0056 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0056 }
        L_0x002b:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0056 }
            if (r3 == 0) goto L_0x0054
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0056 }
            hek r3 = (defpackage.hek) r3     // Catch:{ all -> 0x0056 }
            wuk r4 = r3.a     // Catch:{ all -> 0x0056 }
            if (r4 == 0) goto L_0x004b
            wuk r4 = r3.a     // Catch:{ all -> 0x0056 }
            boolean r4 = r4.isUnsubscribed()     // Catch:{ all -> 0x0056 }
            if (r4 == 0) goto L_0x0044
            goto L_0x004b
        L_0x0044:
            wuk r4 = r3.a     // Catch:{ all -> 0x0056 }
            r4.unsubscribe()     // Catch:{ all -> 0x0056 }
            r4 = 1
            goto L_0x004c
        L_0x004b:
            r4 = 0
        L_0x004c:
            if (r4 == 0) goto L_0x002b
            vie r3 = r3.b     // Catch:{ all -> 0x0056 }
            r1.add(r3)     // Catch:{ all -> 0x0056 }
            goto L_0x002b
        L_0x0054:
            monitor-exit(r6)
            return r1
        L_0x0056:
            r0 = move-exception
            monitor-exit(r6)
            goto L_0x005a
        L_0x0059:
            throw r0
        L_0x005a:
            goto L_0x0059
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.cosmos.android.RxResolverImpl.unsubscribeAndReturnLeaks():java.util.List");
    }

    private String describeActiveSubscriptions() {
        StringBuilder sb = new StringBuilder();
        ArrayList<hek> arrayList = new ArrayList<>(this.mSubscriptions);
        sb.append(String.format(Locale.getDefault(), "#Active subscriptions: %d", new Object[]{Integer.valueOf(arrayList.size())}));
        for (hek hek : arrayList) {
            sb.append(String.format(Locale.getDefault(), "\n%s", new Object[]{hek.b.a}));
        }
        return sb.toString();
    }

    /* access modifiers changed from: private */
    public synchronized void remove(hek hek) {
        if (this.mSubscriptions.remove(hek)) {
            Logger.b("Removed %s subscription.\n%s", hek.b.a, describeActiveSubscriptions());
        }
    }

    /* access modifiers changed from: private */
    public synchronized void add(hek hek) {
        this.mSubscriptions.add(hek);
        Logger.b("Added %s subscription.\n%s", hek.b.a, describeActiveSubscriptions());
    }
}
