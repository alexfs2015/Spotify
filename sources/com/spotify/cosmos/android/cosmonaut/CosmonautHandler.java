package com.spotify.cosmos.android.cosmonaut;

import com.spotify.cosmos.android.cosmonaut.atoms.ServiceMethodFactory;
import com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter.Factory;
import com.spotify.cosmos.router.RxRouter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

class CosmonautHandler {
    private final ServiceMethodFactory mServiceMethodFactory;

    CosmonautHandler(List<Factory> list) {
        this.mServiceMethodFactory = new ServiceMethodFactory(list);
    }

    public <T> T create(Class<T> cls, RxRouter rxRouter) {
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler(rxRouter) {
            private final /* synthetic */ RxRouter f$1;

            {
                this.f$1 = r2;
            }

            public final Object invoke(Object obj, Method method, Object[] objArr) {
                return CosmonautHandler.this.lambda$create$0$CosmonautHandler(this.f$1, obj, method, objArr);
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public Object handle(RxRouter rxRouter, Method method, Object[] objArr) {
        return method.getDeclaringClass() == Object.class ? method.invoke(this, objArr) : this.mServiceMethodFactory.loadServiceMethod(method).create(rxRouter, objArr);
    }

    public /* synthetic */ Object lambda$create$0$CosmonautHandler(RxRouter rxRouter, Object obj, Method method, Object[] objArr) {
        return handle(rxRouter, method, objArr);
    }
}
