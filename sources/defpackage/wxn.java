package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Locale;

/* renamed from: wxn reason: default package */
public final class wxn {
    private static final wyc a = wyd.a(wxn.class);
    private static final String b;
    private static final File c;

    static {
        String str = "";
        b = wxu.a("os.name", str).toLowerCase(Locale.US).replaceAll("[^a-z0-9]+", str);
        String b2 = wxu.b("io.netty.native.workdir");
        String str2 = "-Dio.netty.native.workdir: ";
        if (b2 != null) {
            File file = new File(b2);
            file.mkdirs();
            try {
                file = file.getAbsoluteFile();
            } catch (Exception unused) {
            }
            c = file;
            wyc wyc = a;
            StringBuilder sb = new StringBuilder(str2);
            sb.append(c);
            wyc.b(sb.toString());
            return;
        }
        c = a();
        wyc wyc2 = a;
        StringBuilder sb2 = new StringBuilder(str2);
        sb2.append(c);
        sb2.append(" (io.netty.tmpdir)");
        wyc2.b(sb2.toString());
    }

    private wxn() {
    }

    private static File a() {
        try {
            File a2 = a(wxu.b("io.netty.tmpdir"));
            String str = "-Dio.netty.tmpdir: ";
            if (a2 != null) {
                wyc wyc = a;
                StringBuilder sb = new StringBuilder(str);
                sb.append(a2);
                wyc.b(sb.toString());
                return a2;
            }
            File a3 = a(wxu.b("java.io.tmpdir"));
            if (a3 != null) {
                wyc wyc2 = a;
                StringBuilder sb2 = new StringBuilder(str);
                sb2.append(a3);
                sb2.append(" (java.io.tmpdir)");
                wyc2.b(sb2.toString());
                return a3;
            }
            if (b()) {
                File a4 = a(System.getenv("TEMP"));
                if (a4 != null) {
                    wyc wyc3 = a;
                    StringBuilder sb3 = new StringBuilder(str);
                    sb3.append(a4);
                    sb3.append(" (%TEMP%)");
                    wyc3.b(sb3.toString());
                    return a4;
                }
                String str2 = System.getenv("USERPROFILE");
                if (str2 != null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str2);
                    sb4.append("\\AppData\\Local\\Temp");
                    File a5 = a(sb4.toString());
                    if (a5 != null) {
                        wyc wyc4 = a;
                        StringBuilder sb5 = new StringBuilder(str);
                        sb5.append(a5);
                        sb5.append(" (%USERPROFILE%\\AppData\\Local\\Temp)");
                        wyc4.b(sb5.toString());
                        return a5;
                    }
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(str2);
                    sb6.append("\\Local Settings\\Temp");
                    File a6 = a(sb6.toString());
                    if (a6 != null) {
                        wyc wyc5 = a;
                        StringBuilder sb7 = new StringBuilder(str);
                        sb7.append(a6);
                        sb7.append(" (%USERPROFILE%\\Local Settings\\Temp)");
                        wyc5.b(sb7.toString());
                        return a6;
                    }
                }
            } else {
                File a7 = a(System.getenv("TMPDIR"));
                if (a7 != null) {
                    wyc wyc6 = a;
                    StringBuilder sb8 = new StringBuilder(str);
                    sb8.append(a7);
                    sb8.append(" ($TMPDIR)");
                    wyc6.b(sb8.toString());
                    return a7;
                }
            }
            File file = b() ? new File("C:\\Windows\\Temp") : new File("/tmp");
            wyc wyc7 = a;
            StringBuilder sb9 = new StringBuilder("Failed to get the temporary directory; falling back to: ");
            sb9.append(file);
            wyc7.d(sb9.toString());
            return file;
        } catch (Exception unused) {
        }
    }

    private static File a(String str) {
        if (str == null) {
            return null;
        }
        File file = new File(str);
        file.mkdirs();
        if (!file.isDirectory()) {
            return null;
        }
        try {
            return file.getAbsoluteFile();
        } catch (Exception unused) {
            return file;
        }
    }

    private static Class<?> a(final ClassLoader classLoader, final Class<?> cls) {
        try {
            return classLoader.loadClass(cls.getName());
        } catch (ClassNotFoundException unused) {
            final byte[] a2 = a(cls);
            return (Class) AccessController.doPrivileged(new PrivilegedAction<Class<?>>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public Class<?> run() {
                    try {
                        Method declaredMethod = ClassLoader.class.getDeclaredMethod("defineClass", new Class[]{String.class, byte[].class, Integer.TYPE, Integer.TYPE});
                        declaredMethod.setAccessible(true);
                        return (Class) declaredMethod.invoke(classLoader, new Object[]{cls.getName(), a2, Integer.valueOf(0), Integer.valueOf(a2.length)});
                    } catch (Exception e) {
                        throw new IllegalStateException("Define class failed!", e);
                    }
                }
            });
        }
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private static void a(final Class<?> cls, final String str, final boolean z) {
        Object doPrivileged = AccessController.doPrivileged(new PrivilegedAction<Object>() {
            public final Object run() {
                try {
                    Method method = cls.getMethod("loadLibrary", new Class[]{String.class, Boolean.TYPE});
                    method.setAccessible(true);
                    return method.invoke(null, new Object[]{str, Boolean.valueOf(z)});
                } catch (Exception e) {
                    return e;
                }
            }
        });
        if (doPrivileged instanceof Throwable) {
            Throwable th = (Throwable) doPrivileged;
            Throwable cause = th.getCause();
            if (cause == null) {
                throw new UnsatisfiedLinkError(th.getMessage());
            } else if (cause instanceof UnsatisfiedLinkError) {
                throw ((UnsatisfiedLinkError) cause);
            } else {
                throw new UnsatisfiedLinkError(cause.getMessage());
            }
        }
    }

    private static void a(ClassLoader classLoader, String str, boolean z) {
        String str2 = "Unable to load the library '{}', trying other loading mechanism.";
        try {
            a(a(classLoader, wxo.class), str, z);
        } catch (UnsatisfiedLinkError e) {
            a.b(str2, str, e);
            wxo.a(str, z);
        } catch (Exception e2) {
            a.b(str2, str, e2);
            wxo.a(str, z);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c A[Catch:{ all -> 0x0115 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.ClassLoader r12, java.lang.String... r13) {
        /*
            java.lang.String r0 = ".jnilib"
            int r1 = r13.length
            r2 = 0
            r3 = 0
        L_0x0005:
            if (r3 >= r1) goto L_0x0121
            r4 = r13[r3]
            java.lang.String r5 = java.lang.System.mapLibraryName(r4)     // Catch:{ all -> 0x0115 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0115 }
            java.lang.String r7 = "META-INF/native/"
            r6.<init>(r7)     // Catch:{ all -> 0x0115 }
            r6.append(r5)     // Catch:{ all -> 0x0115 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0115 }
            java.net.URL r7 = r12.getResource(r6)     // Catch:{ all -> 0x0115 }
            r8 = 1
            if (r7 != 0) goto L_0x006d
            java.lang.String r9 = b     // Catch:{ all -> 0x0115 }
            java.lang.String r10 = "macosx"
            boolean r9 = r9.startsWith(r10)     // Catch:{ all -> 0x0115 }
            if (r9 != 0) goto L_0x0039
            java.lang.String r9 = b     // Catch:{ all -> 0x0115 }
            java.lang.String r10 = "osx"
            boolean r9 = r9.startsWith(r10)     // Catch:{ all -> 0x0115 }
            if (r9 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r9 = 0
            goto L_0x003a
        L_0x0039:
            r9 = 1
        L_0x003a:
            if (r9 == 0) goto L_0x006d
            boolean r6 = r6.endsWith(r0)     // Catch:{ all -> 0x0115 }
            java.lang.String r7 = "META-INF/native/lib"
            if (r6 == 0) goto L_0x005a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0115 }
            r6.<init>(r7)     // Catch:{ all -> 0x0115 }
            r6.append(r4)     // Catch:{ all -> 0x0115 }
            java.lang.String r7 = ".dynlib"
            r6.append(r7)     // Catch:{ all -> 0x0115 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0115 }
            java.net.URL r7 = r12.getResource(r6)     // Catch:{ all -> 0x0115 }
            goto L_0x006d
        L_0x005a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0115 }
            r6.<init>(r7)     // Catch:{ all -> 0x0115 }
            r6.append(r4)     // Catch:{ all -> 0x0115 }
            r6.append(r0)     // Catch:{ all -> 0x0115 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0115 }
            java.net.URL r7 = r12.getResource(r6)     // Catch:{ all -> 0x0115 }
        L_0x006d:
            if (r7 != 0) goto L_0x0073
            a(r12, r4, r2)     // Catch:{ all -> 0x0115 }
            goto L_0x00c1
        L_0x0073:
            r6 = 46
            int r6 = r5.lastIndexOf(r6)     // Catch:{ all -> 0x0115 }
            java.lang.String r9 = r5.substring(r2, r6)     // Catch:{ all -> 0x0115 }
            int r10 = r5.length()     // Catch:{ all -> 0x0115 }
            java.lang.String r5 = r5.substring(r6, r10)     // Catch:{ all -> 0x0115 }
            r6 = 0
            java.io.File r10 = c     // Catch:{ Exception -> 0x00e3, all -> 0x00dd }
            java.io.File r5 = java.io.File.createTempFile(r9, r5, r10)     // Catch:{ Exception -> 0x00e3, all -> 0x00dd }
            java.io.InputStream r7 = r7.openStream()     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00cf, all -> 0x00cb }
            r9.<init>(r5)     // Catch:{ Exception -> 0x00cf, all -> 0x00cb }
            r10 = 8192(0x2000, float:1.14794E-41)
            byte[] r10 = new byte[r10]     // Catch:{ Exception -> 0x00c9 }
        L_0x0099:
            int r11 = r7.read(r10)     // Catch:{ Exception -> 0x00c9 }
            if (r11 <= 0) goto L_0x00a3
            r9.write(r10, r2, r11)     // Catch:{ Exception -> 0x00c9 }
            goto L_0x0099
        L_0x00a3:
            r9.flush()     // Catch:{ Exception -> 0x00c9 }
            a(r9)     // Catch:{ Exception -> 0x00c9 }
            java.lang.String r9 = r5.getPath()     // Catch:{ Exception -> 0x00cf, all -> 0x00cb }
            a(r12, r9, r8)     // Catch:{ Exception -> 0x00cf, all -> 0x00cb }
            a(r7)     // Catch:{ all -> 0x0115 }
            a(r6)     // Catch:{ all -> 0x0115 }
            if (r5 == 0) goto L_0x00c1
            boolean r6 = r5.delete()     // Catch:{ all -> 0x0115 }
            if (r6 != 0) goto L_0x00c1
            r5.deleteOnExit()     // Catch:{ all -> 0x0115 }
        L_0x00c1:
            wyc r5 = a     // Catch:{ all -> 0x0115 }
            java.lang.String r6 = "Successfully loaded the library: {}"
            r5.b(r6, r4)     // Catch:{ all -> 0x0115 }
            return
        L_0x00c9:
            r6 = move-exception
            goto L_0x00e8
        L_0x00cb:
            r8 = move-exception
            r9 = r6
            r6 = r8
            goto L_0x0103
        L_0x00cf:
            r8 = move-exception
            r9 = r6
            r6 = r8
            goto L_0x00e8
        L_0x00d3:
            r7 = move-exception
            r9 = r6
            r6 = r7
            r7 = r9
            goto L_0x0103
        L_0x00d8:
            r7 = move-exception
            r9 = r6
            r6 = r7
            r7 = r9
            goto L_0x00e8
        L_0x00dd:
            r5 = move-exception
            r7 = r6
            r9 = r7
            r6 = r5
            r5 = r9
            goto L_0x0103
        L_0x00e3:
            r5 = move-exception
            r7 = r6
            r9 = r7
            r6 = r5
            r5 = r9
        L_0x00e8:
            java.lang.UnsatisfiedLinkError r8 = new java.lang.UnsatisfiedLinkError     // Catch:{ all -> 0x0102 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0102 }
            java.lang.String r11 = "could not load a native library: "
            r10.<init>(r11)     // Catch:{ all -> 0x0102 }
            r10.append(r4)     // Catch:{ all -> 0x0102 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0102 }
            r8.<init>(r10)     // Catch:{ all -> 0x0102 }
            java.lang.Throwable r6 = r8.initCause(r6)     // Catch:{ all -> 0x0102 }
            java.lang.UnsatisfiedLinkError r6 = (java.lang.UnsatisfiedLinkError) r6     // Catch:{ all -> 0x0102 }
            throw r6     // Catch:{ all -> 0x0102 }
        L_0x0102:
            r6 = move-exception
        L_0x0103:
            a(r7)     // Catch:{ all -> 0x0115 }
            a(r9)     // Catch:{ all -> 0x0115 }
            if (r5 == 0) goto L_0x0114
            boolean r7 = r5.delete()     // Catch:{ all -> 0x0115 }
            if (r7 != 0) goto L_0x0114
            r5.deleteOnExit()     // Catch:{ all -> 0x0115 }
        L_0x0114:
            throw r6     // Catch:{ all -> 0x0115 }
        L_0x0115:
            r5 = move-exception
            wyc r6 = a
            java.lang.String r7 = "Unable to load the library '{}', trying next name..."
            r6.b(r7, r4, r5)
            int r3 = r3 + 1
            goto L_0x0005
        L_0x0121:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to load any of the given libraries: "
            r0.<init>(r1)
            java.lang.String r13 = java.util.Arrays.toString(r13)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            goto L_0x013a
        L_0x0139:
            throw r12
        L_0x013a:
            goto L_0x0139
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wxn.a(java.lang.ClassLoader, java.lang.String[]):void");
    }

    private static byte[] a(Class<?> cls) {
        String name = cls.getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf > 0) {
            name = name.substring(lastIndexOf + 1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(".class");
        URL resource = cls.getResource(sb.toString());
        if (resource != null) {
            byte[] bArr = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
            try {
                InputStream openStream = resource.openStream();
                while (true) {
                    int read = openStream.read(bArr);
                    if (read != -1) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        a((Closeable) openStream);
                        a((Closeable) byteArrayOutputStream);
                        return byteArray;
                    }
                }
            } catch (IOException e) {
                throw new ClassNotFoundException(cls.getName(), e);
            } catch (Throwable th) {
                a((Closeable) null);
                a((Closeable) byteArrayOutputStream);
                throw th;
            }
        } else {
            throw new ClassNotFoundException(cls.getName());
        }
    }

    private static boolean b() {
        return b.startsWith("windows");
    }
}
