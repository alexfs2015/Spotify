package com.uber.rxdogtag;

import io.reactivex.CompletableObserver;
import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;

public interface ObserverHandler {

    /* renamed from: com.uber.rxdogtag.ObserverHandler$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static CompletableObserver $default$a(ObserverHandler observerHandler, CompletableObserver completableObserver) {
            return completableObserver;
        }

        public static MaybeObserver $default$a(ObserverHandler observerHandler, MaybeObserver maybeObserver) {
            return maybeObserver;
        }

        public static Observer $default$a(ObserverHandler observerHandler, Observer observer) {
            return observer;
        }

        public static SingleObserver $default$a(ObserverHandler observerHandler, SingleObserver singleObserver) {
            return singleObserver;
        }

        public static wrg $default$a(ObserverHandler observerHandler, wrg wrg) {
            return wrg;
        }
    }

    CompletableObserver a(CompletableObserver completableObserver);

    MaybeObserver a(MaybeObserver maybeObserver);

    Observer a(Observer observer);

    SingleObserver a(SingleObserver singleObserver);

    wrg a(wrg wrg);
}
