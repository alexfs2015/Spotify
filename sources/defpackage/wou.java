package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: wou reason: default package */
public final class wou {
    static final Logger a = Logger.getLogger(wou.class.getName());

    private wou() {
    }

    public static wom a(wpa wpa) {
        return new wow(wpa);
    }

    public static wol a(woz woz) {
        return new wov(woz);
    }

    private static woz a(OutputStream outputStream) {
        return a(outputStream, new wpb());
    }

    private static woz a(final OutputStream outputStream, final wpb wpb) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        } else if (wpb != null) {
            return new woz() {
                public final void a_(wok wok, long j) {
                    wpc.a(wok.b, 0, j);
                    while (j > 0) {
                        wpb.this.f();
                        wox wox = wok.a;
                        int min = (int) Math.min(j, (long) (wox.c - wox.b));
                        outputStream.write(wox.a, wox.b, min);
                        wox.b += min;
                        long j2 = (long) min;
                        j -= j2;
                        wok.b -= j2;
                        if (wox.b == wox.c) {
                            wok.a = wox.b();
                            woy.a(wox);
                        }
                    }
                }

                public final void flush() {
                    outputStream.flush();
                }

                public final void close() {
                    outputStream.close();
                }

                public final wpb a() {
                    return wpb.this;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("sink(");
                    sb.append(outputStream);
                    sb.append(")");
                    return sb.toString();
                }
            };
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    public static woz a(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getOutputStream() != null) {
            woi c = c(socket);
            return new woz(a(socket.getOutputStream(), (wpb) c)) {
                private /* synthetic */ woz a;

                {
                    this.a = r2;
                }

                public final void a_(wok wok, long j) {
                    wpc.a(wok.b, 0, j);
                    while (true) {
                        long j2 = 0;
                        if (j > 0) {
                            wox wox = wok.a;
                            while (true) {
                                if (j2 >= 65536) {
                                    break;
                                }
                                j2 += (long) (wox.c - wox.b);
                                if (j2 >= j) {
                                    j2 = j;
                                    break;
                                }
                                wox = wox.f;
                            }
                            woi.this.bh_();
                            try {
                                this.a.a_(wok, j2);
                                j -= j2;
                                woi.this.a(true);
                            } catch (IOException e) {
                                throw woi.this.b(e);
                            } catch (Throwable th) {
                                woi.this.a(false);
                                throw th;
                            }
                        } else {
                            return;
                        }
                    }
                }

                public final void flush() {
                    woi.this.bh_();
                    try {
                        this.a.flush();
                        woi.this.a(true);
                    } catch (IOException e) {
                        throw woi.this.b(e);
                    } catch (Throwable th) {
                        woi.this.a(false);
                        throw th;
                    }
                }

                public final void close() {
                    woi.this.bh_();
                    try {
                        this.a.close();
                        woi.this.a(true);
                    } catch (IOException e) {
                        throw woi.this.b(e);
                    } catch (Throwable th) {
                        woi.this.a(false);
                        throw th;
                    }
                }

                public final wpb a() {
                    return woi.this;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("AsyncTimeout.sink(");
                    sb.append(this.a);
                    sb.append(")");
                    return sb.toString();
                }
            };
        } else {
            throw new IOException("socket's output stream == null");
        }
    }

    public static wpa a(InputStream inputStream) {
        return a(inputStream, new wpb());
    }

    private static wpa a(final InputStream inputStream, final wpb wpb) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (wpb != null) {
            return new wpa() {
                public final long a(wok wok, long j) {
                    if (j < 0) {
                        StringBuilder sb = new StringBuilder("byteCount < 0: ");
                        sb.append(j);
                        throw new IllegalArgumentException(sb.toString());
                    } else if (j == 0) {
                        return 0;
                    } else {
                        try {
                            wpb.this.f();
                            wox f = wok.f(1);
                            int read = inputStream.read(f.a, f.c, (int) Math.min(j, (long) (8192 - f.c)));
                            if (read == -1) {
                                return -1;
                            }
                            f.c += read;
                            long j2 = (long) read;
                            wok.b += j2;
                            return j2;
                        } catch (AssertionError e) {
                            if (wou.a(e)) {
                                throw new IOException(e);
                            }
                            throw e;
                        }
                    }
                }

                public final void close() {
                    inputStream.close();
                }

                public final wpb a() {
                    return wpb.this;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("source(");
                    sb.append(inputStream);
                    sb.append(")");
                    return sb.toString();
                }
            };
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    public static wpa a(File file) {
        if (file != null) {
            return a((InputStream) new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static woz b(File file) {
        if (file != null) {
            return a((OutputStream) new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static woz c(File file) {
        if (file != null) {
            return a((OutputStream) new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static woz a() {
        return new woz() {
            public final void close() {
            }

            public final void flush() {
            }

            public final void a_(wok wok, long j) {
                wok.i(j);
            }

            public final wpb a() {
                return wpb.b;
            }
        };
    }

    public static wpa b(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getInputStream() != null) {
            woi c = c(socket);
            return new wpa(a(socket.getInputStream(), (wpb) c)) {
                private /* synthetic */ wpa a;

                {
                    this.a = r2;
                }

                public final long a(wok wok, long j) {
                    woi.this.bh_();
                    try {
                        long a2 = this.a.a(wok, j);
                        woi.this.a(true);
                        return a2;
                    } catch (IOException e) {
                        throw woi.this.b(e);
                    } catch (Throwable th) {
                        woi.this.a(false);
                        throw th;
                    }
                }

                public final void close() {
                    try {
                        this.a.close();
                        woi.this.a(true);
                    } catch (IOException e) {
                        throw woi.this.b(e);
                    } catch (Throwable th) {
                        woi.this.a(false);
                        throw th;
                    }
                }

                public final wpb a() {
                    return woi.this;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("AsyncTimeout.source(");
                    sb.append(this.a);
                    sb.append(")");
                    return sb.toString();
                }
            };
        } else {
            throw new IOException("socket's input stream == null");
        }
    }

    private static woi c(final Socket socket) {
        return new woi() {
            /* access modifiers changed from: protected */
            public final IOException a(IOException iOException) {
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            }

            /* access modifiers changed from: protected */
            public final void a() {
                String str = "Failed to close timed out socket ";
                try {
                    socket.close();
                } catch (Exception e) {
                    Logger logger = wou.a;
                    Level level = Level.WARNING;
                    StringBuilder sb = new StringBuilder(str);
                    sb.append(socket);
                    logger.log(level, sb.toString(), e);
                } catch (AssertionError e2) {
                    if (wou.a(e2)) {
                        Logger logger2 = wou.a;
                        Level level2 = Level.WARNING;
                        StringBuilder sb2 = new StringBuilder(str);
                        sb2.append(socket);
                        logger2.log(level2, sb2.toString(), e2);
                        return;
                    }
                    throw e2;
                }
            }
        };
    }

    static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
