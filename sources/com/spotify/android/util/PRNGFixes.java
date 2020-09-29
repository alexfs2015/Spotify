package com.spotify.android.util;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.Process;
import com.spotify.base.java.logging.Logger;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.SecureRandomSpi;
import java.security.Security;

public final class PRNGFixes {
    private static final byte[] a;

    public static class LinuxPRNGSecureRandom extends SecureRandomSpi {
        private static final File a = new File("/dev/urandom");
        private static final Object b = new Object();
        private static DataInputStream c = null;
        private static OutputStream d = null;
        private static final long serialVersionUID = 1;
        private boolean mSeeded;

        private static DataInputStream a() {
            DataInputStream dataInputStream;
            synchronized (b) {
                if (c == null) {
                    try {
                        c = new DataInputStream(new FileInputStream(a));
                    } catch (IOException e) {
                        StringBuilder sb = new StringBuilder("Failed to open ");
                        sb.append(a);
                        sb.append(" for reading");
                        throw new SecurityException(sb.toString(), e);
                    }
                }
                dataInputStream = c;
            }
            return dataInputStream;
        }

        private static OutputStream b() {
            OutputStream outputStream;
            synchronized (b) {
                if (d == null) {
                    d = new FileOutputStream(a);
                }
                outputStream = d;
            }
            return outputStream;
        }

        /* access modifiers changed from: protected */
        public byte[] engineGenerateSeed(int i) {
            byte[] bArr = new byte[i];
            engineNextBytes(bArr);
            return bArr;
        }

        /* access modifiers changed from: protected */
        public void engineNextBytes(byte[] bArr) {
            DataInputStream a2;
            if (!this.mSeeded) {
                engineSetSeed(PRNGFixes.c());
            }
            try {
                synchronized (b) {
                    a2 = a();
                }
                a2.readFully(bArr);
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder("Failed to read from ");
                sb.append(a);
                throw new SecurityException(sb.toString(), e);
            }
        }

        /* access modifiers changed from: protected */
        public void engineSetSeed(byte[] bArr) {
            OutputStream b2;
            try {
                synchronized (b) {
                    b2 = b();
                }
                b2.write(bArr);
                b2.flush();
                this.mSeeded = true;
            } catch (IOException unused) {
                try {
                    Logger.d("%s: Failed to mix seed into %s", PRNGFixes.class.getSimpleName(), a);
                } finally {
                    this.mSeeded = true;
                }
            }
        }
    }

    static class LinuxPRNGSecureRandomProvider extends Provider {
        private static final long serialVersionUID = 1;

        public LinuxPRNGSecureRandomProvider() {
            super("LinuxPRNG", 1.0d, "A Linux-specific random number provider that uses /dev/urandom");
            put("SecureRandom.SHA1PRNG", LinuxPRNGSecureRandom.class.getName());
            put("SecureRandom.SHA1PRNG ImplementedIn", "Software");
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Build.FINGERPRINT);
        sb.append(Build.BOARD);
        sb.append(Build.BOOTLOADER);
        sb.append(Build.TIME);
        sb.append(Build.HOST);
        a = sb.toString().getBytes(fbi.c);
    }

    private PRNGFixes() {
    }

    public static void a() {
        String str = "org.apache.harmony.xnet.provider.jsse.NativeCrypto";
        String str2 = "Failed to seed OpenSSL PRNG";
        if (VERSION.SDK_INT >= 16 && VERSION.SDK_INT <= 18) {
            try {
                Class.forName(str).getMethod("RAND_seed", new Class[]{byte[].class}).invoke(null, new Object[]{c()});
                int intValue = ((Integer) Class.forName(str).getMethod("RAND_load_file", new Class[]{String.class, Long.TYPE}).invoke(null, new Object[]{"/dev/urandom", Integer.valueOf(1024)})).intValue();
                if (intValue != 1024) {
                    StringBuilder sb = new StringBuilder("Unexpected number of bytes read from Linux PRNG: ");
                    sb.append(intValue);
                    throw new IOException(sb.toString());
                }
            } catch (ClassNotFoundException e) {
                throw new SecurityException(str2, e);
            } catch (NoClassDefFoundError e2) {
                throw new SecurityException(str2, e2);
            } catch (UnsatisfiedLinkError e3) {
                throw new SecurityException(str2, e3);
            } catch (Exception e4) {
                throw new SecurityException(str2, e4);
            }
        }
        if (VERSION.SDK_INT <= 18) {
            Provider[] providers = Security.getProviders("SecureRandom.SHA1PRNG");
            if (providers == null || providers.length <= 0 || !LinuxPRNGSecureRandomProvider.class.equals(providers[0].getClass())) {
                Security.insertProviderAt(new LinuxPRNGSecureRandomProvider(), 1);
            }
            SecureRandom secureRandom = new SecureRandom();
            if (LinuxPRNGSecureRandomProvider.class.equals(secureRandom.getProvider().getClass())) {
                try {
                    SecureRandom instance = SecureRandom.getInstance("SHA1PRNG");
                    if (!LinuxPRNGSecureRandomProvider.class.equals(instance.getProvider().getClass())) {
                        StringBuilder sb2 = new StringBuilder("SecureRandom.getInstance(\"SHA1PRNG\") backed by wrong Provider: ");
                        sb2.append(instance.getProvider().getClass());
                        throw new SecurityException(sb2.toString());
                    }
                } catch (NoSuchAlgorithmException e5) {
                    throw new SecurityException("SHA1PRNG not available", e5);
                }
            } else {
                StringBuilder sb3 = new StringBuilder("new SecureRandom() backed by wrong Provider: ");
                sb3.append(secureRandom.getProvider().getClass());
                throw new SecurityException(sb3.toString());
            }
        }
    }

    /* access modifiers changed from: private */
    public static byte[] c() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeLong(jtp.a.a());
            dataOutputStream.writeLong(System.nanoTime());
            dataOutputStream.writeInt(Process.myPid());
            dataOutputStream.writeInt(Process.myUid());
            dataOutputStream.write(a);
            dataOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new SecurityException("Failed to generate seed", e);
        }
    }
}
