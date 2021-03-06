package com.example.turagency.model.entity;

import java.util.StringJoiner;

public class ClientSheet extends Entity {
    private int sheetSum;
    private DiscountType discount;

    public ClientSheet() {
    }

    public int getSheetSum() {
        return sheetSum;
    }

    public void setSheetSum(int sheetSum) {
        this.sheetSum = sheetSum;
    }

    public DiscountType getDiscount() {
        return discount;
    }

    public void setDiscount(DiscountType discount) {
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ClientSheet that = (ClientSheet) o;
        if (sheetSum != that.sheetSum) return false;
        return discount == that.discount;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + sheetSum;
        result = 31 * result + (discount != null ? discount.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ClientSheet.class.getSimpleName() + "[", "]")
                .add("sheetSum=" + sheetSum)
                .add("discount=" + discount)
                .toString();
    }

}