package com.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PhanSoTest {
    @Test public void
    foo() throws Exception {
        PhanSo a = new PhanSo(1, 2);
        PhanSo b = new PhanSo(3, 4);
        PhanSo ketqua = a.add(b);

        assertThat(ketqua.getTuSo() / ketqua.getMauSo()).isEqualTo(5 / 4);
        assertThat(ketqua.getTuSo() / ketqua.getMauSo()).isEqualTo(1);
    }

    @Test public void
    test_phanSoThapPhanVoHanTuanHoan() throws Exception {
        PhanSo a = new PhanSo(1, 3);
        PhanSo b = new PhanSo(1, 3);
        PhanSo ketqua = a.add(b);

        assertThat(ketqua.getTuSo() / ketqua.getMauSo()).isEqualTo(2 / 3);
    }

    static class PhanSo {

        private long tuSo;
        private long mauSo;

        public PhanSo(long tuSo, long mauSo) {
            this.tuSo = tuSo;
            this.mauSo = mauSo;
        }

        static long timUocChung(long a, long b) {

            return 1;
        }

        public long getTuSo() {
            return this.tuSo;
        }

        public long getMauSo() {
            return this.mauSo;
        }

        public PhanSo add(PhanSo other) {

            return new PhanSo(this.tuSo * other.mauSo + other.tuSo * this.mauSo, this.mauSo * other.mauSo);
        }
    }
}


