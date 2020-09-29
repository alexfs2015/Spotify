package defpackage;

import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/* renamed from: xdj reason: default package */
public final class xdj {
    private static BigInteger a;
    private static BigInteger b;
    private static BigInteger c = a.multiply(b);
    private static BigInteger d = a.multiply(c);
    private static BigInteger e = a.multiply(d);
    private static BigInteger f = BigInteger.valueOf(1024).multiply(BigInteger.valueOf(1152921504606846976L));

    static {
        BigInteger valueOf = BigInteger.valueOf(1024);
        a = valueOf;
        b = valueOf.multiply(a);
        a.multiply(e);
        a.multiply(f);
    }

    public static void a(File file) {
        if (file.exists()) {
            if (!h(file)) {
                d(file);
            }
            if (!file.delete()) {
                StringBuilder sb = new StringBuilder("Unable to delete directory ");
                sb.append(file);
                sb.append(".");
                throw new IOException(sb.toString());
            }
        }
    }

    public static void a(File file, File file2) {
        a(file, file2, true);
    }

    private static void a(File file, File file2, FileFilter fileFilter, boolean z, List<String> list) {
        File[] listFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
        if (listFiles != null) {
            String str = "Destination '";
            if (file2.exists()) {
                if (!file2.isDirectory()) {
                    StringBuilder sb = new StringBuilder(str);
                    sb.append(file2);
                    sb.append("' exists but is not a directory");
                    throw new IOException(sb.toString());
                }
            } else if (!file2.mkdirs() && !file2.isDirectory()) {
                StringBuilder sb2 = new StringBuilder(str);
                sb2.append(file2);
                sb2.append("' directory cannot be created");
                throw new IOException(sb2.toString());
            }
            if (file2.canWrite()) {
                for (File file3 : listFiles) {
                    File file4 = new File(file2, file3.getName());
                    if (list == null || !list.contains(file3.getCanonicalPath())) {
                        if (file3.isDirectory()) {
                            a(file3, file4, fileFilter, z, list);
                        } else {
                            b(file3, file4, z);
                        }
                    }
                }
                if (z) {
                    file2.setLastModified(file.lastModified());
                    return;
                }
                return;
            }
            StringBuilder sb3 = new StringBuilder(str);
            sb3.append(file2);
            sb3.append("' cannot be written to");
            throw new IOException(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder("Failed to list contents of ");
        sb4.append(file);
        throw new IOException(sb4.toString());
    }

    public static void a(File file, File file2, boolean z) {
        c(file, file2);
        String str = "Source '";
        if (file.isDirectory()) {
            StringBuilder sb = new StringBuilder(str);
            sb.append(file);
            sb.append("' exists but is a directory");
            throw new IOException(sb.toString());
        } else if (!file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            File parentFile = file2.getParentFile();
            String str2 = "Destination '";
            if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
                StringBuilder sb2 = new StringBuilder(str2);
                sb2.append(parentFile);
                sb2.append("' directory cannot be created");
                throw new IOException(sb2.toString());
            } else if (!file2.exists() || file2.canWrite()) {
                b(file, file2, z);
            } else {
                StringBuilder sb3 = new StringBuilder(str2);
                sb3.append(file2);
                sb3.append("' exists but is read-only");
                throw new IOException(sb3.toString());
            }
        } else {
            StringBuilder sb4 = new StringBuilder(str);
            sb4.append(file);
            sb4.append("' and destination '");
            sb4.append(file2);
            sb4.append("' are the same");
            throw new IOException(sb4.toString());
        }
    }

    public static void b(File file, File file2) {
        List list;
        c(file, file2);
        String str = "Source '";
        if (!file.isDirectory()) {
            StringBuilder sb = new StringBuilder(str);
            sb.append(file);
            sb.append("' exists but is not a directory");
            throw new IOException(sb.toString());
        } else if (!file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
                File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length > 0) {
                    list = new ArrayList(listFiles.length);
                    for (File name : listFiles) {
                        list.add(new File(file2, name.getName()).getCanonicalPath());
                    }
                    a(file, file2, null, true, list);
                }
            }
            list = null;
            a(file, file2, null, true, list);
        } else {
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append(file);
            sb2.append("' and destination '");
            sb2.append(file2);
            sb2.append("' are the same");
            throw new IOException(sb2.toString());
        }
    }

    /* JADX WARNING: type inference failed for: r16v0 */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1 */
    /* JADX WARNING: type inference failed for: r16v1 */
    /* JADX WARNING: type inference failed for: r16v2 */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: type inference failed for: r9v7 */
    /* JADX WARNING: type inference failed for: r16v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(java.io.File r23, java.io.File r24, boolean r25) {
        /*
            r0 = r23
            r1 = r24
            boolean r2 = r24.exists()
            if (r2 == 0) goto L_0x002a
            boolean r2 = r24.isDirectory()
            if (r2 != 0) goto L_0x0011
            goto L_0x002a
        L_0x0011:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Destination '"
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = "' exists but is a directory"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x002a:
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 4
            r7 = 0
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ all -> 0x00c2 }
            r8.<init>(r0)     // Catch:{ all -> 0x00c2 }
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ all -> 0x00bf }
            r9.<init>(r1)     // Catch:{ all -> 0x00bf }
            java.nio.channels.FileChannel r16 = r8.getChannel()     // Catch:{ all -> 0x00bb }
            java.nio.channels.FileChannel r7 = r9.getChannel()     // Catch:{ all -> 0x00b9 }
            long r17 = r16.size()     // Catch:{ all -> 0x00b9 }
            r19 = 0
            r21 = r19
        L_0x004a:
            int r10 = (r21 > r17 ? 1 : (r21 == r17 ? 0 : -1))
            if (r10 >= 0) goto L_0x006a
            long r10 = r17 - r21
            r12 = 31457280(0x1e00000, double:1.55419614E-316)
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x0059
            r14 = r12
            goto L_0x005a
        L_0x0059:
            r14 = r10
        L_0x005a:
            r10 = r7
            r11 = r16
            r12 = r21
            long r10 = r10.transferFrom(r11, r12, r14)     // Catch:{ all -> 0x00b9 }
            int r12 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r12 == 0) goto L_0x006a
            long r21 = r21 + r10
            goto L_0x004a
        L_0x006a:
            java.io.Closeable[] r6 = new java.io.Closeable[r6]
            r6[r5] = r7
            r6[r4] = r9
            r6[r3] = r16
            r6[r2] = r8
            defpackage.xdl.a(r6)
            long r2 = r23.length()
            long r4 = r24.length()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x008d
            if (r25 == 0) goto L_0x008c
            long r2 = r23.lastModified()
            r1.setLastModified(r2)
        L_0x008c:
            return
        L_0x008d:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Failed to copy full contents from '"
            r7.<init>(r8)
            r7.append(r0)
            java.lang.String r0 = "' to '"
            r7.append(r0)
            r7.append(r1)
            java.lang.String r0 = "' Expected length: "
            r7.append(r0)
            r7.append(r2)
            java.lang.String r0 = " Actual: "
            r7.append(r0)
            r7.append(r4)
            java.lang.String r0 = r7.toString()
            r6.<init>(r0)
            throw r6
        L_0x00b9:
            r0 = move-exception
            goto L_0x00c7
        L_0x00bb:
            r0 = move-exception
            r16 = r7
            goto L_0x00c7
        L_0x00bf:
            r0 = move-exception
            r9 = r7
            goto L_0x00c5
        L_0x00c2:
            r0 = move-exception
            r8 = r7
            r9 = r8
        L_0x00c5:
            r16 = r9
        L_0x00c7:
            java.io.Closeable[] r1 = new java.io.Closeable[r6]
            r1[r5] = r7
            r1[r4] = r9
            r1[r3] = r16
            r1[r2] = r8
            defpackage.xdl.a(r1)
            goto L_0x00d6
        L_0x00d5:
            throw r0
        L_0x00d6:
            goto L_0x00d5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xdj.b(java.io.File, java.io.File, boolean):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|(1:3)|4|5|6) */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        return false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0009 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(java.io.File r1) {
        /*
            boolean r0 = r1.isDirectory()     // Catch:{ Exception -> 0x0009 }
            if (r0 == 0) goto L_0x0009
            d(r1)     // Catch:{ Exception -> 0x0009 }
        L_0x0009:
            boolean r1 = r1.delete()     // Catch:{ Exception -> 0x000e }
            return r1
        L_0x000e:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xdj.b(java.io.File):boolean");
    }

    public static long c(File file) {
        if (!file.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append(file);
            sb.append(" does not exist");
            throw new IllegalArgumentException(sb.toString());
        } else if (file.isDirectory()) {
            return g(file);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(file);
            sb2.append(" is not a directory");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    private static void c(File file, File file2) {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        } else if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        } else if (!file.exists()) {
            StringBuilder sb = new StringBuilder("Source '");
            sb.append(file);
            sb.append("' does not exist");
            throw new FileNotFoundException(sb.toString());
        }
    }

    private static void d(File file) {
        IOException e2 = null;
        for (File f2 : e(file)) {
            try {
                f(f2);
            } catch (IOException e3) {
                e2 = e3;
            }
        }
        if (e2 != null) {
            throw e2;
        }
    }

    private static File[] e(File file) {
        if (!file.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append(file);
            sb.append(" does not exist");
            throw new IllegalArgumentException(sb.toString());
        } else if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                return listFiles;
            }
            StringBuilder sb2 = new StringBuilder("Failed to list contents of ");
            sb2.append(file);
            throw new IOException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(file);
            sb3.append(" is not a directory");
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    private static void f(File file) {
        if (file.isDirectory()) {
            a(file);
            return;
        }
        boolean exists = file.exists();
        if (file.delete()) {
            return;
        }
        if (!exists) {
            StringBuilder sb = new StringBuilder("File does not exist: ");
            sb.append(file);
            throw new FileNotFoundException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("Unable to delete file: ");
        sb2.append(file);
        throw new IOException(sb2.toString());
    }

    private static long g(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return 0;
        }
        int length = listFiles.length;
        long j = 0;
        for (int i = 0; i < length; i++) {
            File file2 = listFiles[i];
            try {
                if (h(file2)) {
                    continue;
                } else {
                    j += file2.isDirectory() ? g(file2) : file2.length();
                    if (j < 0) {
                        break;
                    }
                }
            } catch (IOException unused) {
            }
        }
        return j;
    }

    private static boolean h(File file) {
        if (xdm.a()) {
            return xdm.a(file);
        }
        if (file == null) {
            throw new NullPointerException("File must not be null");
        } else if (xdk.a()) {
            return false;
        } else {
            File file2 = file.getParent() == null ? file : new File(file.getParentFile().getCanonicalFile(), file.getName());
            if (file2.getCanonicalFile().equals(file2.getAbsoluteFile())) {
                return i(file);
            }
            return true;
        }
    }

    private static boolean i(File file) {
        if (file.exists()) {
            return false;
        }
        final File canonicalFile = file.getCanonicalFile();
        File parentFile = canonicalFile.getParentFile();
        if (parentFile != null && parentFile.exists()) {
            File[] listFiles = parentFile.listFiles(new FileFilter() {
                public final boolean accept(File file) {
                    return file.equals(canonicalFile);
                }
            });
            if (listFiles != null && listFiles.length > 0) {
                return true;
            }
        }
        return false;
    }
}
