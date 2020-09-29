package org.msgpack.core.buffer;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

class DirectBufferAccess {
    static Constructor byteBufferConstructor;
    static DirectBufferConstructorType directBufferConstructorType;
    static Class<?> directByteBufferClass;
    static Method mClean;
    static Method mCleaner;
    static Method mGetAddress;
    static Method memoryBlockWrapFromJni;

    /* renamed from: org.msgpack.core.buffer.DirectBufferAccess$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$msgpack$core$buffer$DirectBufferAccess$DirectBufferConstructorType = new int[DirectBufferConstructorType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                org.msgpack.core.buffer.DirectBufferAccess$DirectBufferConstructorType[] r0 = org.msgpack.core.buffer.DirectBufferAccess.DirectBufferConstructorType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$msgpack$core$buffer$DirectBufferAccess$DirectBufferConstructorType = r0
                int[] r0 = $SwitchMap$org$msgpack$core$buffer$DirectBufferAccess$DirectBufferConstructorType     // Catch:{ NoSuchFieldError -> 0x0014 }
                org.msgpack.core.buffer.DirectBufferAccess$DirectBufferConstructorType r1 = org.msgpack.core.buffer.DirectBufferAccess.DirectBufferConstructorType.ARGS_LONG_INT_REF     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$org$msgpack$core$buffer$DirectBufferAccess$DirectBufferConstructorType     // Catch:{ NoSuchFieldError -> 0x001f }
                org.msgpack.core.buffer.DirectBufferAccess$DirectBufferConstructorType r1 = org.msgpack.core.buffer.DirectBufferAccess.DirectBufferConstructorType.ARGS_LONG_INT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$org$msgpack$core$buffer$DirectBufferAccess$DirectBufferConstructorType     // Catch:{ NoSuchFieldError -> 0x002a }
                org.msgpack.core.buffer.DirectBufferAccess$DirectBufferConstructorType r1 = org.msgpack.core.buffer.DirectBufferAccess.DirectBufferConstructorType.ARGS_INT_INT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = $SwitchMap$org$msgpack$core$buffer$DirectBufferAccess$DirectBufferConstructorType     // Catch:{ NoSuchFieldError -> 0x0035 }
                org.msgpack.core.buffer.DirectBufferAccess$DirectBufferConstructorType r1 = org.msgpack.core.buffer.DirectBufferAccess.DirectBufferConstructorType.ARGS_MB_INT_INT     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.msgpack.core.buffer.DirectBufferAccess.AnonymousClass1.<clinit>():void");
        }
    }

    enum DirectBufferConstructorType {
        ARGS_LONG_INT_REF,
        ARGS_LONG_INT,
        ARGS_INT_INT,
        ARGS_MB_INT_INT
    }

    private DirectBufferAccess() {
    }

    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [org.msgpack.core.buffer.DirectBufferAccess$DirectBufferConstructorType] */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v12, types: [org.msgpack.core.buffer.DirectBufferAccess$DirectBufferConstructorType] */
    /* JADX WARNING: type inference failed for: r1v13, types: [org.msgpack.core.buffer.DirectBufferAccess$DirectBufferConstructorType] */
    /* JADX WARNING: type inference failed for: r1v14, types: [org.msgpack.core.buffer.DirectBufferAccess$DirectBufferConstructorType] */
    /* JADX WARNING: type inference failed for: r1v15, types: [org.msgpack.core.buffer.DirectBufferAccess$DirectBufferConstructorType] */
    /* JADX WARNING: type inference failed for: r1v16 */
    /* JADX WARNING: type inference failed for: r1v17 */
    /* JADX WARNING: type inference failed for: r1v18 */
    /* JADX WARNING: type inference failed for: r1v19 */
    /* JADX WARNING: type inference failed for: r1v20 */
    /* JADX WARNING: type inference failed for: r1v21 */
    /* JADX WARNING: type inference failed for: r1v22 */
    /* JADX WARNING: type inference failed for: r1v23 */
    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|13|(2:15|16)(2:17|18)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0028 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x003b */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v8
      assigns: []
      uses: []
      mth insns count: 95
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 8 */
    static {
        /*
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r1 = "java.nio.DirectByteBuffer"
            java.lang.Class r0 = r0.loadClass(r1)     // Catch:{ Exception -> 0x00c7 }
            directByteBufferClass = r0     // Catch:{ Exception -> 0x00c7 }
            r0 = 0
            r1 = 3
            r2 = 2
            r3 = 0
            r4 = 1
            java.lang.Class<?> r5 = directByteBufferClass     // Catch:{ NoSuchMethodException -> 0x0028 }
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x0028 }
            java.lang.Class r7 = java.lang.Long.TYPE     // Catch:{ NoSuchMethodException -> 0x0028 }
            r6[r3] = r7     // Catch:{ NoSuchMethodException -> 0x0028 }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x0028 }
            r6[r4] = r7     // Catch:{ NoSuchMethodException -> 0x0028 }
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r6[r2] = r7     // Catch:{ NoSuchMethodException -> 0x0028 }
            java.lang.reflect.Constructor r5 = r5.getDeclaredConstructor(r6)     // Catch:{ NoSuchMethodException -> 0x0028 }
            org.msgpack.core.buffer.DirectBufferAccess$DirectBufferConstructorType r1 = org.msgpack.core.buffer.DirectBufferAccess.DirectBufferConstructorType.ARGS_LONG_INT_REF     // Catch:{ NoSuchMethodException -> 0x0028 }
            goto L_0x007e
        L_0x0028:
            java.lang.Class<?> r5 = directByteBufferClass     // Catch:{ NoSuchMethodException -> 0x003b }
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x003b }
            java.lang.Class r7 = java.lang.Long.TYPE     // Catch:{ NoSuchMethodException -> 0x003b }
            r6[r3] = r7     // Catch:{ NoSuchMethodException -> 0x003b }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x003b }
            r6[r4] = r7     // Catch:{ NoSuchMethodException -> 0x003b }
            java.lang.reflect.Constructor r5 = r5.getDeclaredConstructor(r6)     // Catch:{ NoSuchMethodException -> 0x003b }
            org.msgpack.core.buffer.DirectBufferAccess$DirectBufferConstructorType r1 = org.msgpack.core.buffer.DirectBufferAccess.DirectBufferConstructorType.ARGS_LONG_INT     // Catch:{ NoSuchMethodException -> 0x003b }
            goto L_0x007e
        L_0x003b:
            java.lang.Class<?> r5 = directByteBufferClass     // Catch:{ NoSuchMethodException -> 0x004e }
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x004e }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x004e }
            r6[r3] = r7     // Catch:{ NoSuchMethodException -> 0x004e }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x004e }
            r6[r4] = r7     // Catch:{ NoSuchMethodException -> 0x004e }
            java.lang.reflect.Constructor r5 = r5.getDeclaredConstructor(r6)     // Catch:{ NoSuchMethodException -> 0x004e }
            org.msgpack.core.buffer.DirectBufferAccess$DirectBufferConstructorType r1 = org.msgpack.core.buffer.DirectBufferAccess.DirectBufferConstructorType.ARGS_INT_INT     // Catch:{ NoSuchMethodException -> 0x004e }
            goto L_0x007e
        L_0x004e:
            java.lang.String r0 = "java.nio.MemoryBlock"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r5 = "wrapFromJni"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x00c7 }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x00c7 }
            r6[r3] = r7     // Catch:{ Exception -> 0x00c7 }
            java.lang.Class r7 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x00c7 }
            r6[r4] = r7     // Catch:{ Exception -> 0x00c7 }
            java.lang.reflect.Method r5 = r0.getDeclaredMethod(r5, r6)     // Catch:{ Exception -> 0x00c7 }
            r5.setAccessible(r4)     // Catch:{ Exception -> 0x00c7 }
            java.lang.Class<?> r6 = directByteBufferClass     // Catch:{ Exception -> 0x00c7 }
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x00c7 }
            r1[r3] = r0     // Catch:{ Exception -> 0x00c7 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x00c7 }
            r1[r4] = r0     // Catch:{ Exception -> 0x00c7 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x00c7 }
            r1[r2] = r0     // Catch:{ Exception -> 0x00c7 }
            java.lang.reflect.Constructor r0 = r6.getDeclaredConstructor(r1)     // Catch:{ Exception -> 0x00c7 }
            org.msgpack.core.buffer.DirectBufferAccess$DirectBufferConstructorType r1 = org.msgpack.core.buffer.DirectBufferAccess.DirectBufferConstructorType.ARGS_MB_INT_INT     // Catch:{ Exception -> 0x00c7 }
            r8 = r5
            r5 = r0
            r0 = r8
        L_0x007e:
            byteBufferConstructor = r5     // Catch:{ Exception -> 0x00c7 }
            directBufferConstructorType = r1     // Catch:{ Exception -> 0x00c7 }
            memoryBlockWrapFromJni = r0     // Catch:{ Exception -> 0x00c7 }
            java.lang.reflect.Constructor r0 = byteBufferConstructor     // Catch:{ Exception -> 0x00c7 }
            if (r0 == 0) goto L_0x00bf
            java.lang.reflect.Constructor r0 = byteBufferConstructor     // Catch:{ Exception -> 0x00c7 }
            r0.setAccessible(r4)     // Catch:{ Exception -> 0x00c7 }
            java.lang.Class<?> r0 = directByteBufferClass     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r1 = "address"
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x00c7 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch:{ Exception -> 0x00c7 }
            mGetAddress = r0     // Catch:{ Exception -> 0x00c7 }
            r0.setAccessible(r4)     // Catch:{ Exception -> 0x00c7 }
            java.lang.Class<?> r0 = directByteBufferClass     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r1 = "cleaner"
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x00c7 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch:{ Exception -> 0x00c7 }
            mCleaner = r0     // Catch:{ Exception -> 0x00c7 }
            r0.setAccessible(r4)     // Catch:{ Exception -> 0x00c7 }
            java.lang.reflect.Method r0 = mCleaner     // Catch:{ Exception -> 0x00c7 }
            java.lang.Class r0 = r0.getReturnType()     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r1 = "clean"
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x00c7 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch:{ Exception -> 0x00c7 }
            mClean = r0     // Catch:{ Exception -> 0x00c7 }
            r0.setAccessible(r4)     // Catch:{ Exception -> 0x00c7 }
            return
        L_0x00bf:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r1 = "Constructor of DirectByteBuffer is not found"
            r0.<init>(r1)     // Catch:{ Exception -> 0x00c7 }
            throw r0     // Catch:{ Exception -> 0x00c7 }
        L_0x00c7:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.core.buffer.DirectBufferAccess.<clinit>():void");
    }

    static long getAddress(Object obj) {
        try {
            return ((Long) mGetAddress.invoke(obj, new Object[0])).longValue();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    static void clean(Object obj) {
        try {
            mClean.invoke(mCleaner.invoke(obj, new Object[0]), new Object[0]);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    static boolean isDirectByteBufferInstance(Object obj) {
        return directByteBufferClass.isInstance(obj);
    }

    static ByteBuffer newByteBuffer(long j, int i, int i2, ByteBuffer byteBuffer) {
        try {
            int i3 = AnonymousClass1.$SwitchMap$org$msgpack$core$buffer$DirectBufferAccess$DirectBufferConstructorType[directBufferConstructorType.ordinal()];
            if (i3 == 1) {
                return (ByteBuffer) byteBufferConstructor.newInstance(new Object[]{Long.valueOf(j + ((long) i)), Integer.valueOf(i2), byteBuffer});
            } else if (i3 == 2) {
                return (ByteBuffer) byteBufferConstructor.newInstance(new Object[]{Long.valueOf(j + ((long) i)), Integer.valueOf(i2)});
            } else if (i3 == 3) {
                return (ByteBuffer) byteBufferConstructor.newInstance(new Object[]{Integer.valueOf(((int) j) + i), Integer.valueOf(i2)});
            } else if (i3 == 4) {
                return (ByteBuffer) byteBufferConstructor.newInstance(new Object[]{memoryBlockWrapFromJni.invoke(null, new Object[]{Long.valueOf(j + ((long) i)), Integer.valueOf(i2)}), Integer.valueOf(i2), Integer.valueOf(0)});
            } else {
                throw new IllegalStateException("Unexpected value");
            }
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }
}
