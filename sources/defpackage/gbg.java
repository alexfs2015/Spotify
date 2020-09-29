package defpackage;

import com.spotify.base.java.logging.Logger;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: gbg reason: default package */
public final class gbg {
    private static final List<Pattern> a;
    private static final Set<String> b;
    private final String c;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Pattern.compile("^/cache.*"));
        arrayList.add(Pattern.compile("^/config.*"));
        arrayList.add(Pattern.compile("^/dev/.*"));
        arrayList.add(Pattern.compile("^/firmware.*"));
        arrayList.add(Pattern.compile("^/persist.*"));
        arrayList.add(Pattern.compile("^/storage/emulated/legacy.*"));
        arrayList.add(Pattern.compile("^/storage/emulated/[0-9]+/Android/obb"));
        arrayList.add(Pattern.compile("^/sys/.*"));
        a = Collections.unmodifiableList(arrayList);
        HashSet hashSet = new HashSet();
        hashSet.add("tmpfs");
        hashSet.add("rootfs");
        hashSet.add("proc");
        hashSet.add("procfs");
        hashSet.add("selinuxfs");
        hashSet.add("sockfs");
        hashSet.add("sysfs");
        hashSet.add("cgroup");
        hashSet.add("cifs");
        hashSet.add("nfs");
        hashSet.add("smbfs");
        hashSet.add("configfs");
        hashSet.add("functionfs");
        b = Collections.unmodifiableSet(hashSet);
    }

    public gbg(jty jty) {
        StringBuilder sb = new StringBuilder("Android/data/");
        sb.append(jty.d());
        sb.append("/files");
        this.c = sb.toString();
    }

    private static Set<String> a(InputStream inputStream) {
        BufferedReader bufferedReader;
        HashSet hashSet = new HashSet();
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "ascii"));
            try {
                Pattern compile = Pattern.compile("\\S+ (\\S+) (\\S+) rw.*");
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        Matcher matcher = compile.matcher(readLine);
                        if (matcher.matches()) {
                            if (!b.contains(matcher.group(2))) {
                                hashSet.add(matcher.group(1));
                            }
                        }
                    } else {
                        xdl.a((Reader) bufferedReader);
                        return hashSet;
                    }
                }
            } catch (Throwable th) {
                th = th;
                xdl.a((Reader) bufferedReader);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
            xdl.a((Reader) bufferedReader);
            throw th;
        }
    }

    private static Set<String> a(Set<String> set) {
        HashSet hashSet = new HashSet();
        for (String str : set) {
            boolean z = false;
            Iterator it = a.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((Pattern) it.next()).matcher(str).matches()) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    private Set<String> b(Set<String> set) {
        HashSet hashSet = new HashSet();
        for (String str : set) {
            if (gcg.a(new File(str))) {
                hashSet.add(str);
            } else if (gcg.a(new File(str, this.c))) {
                hashSet.add(str);
            } else {
                Logger.d("Cannot write to mount point %s", str);
            }
        }
        return hashSet;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Set<java.lang.String> a(java.lang.String r7) {
        /*
            r6 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0012 }
            r1.<init>(r7)     // Catch:{ IOException -> 0x0012 }
            java.util.Set r0 = a(r1)     // Catch:{ IOException -> 0x0013 }
            r1.close()     // Catch:{ IOException -> 0x0013 }
            goto L_0x0019
        L_0x0012:
            r1 = 0
        L_0x0013:
            defpackage.xdl.a(r1)
            r0.clear()
        L_0x0019:
            java.util.Set r7 = a(r0)
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r0 = r0.getAbsolutePath()
            r7.add(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto L_0x0074
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r1 = r7.iterator()
        L_0x0037:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0071
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.io.File r3 = new java.io.File
            java.lang.String r4 = r6.c
            r3.<init>(r2, r4)
            boolean r4 = r3.mkdirs()
            boolean r5 = r3.exists()
            if (r5 != 0) goto L_0x0056
            if (r4 == 0) goto L_0x0059
        L_0x0056:
            r0.add(r2)
        L_0x0059:
            if (r4 == 0) goto L_0x0037
            boolean r2 = r3.delete()
            if (r2 != 0) goto L_0x0037
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r4 = 0
            java.lang.String r3 = r3.getAbsolutePath()
            r2[r4] = r3
            java.lang.String r3 = "Could not delete the probe folder: %s"
            com.spotify.base.java.logging.Logger.d(r3, r2)
            goto L_0x0037
        L_0x0071:
            r7.addAll(r0)
        L_0x0074:
            java.util.Set r7 = r6.b(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gbg.a(java.lang.String):java.util.Set");
    }
}
