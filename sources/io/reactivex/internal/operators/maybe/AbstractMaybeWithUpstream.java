package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeSource;

abstract class AbstractMaybeWithUpstream<T, R> extends Maybe<R> {
    protected final MaybeSource<T> a;

    AbstractMaybeWithUpstream(MaybeSource<T> maybeSource) {
        this.a = maybeSource;
    }
}
