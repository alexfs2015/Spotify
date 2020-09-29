package defpackage;

import com.google.protobuf.ByteString;
import com.google.protobuf.ByteString.LiteralByteString;
import com.google.protobuf.ByteString.d;
import com.google.protobuf.CodedOutputStream;
import defpackage.fjx;
import defpackage.fjx.a;
import java.io.IOException;
import java.util.Collection;

/* renamed from: fjx reason: default package */
public abstract class fjx<MessageType extends fjx<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements fko {
    protected int a = 0;

    /* renamed from: fjx$a */
    public static abstract class a<MessageType extends fjx<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements defpackage.fko.a {
        /* renamed from: a */
        public abstract BuilderType clone();

        /* access modifiers changed from: protected */
        public abstract BuilderType a(MessageType messagetype);

        /* renamed from: a */
        public abstract BuilderType b(fkc fkc, fke fke);

        protected static <T> void a(Iterable<T> iterable, Collection<? super T> collection) {
            if (iterable == null) {
                throw new NullPointerException();
            } else if (iterable instanceof fkl) {
                a((Iterable<?>) ((fkl) iterable).a());
                collection.addAll((Collection) iterable);
            } else if (iterable instanceof Collection) {
                a(iterable);
                collection.addAll((Collection) iterable);
            } else {
                for (Object next : iterable) {
                    if (next != null) {
                        collection.add(next);
                    } else {
                        throw new NullPointerException();
                    }
                }
            }
        }

        private static void a(Iterable<?> iterable) {
            for (Object obj : iterable) {
                if (obj == null) {
                    throw new NullPointerException();
                }
            }
        }

        public final /* synthetic */ defpackage.fko.a a(fko fko) {
            if (i().getClass().isInstance(fko)) {
                return a((MessageType) (fjx) fko);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    public final ByteString a() {
        try {
            d b = ByteString.b(j());
            a(b.a);
            b.a.i();
            return new LiteralByteString(b.b);
        } catch (IOException e) {
            throw new RuntimeException(a("ByteString"), e);
        }
    }

    public final byte[] b() {
        try {
            byte[] bArr = new byte[j()];
            CodedOutputStream a2 = CodedOutputStream.a(bArr);
            a(a2);
            a2.i();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(a("byte array"), e);
        }
    }

    private String a(String str) {
        StringBuilder sb = new StringBuilder("Serializing ");
        sb.append(getClass().getName());
        sb.append(" to a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    public static <T> void a(Iterable<T> iterable, Collection<? super T> collection) {
        a.a(iterable, collection);
    }
}
