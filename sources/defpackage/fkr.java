package defpackage;

import com.google.protobuf.ByteString;
import com.google.protobuf.ByteString.LiteralByteString;
import com.google.protobuf.ByteString.d;
import com.google.protobuf.CodedOutputStream;
import defpackage.fkr;
import defpackage.fkr.a;
import java.io.IOException;
import java.util.Collection;

/* renamed from: fkr reason: default package */
public abstract class fkr<MessageType extends fkr<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements fli {
    protected int a = 0;

    /* renamed from: fkr$a */
    public static abstract class a<MessageType extends fkr<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements defpackage.fli.a {
        private static void a(Iterable<?> iterable) {
            for (Object obj : iterable) {
                if (obj == null) {
                    throw new NullPointerException();
                }
            }
        }

        protected static <T> void a(Iterable<T> iterable, Collection<? super T> collection) {
            if (iterable == null) {
                throw new NullPointerException();
            } else if (iterable instanceof flf) {
                a((Iterable<?>) ((flf) iterable).a());
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

        /* renamed from: a */
        public abstract BuilderType clone();

        /* access modifiers changed from: protected */
        public abstract BuilderType a(MessageType messagetype);

        /* renamed from: a */
        public abstract BuilderType b(fkw fkw, fky fky);

        public final /* synthetic */ defpackage.fli.a a(fli fli) {
            if (i().getClass().isInstance(fli)) {
                return a((MessageType) (fkr) fli);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
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
}
