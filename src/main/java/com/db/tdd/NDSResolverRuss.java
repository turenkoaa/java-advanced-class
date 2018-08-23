package com.db.tdd;

import lombok.SneakyThrows;

public class NDSResolverRuss implements NDSResolver {

    private double nds;

    @SneakyThrows
    public NDSResolverRuss() {
        Thread.sleep(3000);
        nds = 0.18;
    }

    @Override
    public double getNDS() {
        return nds;
    }
}
