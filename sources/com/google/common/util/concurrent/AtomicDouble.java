package com.google.common.util.concurrent;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

public class AtomicDouble extends Number implements Serializable {
    private static final long serialVersionUID = 0;
    private transient AtomicLong a;

    public AtomicDouble() {
        this(0.0d);
    }

    public AtomicDouble(double d) {
        this.a = new AtomicLong(Double.doubleToRawLongBits(d));
    }

    private double a() {
        return Double.longBitsToDouble(this.a.get());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.a = new AtomicLong();
        a(objectInputStream.readDouble());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeDouble(a());
    }

    public final void a(double d) {
        this.a.set(Double.doubleToRawLongBits(d));
    }

    public double doubleValue() {
        return a();
    }

    public float floatValue() {
        return (float) a();
    }

    public int intValue() {
        return (int) a();
    }

    public long longValue() {
        return (long) a();
    }

    public String toString() {
        return Double.toString(a());
    }
}
