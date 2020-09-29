package com.uber.rxdogtag;

/* renamed from: com.uber.rxdogtag.-$$Lambda$RxDogTag$_kt-Bu2gntjTaco3V8FU54wsluc reason: invalid class name */
public final /* synthetic */ class $$Lambda$RxDogTag$_ktBu2gntjTaco3V8FU54wsluc implements NonCheckingPredicate {
    public static final /* synthetic */ $$Lambda$RxDogTag$_ktBu2gntjTaco3V8FU54wsluc INSTANCE = new $$Lambda$RxDogTag$_ktBu2gntjTaco3V8FU54wsluc();

    private /* synthetic */ $$Lambda$RxDogTag$_ktBu2gntjTaco3V8FU54wsluc() {
    }

    public final boolean test(Object obj) {
        return "[[ ↓↓ Original trace ↓↓ ]]".equals(((StackTraceElement) obj).getClassName());
    }
}
