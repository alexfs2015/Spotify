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

/* renamed from: xda reason: default package */
public final class xda {
    static final Logger a = Logger.getLogger(xda.class.getName());

    private xda() {
    }

    public static xcr a(xdf xdf) {
        return new xdb(xdf);
    }

    public static xcs a(xdg xdg) {
        return new xdc(xdg);
    }

    public static xdf a() {
        return new xdf() {
            public final xdh a() {
                return xdh.b;
            }

            public final void a_(xcq xcq, long j) {
                xcq.i(j);
            }

            public final void close() {
            }

            public final void flush() {
            }
        };
    }

    private static xdf a(OutputStream outputStream) {
        return a(outputStream, new xdh());
    }

    private static xdf a(final OutputStream outputStream, final xdh xdh) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        } else if (xdh != null) {
            return new xdf() {
                public final xdh a() {
                    return xdh.this;
                }

                public final void a_(xcq xcq, long j) {
                    xdi.a(xcq.b, 0, j);
                    while (j > 0) {
                        xdh.this.f();
                        xdd xdd = xcq.a;
                        int min = (int) Math.min(j, (long) (xdd.c - xdd.b));
                        outputStream.write(xdd.a, xdd.b, min);
                        xdd.b += min;
                        long j2 = (long) min;
                        j -= j2;
                        xcq.b -= j2;
                        if (xdd.b == xdd.c) {
                            xcq.a = xdd.b();
                            xde.a(xdd);
                        }
                    }
                }

                public final void close() {
                    outputStream.close();
                }

                public final void flush() {
                    outputStream.flush();
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

    public static xdf a(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getOutputStream() != null) {
            xco c = c(socket);
            return new xdf(a(socket.getOutputStream(), (xdh) c)) {
                private /* synthetic */ xdf a;

                {
                    this.a = r2;
                }

                public final xdh a() {
                    return xco.this;
                }

                public final void a_(xcq xcq, long j) {
                    xdi.a(xcq.b, 0, j);
                    while (true) {
                        long j2 = 0;
                        if (j > 0) {
                            xdd xdd = xcq.a;
                            while (true) {
                                if (j2 >= 65536) {
                                    break;
                                }
                                j2 += (long) (xdd.c - xdd.b);
                                if (j2 >= j) {
                                    j2 = j;
                                    break;
                                }
                                xdd = xdd.f;
                            }
                            xco.this.bf_();
                            try {
                                this.a.a_(xcq, j2);
                                j -= j2;
                                xco.this.a(true);
                            } catch (IOException e) {
                                throw xco.this.b(e);
                            } catch (Throwable th) {
                                xco.this.a(false);
                                throw th;
                            }
                        } else {
                            return;
                        }
                    }
                }

                public final void close() {
                    xco.this.bf_();
                    try {
                        this.a.close();
                        xco.this.a(true);
                    } catch (IOException e) {
                        throw xco.this.b(e);
                    } catch (Throwable th) {
                        xco.this.a(false);
                        throw th;
                    }
                }

                public final void flush() {
                    xco.this.bf_();
                    try {
                        this.a.flush();
                        xco.this.a(true);
                    } catch (IOException e) {
                        throw xco.this.b(e);
                    } catch (Throwable th) {
                        xco.this.a(false);
                        throw th;
                    }
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

    public static xdg a(File file) {
        if (file != null) {
            return a((InputStream) new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static xdg a(InputStream inputStream) {
        return a(inputStream, new xdh());
    }

    private static xdg a(final InputStream inputStream, final xdh xdh) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (xdh != null) {
            return new xdg() {
                public final long a(xcq xcq, long j) {
                    if (j < 0) {
                        StringBuilder sb = new StringBuilder("byteCount < 0: ");
                        sb.append(j);
                        throw new IllegalArgumentException(sb.toString());
                    } else if (j == 0) {
                        return 0;
                    } else {
                        try {
                            xdh.this.f();
                            xdd f = xcq.f(1);
                            int read = inputStream.read(f.a, f.c, (int) Math.min(j, (long) (8192 - f.c)));
                            if (read == -1) {
                                return -1;
                            }
                            f.c += read;
                            long j2 = (long) read;
                            xcq.b += j2;
                            return j2;
                        } catch (AssertionError e) {
                            if (xda.a(e)) {
                                throw new IOException(e);
                            }
                            throw e;
                        }
                    }
                }

                public final xdh a() {
                    return xdh.this;
                }

                public final void close() {
                    inputStream.close();
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

    static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static xdf b(File file) {
        if (file != null) {
            return a((OutputStream) new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static xdg b(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getInputStream() != null) {
            xco c = c(socket);
            return new xdg(a(socket.getInputStream(), (xdh) c)) {
                private /* synthetic */ xdg a;

                {
                    this.a = r2;
                }

                public final long a(xcq xcq, long j) {
                    xco.this.bf_();
                    try {
                        long a2 = this.a.a(xcq, j);
                        xco.this.a(true);
                        return a2;
                    } catch (IOException e) {
                        throw xco.this.b(e);
                    } catch (Throwable th) {
                        xco.this.a(false);
                        throw th;
                    }
                }

                public final xdh a() {
                    return xco.this;
                }

                public final void close() {
                    try {
                        this.a.close();
                        xco.this.a(true);
                    } catch (IOException e) {
                        throw xco.this.b(e);
                    } catch (Throwable th) {
                        xco.this.a(false);
                        throw th;
                    }
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

    private static xco c(final Socket socket) {
        return new xco() {
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
                    Logger logger = xda.a;
                    Level level = Level.WARNING;
                    StringBuilder sb = new StringBuilder(str);
                    sb.append(socket);
                    logger.log(level, sb.toString(), e);
                } catch (AssertionError e2) {
                    if (xda.a(e2)) {
                        Logger logger2 = xda.a;
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

    public static xdf c(File file) {
        if (file != null) {
            return a((OutputStream) new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }
}
