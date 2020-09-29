package com.uber.rxdogtag;

import com.uber.rxdogtag.ObserverHandler.CC;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.functions.BiFunction;
import io.reactivex.observers.LambdaConsumerIntrospection;
import io.reactivex.plugins.RxJavaPlugins;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public final class RxDogTag {

    public static final class Builder {
        boolean a = false;
        List<ObserverHandler> b = new ArrayList();
        Set<String> c = new LinkedHashSet();

        Builder() {
        }
    }

    static class Configuration {
        private static final Collection<String> d = Arrays.asList(new String[]{Observable.class.getPackage().getName(), DogTagObserver.class.getPackage().getName()});
        private static final ObserverHandler e = new ObserverHandler() {
            public /* synthetic */ CompletableObserver a(CompletableObserver completableObserver) {
                return CC.$default$a((ObserverHandler) this, completableObserver);
            }

            public /* synthetic */ MaybeObserver a(MaybeObserver maybeObserver) {
                return CC.$default$a((ObserverHandler) this, maybeObserver);
            }

            public /* synthetic */ Observer a(Observer observer) {
                return CC.$default$a((ObserverHandler) this, observer);
            }

            public /* synthetic */ SingleObserver a(SingleObserver singleObserver) {
                return CC.$default$a((ObserverHandler) this, singleObserver);
            }

            public /* synthetic */ xfl a(xfl xfl) {
                return CC.$default$a((ObserverHandler) this, xfl);
            }
        };
        final boolean a = false;
        final List<ObserverHandler> b;
        final Set<String> c;

        Configuration(Builder builder) {
            ArrayList arrayList = new ArrayList(builder.b);
            arrayList.add(e);
            LinkedHashSet linkedHashSet = new LinkedHashSet(builder.c);
            linkedHashSet.addAll(d);
            this.b = Collections.unmodifiableList(arrayList);
            this.c = Collections.unmodifiableSet(linkedHashSet);
        }
    }

    interface NonCheckingConsumer<T> {
        void accept(T t);
    }

    interface NonCheckingPredicate<T> {
        boolean test(T t);
    }

    private static <T> int a(T[] tArr, NonCheckingPredicate<T> nonCheckingPredicate) {
        for (int length = tArr.length - 1; length >= 0; length--) {
            if (nonCheckingPredicate.test(tArr[length])) {
                return length;
            }
        }
        return -1;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ CompletableObserver a(Configuration configuration, Completable completable, CompletableObserver completableObserver) {
        for (ObserverHandler a : configuration.b) {
            CompletableObserver a2 = a.a(completableObserver);
            if ((a2 instanceof LambdaConsumerIntrospection) && !((LambdaConsumerIntrospection) a2).aZ_()) {
                return new DogTagCompletableObserver(configuration, completableObserver);
            }
        }
        return completableObserver;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ MaybeObserver a(Configuration configuration, Maybe maybe, MaybeObserver maybeObserver) {
        for (ObserverHandler a : configuration.b) {
            MaybeObserver a2 = a.a(maybeObserver);
            if ((a2 instanceof LambdaConsumerIntrospection) && !((LambdaConsumerIntrospection) a2).aZ_()) {
                return new DogTagMaybeObserver(configuration, maybeObserver);
            }
        }
        return maybeObserver;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Observer a(Configuration configuration, Observable observable, Observer observer) {
        for (ObserverHandler a : configuration.b) {
            Observer a2 = a.a(observer);
            if ((a2 instanceof LambdaConsumerIntrospection) && !((LambdaConsumerIntrospection) a2).aZ_()) {
                return new DogTagObserver(configuration, observer);
            }
        }
        return observer;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ SingleObserver a(Configuration configuration, Single single, SingleObserver singleObserver) {
        for (ObserverHandler a : configuration.b) {
            SingleObserver a2 = a.a(singleObserver);
            if ((a2 instanceof LambdaConsumerIntrospection) && !((LambdaConsumerIntrospection) a2).aZ_()) {
                return new DogTagSingleObserver(configuration, singleObserver);
            }
        }
        return singleObserver;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ xfl a(Configuration configuration, Flowable flowable, xfl xfl) {
        for (ObserverHandler a : configuration.b) {
            xfl a2 = a.a(xfl);
            if ((a2 instanceof LambdaConsumerIntrospection) && !((LambdaConsumerIntrospection) a2).aZ_()) {
                return new DogTagSubscriber(configuration, xfl);
            }
        }
        return xfl;
    }

    public static void a() {
        a(new Configuration(new Builder()));
    }

    private static synchronized void a(Configuration configuration) {
        synchronized (RxDogTag.class) {
            RxJavaPlugins.d((BiFunction<? super Observable, ? super Observer, ? extends Observer>) new BiFunction() {
                public final Object apply(Object obj, Object obj2) {
                    return RxDogTag.a(Configuration.this, (Observable) obj, (Observer) obj2);
                }
            });
            RxJavaPlugins.b((BiFunction<? super Flowable, ? super xfl, ? extends xfl>) new BiFunction() {
                public final Object apply(Object obj, Object obj2) {
                    return RxDogTag.a(Configuration.this, (Flowable) obj, (xfl) obj2);
                }
            });
            RxJavaPlugins.e((BiFunction<? super Single, ? super SingleObserver, ? extends SingleObserver>) new BiFunction() {
                public final Object apply(Object obj, Object obj2) {
                    return RxDogTag.a(Configuration.this, (Single) obj, (SingleObserver) obj2);
                }
            });
            RxJavaPlugins.c((BiFunction<? super Maybe, MaybeObserver, ? extends MaybeObserver>) new BiFunction() {
                public final Object apply(Object obj, Object obj2) {
                    return RxDogTag.a(Configuration.this, (Maybe) obj, (MaybeObserver) obj2);
                }
            });
            RxJavaPlugins.a((BiFunction<? super Completable, ? super CompletableObserver, ? extends CompletableObserver>) new BiFunction() {
                public final Object apply(Object obj, Object obj2) {
                    return RxDogTag.a(Configuration.this, (Completable) obj, (CompletableObserver) obj2);
                }
            });
        }
    }

    static void a(Configuration configuration, Throwable th, Throwable th2, String str) {
        StackTraceElement stackTraceElement;
        OnErrorNotImplementedException onErrorNotImplementedException;
        Throwable th3;
        StackTraceElement[] stackTraceElementArr;
        boolean z;
        Set<String> set = configuration.c;
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                String str2 = "unknown";
                stackTraceElement = new StackTraceElement("Unknown", str2, str2, 0);
                break;
            }
            stackTraceElement = stackTrace[i];
            String className = stackTraceElement.getClassName();
            Iterator it = set.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (className.startsWith((String) it.next())) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                break;
            }
            i++;
        }
        String str3 = "";
        if (th2 instanceof OnErrorNotImplementedException) {
            onErrorNotImplementedException = (OnErrorNotImplementedException) th2;
            th3 = onErrorNotImplementedException.getCause();
        } else {
            String message = th2.getMessage();
            if (message == null) {
                message = str3;
            }
            OnErrorNotImplementedException onErrorNotImplementedException2 = new OnErrorNotImplementedException(message, th2);
            onErrorNotImplementedException2.setStackTrace(new StackTraceElement[0]);
            th3 = th2;
            onErrorNotImplementedException = onErrorNotImplementedException2;
        }
        StackTraceElement[] stackTrace2 = th3.getStackTrace();
        char c = 3;
        int i2 = str != null ? 4 : 3;
        if (configuration.a) {
            stackTraceElementArr = new StackTraceElement[(stackTrace2.length + 1)];
            stackTraceElementArr[0] = stackTraceElement;
            if (stackTrace2.length != 0) {
                System.arraycopy(stackTrace2, 0, stackTraceElementArr, 1, stackTrace2.length);
            }
        } else {
            int a = a((T[]) stackTrace2, (NonCheckingPredicate<T>) $$Lambda$RxDogTag$_ktBu2gntjTaco3V8FU54wsluc.INSTANCE);
            int i3 = a != -1 ? a + 1 : 0;
            StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[((stackTrace2.length + i2) - i3)];
            stackTraceElementArr2[0] = stackTraceElement;
            stackTraceElementArr2[1] = new StackTraceElement("[[ ↑↑ Inferred subscribe point ↑↑ ]]", str3, str3, 0);
            if (str != null) {
                stackTraceElementArr2[2] = new StackTraceElement(String.format(Locale.US, "[[ Originating callback: %s ]]", new Object[]{str}), str3, str3, 0);
            } else {
                c = 2;
            }
            stackTraceElementArr2[c] = new StackTraceElement("[[ ↓↓ Original trace ↓↓ ]]", str3, str3, 0);
            if (stackTrace2.length != 0) {
                System.arraycopy(stackTrace2, i3, stackTraceElementArr2, i2, stackTrace2.length - i3);
            }
            stackTraceElementArr = stackTraceElementArr2;
        }
        th3.setStackTrace(stackTraceElementArr);
        RxJavaPlugins.a((Throwable) onErrorNotImplementedException);
    }

    static void a(NonCheckingConsumer<Throwable> nonCheckingConsumer, Runnable runnable) {
        UncaughtExceptionHandler uncaughtExceptionHandler = Thread.currentThread().getUncaughtExceptionHandler();
        try {
            Thread.currentThread().setUncaughtExceptionHandler(new UncaughtExceptionHandler(uncaughtExceptionHandler, nonCheckingConsumer) {
                private final /* synthetic */ UncaughtExceptionHandler f$0;
                private final /* synthetic */ NonCheckingConsumer f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void uncaughtException(Thread thread, Throwable th) {
                    RxDogTag.a(this.f$0, this.f$1, thread, th);
                }
            });
            runnable.run();
        } catch (OnErrorNotImplementedException e) {
            nonCheckingConsumer.accept(e.getCause());
        } catch (Throwable th) {
            Thread.currentThread().setUncaughtExceptionHandler(uncaughtExceptionHandler);
            throw th;
        }
        Thread.currentThread().setUncaughtExceptionHandler(uncaughtExceptionHandler);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(UncaughtExceptionHandler uncaughtExceptionHandler, NonCheckingConsumer nonCheckingConsumer, Thread thread, Throwable th) {
        Thread.currentThread().setUncaughtExceptionHandler(uncaughtExceptionHandler);
        if (th instanceof OnErrorNotImplementedException) {
            nonCheckingConsumer.accept(th);
            return;
        }
        if (th instanceof NullPointerException) {
            if ("subscribeActual failed".equals(th.getMessage())) {
                nonCheckingConsumer.accept(th.getCause());
                return;
            }
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }
}
