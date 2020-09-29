package io.netty.util;

import io.netty.util.internal.PlatformDependent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class DefaultAttributeMap implements wgz {
    private static final AtomicReferenceFieldUpdater<DefaultAttributeMap, AtomicReferenceArray> a;
    private volatile AtomicReferenceArray<DefaultAttribute<?>> b;

    static final class DefaultAttribute<T> extends AtomicReference<T> implements wgx<T> {
        private static final long serialVersionUID = -2661411462200283011L;
        private final DefaultAttribute<?> head;
        /* access modifiers changed from: private */
        public final wgy<T> key;
        /* access modifiers changed from: private */
        public DefaultAttribute<?> next;
        /* access modifiers changed from: private */
        public DefaultAttribute<?> prev;
        /* access modifiers changed from: private */
        public volatile boolean removed;

        static {
            DefaultAttributeMap.class.desiredAssertionStatus();
        }

        DefaultAttribute(DefaultAttribute<?> defaultAttribute, wgy<T> wgy) {
            this.head = defaultAttribute;
            this.key = wgy;
        }

        DefaultAttribute() {
            this.head = this;
            this.key = null;
        }
    }

    static {
        Class<DefaultAttributeMap> cls = DefaultAttributeMap.class;
        AtomicReferenceFieldUpdater<DefaultAttributeMap, AtomicReferenceArray> a2 = PlatformDependent.a(cls, "attributes");
        if (a2 == null) {
            a2 = AtomicReferenceFieldUpdater.newUpdater(cls, AtomicReferenceArray.class, "b");
        }
        a = a2;
    }

    public <T> wgx<T> a(wgy<T> wgy) {
        if (wgy != null) {
            AtomicReferenceArray<DefaultAttribute<?>> atomicReferenceArray = this.b;
            if (atomicReferenceArray == null) {
                atomicReferenceArray = new AtomicReferenceArray<>(4);
                if (!a.compareAndSet(this, null, atomicReferenceArray)) {
                    atomicReferenceArray = this.b;
                }
            }
            int i = wgy.u & 3;
            DefaultAttribute defaultAttribute = (DefaultAttribute) atomicReferenceArray.get(i);
            if (defaultAttribute == null) {
                DefaultAttribute defaultAttribute2 = new DefaultAttribute();
                DefaultAttribute defaultAttribute3 = new DefaultAttribute(defaultAttribute2, wgy);
                defaultAttribute2.next = defaultAttribute3;
                defaultAttribute3.prev = defaultAttribute2;
                if (atomicReferenceArray.compareAndSet(i, null, defaultAttribute2)) {
                    return defaultAttribute3;
                }
                defaultAttribute = (DefaultAttribute) atomicReferenceArray.get(i);
            }
            synchronized (defaultAttribute) {
                DefaultAttribute defaultAttribute4 = defaultAttribute;
                while (true) {
                    DefaultAttribute a2 = defaultAttribute4.next;
                    if (a2 == null) {
                        DefaultAttribute defaultAttribute5 = new DefaultAttribute(defaultAttribute, wgy);
                        defaultAttribute4.next = defaultAttribute5;
                        defaultAttribute5.prev = defaultAttribute4;
                        return defaultAttribute5;
                    } else if (a2.key == wgy && !a2.removed) {
                        return a2;
                    } else {
                        defaultAttribute4 = a2;
                    }
                }
            }
        } else {
            throw new NullPointerException("key");
        }
    }
}
