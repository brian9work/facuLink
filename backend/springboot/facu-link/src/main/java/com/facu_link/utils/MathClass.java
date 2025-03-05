package com.facu_link.utils;

import java.lang.Math;
import java.math.BigDecimal;

public class MathClass {
    public double ASIN(double x) {
        return Math.asin(x);
    }

    public double SQRT(double x) {
        return Math.sqrt(x);
    }

    public double POW(double x) {
        return Math.sqrt(x);
    }

    public double SIN(double x) {
        return Math.sin(Math.PI / x);
    }

    public double CAST(String x) {
        return Double.valueOf(x);
    }

    public double DECIMAL(String x) {
        return Double.valueOf(x);
    }

    public double Radians(Double x) {
        return x * (Math.PI / 180);
    }
}
