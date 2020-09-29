package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: fcv reason: default package */
public final class fcv {

    /* renamed from: fcv$a */
    public static final class a<T> {
        private final Field a;

        /* synthetic */ a(Field field, byte b) {
            this(field);
        }

        private a(Field field) {
            this.a = field;
            field.setAccessible(true);
        }

        public final void a(T t, Object obj) {
            try {
                this.a.set(t, obj);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        public final void a(T t, int i) {
            try {
                this.a.set(t, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    public static <K, V> void a(Map<K, V> map, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(map.size());
        for (Entry entry : map.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public static <K, V> void a(Map<K, V> map, ObjectInputStream objectInputStream) {
        a(map, objectInputStream, objectInputStream.readInt());
    }

    public static <K, V> void a(Map<K, V> map, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            map.put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    public static <E> void a(fcp<E> fcp, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(fcp.S_().size());
        for (defpackage.fcp.a aVar : fcp.S_()) {
            objectOutputStream.writeObject(aVar.b());
            objectOutputStream.writeInt(aVar.a());
        }
    }

    public static <E> void a(fcp<E> fcp, ObjectInputStream objectInputStream) {
        a(fcp, objectInputStream, objectInputStream.readInt());
    }

    public static <E> void a(fcp<E> fcp, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            fcp.a(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    public static <K, V> void a(fcn<K, V> fcn, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(fcn.b().size());
        for (Entry entry : fcn.b().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            for (Object writeObject : (Collection) entry.getValue()) {
                objectOutputStream.writeObject(writeObject);
            }
        }
    }

    public static <K, V> void a(fcn<K, V> fcn, ObjectInputStream objectInputStream) {
        a(fcn, objectInputStream, objectInputStream.readInt());
    }

    public static <K, V> void a(fcn<K, V> fcn, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            Collection c = fcn.c(objectInputStream.readObject());
            int readInt = objectInputStream.readInt();
            for (int i3 = 0; i3 < readInt; i3++) {
                c.add(objectInputStream.readObject());
            }
        }
    }

    public static <T> a<T> a(Class<T> cls, String str) {
        try {
            return new a<>(cls.getDeclaredField(str), 0);
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }
}
