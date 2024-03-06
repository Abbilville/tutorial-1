package id.ac.ui.cs.advprog.eshop.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PaymentTest {
    private List<Product> products;
    private Order order;

    private Map<String, String> paymentData;

    @BeforeEach
    void setUp() {
        this.products = new ArrayList<>();
        Product product1 = new Product();
        product1.setProductId("e45d7d21-fd29-4533-a569-abbe0819579a");
        product1.setProductName("Sampo Cap Bambang");
        product1.setProductQuantity(2);

        Product product2 = new Product();
        product2.setProductId("8a76b99c-a0b3-46d2-a688-4c1831b21119");
        product2.setProductName("Sabun Cap Usep");
        product2.setProductQuantity(1);

        this.products.add(product1);
        this.products.add(product2);
        order = new Order("13652556-012a-4c07-8b3e-3e3e3e3e3e3e",
                this.products, 1708560000L, "Safira Sudrajat");
    }

    void setPaymentDataEmpty() {
        this.paymentData.clear();
    }

    void setPaymentDataVoucherValid() {
        this.paymentData.clear();
        this.paymentData.put("voucherCode", "ESHOP1234ABC5678");
    }

    void setPaymentDataVoucherInvalidCharacterLongToSmall() {
        this.paymentData.clear();
        this.paymentData.put("voucherCode", "ESHOP");
    }

    void setPaymentDataVoucherInvalidCharacterLongToLong() {
        this.paymentData.clear();
        this.paymentData.put("voucherCode", "ESHOP");
    }

    void setPaymentDataVoucherInvalidStartWith() {
        this.paymentData.clear();
        this.paymentData.put("voucherCode", "MEOWW1234ABC5678");
    }

    void setPaymnetDataCODEmpty() {
        this.paymentData.clear();
        this.paymentData.put("paymentMethod", "BANK_TRANSFER");
    }

    void setPaymentDataVoucherInvalidContains8NumericalCharacter() {
        this.paymentData.clear();
        this.paymentData.put("voucherCode", "ESHOP1234ABC");
    }

    @Test
    void testCreatePaymentVoucherEmptyOrder() {
        this.order = null;
        setPaymentDataVoucherValid();

        assertThrows(IllegalArgumentException.class, () -> {
            Payment payment = new Payment(this.order.getId(), "VOUCHER", this.paymentData);
        });
    }

    @Test
    void testCreatePaymentVoucherEmptyPaymentData() {
        setPaymentDataEmpty();

        assertThrows(IllegalArgumentException.class, () -> {
            Payment payment = new Payment(this.order.getId(), "VOUCHER_CODE", this.paymentData);
        });
    }

    @Test
    void testCreatePaymentCODEmptyOrder() {
        this.order = null;
        setPaymentDataVoucherValid();

        assertThrows(IllegalArgumentException.class, () -> {
            Payment payment = new Payment(this.order.getId(), "BANK_TRANSFER", this.paymentData);
        });
    }

    @Test
    void testCreatePaymentCODEmptyPaymentData() {
        setPaymentDataEmpty();

        assertThrows(IllegalArgumentException.class, () -> {
            Payment payment = new Payment(this.order.getId(), "BANK_TRANSFER", this.paymentData);
        });
    }

    @Test
    void testCreatePaymentVoucherDefaultStatus() {
        setPaymentDataVoucherValid();

        Payment payment = new Payment(this.order.getId(), "VOUCHER", this.paymentData);
        assertSame(this.order, payment.get);
        assertEquals(this.order, payment.getOrder());
        assertEquals("VOUCHER", payment.getPaymentType());
        assertEquals(this.paymentData, payment.getPaymentData());
    }
}