package defpackage;

import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: wst reason: default package */
public final class wst extends a {
    private final Scheduler a = null;
    private final boolean b;

    public wst(Scheduler scheduler, boolean z) {
        this.b = z;
    }

    public final wrv<?, ?> a(Type type) {
        boolean z;
        boolean z2;
        Type type2;
        Class<Observable> a2 = wsm.a(type);
        if (a2 == Completable.class) {
            wss wss = new wss(Void.class, this.a, this.b, false, true, false, false, false, true);
            return wss;
        }
        boolean z3 = a2 == Flowable.class;
        boolean z4 = a2 == Single.class;
        boolean z5 = a2 == Maybe.class;
        if (a2 != Observable.class && !z3 && !z4 && !z5) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            String str = !z3 ? !z4 ? z5 ? "Maybe" : "Observable" : "Single" : "Flowable";
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" return type must be parameterized as ");
            sb.append(str);
            sb.append("<Foo> or ");
            sb.append(str);
            sb.append("<? extends Foo>");
            throw new IllegalStateException(sb.toString());
        }
        Type a3 = wsm.a(0, (ParameterizedType) type);
        Class<wsq> a4 = wsm.a(a3);
        if (a4 == wsj.class) {
            if (a3 instanceof ParameterizedType) {
                type2 = wsm.a(0, (ParameterizedType) a3);
                z2 = false;
            } else {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
        } else if (a4 != wsq.class) {
            type2 = a3;
            z2 = false;
            z = true;
            wss wss2 = new wss(type2, this.a, this.b, z2, z, z3, z4, z5, false);
            return wss2;
        } else if (a3 instanceof ParameterizedType) {
            type2 = wsm.a(0, (ParameterizedType) a3);
            z2 = true;
        } else {
            throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
        }
        z = false;
        wss wss22 = new wss(type2, this.a, this.b, z2, z, z3, z4, z5, false);
        return wss22;
    }
}
