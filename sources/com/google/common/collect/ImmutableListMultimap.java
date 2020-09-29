package com.google.common.collect;

import com.google.common.collect.ImmutableMap.a;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;

public class ImmutableListMultimap<K, V> extends ImmutableMultimap<K, V> implements fcm<K, V> {
    private static final long serialVersionUID = 0;

    /* access modifiers changed from: private */
    /* renamed from: e */
    public ImmutableList<V> c(K k) {
        ImmutableList<V> immutableList = (ImmutableList) this.a.get(k);
        return immutableList == null ? ImmutableList.d() : immutableList;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        fcv.a((fcn<K, V>) this, objectOutputStream);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            a g = ImmutableMap.g();
            int i = 0;
            int i2 = 0;
            while (i < readInt) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    ImmutableList.a g2 = ImmutableList.g();
                    for (int i3 = 0; i3 < readInt2; i3++) {
                        g2.c(objectInputStream.readObject());
                    }
                    g.b(readObject, g2.a());
                    i2 += readInt2;
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder("Invalid value count ");
                    sb.append(readInt2);
                    throw new InvalidObjectException(sb.toString());
                }
            }
            try {
                a.a.a(this, (Object) g.b());
                a.b.a(this, i2);
            } catch (IllegalArgumentException e) {
                throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
            }
        } else {
            StringBuilder sb2 = new StringBuilder("Invalid key count ");
            sb2.append(readInt);
            throw new InvalidObjectException(sb2.toString());
        }
    }

    @Deprecated
    public final /* synthetic */ ImmutableCollection b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final /* synthetic */ Collection d(Object obj) {
        throw new UnsupportedOperationException();
    }
}
