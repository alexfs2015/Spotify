package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: fdn reason: default package */
public final class fdn {

    /* renamed from: fdn$a */
    public static final class a<T> {
        private final Field a;

        private a(Field field) {
            this.a = field;
            field.setAccessible(true);
        }

        /* synthetic */ a(Field field, byte b) {
            this(field);
        }

        public final void a(T t, int i) {
            try {
                this.a.set(t, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        public final void a(T t, Object obj) {
            try {
                this.a.set(t, obj);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
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

    public static <K, V> void a(fdf<K, V> fdf, ObjectInputStream objectInputStream) {
        a(fdf, objectInputStream, objectInputStream.readInt());
    }

    public static <K, V> void a(fdf<K, V> fdf, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            Collection c = fdf.c(objectInputStream.readObject());
            int readInt = objectInputStream.readInt();
            for (int i3 = 0; i3 < readInt; i3++) {
                c.add(objectInputStream.readObject());
            }
        }
    }

    public static <K, V> void a(fdf<K, V> fdf, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(fdf.b().size());
        for (Entry entry : fdf.b().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            for (Object writeObject : (Collection) entry.getValue()) {
                objectOutputStream.writeObject(writeObject);
            }
        }
    }

    public static <E> void a(fdh<E> fdh, ObjectInputStream objectInputStream) {
        a(fdh, objectInputStream, objectInputStream.readInt());
    }

    public static <E> void a(fdh<E> fdh, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            fdh.a(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    public static <E> void a(fdh<E> fdh, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(fdh.S_().size());
        for (defpackage.fdh.a aVar : fdh.S_()) {
            objectOutputStream.writeObject(aVar.b());
            objectOutputStream.writeInt(aVar.a());
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

    public static <K, V> void a(Map<K, V> map, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(map.size());
        for (Entry entry : map.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }
}
