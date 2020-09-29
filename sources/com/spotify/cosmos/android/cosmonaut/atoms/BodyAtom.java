package com.spotify.cosmos.android.cosmonaut.atoms;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.a;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.BodyPart;
import com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class BodyAtom {
    /* access modifiers changed from: private */
    public static final byte[] DEFAULT_VALUE = new byte[0];
    private final Optional<gcr<Object[], byte[]>> mArgumentTransformation;

    static class BodyPartTransformation implements gcr<Object[], byte[]> {
        private final Converter<Object, byte[]> mConverter;
        private final List<PartArgument> mPartArguments;

        BodyPartTransformation(List<PartArgument> list, Converter<?, byte[]> converter) {
            this.mPartArguments = list;
            this.mConverter = converter;
        }

        public byte[] apply(Object[] objArr) {
            a g = ImmutableMap.g();
            for (PartArgument visit : this.mPartArguments) {
                visit.visit(objArr, g);
            }
            ImmutableMap b = g.b();
            try {
                return (byte[]) fbp.a(this.mConverter.convert(b.getClass(), b));
            } catch (IOException e) {
                Logger.e(e, "Unexpected IO exception", new Object[0]);
                return BodyAtom.DEFAULT_VALUE;
            }
        }
    }

    static class BodyTransformation implements gcr<Object[], byte[]> {
        private final Converter<Object, byte[]> mConverter;
        private final int mIndex;
        private final Type mType;

        BodyTransformation(int i, Type type, Converter<?, byte[]> converter) {
            this.mIndex = i;
            this.mType = type;
            this.mConverter = converter;
        }

        public byte[] apply(Object[] objArr) {
            try {
                return (byte[]) fbp.a(this.mConverter.convert(this.mType, objArr[this.mIndex]));
            } catch (IOException e) {
                Logger.e(e, "Unexpected IO exception", new Object[0]);
                return BodyAtom.DEFAULT_VALUE;
            }
        }
    }

    static class PartArgument {
        private final int mIndex;
        private final String mName;

        PartArgument(String str, int i) {
            this.mName = str;
            this.mIndex = i;
        }

        /* access modifiers changed from: 0000 */
        public void visit(Object[] objArr, a<String, Object> aVar) {
            aVar.b(this.mName, objArr[this.mIndex]);
        }
    }

    BodyAtom(Method method, RequestTransformers requestTransformers) {
        this.mArgumentTransformation = createOptionalArgumentTransformer(method, requestTransformers);
    }

    private static Optional<gcr<Object[], byte[]>> createOptionalArgumentTransformer(Method method, RequestTransformers requestTransformers) {
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        int length = parameterAnnotations.length;
        for (int i = 0; i < length; i++) {
            if (((Body) ReflectionUtil.findAnnotation(parameterAnnotations[i], Body.class)) != null) {
                Type type = method.getGenericParameterTypes()[i];
                return Optional.b(new BodyTransformation(i, type, requestTransformers.find(type)));
            }
        }
        ArrayList arrayList = new ArrayList(1);
        int length2 = parameterAnnotations.length;
        for (int i2 = 0; i2 < length2; i2++) {
            BodyPart bodyPart = (BodyPart) ReflectionUtil.findAnnotation(parameterAnnotations[i2], BodyPart.class);
            if (bodyPart != null) {
                arrayList.add(new PartArgument(bodyPart.value(), i2));
            }
        }
        return arrayList.isEmpty() ? Optional.e() : Optional.b(new BodyPartTransformation(arrayList, requestTransformers.find(Map.class)));
    }

    static /* synthetic */ byte[] lambda$call$0(Object[] objArr, gcr gcr) {
        return (byte[]) gcr.apply(objArr);
    }

    /* access modifiers changed from: 0000 */
    public final byte[] call(Object[] objArr) {
        return (byte[]) this.mArgumentTransformation.a((Function<? super T, V>) new Function(objArr) {
            private final /* synthetic */ Object[] f$0;

            {
                this.f$0 = r1;
            }

            public final Object apply(Object obj) {
                return BodyAtom.lambda$call$0(this.f$0, (gcr) obj);
            }
        }).a(DEFAULT_VALUE);
    }
}
