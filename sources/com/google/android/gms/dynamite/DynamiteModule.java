package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public final class DynamiteModule {
    public static final a a = new cau();
    public static final a b = new cax();
    private static Boolean d = null;
    private static cbb e = null;
    private static cbd f = null;
    private static String g = null;
    private static int h = -1;
    private static final ThreadLocal<b> i = new ThreadLocal<>();
    private static final C0006a j = new cat();
    public final Context c;

    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class LoadingException extends Exception {
        private LoadingException(String str) {
            super(str);
        }

        private LoadingException(String str, Throwable th) {
            super(str, th);
        }

        /* synthetic */ LoadingException(String str, byte b) {
            this(str);
        }

        /* synthetic */ LoadingException(String str, Throwable th, byte b) {
            this(str, th);
        }
    }

    public interface a {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a$a reason: collision with other inner class name */
        public interface C0006a {
            int a(Context context, String str);

            int a(Context context, String str, boolean z);
        }

        public static class b {
            public int a = 0;
            public int b = 0;
            public int c = 0;
        }

        b a(Context context, String str, C0006a aVar);
    }

    static class b {
        public Cursor a;

        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }
    }

    static class c implements C0006a {
        private final int a;
        private final int b = 0;

        public c(int i) {
            this.a = i;
        }

        public final int a(Context context, String str, boolean z) {
            return 0;
        }

        public final int a(Context context, String str) {
            return this.a;
        }
    }

    public static DynamiteModule a(Context context, a aVar, String str) {
        b a2;
        String str2 = ":";
        b bVar = (b) i.get();
        b bVar2 = new b(0);
        i.set(bVar2);
        try {
            a2 = aVar.a(context, str, j);
            int i2 = a2.a;
            int i3 = a2.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str).length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(str2);
            sb.append(i2);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(str2);
            sb.append(i3);
            if (a2.c == 0 || ((a2.c == -1 && a2.a == 0) || (a2.c == 1 && a2.b == 0))) {
                int i4 = a2.a;
                int i5 = a2.b;
                StringBuilder sb2 = new StringBuilder(91);
                sb2.append("No acceptable module found. Local version is ");
                sb2.append(i4);
                sb2.append(" and remote version is ");
                sb2.append(i5);
                sb2.append(".");
                throw new LoadingException(sb2.toString(), 0);
            } else if (a2.c == -1) {
                DynamiteModule c2 = c(context, str);
                if (bVar2.a != null) {
                    bVar2.a.close();
                }
                i.set(bVar);
                return c2;
            } else if (a2.c == 1) {
                DynamiteModule a3 = a(context, str, a2.b);
                if (bVar2.a != null) {
                    bVar2.a.close();
                }
                i.set(bVar);
                return a3;
            } else {
                int i6 = a2.c;
                StringBuilder sb3 = new StringBuilder(47);
                sb3.append("VersionPolicy returned invalid code:");
                sb3.append(i6);
                throw new LoadingException(sb3.toString(), 0);
            }
        } catch (LoadingException e2) {
            String str3 = "Failed to load remote module: ";
            String valueOf = String.valueOf(e2.getMessage());
            if (valueOf.length() != 0) {
                str3.concat(valueOf);
            } else {
                new String(str3);
            }
            if (a2.a == 0 || aVar.a(context, str, new c(a2.a)).c != -1) {
                throw new LoadingException("Remote load failed. No local fallback found.", e2, 0);
            }
            DynamiteModule c3 = c(context, str);
            if (bVar2.a != null) {
                bVar2.a.close();
            }
            i.set(bVar);
            return c3;
        } catch (Throwable th) {
            if (bVar2.a != null) {
                bVar2.a.close();
            }
            i.set(bVar);
            throw th;
        }
    }

    public static int a(Context context, String str) {
        String str2 = "DynamiteModule";
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get(null).equals(str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e(str2, sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            return 0;
        } catch (Exception e2) {
            String str3 = "Failed to load module descriptor class: ";
            String valueOf2 = String.valueOf(e2.getMessage());
            Log.e(str2, valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
            return 0;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:16|17|18|19) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:40|41|42|43|51|52|53|54|(0)(0)) */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r2.set(null, java.lang.ClassLoader.getSystemClassLoader());
        r2 = java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0088, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0035 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x007e */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b8 A[SYNTHETIC, Splitter:B:56:0x00b8] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d9 A[Catch:{ LoadingException -> 0x00bd, all -> 0x00e1 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0052=Splitter:B:23:0x0052, B:18:0x0035=Splitter:B:18:0x0035, B:35:0x007b=Splitter:B:35:0x007b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x00e1 }
            java.lang.Boolean r1 = d     // Catch:{ all -> 0x00de }
            if (r1 != 0) goto L_0x00b1
            android.content.Context r1 = r8.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, NoSuchFieldException -> 0x008d }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, NoSuchFieldException -> 0x008d }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r2 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r2 = r2.getName()     // Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, NoSuchFieldException -> 0x008d }
            java.lang.Class r1 = r1.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, NoSuchFieldException -> 0x008d }
            java.lang.String r2 = "sClassLoader"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, NoSuchFieldException -> 0x008d }
            monitor-enter(r1)     // Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, NoSuchFieldException -> 0x008d }
            r3 = 0
            java.lang.Object r4 = r2.get(r3)     // Catch:{ all -> 0x008a }
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch:{ all -> 0x008a }
            if (r4 == 0) goto L_0x0038
            java.lang.ClassLoader r2 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x008a }
            if (r4 != r2) goto L_0x0032
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x008a }
            goto L_0x0087
        L_0x0032:
            a(r4)     // Catch:{ LoadingException -> 0x0035 }
        L_0x0035:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x008a }
            goto L_0x0087
        L_0x0038:
            java.lang.String r4 = "com.google.android.gms"
            android.content.Context r5 = r8.getApplicationContext()     // Catch:{ all -> 0x008a }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ all -> 0x008a }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x008a }
            if (r4 == 0) goto L_0x0052
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x008a }
            r2.set(r3, r4)     // Catch:{ all -> 0x008a }
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x008a }
            goto L_0x0087
        L_0x0052:
            int r4 = c(r8, r9, r10)     // Catch:{ LoadingException -> 0x007e }
            java.lang.String r5 = g     // Catch:{ LoadingException -> 0x007e }
            if (r5 == 0) goto L_0x007b
            java.lang.String r5 = g     // Catch:{ LoadingException -> 0x007e }
            boolean r5 = r5.isEmpty()     // Catch:{ LoadingException -> 0x007e }
            if (r5 == 0) goto L_0x0063
            goto L_0x007b
        L_0x0063:
            cba r5 = new cba     // Catch:{ LoadingException -> 0x007e }
            java.lang.String r6 = g     // Catch:{ LoadingException -> 0x007e }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x007e }
            r5.<init>(r6, r7)     // Catch:{ LoadingException -> 0x007e }
            a(r5)     // Catch:{ LoadingException -> 0x007e }
            r2.set(r3, r5)     // Catch:{ LoadingException -> 0x007e }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ LoadingException -> 0x007e }
            d = r5     // Catch:{ LoadingException -> 0x007e }
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            monitor-exit(r0)     // Catch:{ all -> 0x00de }
            return r4
        L_0x007b:
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            monitor-exit(r0)     // Catch:{ all -> 0x00de }
            return r4
        L_0x007e:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x008a }
            r2.set(r3, r4)     // Catch:{ all -> 0x008a }
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x008a }
        L_0x0087:
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            r1 = r2
            goto L_0x00af
        L_0x008a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            throw r2     // Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, NoSuchFieldException -> 0x008d }
        L_0x008d:
            r1 = move-exception
            goto L_0x0092
        L_0x008f:
            r1 = move-exception
            goto L_0x0092
        L_0x0091:
            r1 = move-exception
        L_0x0092:
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00de }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00de }
            int r2 = r2.length()     // Catch:{ all -> 0x00de }
            int r2 = r2 + 30
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00de }
            r3.<init>(r2)     // Catch:{ all -> 0x00de }
            java.lang.String r2 = "Failed to load module via V2: "
            r3.append(r2)     // Catch:{ all -> 0x00de }
            r3.append(r1)     // Catch:{ all -> 0x00de }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00de }
        L_0x00af:
            d = r1     // Catch:{ all -> 0x00de }
        L_0x00b1:
            monitor-exit(r0)     // Catch:{ all -> 0x00de }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x00d9
            int r8 = c(r8, r9, r10)     // Catch:{ LoadingException -> 0x00bd }
            return r8
        L_0x00bd:
            r9 = move-exception
            java.lang.String r10 = "Failed to retrieve remote module version: "
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x00e1 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x00e1 }
            int r0 = r9.length()     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x00d2
            r10.concat(r9)     // Catch:{ all -> 0x00e1 }
            goto L_0x00d7
        L_0x00d2:
            java.lang.String r9 = new java.lang.String     // Catch:{ all -> 0x00e1 }
            r9.<init>(r10)     // Catch:{ all -> 0x00e1 }
        L_0x00d7:
            r8 = 0
            return r8
        L_0x00d9:
            int r8 = b(r8, r9, r10)     // Catch:{ all -> 0x00e1 }
            return r8
        L_0x00de:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00de }
            throw r9     // Catch:{ all -> 0x00e1 }
        L_0x00e1:
            r9 = move-exception
            defpackage.bzi.a(r8, r9)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.a(android.content.Context, java.lang.String, boolean):int");
    }

    private static int b(Context context, String str, boolean z) {
        cbb a2 = a(context);
        if (a2 == null) {
            return 0;
        }
        try {
            if (a2.a() >= 2) {
                return a2.b(cas.a(context), str, z);
            }
            return a2.a(cas.a(context), str, z);
        } catch (RemoteException e2) {
            String str2 = "Failed to retrieve remote module version: ";
            String valueOf = String.valueOf(e2.getMessage());
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                new String(str2);
            }
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int c(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            r0 = 0
            r1 = 0
            android.content.ContentResolver r2 = r8.getContentResolver()     // Catch:{ Exception -> 0x0095 }
            if (r10 == 0) goto L_0x000b
            java.lang.String r8 = "api_force_staging"
            goto L_0x000d
        L_0x000b:
            java.lang.String r8 = "api"
        L_0x000d:
            int r10 = r8.length()     // Catch:{ Exception -> 0x0095 }
            int r10 = r10 + 42
            java.lang.String r3 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x0095 }
            int r3 = r3.length()     // Catch:{ Exception -> 0x0095 }
            int r10 = r10 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0095 }
            r3.<init>(r10)     // Catch:{ Exception -> 0x0095 }
            java.lang.String r10 = "content://com.google.android.gms.chimera/"
            r3.append(r10)     // Catch:{ Exception -> 0x0095 }
            r3.append(r8)     // Catch:{ Exception -> 0x0095 }
            java.lang.String r8 = "/"
            r3.append(r8)     // Catch:{ Exception -> 0x0095 }
            r3.append(r9)     // Catch:{ Exception -> 0x0095 }
            java.lang.String r8 = r3.toString()     // Catch:{ Exception -> 0x0095 }
            android.net.Uri r3 = android.net.Uri.parse(r8)     // Catch:{ Exception -> 0x0095 }
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0095 }
            if (r8 == 0) goto L_0x0083
            boolean r9 = r8.moveToFirst()     // Catch:{ Exception -> 0x008f, all -> 0x008b }
            if (r9 == 0) goto L_0x0083
            int r9 = r8.getInt(r1)     // Catch:{ Exception -> 0x008f, all -> 0x008b }
            if (r9 <= 0) goto L_0x007d
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r10 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r10)     // Catch:{ Exception -> 0x008f, all -> 0x008b }
            r2 = 2
            java.lang.String r2 = r8.getString(r2)     // Catch:{ all -> 0x007a }
            g = r2     // Catch:{ all -> 0x007a }
            java.lang.String r2 = "loaderVersion"
            int r2 = r8.getColumnIndex(r2)     // Catch:{ all -> 0x007a }
            if (r2 < 0) goto L_0x0067
            int r2 = r8.getInt(r2)     // Catch:{ all -> 0x007a }
            h = r2     // Catch:{ all -> 0x007a }
        L_0x0067:
            monitor-exit(r10)     // Catch:{ all -> 0x007a }
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$b> r10 = i     // Catch:{ Exception -> 0x008f, all -> 0x008b }
            java.lang.Object r10 = r10.get()     // Catch:{ Exception -> 0x008f, all -> 0x008b }
            com.google.android.gms.dynamite.DynamiteModule$b r10 = (com.google.android.gms.dynamite.DynamiteModule.b) r10     // Catch:{ Exception -> 0x008f, all -> 0x008b }
            if (r10 == 0) goto L_0x007d
            android.database.Cursor r2 = r10.a     // Catch:{ Exception -> 0x008f, all -> 0x008b }
            if (r2 != 0) goto L_0x007d
            r10.a = r8     // Catch:{ Exception -> 0x008f, all -> 0x008b }
            r8 = r0
            goto L_0x007d
        L_0x007a:
            r9 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x007a }
            throw r9     // Catch:{ Exception -> 0x008f, all -> 0x008b }
        L_0x007d:
            if (r8 == 0) goto L_0x0082
            r8.close()
        L_0x0082:
            return r9
        L_0x0083:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r9 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x008f, all -> 0x008b }
            java.lang.String r10 = "Failed to connect to dynamite module ContentResolver."
            r9.<init>(r10, r1)     // Catch:{ Exception -> 0x008f, all -> 0x008b }
            throw r9     // Catch:{ Exception -> 0x008f, all -> 0x008b }
        L_0x008b:
            r9 = move-exception
            r0 = r8
            r8 = r9
            goto L_0x00a3
        L_0x008f:
            r9 = move-exception
            r0 = r8
            r8 = r9
            goto L_0x0096
        L_0x0093:
            r8 = move-exception
            goto L_0x00a3
        L_0x0095:
            r8 = move-exception
        L_0x0096:
            boolean r9 = r8 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException     // Catch:{ all -> 0x0093 }
            if (r9 == 0) goto L_0x009b
            throw r8     // Catch:{ all -> 0x0093 }
        L_0x009b:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r9 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x0093 }
            java.lang.String r10 = "V2 version check failed"
            r9.<init>(r10, r8, r1)     // Catch:{ all -> 0x0093 }
            throw r9     // Catch:{ all -> 0x0093 }
        L_0x00a3:
            if (r0 == 0) goto L_0x00a8
            r0.close()
        L_0x00a8:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.c(android.content.Context, java.lang.String, boolean):int");
    }

    public static int b(Context context, String str) {
        return a(context, str, false);
    }

    private static DynamiteModule c(Context context, String str) {
        String valueOf = String.valueOf(str);
        String str2 = "Selected local version of ";
        if (valueOf.length() != 0) {
            str2.concat(valueOf);
        } else {
            new String(str2);
        }
        return new DynamiteModule(context.getApplicationContext());
    }

    private static DynamiteModule a(Context context, String str, int i2) {
        Boolean bool;
        try {
            synchronized (DynamiteModule.class) {
                bool = d;
            }
            if (bool == null) {
                throw new LoadingException("Failed to determine which loading route to use.", 0);
            } else if (bool.booleanValue()) {
                return c(context, str, i2);
            } else {
                return b(context, str, i2);
            }
        } catch (Throwable th) {
            bzi.a(context, th);
            throw th;
        }
    }

    private static DynamiteModule b(Context context, String str, int i2) {
        car car;
        String str2 = "Failed to load remote module.";
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("Selected remote version of ");
        sb.append(str);
        sb.append(", version >= ");
        sb.append(i2);
        cbb a2 = a(context);
        if (a2 != null) {
            try {
                if (a2.a() >= 2) {
                    car = a2.b(cas.a(context), str, i2);
                } else {
                    car = a2.a(cas.a(context), str, i2);
                }
                if (cas.a(car) != null) {
                    return new DynamiteModule((Context) cas.a(car));
                }
                throw new LoadingException(str2, 0);
            } catch (RemoteException e2) {
                throw new LoadingException(str2, e2, 0);
            }
        } else {
            throw new LoadingException("Failed to create IDynamiteLoader.", 0);
        }
    }

    private static cbb a(Context context) {
        cbb cbb;
        synchronized (DynamiteModule.class) {
            if (e != null) {
                cbb cbb2 = e;
                return cbb2;
            } else if (bry.b().a(context) != 0) {
                return null;
            } else {
                try {
                    IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                    if (iBinder == null) {
                        cbb = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                        if (queryLocalInterface instanceof cbb) {
                            cbb = (cbb) queryLocalInterface;
                        } else {
                            cbb = new cbc(iBinder);
                        }
                    }
                    if (cbb != null) {
                        e = cbb;
                        return cbb;
                    }
                } catch (Exception e2) {
                    String str = "DynamiteModule";
                    String str2 = "Failed to load IDynamiteLoader from GmsCore: ";
                    String valueOf = String.valueOf(e2.getMessage());
                    Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                }
            }
        }
        return null;
    }

    private static DynamiteModule c(Context context, String str, int i2) {
        cbd cbd;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("Selected remote version of ");
        sb.append(str);
        sb.append(", version >= ");
        sb.append(i2);
        synchronized (DynamiteModule.class) {
            cbd = f;
        }
        if (cbd != null) {
            b bVar = (b) i.get();
            if (bVar == null || bVar.a == null) {
                throw new LoadingException("No result cursor", 0);
            }
            Context a2 = a(context.getApplicationContext(), str, i2, bVar.a, cbd);
            if (a2 != null) {
                return new DynamiteModule(a2);
            }
            throw new LoadingException("Failed to get module context", 0);
        }
        throw new LoadingException("DynamiteLoaderV2 was not cached.", 0);
    }

    private static Boolean a() {
        Boolean valueOf;
        synchronized (DynamiteModule.class) {
            valueOf = Boolean.valueOf(h >= 2);
        }
        return valueOf;
    }

    private static Context a(Context context, String str, int i2, Cursor cursor, cbd cbd) {
        car car;
        try {
            cas.a(null);
            if (a().booleanValue()) {
                car = cbd.b(cas.a(context), str, i2, cas.a(cursor));
            } else {
                car = cbd.a(cas.a(context), str, i2, cas.a(cursor));
            }
            return (Context) cas.a(car);
        } catch (Exception e2) {
            String str2 = "Failed to load DynamiteLoader: ";
            String valueOf = String.valueOf(e2.toString());
            Log.e("DynamiteModule", valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return null;
        }
    }

    private static void a(ClassLoader classLoader) {
        cbd cbd;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                cbd = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof cbd) {
                    cbd = (cbd) queryLocalInterface;
                } else {
                    cbd = new cbe(iBinder);
                }
            }
            f = cbd;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new LoadingException("Failed to instantiate dynamite loader", e2, 0);
        }
    }

    public final IBinder a(String str) {
        try {
            return (IBinder) this.c.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            String str2 = "Failed to instantiate module class: ";
            String valueOf = String.valueOf(str);
            throw new LoadingException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e2, 0);
        }
    }

    private DynamiteModule(Context context) {
        this.c = (Context) bwx.a(context);
    }

    static {
        new cav();
        new caw();
        new cay();
        new caz();
    }
}
